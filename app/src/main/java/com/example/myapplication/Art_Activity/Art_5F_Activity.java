package com.example.myapplication.Art_Activity;

import android.animation.ObjectAnimator;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;


public class Art_5F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_5f);
        textview=findViewById(R.id.textView6);
        moving_501();
        moving_502();
        moving_503();
        moving_504();
        moving_505();
        moving_506();
        moving_507();
        moving_508();
        moving_509();
        moving_510();
        moving_511();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    // 501호에서 최단거리 이동
    private void moving_501() {
        final Button b = (Button) findViewById(R.id.a_501);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 440,810,810,830); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520,520,635,635); //y 좌표
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

    // 502호에서 최단거리 이동
    private void moving_502() {
        final Button b = (Button) findViewById(R.id.a_502);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 410,810,810,830); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520,520,635,635); //y 좌표
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

    // 503호에서 최단거리 이동
    private void moving_503() {
        final Button b = (Button) findViewById(R.id.a_503);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 440,810,810,830); //x 좌표
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520,520,635,635); //y 좌표
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

    //504호에서 최단거리 이동
    private void moving_504() {
        final Button button = (Button) findViewById(R.id.a_504);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 685,810,810,830);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520,520,635,635);
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

    //505호에서 최단거리 이동
    private void moving_505() {
        final Button button = (Button) findViewById(R.id.a_505);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 980,810,810,830);
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  520,520,635,635);
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

    //506호에서 최단거리 이동
    private void moving_506() {
        final Button button = (Button) findViewById(R.id.a_506);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1300,1400,1400);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520,520,530);
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

    //507호에서 최단거리 이동
    private void moving_507() {
        final Button button = (Button) findViewById(R.id.a_507);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1620,1400,1400);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520,520,530);
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

    //508호에서 최단거리 이동
    private void moving_508() {
        final Button button = (Button) findViewById(R.id.a_508);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1830,1400,1400);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520,520,530);
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

    //509호에서 최단거리 이동
    private void moving_509() {
        final Button button = (Button) findViewById(R.id.a_509);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1620,1400,1400);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520,520,530);
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

    //510호에서 최단거리 이동
    private void moving_510() {
        final Button button = (Button) findViewById(R.id.a_510);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1090,1400,1400);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520,520,530);
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

    //511호에서 최단거리 이동
    private void moving_511() {
        final Button button = (Button) findViewById(R.id.a_511);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 980,810,810,830);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520,520,635,635);
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


