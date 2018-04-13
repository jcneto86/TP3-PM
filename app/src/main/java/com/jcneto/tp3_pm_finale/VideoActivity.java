package com.jcneto.tp3_pm_finale;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    private static int SPLASHTIMEOUT = 17000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoLogo = (VideoView) findViewById(R.id.videoLogo);
        String uriPath = "android.resource://com.jcneto.tp3_pm_finale/" + R.raw.film;

        Uri uri = Uri.parse(uriPath);
        videoLogo.setVideoURI(uri);
        videoLogo.requestFocus();
        videoLogo.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeItntent = new Intent(VideoActivity.this, NavegationActivity.class);
                startActivity(homeItntent);
                finish();
            }
        }, SPLASHTIMEOUT);
    }
}
