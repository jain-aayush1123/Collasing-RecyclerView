package u.awsmizng.awsm.collapsinglistviewapp

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.child_cell.view.*

class Horizontal_RVAdapter(private var mContext: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var itemsList: ArrayList<Horizontal_RVModel> = ArrayList()
    private var mRowIndex = -1

    fun setData(data: ArrayList<Horizontal_RVModel>) {
        if (itemsList != data) {
            itemsList = data
            notifyDataSetChanged()
        }
    }

    fun setRowIndex(index: Int) {
        mRowIndex = index
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView =
            LayoutInflater.from(mContext).inflate(R.layout.child_cell, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.list_title.text = itemsList[position].color
//        holder.itemView.list_description.text = itemsList[position].name
        holder.itemView.list_description.text = "awsm"

        holder.itemView.setOnClickListener {
            Log.d(
                "TAG",
                "You pressed the item in the category row $mRowIndex and position $position"
            )
        }

    }
}