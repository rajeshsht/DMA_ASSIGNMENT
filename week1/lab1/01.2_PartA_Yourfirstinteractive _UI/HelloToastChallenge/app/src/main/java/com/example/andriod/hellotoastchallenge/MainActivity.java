package com.example.andriod.hellotoastchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    public static final String KEY = "com.example.hellotoastchallenge";

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("KEY",mCount);
        Log.d("MainActivity","onSaveInstanceState()");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null){
            mCount = savedInstanceState.getInt("KEY", 0);
        }

        mShowCount = (TextView) findViewById(R.id.show_count);
        mShowCount.setText(""+mCount);
        Log.d("MainActivity", "onCreate()");
    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this,R.string.toast_message, Toast.LENGTH_LONG);
        toast.show();
        Log.d("MainActivity", "showToast()");
    }

    public void countUp(View view){
        mCount++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
            Log.d("MainActivity", "countUp");
        }
    }

    public void countReset(View view){
        mCount =0;
        mShowCount.setText(Integer.toString(mCount));
        Log.d("MainActivity", "countUp");
    }
}
