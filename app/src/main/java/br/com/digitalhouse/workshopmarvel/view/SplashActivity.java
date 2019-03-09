package br.com.digitalhouse.workshopmarvel.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.Timer;

import br.com.digitalhouse.workshopmarvel.R;

public class SplashActivity extends AppCompatActivity {

    //private Timer timer = new Timer();
    //private ImageView imageSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}
