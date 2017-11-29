package uhack.ypsquad.checkwritertrackingsystem;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.style.FoldingCube;

public class splash extends AppCompatActivity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progressBar = (ProgressBar)findViewById(R.id.splash_progressBar);
        FoldingCube foldingCube = new FoldingCube();
        progressBar.setIndeterminateDrawable(foldingCube);

        int timerDelayed = 2;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(splash.this, home.class));
                finish();
            }
        },timerDelayed * 8000);
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
