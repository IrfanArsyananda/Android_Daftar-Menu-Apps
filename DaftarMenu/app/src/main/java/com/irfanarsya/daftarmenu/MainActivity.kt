package com.irfanarsya.daftarmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.MovementMethod
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
//    private var title: String = "Semua Menu"
    private lateinit var rvMenu: RecyclerView
    private var list: ArrayList<Menu> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMenu = findViewById(R.id.rv_menu)
        rvMenu.setHasFixedSize(true)

        list.addAll(MenuData.listData)
        showRecyclerList()
        supportActionBar?.title = "Semua Menu"
    }

    private fun showRecyclerList() {
        rvMenu.layoutManager = LinearLayoutManager(this)
        val listMenuAdapter = ListMenuAdapter(list)
        rvMenu.adapter = listMenuAdapter
    }

    override fun onCreateOptionsMenu(menu: android.view.Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
//                title = "About"
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.action_exit -> {
                val moveIntent = Intent(this@MainActivity, SplashScreen::class.java)
                startActivity(moveIntent)
            }

//            R.id.action_cardview -> {
//            }

        }
//        setActionBarTitle(title)
    }

//    private fun setActionBarTitle(title: String) {
//        supportActionBar?.title = title
//    }
}