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

public class Baek_2F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baek_2f);
        textview=findViewById(R.id.textView6);

        moving_201();
        moving_202();
        moving_203();
        moving_204();
        moving_205();
        moving_206();
        moving_207();
        moving_208();
        moving_209();
        moving_210();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    // 201호에서 최단거리 이동
    private void moving_201() {
        final Button b = (Button) findViewById(R.id.b_201);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1050, 1200, 1200); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  400, 400, 700); //y 좌표
                animation3.setDuration(1600);
                animation3.start();

            }
        });
    }

    // 202호에서 최단거리 이동
    private void moving_202() {
        final Button b = (Button) findViewById(R.id.b_202);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1050, 1200, 1200); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  510, 510, 700); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

            }
        });
    }

    //203호에서 최단거리 이동
    private void moving_203() {
        final Button button = (Button) findViewById(R.id.b_203);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  720, 720, 1050, 1050, 1200, 1200);
                animation1.setDuration(2100);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  660, 620, 620, 560, 560, 700);
                animation3.setDuration(2100);
                animation3.start();

            }
        });
    }

    //204호에서 최단거리 이동
    private void moving_204() {
        final Button button = (Button) findViewById(R.id.b_204);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 530, 530, 1050, 1050, 1200, 1200);
                animation1.setDuration(2300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  660, 620, 620, 560, 560, 700);
                animation3.setDuration(2300);
                animation3.start();


            }
        });
    }

    //205호에서 최단거리 이동
    private void moving_205() {
        final Button button = (Button) findViewById(R.id.b_205);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 410, 410, 1050, 1050, 1200, 1200);
                animation1.setDuration(2300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 660, 620, 620, 560, 560, 700);
                animation3.setDuration(2300);
                animation3.start();

            }
        });
    }

    //206호에서 최단거리 이동
    private void moving_206() {
        final Button button = (Button) findViewById(R.id.b_206);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  300, 1050, 1050, 1200, 1200);
                animation1.setDuration(2300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  620, 620, 560, 560, 700);
                animation3.setDuration(2300);
                animation3.start();

            }
        });
    }

    //207호에서 최단거리 이동
    private void moving_207() {
        final Button button = (Button) findViewById(R.id.b_207);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 300, 1050, 1050, 1200, 1200);
                animation1.setDuration(2500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 620, 620, 560, 560, 700);
                animation3.setDuration(2500);
                animation3.start();

            }
        });
    }

    //208호에서 최단거리 이동
    private void moving_208() {
        final Button button = (Button) findViewById(R.id.b_208);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 150, 200, 1200, 1200);
                animation1.setDuration(2500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 160, 400, 400, 700);
                animation3.setDuration(2500);
                animation3.start();

            }
        });
    }

    //209호에서 최단거리 이동
    private void moving_209() {
        final Button button = (Button) findViewById(R.id.b_209);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1020, 950, 950, 1230, 1230, 1150);
                animation1.setDuration(2000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 160, 160, 400, 400, 250, 250);
                animation3.setDuration(2000);
                animation3.start();

            }
        });
    }

    //210호에서 최단거리 이동
    private void moving_210() {
        final Button button = (Button) findViewById(R.id.b_210);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1020, 950, 950, 1230, 1230, 1150);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 280, 280, 400, 400, 250, 250);
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }
}
