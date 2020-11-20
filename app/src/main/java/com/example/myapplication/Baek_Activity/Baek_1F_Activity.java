package com.example.myapplication.Baek_Activity;

import android.animation.ObjectAnimator;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Baek_1F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baek_1f);
        textview=findViewById(R.id.textView6);

        moving_102();
        moving_103();
        moving_104();
        moving_105();
        moving_106();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    // 102호에서 최단거리 이동
    private void moving_102() {
        final Button b = (Button) findViewById(R.id.b_102);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  700, 700, 940, 940); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  700, 640, 640, 700); //y 좌표
                animation3.setDuration(1600);
                animation3.start();

            }
        });
    }

    // 103호에서 최단거리 이동
    private void moving_103() {
        final Button b = (Button) findViewById(R.id.b_103);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  500, 940, 940); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  500, 500, 700); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

            }
        });
    }

    //104호에서 최단거리 이동
    private void moving_104() {
        final Button button = (Button) findViewById(R.id.b_104);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  610, 610, 940, 940);
                animation1.setDuration(2100);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  350, 500, 500, 700);
                animation3.setDuration(2100);
                animation3.start();

            }
        });
    }

    //105호에서 최단거리 이동
    private void moving_105() {
        final Button button = (Button) findViewById(R.id.b_105);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 750, 750, 940, 940);
                 animation1.setDuration(1900);
                 animation1.start();

                 ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  350, 500, 500, 700);
                 animation3.setDuration(1900);
                 animation3.start();


            }
        });
    }

    //106호에서 최단거리 이동
    private void moving_106() {
        final Button button = (Button) findViewById(R.id.b_106);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 920, 940);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 350, 700);
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }
}