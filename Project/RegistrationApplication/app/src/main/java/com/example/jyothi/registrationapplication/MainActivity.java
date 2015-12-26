package com.example.jyothi.registrationapplication;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tv1;
    Toolbar toolbar;
    SlidingTableLayout tabs;
    String[] tabNames = { "Sign_in","Sign_up" };
    ViewPager pager;
    ViewPagerAdapter adp;
    private EditText first_name,Last_name,e_mail,pass_word,cnfopwd;
    private Button btnsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
//       setSupportActionBar(toolbar);
        tv1 = (TextView) findViewById(R.id.fp);
        first_name = (EditText) findViewById(R.id.firstname);
        Last_name = (EditText) findViewById(R.id.Lastname);
        e_mail = (EditText) findViewById(R.id.email);
        pass_word = (EditText) findViewById(R.id.password);
        cnfopwd = (EditText) findViewById(R.id.cnfpwd);
        btnsubmit = (Button) findViewById(R.id.submit);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        
        tabs = (SlidingTableLayout) findViewById(R.id.tabs);
        pager = (ViewPager) findViewById(R.id.pager);
        tabs.setDistributeEvenly(true);
        tabs.setCustomTabColorizer(new SlidingTableLayout.TabColorizer()
        {


            @Override

            public int getIndicatorColor(int position) {

// TODO Auto-generated method stub

                return getResources().getColor(R.color.tabColor);

            }

        });


        adp = new ViewPagerAdapter(getSupportFragmentManager(), tabNames);

        pager.setAdapter(adp);
        tabs.setViewPager(pager);


    }


  //  @Override

  //  public boolean onCreateOptionsMenu(Menu menu) {

// TODO Auto-generated method stub

     //   getMenuInflater().inflate(R.menu.menu_main, menu);

       // return super.onCreateOptionsMenu(menu);


}
