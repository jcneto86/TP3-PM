package com.jcneto.tp3_pm_finale;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class NavegationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegation);

    }
    public void ouvrirGalerie(View view){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
    public void ouvrirVideo(View view){
        Intent intent = new Intent(this, VideoActivity.class);
        startActivity(intent);
    }
    public void quitterApp(View view){
        finishAffinity();
    }

}
