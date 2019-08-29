package com.example.andriod.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private int buttonState = 1;
    public static final String KEY = "com.example.hellotoastchallenge";

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
//
//        final Button btn1 = findViewById(R.id.button_count);
//
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(buttonState % 2 == 0){
//                    btn1.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
//                    mCount++;
//                    if(mShowCount != null){
//                        mShowCount.setText(Integer.toString(mCount));
//                    }else{
//                        btn1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
//                    }
//                    buttonState++;
//                }
//            }
//        });
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
