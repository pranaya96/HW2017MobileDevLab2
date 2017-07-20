package com.pranayaa.lab2;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    private LinearLayout mbackGround;

    private Button mBlueButton;
    private  Button mGreenButton;

    private boolean mGreenState = false;
    private boolean mBlueState = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbackGround =(LinearLayout) findViewById(R.id.background_id);
        mBlueButton = (Button) findViewById(R.id.button_A_id);
        mTextView = (TextView) findViewById(R.id.mood_text_id);
        mBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText("now we feel blue");
                mbackGround.setBackgroundColor(ContextCompat.getColor(MainActivity.this, android.R.color.holo_blue_bright));

                if(mBlueState == false){
                    Toast.makeText(MainActivity.this, "now we feel blue", Toast.LENGTH_SHORT).show();
                    mBlueState = true;
                    mGreenState = false;
                }
            }
        });


        mGreenButton = (Button) findViewById(R.id.button_B_id);
        mGreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText("now we feel green");
                mbackGround.setBackgroundColor(ContextCompat.getColor(MainActivity.this, android.R.color.holo_green_light));
                if(mGreenState==false){
                    Toast.makeText(MainActivity.this, "now we feel green", Toast.LENGTH_SHORT).show();
                    mGreenState = true;
                    mBlueState = false;
                }
            }
        });


    }
}
