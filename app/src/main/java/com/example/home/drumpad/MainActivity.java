package com.example.home.drumpad;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool soundPool;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;
    private int sound9;
    private int sound10;
    private int sound11;
    private int sound12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        sound1 = soundPool.load(getApplicationContext(), R.raw.s01, 1);
        sound2 = soundPool.load(getApplicationContext(), R.raw.s02, 1);
        sound3 = soundPool.load(getApplicationContext(), R.raw.s03, 1);
        sound4 = soundPool.load(getApplicationContext(), R.raw.s04, 1);
        sound5 = soundPool.load(getApplicationContext(), R.raw.s05, 1);
        sound6 = soundPool.load(getApplicationContext(), R.raw.s06, 1);
        sound7 = soundPool.load(getApplicationContext(), R.raw.s07, 1);
        sound8 = soundPool.load(getApplicationContext(), R.raw.s08, 1);
        sound9 = soundPool.load(getApplicationContext(), R.raw.s09, 1);
        sound10 = soundPool.load(getApplicationContext(), R.raw.s10, 1);
        sound11 = soundPool.load(getApplicationContext(), R.raw.s11, 1);
        sound12 = soundPool.load(getApplicationContext(), R.raw.s12, 1);

    }

    public void play1(View v){
        soundPool.play(sound1, 1.0f, 1.0f, 1, 0,11.0f);
    }

    public void play2(View v){
        soundPool.play(sound2, 1.0f, 1.0f, 1, 0,11.0f);
    }

    public void play3(View v){
        soundPool.play(sound3, 1.0f, 1.0f, 1, 0,11.0f);
    }

    public void play4(View v){
        soundPool.play(sound4, 1.0f, 1.0f, 1, 0,11.0f);
    }

    public void play5(View v){
        soundPool.play(sound5, 1.0f, 1.0f, 1, 0,11.0f);
    }

    public void play6(View v){
        soundPool.play(sound6, 1.0f, 1.0f, 1, 0,11.0f);
    }

    public void play7(View v){
        soundPool.play(sound7, 1.0f, 1.0f, 1, 0,11.0f);
    }

    public void play8(View v){
        soundPool.play(sound8, 1.0f, 1.0f, 1, 0,11.0f);
    }

    public void play9(View v){
        soundPool.play(sound9, 1.0f, 1.0f, 1, 0,11.0f);
    }

    public void play10(View v){
        soundPool.play(sound10, 1.0f, 1.0f, 1, 0,11.0f);
    }

    public void play11(View v){
        soundPool.play(sound11, 1.0f, 1.0f, 1, 0,11.0f);
    }

    public void play12(View v){
        soundPool.play(sound12, 1.0f, 1.0f, 1, 0,11.0f);
    }



}
