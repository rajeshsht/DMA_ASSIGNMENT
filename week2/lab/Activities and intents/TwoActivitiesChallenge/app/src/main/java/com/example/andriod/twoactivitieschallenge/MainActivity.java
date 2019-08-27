package com.example.andriod.twoactivitieschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public final static String Passage1 = "com.example.andriod.passsage1";
    public final static String Passage2 = "com.example.andriod.passsage2";
    public final static String Passage3 = "com.example.andriod.passsage3";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        String passage1 = res.getString(R.string.passage_one_heading);
        String passage2 = res.getString(R.string.passage_two_heading);
        String passage3 = res.getString(R.string.passage_three_heading);

    }

    public void textOneLunch(View view){
        Intent intent = new Intent(this, SecondActivity.class);
//        intent.putExtra(Passage1, passage1);
        startActivity(intent);

    }

    public void textTwoLunch(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void textThreeLunch(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}
