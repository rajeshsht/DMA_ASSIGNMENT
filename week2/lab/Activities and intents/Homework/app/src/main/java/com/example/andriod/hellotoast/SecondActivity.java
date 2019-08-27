package com.example.andriod.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int mCount = intent.getIntExtra(MainActivity.KEY, 0);
        TextView textView = (TextView) findViewById(R.id.textView_count);
        textView.setText("Hello!\n"+""+mCount);
    }
}
