package com.example.webviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class WebViewResult : AppCompatActivity() {
    var url:String = "https://atwork.atai.ai/login";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_result)

//        val bundle = intent.extras;
//        if(bundle!=null){
//
//            url = bundle.getString("url").toString();
//
//            val duration = Toast.LENGTH_SHORT
//
//            val toast = Toast.makeText(this, url, duration)
//            toast.show()
//        }
        val myWebView : WebView = findViewById(R.id.webView);
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.allowContentAccess = true
        myWebView.settings.domStorageEnabled = true
        myWebView.webViewClient = MyWebViewClient()
//        if(url == ""){
//            url = ""
//        }
        myWebView.loadUrl(url)
    }
    override fun onBackPressed() {
        val myWebView: WebView = findViewById(R.id.webView)
        if (myWebView.canGoBack()) {
            myWebView.goBack()
        } else {
            super.onBackPressed()
        }
    }
    private inner class MyWebViewClient : WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
            // Check if the request is for a URL with HTTP or HTTPS scheme
            if (request.url.scheme.equals("http") || request.url.scheme.equals("https")) {
                return false
            }else{
                val intent = Intent(Intent.ACTION_VIEW, request.url)
                view.context.startActivity(intent)
                return true
            }
        }
    }

}