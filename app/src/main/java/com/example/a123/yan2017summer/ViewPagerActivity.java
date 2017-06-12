package com.example.a123.yan2017summer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show();
        Log.d("LifeCycle","onCreat");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart");
    }
}
