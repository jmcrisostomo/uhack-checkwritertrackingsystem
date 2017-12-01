package uhack.ypsquad.checkwritertrackingsystem;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.style.Circle;
import com.github.ybq.android.spinkit.style.FoldingCube;

public class splash extends AppCompatActivity {

    private ProgressBar progressBar;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Remove title bar
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        progressBar = (ProgressBar)findViewById(R.id.splash_progressBar);
//        FoldingCube foldingCube = new FoldingCube();
//        progressBar.setIndeterminateDrawable(foldingCube);

        Circle circle = new Circle();
        progressBar.setIndeterminateDrawable(circle);

        int timerDelayed = 2;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                intent = new Intent(splash.this, loginUser.class);
                startActivity(intent);
                finish();
            }
        },timerDelayed * 1000);



//Remove notification bar
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

//set content view AFTER ABOVE sequence (to avoid crash)
        //setContentView(R.layout.activity_splash);
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
