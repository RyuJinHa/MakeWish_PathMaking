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

public class Baek_3F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baek_3f);
        textview=findViewById(R.id.textView6);

        moving_301();
        moving_302();
        moving_303();
        moving_304();
        moving_305();
        moving_306();
        moving_307();
        moving_308();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    // 301호에서 최단거리 이동
    private void moving_301() {
        final Button b = (Button) findViewById(R.id.b_301);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1080, 1280, 1280, 1200); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  450, 450, 280, 280); //y 좌표
                animation3.setDuration(1600);
                animation3.start();

            }
        });
    }

    // 302호에서 최단거리 이동
    private void moving_302() {
        final Button b = (Button) findViewById(R.id.b_302);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1080, 1280, 1280, 1200); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  450, 450, 280, 280); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

            }
        });
    }

    //303호에서 최단거리 이동
    private void moving_303() {
        final Button button = (Button) findViewById(R.id.b_303);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1080, 1280, 1280, 1200);
                animation1.setDuration(2100);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  450, 450, 280, 280);
                animation3.setDuration(2100);
                animation3.start();

            }
        });
    }

    //304호에서 최단거리 이동
    private void moving_304() {
        final Button button = (Button) findViewById(R.id.b_304);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1280, 1280, 1200);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  480, 280, 280);
                animation3.setDuration(1900);
                animation3.start();


            }
        });
    }

    //305호에서 최단거리 이동
    private void moving_305() {
        final Button button = (Button) findViewById(R.id.b_305);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1530, 1530, 1280, 1280, 1200);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 550, 470, 470, 280, 280);
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }

    //306호에서 최단거리 이동
    private void moving_306() {
        final Button button = (Button) findViewById(R.id.b_306);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1800, 1800);
                animation1.setDuration(1300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450, 280);
                animation3.setDuration(1300);
                animation3.start();

            }
        });
    }

    //307호에서 최단거리 이동
    private void moving_307() {
        final Button button = (Button) findViewById(R.id.b_307);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1690, 1690, 1800, 1800);
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 550, 450, 450, 280);
                animation3.setDuration(1600);
                animation3.start();

            }
        });
    }

    //308호에서 최단거리 이동
    private void moving_308() {
        final Button button = (Button) findViewById(R.id.b_308);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1690, 1690, 1800, 1800);
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 550, 450, 450, 280);
                animation3.setDuration(1600);
                animation3.start();

            }
        });
    }
}
