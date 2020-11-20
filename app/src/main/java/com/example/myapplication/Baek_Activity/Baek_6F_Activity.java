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

public class Baek_6F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baek_6f);
        textview=findViewById(R.id.textView6);

        moving_601();
        moving_602();
        moving_603();
        moving_604();
        moving_605();
        moving_606();
        moving_607();
        moving_608();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    // 601호에서 최단거리 이동
    private void moving_601() {
        final Button b = (Button) findViewById(R.id.b_601);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  700, 1265, 1265, 1170); //x 좌표
                animation1.setDuration(2300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  550, 550, 300, 300); //y 좌표
                animation3.setDuration(2300);
                animation3.start();

            }
        });
    }

    // 602호에서 최단거리 이동
    private void moving_602() {
        final Button b = (Button) findViewById(R.id.b_602);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  220, 1000, 1000, 1265, 1265, 1170); //x 좌표
                animation1.setDuration(2500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  330, 330, 550, 550, 300, 300); //y 좌표
                animation3.setDuration(2500);
                animation3.start();

            }
        });
    }

    //603호에서 최단거리 이동
    private void moving_603() {
        final Button button = (Button) findViewById(R.id.b_603);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  480, 1000, 1000, 1265, 1265, 1170);
                animation1.setDuration(2300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  330, 330, 550, 550, 300, 300);
                animation3.setDuration(2300);
                animation3.start();

            }
        });
    }

    //604호에서 최단거리 이동
    private void moving_604() {
        final Button button = (Button) findViewById(R.id.b_604);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 740, 1000, 1000, 1265, 1265, 1170);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  330, 330, 550, 550, 300, 300);
                animation3.setDuration(1900);
                animation3.start();


            }
        });
    }

    //605호에서 최단거리 이동
    private void moving_605() {
        final Button button = (Button) findViewById(R.id.b_605);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1000, 1000, 1265, 1265, 1170);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 330, 550, 550, 300, 300);
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }

    //606호에서 최단거리 이동
    private void moving_606() {
        final Button button = (Button) findViewById(R.id.b_606);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1310, 1310, 1265, 1265, 1170);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 660, 550, 550, 300, 300);
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }

    //607호에서 최단거리 이동
    private void moving_607() {
        final Button button = (Button) findViewById(R.id.b_607);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1310, 1310, 1265, 1265, 1170);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 760, 550, 550, 300, 300);
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }

    //608호에서 최단거리 이동
    private void moving_608() {
        final Button button = (Button) findViewById(R.id.b_608);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1775, 1775);
                animation1.setDuration(1300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 530, 320);
                animation3.setDuration(1300);
                animation3.start();

            }
        });
    }
}
