package uhack.ypsquad.checkwritertrackingsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.view.Gravity;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.beardedhen.androidbootstrap.TypefaceProvider;
import com.beardedhen.androidbootstrap.api.defaults.DefaultBootstrapBrand;
import com.beardedhen.androidbootstrap.api.defaults.DefaultBootstrapSize;
import com.beardedhen.androidbootstrap.font.FontAwesome;

public class home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public void gotoFormCustomer(View view){
        Intent intent = new Intent(home.this, formAdd.class);
        startActivity(intent);
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TypefaceProvider.registerDefaultIconSets();
        setContentView(R.layout.activity_home);

        generateTables();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Do something
        } else if (id == R.id.nav_settings) {

        } else if (id == R.id.nav_about) {

        } else if (id == R.id.nav_exit) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void generateTables(){
        TableLayout tl_1 = (TableLayout) findViewById(R.id.tl_home);

        String[] names = {"Jonel","Ryan","Jeff","Matt"};

        for (int i = 0; i < 4; i++){
            TableRow row = new TableRow(this);
            TableRow.LayoutParams lp = new TableRow.LayoutParams(new TableLayout.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT));
            row.setLayoutParams(lp);

            TextView textView_1 = new TextView(this);
//            textView_1.setLayoutParams(new LinearLayout.LayoutParams(
//                    LinearLayout.LayoutParams.MATCH_PARENT,
//                    LinearLayout.LayoutParams.WRAP_CONTENT,
//                 1.0f
//             ));
            //LinearLayout cell = new LinearLayout(this);
            //ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            //cell.setLayoutParams(layoutParams);
            //branch id

            textView_1.setText("BR-000"+ i);
            textView_1.setTextAppearance(this, android.R.style.TextAppearance_DeviceDefault_Medium);
            textView_1.setPadding(5, 5, 5, 5);
            textView_1.setTextSize(12);
            textView_1.setGravity(Gravity.CENTER);

            //cell.addView(textView_1);
//            LinearLayout linearLayout_1 = new LinearLayout(this);
//            linearLayout_1.setGravity(Gravity.CENTER);
//            //LinearLayout.LayoutParams layoutParams_1 = new LinearLayout.LayoutParams();
//            linearLayout_1.setLayoutParams(new LinearLayout.LayoutParams(
//                    LinearLayout.LayoutParams.MATCH_PARENT,
//                    LinearLayout.LayoutParams.WRAP_CONTENT,
//                    1.0f
//            ));
//            linearLayout_1.addView(textView_1);




            //branch name
            TextView textView_2 = new TextView(this);
            textView_2.setText(names[i]);
            textView_2.setTextAppearance(this, android.R.style.TextAppearance_DeviceDefault_Medium);
            textView_2.setPadding(5, 5, 5, 5);
            textView_2.setTextSize(12);
            textView_2.setGravity(Gravity.CENTER);
//            LinearLayout linearLayout_2 = new LinearLayout(this);
//            linearLayout_2.setGravity(Gravity.CENTER);
//            //LinearLayout.LayoutParams layoutParams_1 = new LinearLayout.LayoutParams();
//            linearLayout_2.setLayoutParams(new LinearLayout.LayoutParams(
//                    LinearLayout.LayoutParams.MATCH_PARENT,
//                    LinearLayout.LayoutParams.WRAP_CONTENT,
//                    1.0f
//            ));
//            linearLayout_2.addView(textView_2);

            //branch status
            TextView textView_3 = new TextView(this);
            textView_3.setText("Status Null");
            textView_3.setTextAppearance(this, android.R.style.TextAppearance_DeviceDefault_Medium);
            textView_3.setPadding(5, 5, 5, 5);
            textView_3.setTextSize(12);

            //action buttons
            Button button = new Button(this);
            //button.setText(i);
            button.setId(i);

            BootstrapButton bootstrapButton = new BootstrapButton(this);
            bootstrapButton.setBootstrapBrand(DefaultBootstrapBrand.INFO);
            bootstrapButton.setBootstrapSize(DefaultBootstrapSize.SM);
            bootstrapButton.setRounded(true);
            bootstrapButton.setShowOutline(false);
            bootstrapButton.setFontAwesomeIcon(FontAwesome.FA_INFO_CIRCLE);
            bootstrapButton.setId(i);
//                    button.setRounded(true);
//            button.setShowOutline(false);
//            button.setFontAwesomeIcon(FontAwesome.FA_ANDROID);

            final Toast toast = new Toast(this);
            final String btnValue = i + "" ;

            bootstrapButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    toast.makeText(home.this, "Button " + btnValue, Toast.LENGTH_LONG).show();
                }
            });


            row.addView(textView_1);
            row.addView(textView_2);
            row.addView(textView_3);
            row.addView(bootstrapButton);
            tl_1.addView(row,i);
//            Toast toast = new Toast(this);
//            toast.makeText(this, "Hello", Toast.LENGTH_LONG).show();
        }
    }
}
