package com.example.nac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var url = ""

    fun onClick(view: View) {

        when (findViewById<ImageButton>(view.id)){
            btMercadoLivre -> url="https://www.mercadolivre.com.br"
            btBuscape -> url="https://www.buscape.com.br"
            btEBay -> url="https://www.mercadolivre.com.br"
            btWebmotors -> url="https://www.ebay.com"
            btMagalu -> url="https://www.magazineluiza.com.br"
            btNetshoes -> url="https://www.netshoes.com.br"
            btAmericanas -> url="https://www.americanas.com.br"
            btSubmarino -> url="https://www.submarino.com.br"
        }

        var intent = Intent(this, Web::class.java)
        startActivity(intent);

        intent.putExtra("url",url)
        startActivity(intent)
    }
}
