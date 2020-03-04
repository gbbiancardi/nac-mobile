package com.example.nac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web.*

class Web : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        web.webViewClient = WebViewClient()
        web.settings.javaScriptEnabled = true

        web.loadUrl(intent.getStringExtra("url"))
    }
}
