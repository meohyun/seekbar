package com.example.p1_21711824;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("SampleProgress");

        SeekBar seekBar = (SeekBar) findViewById(R.id.seekbar);
        TextView textview = (TextView)findViewById(R.id.textview);
        Button button01 = (Button)findViewById(R.id.button01);
        Button button02 = (Button)findViewById(R.id.button02);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekBar.setProgress(progress);
                textview.setText("현재 시크바의 값 : "+progress+"%");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                int progress =seekBar.getProgress();

                progress += 1;

                if (progress >100){
                    progress = 100;
                }

                seekBar.setProgress(progress);

                textview.setText("현재 시크바의 값 : "+progress+"%");

            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int progress =seekBar.getProgress();

                progress -= 1;

                if (progress<0){
                    progress = 0;
                }

                seekBar.setProgress(progress);

                textview.setText("현재 시크바의 값 : "+progress+"%");

            }
        });





    }





}