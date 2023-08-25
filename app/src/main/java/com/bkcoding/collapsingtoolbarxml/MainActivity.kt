package com.bkcoding.collapsingtoolbarxml

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.bkcoding.collapsingtoolbarxml.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mAdapter: ContactAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        repeat(4){
            dataItems.addAll(dataItems)
        }
        binding.RV.adapter = ContactAdapter(dataItems)
        binding.RV.layoutManager = LinearLayoutManager(this)

        binding.RV.isNestedScrollingEnabled  = false
        binding.RV.setHasFixedSize(false)
//
//        mAdapter = ContactAdapter(dataItems)
//        binding.RV.apply {
//            adapter = mAdapter
//            layoutManager = StaggeredGridLayoutManager(
//                2, StaggeredGridLayoutManager.VERTICAL
//            )
//            setHasFixedSize(true)
//        }
    }
}


data class Data(
    val image: Int,
    val name: String,
    val number: String
)


val dataItems: MutableList<Data> = mutableListOf(
    Data(R.drawable.ic_launcher_background, "Burhan", "03334825710"),
    Data(R.drawable.ic_launcher_background, "Ahmed", "03214225730"),
    Data(R.drawable.ic_launcher_background, "Ayesha", "03334844550"),
    Data(R.drawable.ic_launcher_background, "Amna", "03216745710"),
    Data(R.drawable.ic_launcher_background, "Hanzala", "03334445710"),
    Data(R.drawable.ic_launcher_background, "Naveed", "03334567710"),
    Data(R.drawable.ic_launcher_background, "Momin", "03324825554"),
    Data(R.drawable.ic_launcher_background, "Sallal", "03214325715"),
    Data(R.drawable.ic_launcher_background, "Ali", "03214825710"),
    Data(R.drawable.ic_launcher_background, "Mehak", "03334825710"),
    Data(R.drawable.ic_launcher_background, "Shahzad", "03334825710"),
    Data(R.drawable.ic_launcher_background, "Arham", "03334777710"),
    Data(R.drawable.ic_launcher_background, "Zulfan", "0321543710"),
)