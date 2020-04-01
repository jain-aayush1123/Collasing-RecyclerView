package u.awsmizng.awsm.collapsinglistviewapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cell.view.*

class RVAdapter(private val itemsCells: ArrayList<Vertical_RVModel>) :
    RecyclerView.Adapter<RVAdapter.ViewHolder>() {

    // Save the expanded row position
    private val expandedPositionSet: HashSet<Int> = HashSet()
    lateinit var context: Context

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val childRecyclerView: RecyclerView
        val childAdapter: Horizontal_RVAdapter

        init {
            val context = itemView.context
            childRecyclerView = itemView.findViewById(R.id.childRV)
            childRecyclerView?.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

            childAdapter = Horizontal_RVAdapter(context)
            childRecyclerView.adapter = childAdapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cell, parent, false)
        val vh = ViewHolder(v)
        context = parent.context
        return vh
    }

    override fun getItemCount(): Int {
        return itemsCells.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Add data to cells
        holder.itemView.question_textview.text = itemsCells[position].category
        holder.childAdapter.setData(itemsCells[position].colors)
        holder.childAdapter.setRowIndex(position)

//        holder.itemView.answer_textview.text = itemsCells[position].answer

        // Expand when you click on cell
        holder.itemView.expand_layout.setOnExpandListener(object :
            ExpandableLayout.OnExpandListener {
            override fun onExpand(expanded: Boolean) {
                if (expandedPositionSet.contains(position)) {
                    expandedPositionSet.remove(position)
                } else {
                    expandedPositionSet.add(position)
                }
            }
        })
        holder.itemView.expand_layout.setExpand(expandedPositionSet.contains(position))
    }
}