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

public class Baek_7F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baek_7f);
        textview=findViewById(R.id.textView6);

        moving_701();
        moving_702();
        moving_704();
        moving_705();
        moving_706();
        moving_707();
        moving_708();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    // 701호에서 최단거리 이동
    private void moving_701() {
        final Button b = (Button) findViewById(R.id.b_701);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  700, 1260, 1260, 1170); //x 좌표
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  490, 490, 320, 320); //y 좌표
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }

    // 702호에서 최단거리 이동
    private void moving_702() {
        final Button b = (Button) findViewById(R.id.b_702);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1100, 1200, 1200, 1260, 1260, 1170); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  780, 780, 490, 490, 320, 320); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

            }
        });
    }

    //704호에서 최단거리 이동
    private void moving_704() {
        final Button button = (Button) findViewById(R.id.b_704);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 200, 200, 1260, 1260, 1170);
                animation1.setDuration(2600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  700, 490, 490, 320, 320);
                animation3.setDuration(2600);
                animation3.start();


            }
        });
    }

    //705호에서 최단거리 이동
    private void moving_705() {
        final Button button = (Button) findViewById(R.id.b_705);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 190, 190, 1260, 1260, 1170);
                animation1.setDuration(2600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 300, 490, 490, 320, 320);
                animation3.setDuration(2600);
                animation3.start();

            }
        });
    }

    //706호에서 최단거리 이동
    private void moving_706() {
        final Button button = (Button) findViewById(R.id.b_706);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 980, 980, 1260, 1260, 1170);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 300, 490, 490, 320, 320);
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }

    //707호에서 최단거리 이동
    private void moving_707() {
        final Button button = (Button) findViewById(R.id.b_707);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1350, 1200, 1200, 1260, 1260, 1170);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 700, 700, 490, 490, 320, 320);
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }

    //708호에서 최단거리 이동
    private void moving_708() {
        final Button button = (Button) findViewById(R.id.b_708);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1775, 1775);
                animation1.setDuration(1300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 500, 320);
                animation3.setDuration(1300);
                animation3.start();

            }
        });
    }
}
