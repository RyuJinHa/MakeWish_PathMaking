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

public class Baek_5F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baek_5f);
        textview=findViewById(R.id.textView6);

        moving_501();
        moving_502();
        moving_503();
        moving_504();
        moving_505();
        moving_507();
        moving_508();
        moving_509();
        moving_510();
        moving_511();
        moving_512();
        moving_514();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    // 501호에서 최단거리 이동
    private void moving_501() {
        final Button b = (Button) findViewById(R.id.b_501);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  870, 1270, 1270, 1170); //x 좌표
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  470, 470, 310, 310); //y 좌표
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }

    // 502호에서 최단거리 이동
    private void moving_502() {
        final Button b = (Button) findViewById(R.id.b_502);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  400, 1270, 1270, 1170); //x 좌표
                animation1.setDuration(2300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  470, 470, 310, 310); //y 좌표
                animation3.setDuration(2300);
                animation3.start();

            }
        });
    }

    //503호에서 최단거리 이동
    private void moving_503() {
        final Button button = (Button) findViewById(R.id.b_503);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  140, 1270, 1270, 1170);
                animation1.setDuration(2500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  470, 470, 310, 310);
                animation3.setDuration(2500);
                animation3.start();

            }
        });
    }

    //504호에서 최단거리 이동
    private void moving_504() {
        final Button button = (Button) findViewById(R.id.b_504);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 300, 1270, 1270, 1170);
                animation1.setDuration(2500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  470, 470, 310, 310);
                animation3.setDuration(2500);
                animation3.start();


            }
        });
    }

    //505호에서 최단거리 이동
    private void moving_505() {
        final Button button = (Button) findViewById(R.id.b_505);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 870, 1270, 1270, 1170);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 470, 470, 310, 310);
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }

    //507호에서 최단거리 이동
    private void moving_507() {
        final Button button = (Button) findViewById(R.id.b_507);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1200, 1270, 1270, 1170);
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520, 520, 310, 310);
                animation3.setDuration(1600);
                animation3.start();

            }
        });
    }

    //508호에서 최단거리 이동
    private void moving_508() {
        final Button button = (Button) findViewById(R.id.b_508);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1315, 1270, 1270, 1170);
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520, 520, 310, 310);
                animation3.setDuration(1600);
                animation3.start();

            }
        });
    }

    //509호에서 최단거리 이동
    private void moving_509() {
        final Button button = (Button) findViewById(R.id.b_509);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1450, 1270, 1270, 1170);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520, 520, 310, 310);
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }

    //510호에서 최단거리 이동
    private void moving_510() {
        final Button button = (Button) findViewById(R.id.b_510);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1575, 1670, 1670, 1790, 1790);
                animation1.setDuration(1700);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520, 520, 480, 480, 300);
                animation3.setDuration(1700);
                animation3.start();

            }
        });
    }

    //511호에서 최단거리 이동
    private void moving_511() {
        final Button button = (Button) findViewById(R.id.b_511);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1670, 1670, 1790, 1790);
                animation1.setDuration(1700);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 600, 480, 480, 300);
                animation3.setDuration(1700);
                animation3.start();

            }
        });
    }

    //512호에서 최단거리 이동
    private void moving_512() {
        final Button button = (Button) findViewById(R.id.b_512);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1790, 1790);
                animation1.setDuration(1300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 480, 300);
                animation3.setDuration(1300);
                animation3.start();

            }
        });
    }

    //514호에서 최단거리 이동
    private void moving_514() {
        final Button button = (Button) findViewById(R.id.b_514);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1160, 1270, 1270, 1170);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 470, 470, 310, 310);
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }
}
