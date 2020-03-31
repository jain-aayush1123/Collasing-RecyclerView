package u.awsmizng.awsm.collapsinglistviewapp

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var itemsData = ArrayList<DataModel>()
    lateinit var adapter: RVAdapter
    lateinit var mcontext: Context

    data class Movie(val title: String, val year: Int)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mcontext = this.baseContext

        adapter = RVAdapter(itemsData)
        val llm = LinearLayoutManager(this)

        itemsrv.setHasFixedSize(true)
        itemsrv.layoutManager = llm
        getData()
        itemsrv.adapter = adapter

    }

    private fun getData() {
        itemsData = ArrayList()
        itemsData = Data.items
        adapter.notifyDataSetChanged()
        adapter = RVAdapter(itemsData)
    }

    private val mNicolasCageMovies = listOf(
        Movie("Raising Arizona", 1987),
        Movie("Vampire's Kiss", 1988),
        Movie("Con Air", 1997),
        Movie("Gone in 60 Seconds", 1997),
        Movie("National Treasure", 2004),
        Movie("The Wicker Man", 2006),
        Movie("Ghost Rider", 2007),
        Movie("Knowing", 2009)
    )
}
