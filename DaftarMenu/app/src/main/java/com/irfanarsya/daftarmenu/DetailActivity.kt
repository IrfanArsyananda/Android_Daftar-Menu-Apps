package com.irfanarsya.daftarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.irfanarsya.daftarmenu.Constant.Companion.BASE_URL_IMAGE
import kotlinx.android.synthetic.main.activity_detail.*
import java.text.NumberFormat
import java.util.*

class DetailActivity : AppCompatActivity() {
    private lateinit var ivMenu : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.title = "Detail Menu"
        ivMenu = findViewById(R.id.detailImageFood)

        val nama = intent.getStringExtra("namaMenu")
        val harga = intent.getStringExtra("hargaMenu")
        val detail = intent.getStringExtra("detailMenu")
        val foto = intent.getStringExtra("imgMenu")
//        val exFoto = "https://upload.wikimedia.org/wikipedia/commons/b/b7/Burger_King_double_cheeseburger.jpg";

        detailNameFood.text = nama
        detailPriceFood.text = harga
        detailDescFood.text = detail
//        detailHargaTerendah.text = hRendah.toString()
//        detailHargaTertinggi.text = hTinggi.toString()

        //mengubah format harga ke rupiah
//        val lokal = Locale("id", "ID")
//        val formatRupiah = NumberFormat.getCurrencyInstance(lokal)
//        detailHargaTerendah.text = formatRupiah.format(hRendah.toDouble())
//        detailHargaTertinggi.text = formatRupiah.format(hTinggi.toDouble())

        Glide.with(this)
            .load(BASE_URL_IMAGE+foto)
            .into(ivMenu)

    }
}