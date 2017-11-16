package uhack.ypsquad.checkwritertrackingsystem;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int timerDelayed = 2;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(splash.this, home.class));
                finish();
            }
        },timerDelayed * 1000);
//        Intent intent = new Intent(splash.this, home.class);
//        startActivity(intent);

//        int secondsDelayed = 3;
//        new Handler().postDelayed(new Runnable() {
//            public void run() {
//                startActivity(new Intent(SplashScreen.this, HomeScreen.class));
//                finish();
//            }
//        }, secondsDelayed * 1000);
    }
}
