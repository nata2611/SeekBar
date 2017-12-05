package com.example.android.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    SeekBar seekBar;
    Button button1, button2;
    LinearLayout.LayoutParams layoutParams1, layoutParams2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.sbWeight);
        seekBar.setOnSeekBarChangeListener(this);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        layoutParams1 = (LinearLayout.LayoutParams) button1.getLayoutParams();
        layoutParams2 = (LinearLayout.LayoutParams) button2.getLayoutParams();



    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        int leftValue = i;
        int rightValue = seekBar.getMax() - i;

        layoutParams1.weight = leftValue;
        layoutParams2.weight = rightValue;

        button1.requestLayout();
        button2.requestLayout();

        button1.setText(String.valueOf(leftValue));
        button2.setText(String.valueOf(leftValue));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
