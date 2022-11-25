package com.example.isgi_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.web);
                webView.loadUrl("https://isgim.edupage.org/?");
                webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        //js true
        webSettings.setJavaScriptEnabled(true);
        //localStorage
        webSettings.setDomStorageEnabled(true);
        //view port tous tele
        webSettings.setUseWideViewPort(true);
        //acces fil
        webSettings.setAllowContentAccess(true);
        webSettings.setAllowFileAccess(true);
        //support zoom
        webSettings.setDisplayZoomControls(true);
        webSettings.setSupportZoom(true);


    }
    //can go back


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK && webView.canGoBack()){
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}