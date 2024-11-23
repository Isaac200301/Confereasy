package com.example.proyecto20;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    ImageView appLogoImage;
    TextView appNombreText, NombreText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
              Intent intent = new Intent(SplashActivity.this, MenuLoginActivity.class);
              startActivity(intent);
              finish();
            }
        };
        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 4000);

        //animaciones

        appLogoImage = findViewById(R.id.appLogoImageView);
        appNombreText = findViewById(R.id.appNameTextView);
        NombreText = findViewById(R.id.nameTextView);

        Animation animacionup = AnimationUtils.loadAnimation(this, R.anim.anim_up);
        Animation animaciondown = AnimationUtils.loadAnimation(this, R.anim.anim_down);

        appLogoImage.setAnimation(animacionup);
        appNombreText.setAnimation(animaciondown);
        NombreText.setAnimation(animaciondown);
    }
}
