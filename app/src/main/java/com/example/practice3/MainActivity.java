package com.example.practice3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView web = findViewById(R.id.web);
        web.loadUrl("https://www.aparat.com");
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());

        Button btnOpenDrawer =findViewById(R.id.btnOpenDrawer);
        btnOpenDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout Dr = (DrawerLayout)findViewById(R.id.activity_main);
                Dr.openDrawer(Gravity.RIGHT);


            }
        });

        MyTextView MyTextViewToast =findViewById(R.id.MyTextViewToast);
        MyTextViewToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "خوبم مرسی", Toast.LENGTH_LONG).show();
            }
        });
        Button PlayVideo =findViewById(R.id.PlayVideo);
        PlayVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                VideoView vv = findViewById(R.id.vv);
                String url = "https://as4.cdn.asset.aparat.com/aparat-video/93be29e4367b081325e2eb97bc40500818274262-144p.mp4";
                vv.setVideoURI(Uri.parse(url));
                vv.setMediaController(new MediaController(MainActivity.this));
                vv.start();


            }
        });




    }
}