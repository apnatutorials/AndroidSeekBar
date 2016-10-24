package com.apnatutorials.androidseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{
    SeekBar sbDefaultSeekBar ;
    TextView tvDefaultProgessDetail;

    SeekBar sbCustomSeekBar ;
    TextView tvCustomProgessDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDefaultProgessDetail =(TextView) findViewById(R.id.tvDefaultProgessDetail);
        tvCustomProgessDetail =(TextView) findViewById(R.id.tvCustomProgessDetail);

        sbDefaultSeekBar =(SeekBar) findViewById(R.id.sbDefaultSeekBar);
        sbDefaultSeekBar.setOnSeekBarChangeListener(this);

        sbCustomSeekBar =(SeekBar) findViewById(R.id.sbCustomSeekBar);
        sbCustomSeekBar.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        switch (seekBar.getId()){
            case R.id.sbDefaultSeekBar :
                tvDefaultProgessDetail.setText(progress+"");
                break;
            case R.id.sbCustomSeekBar:
                tvCustomProgessDetail.setText(progress+"");
                break;
        }

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
