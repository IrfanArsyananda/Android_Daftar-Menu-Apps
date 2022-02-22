package com.irfanarsya.daftarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    private lateinit var tvName: TextView
    private lateinit var tvEmail: TextView
    private lateinit var tvCredit: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        tvName = findViewById(R.id.tNama)
        tvEmail = findViewById(R.id.tEmail)
        tvCredit = findViewById(R.id.tCredit)
        tvName.text = "Irfan Arsyananda"
        tvEmail.text = "irfan.ars18@gmail.com"
        tvCredit.text = " \n Icon food : \n - https://www.flaticon.com/packs/fast-food-19?k=1645529724846 \n"+
                "Desc food : \n - https://id.wikipedia.org"

        supportActionBar?.title = "About"
    }

}