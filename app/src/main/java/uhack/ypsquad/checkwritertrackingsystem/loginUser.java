package uhack.ypsquad.checkwritertrackingsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.beardedhen.androidbootstrap.TypefaceProvider;
import com.github.ybq.android.spinkit.style.Circle;

public class loginUser extends AppCompatActivity {

    private Button button;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);
        //TypefaceProvider.registerDefaultIconSets();

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);


        button = (Button) findViewById(R.id.btnLoginUser);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(loginUser.this, home.class);
                startActivity(intent);
                finish();
            }
        });

//        onclick
        ProgressBar progressBarLogin = new ProgressBar(this);
        progressBarLogin = (ProgressBar)findViewById(R.id.splash_progressBarLogin);
//        FoldingCube foldingCube = new FoldingCube();
//        progressBar.setIndeterminateDrawable(foldingCube);

        Circle circle = new Circle();
        progressBarLogin.setIndeterminateDrawable(circle);
    }

}
