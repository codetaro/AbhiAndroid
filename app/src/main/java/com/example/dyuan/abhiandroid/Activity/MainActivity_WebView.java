package com.example.dyuan.abhiandroid.Activity;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_WebView extends AppCompatActivity implements View.OnClickListener {

    WebView simpleWebView;
    Button loadWebPage, loadFromStaticHtml;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_webview);

        loadFromStaticHtml = findViewById(R.id.loadFromStaticHtml);
        loadFromStaticHtml.setOnClickListener(this);
        loadWebPage = findViewById(R.id.loadWebPage);
        loadWebPage.setOnClickListener(this);
        simpleWebView = findViewById(R.id.simpleWebView);
        progressBar = findViewById(R.id.progressBar1);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.loadFromStaticHtml:
                String customHtml = "<html><body><h1>Hello, AbhiAndroid</h1>" +
                        "<h1>Heading 1</h1><h2>Heading 2</h2><h3>Heading 3</h3>" +
                        "<p>This is a sample paragraph of static HTML In Web view</p>" +
                        "</body></html>";
                simpleWebView.loadData(customHtml, "text/html", "UTF-8");
                break;
            case R.id.loadWebPage:
                simpleWebView.setWebViewClient(new MyWebViewClient());
                String url = "http://abhiandroid.com/ui/";
                simpleWebView.getSettings().setJavaScriptEnabled(true);
                simpleWebView.loadUrl(url);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        if (simpleWebView.canGoBack()) {
            simpleWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    private class MyWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            progressBar.setVisibility(View.GONE);
        }


    }
}
