package com.felix.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void toastShow(String s) {
        Toast toast = Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToastPopularMovie(View view) {
        toastShow("Popular Movie Message");
    }

    public void showToastStockHawk(View view) {
        toastShow("Stock Hawk Message");
    }

    public void showToastBuildBigger(View view) {
        toastShow("Build It Bigger Message");
    }

    public void showToastMakeMaterial(View view) {
        toastShow("Make Your App Material Message");
    }

    public void showToastGoUbiquitous(View view) {
        toastShow("Go Ubiquitous Message");
    }

    public void showToastCapstone(View view) {
        toastShow("Capstone Message");
    }
}
