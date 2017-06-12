package com.example.a123.yan2017summer;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a123.yan2017summer.fragment.DemoFragment;
import com.example.a123.yan2017summer.fragment.WorkFragment;

public class MainActivity extends AppCompatActivity {
    private TextView tv_work;
    private TextView tv_demo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       initialView();
       setListener();
    }

    private void initialView() {
        tv_demo =(TextView) findViewById(R.id.activity_tool_demo);
        tv_work= (TextView) findViewById(R.id.activity_tool_work);

    }
    private void setListener() {
        final WorkFragment workFragment = new WorkFragment();
        final DemoFragment demoFragment = new DemoFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.activity_main_fragment,demoFragment).commit();


        tv_demo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv_work.setTextColor(Color.BLACK);
                tv_demo.setTextColor(Color.RED);
                getSupportFragmentManager().beginTransaction().replace(R.id.activity_main_fragment,demoFragment).commit();
                Toast.makeText(MainActivity.this, "You clicked demo", Toast.LENGTH_SHORT).show();
            }
        });

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                  tv_work.setTextColor(Color.RED);
                  tv_demo.setTextColor(Color.BLACK);
                getSupportFragmentManager().beginTransaction().replace(R.id.activity_main_fragment,workFragment).commit();
                  Toast.makeText(MainActivity.this,"You clicked work", Toast.LENGTH_SHORT).show();
            }
        };
        tv_work.setOnClickListener(listener);
    }
    public void login(View v){
        Toast.makeText(MainActivity.this,"You clicked login", Toast.LENGTH_SHORT).show();
    }


}
