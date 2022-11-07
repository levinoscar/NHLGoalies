package edu.temple.nhlgoalies2022_23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SelectionActivity : AppCompatActivity() {
    /**
     * Companion objects are used in Kotlin
     * as containers of public static fields
     */
    companion object {
        val ITEM_KEY = "key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set the title for the activity.
        // This is done to ensure that the activity label
        // displayed in the Android launcher is different
        supportActionBar?.title = "Selector"

        val items = generateTestData()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)


        recyclerView.layoutManager = GridLayoutManager(this, 3)

        val clickEvent = {item: Item ->
            // Item object can be placed directly inside Intent because
            // the Item class implements the Parcelable interface
            val launchIntent = Intent(this, DisplayActivity::class.java)
                .putExtra(ITEM_KEY, item)

            startActivity(launchIntent)
        }

        recyclerView.adapter = ImageAdapter(items, clickEvent)
    }

    /**
     * Feel free to change these resources to whatever you'd like
     */
    fun generateTestData(): Array<Item> {
        return arrayOf(
            Item(R.drawable.vasilevskiy, "Andrei Vasilevskiy"),
            Item(R.drawable.shesterkin, "Igor Shesterkin"),
            Item(R.drawable.sorokin, "Ilya Sorokin"),
            Item(R.drawable.varlamov, "Semyon Varlamov"),
            Item(R.drawable.saros, "Juuse Saros"),
            Item(R.drawable.demko, "Thatcher Demko"),
            Item(R.drawable.hellebuyck, "Connor Hellebuyck"),
            Item(R.drawable.markstrom, "Jacob Marmstrom"),
            Item(R.drawable.vladar, "Dan Vladar"),
            Item(R.drawable.oettinger, "Jake Oettinger (Otter)"),
            Item(R.drawable.quick, "Jonathan Quick"),
            Item(R.drawable.hart, "Carter Hart"),
            Item(R.drawable.jarry, "Tristian Jarry"),
            Item(R.drawable.kuemper, "Darcy Kuemper"),
            Item(R.drawable.bobrovsky, "Sergei Bobrovsky"),
            Item(R.drawable.knight, "Spencer Knight"),
            Item(R.drawable.fleury, "Marc-Andre Fleury (flower)"),
            Item(R.drawable.gibson, "John Gibson"),
            Item(R.drawable.swayman, "Jeremy Swayman"),
            Item(R.drawable.ullmark, "Linus Ullmark"),
            Item(R.drawable.samsonov, "Ilya Samsonov"),
            Item(R.drawable.kallgren, "Erik Källgren"),
            Item(R.drawable.mrazek, "Petr Mrazek"),
            Item(R.drawable.blackwood, "Mackenzie Blackwood"),
            Item(R.drawable.grubauer, "Philipp Grubauer"),
            Item(R.drawable.jones, "Martin Jones"),
            Item(R.drawable.merzlikins, "Elvis Merzlikins")
        )
    }
}