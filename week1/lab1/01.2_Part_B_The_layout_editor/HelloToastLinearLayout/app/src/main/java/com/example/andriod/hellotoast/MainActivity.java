package com.example.andriod.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    public static final String KEY = "com.example.hellotoast";

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("KEY",mCount);
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
    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this,R.string.toast_message, Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view){
        mCount++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void countReset(View view){
        mCount =0;
        mShowCount.setText(Integer.toString(mCount));
    }
}
