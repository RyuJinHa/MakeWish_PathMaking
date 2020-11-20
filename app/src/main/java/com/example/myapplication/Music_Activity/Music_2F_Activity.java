package com.example.myapplication.Music_Activity;

import android.animation.ObjectAnimator;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;


public class Music_2F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_2f);
        textview=findViewById(R.id.textView6);
        moving_201();
        moving_202();
        moving_203();
        moving_204();
        moving_205();
        moving_206();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    // 201호에서 최단거리 이동
    private void moving_201() {
        final Button b = (Button) findViewById(R.id.m_201);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 400,790,790); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450,450,635); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();
                    }
                    flag = 1;
                } else {
                    {
                        ObjectAnimator animation = ObjectAnimator.ofFloat(iv, "translationX", 0); //기존의 이미지 위치로 복귀
                        animation.setDuration(500);
                        animation.start();

                        ObjectAnimator animation2 = ObjectAnimator.ofFloat(iv, "translationY", 0);
                        animation2.setDuration(500);
                        animation2.start();
                    }
                    flag = 0;
                }

            }
        });
    }

    // 202호에서 최단거리 이동
    private void moving_202() {
        final Button b = (Button) findViewById(R.id.m_202);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 400,790,790); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450,450,635); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();
                    }
                    flag = 1;
                } else {
                    {
                        ObjectAnimator animation = ObjectAnimator.ofFloat(iv, "translationX", 0); //기존의 이미지 위치로 복귀
                        animation.setDuration(500);
                        animation.start();

                        ObjectAnimator animation2 = ObjectAnimator.ofFloat(iv, "translationY", 0);
                        animation2.setDuration(500);
                        animation2.start();
                    }
                    flag = 0;
                }

            }
        });
    }

    // 203호에서 최단거리 이동
    private void moving_203() {
        final Button b = (Button) findViewById(R.id.m_203);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 700,790,790); //x 좌표
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450,450,635); //y 좌표
                        animation3.setDuration(1500);
                        animation3.start();
                    }
                    flag = 1;
                } else {
                    {
                        ObjectAnimator animation = ObjectAnimator.ofFloat(iv, "translationX", 0); //기존의 이미지 위치로 복귀
                        animation.setDuration(500);
                        animation.start();

                        ObjectAnimator animation2 = ObjectAnimator.ofFloat(iv, "translationY", 0);
                        animation2.setDuration(500);
                        animation2.start();
                    }
                    flag = 0;
                }

            }
        });
    }

    //204호에서 최단거리 이동
    private void moving_204() {
        final Button button = (Button) findViewById(R.id.m_204);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1500, 1700, 1700);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520,520, 400);
                        animation3.setDuration(1500);
                        animation3.start();
                    }
                    flag = 1;
                } else {
                    {
                        ObjectAnimator animation = ObjectAnimator.ofFloat(iv, "translationX", 0);
                        animation.setDuration(500);
                        animation.start();

                        ObjectAnimator animation2 = ObjectAnimator.ofFloat(iv, "translationY", 0);
                        animation2.setDuration(500);
                        animation2.start();
                    }
                    flag = 0;
                }

            }
        });
    }

    //205호에서 최단거리 이동
    private void moving_205() {
        final Button button = (Button) findViewById(R.id.m_205);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1300, 1700, 1700);
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  520,520, 400);
                        animation3.setDuration(1800);
                        animation3.start();
                    }
                    flag = 1;
                } else {
                    {
                        ObjectAnimator animation = ObjectAnimator.ofFloat(iv, "translationX", 0);
                        animation.setDuration(500);
                        animation.start();

                        ObjectAnimator animation2 = ObjectAnimator.ofFloat(iv, "translationY", 0);
                        animation2.setDuration(500);
                        animation2.start();
                    }
                    flag = 0;
                }

            }
        });
    }

    //206호에서 최단거리 이동
    private void moving_206() {
        final Button button = (Button) findViewById(R.id.m_206);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1030, 790, 790);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450,450,635);
                        animation3.setDuration(1500);
                        animation3.start();
                    }
                    flag = 1;
                } else {
                    {
                        ObjectAnimator animation = ObjectAnimator.ofFloat(iv, "translationX", 0);
                        animation.setDuration(500);
                        animation.start();

                        ObjectAnimator animation2 = ObjectAnimator.ofFloat(iv, "translationY", 0);
                        animation2.setDuration(500);
                        animation2.start();
                    }
                    flag = 0;
                }

            }
        });
    }
}