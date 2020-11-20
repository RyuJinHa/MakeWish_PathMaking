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

public class Baek_4F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baek_4f);
        textview=findViewById(R.id.textView6);

        moving_401();
        moving_402();
        moving_403A();
        moving_403B();
        moving_404();
        moving_405();
        moving_406();
        moving_407();
        moving_408();
        moving_409();
        moving_410();
        moving_411();
        moving_412();
        moving_413();
        moving_414();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    // 401호에서 최단거리 이동
    private void moving_401() {
        final Button b = (Button) findViewById(R.id.b_401);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1000, 1270, 1270, 1170); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  450, 450, 280, 280); //y 좌표
                animation3.setDuration(1600);
                animation3.start();

            }
        });
    }

    // 402호에서 최단거리 이동
    private void moving_402() {
        final Button b = (Button) findViewById(R.id.b_402);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  750, 1270, 1270, 1170); //x 좌표
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  450, 450, 280, 280); //y 좌표
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }

    //403A호에서 최단거리 이동
    private void moving_403A() {
        final Button button = (Button) findViewById(R.id.b_403A);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  470, 1270, 1270, 1170);
                animation1.setDuration(2300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  450, 450, 280, 280);
                animation3.setDuration(2300);
                animation3.start();

            }
        });
    }

    //403B호에서 최단거리 이동
    private void moving_403B() {
        final Button button = (Button) findViewById(R.id.b_403B);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 200, 1270, 1270, 1170);
                animation1.setDuration(2500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  450, 450, 280, 280);
                animation3.setDuration(2500);
                animation3.start();


            }
        });
    }

    //404호에서 최단거리 이동
    private void moving_404() {
        final Button button = (Button) findViewById(R.id.b_404);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 150, 1270, 1270, 1170);
                animation1.setDuration(2600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450, 450, 280, 280);
                animation3.setDuration(2600);
                animation3.start();

            }
        });
    }

    //405호에서 최단거리 이동
    private void moving_405() {
        final Button button = (Button) findViewById(R.id.b_405);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 450, 1270, 1270, 1170);
                animation1.setDuration(2300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450, 450, 280, 280);
                animation3.setDuration(2300);
                animation3.start();

            }
        });
    }

    //406호에서 최단거리 이동
    private void moving_406() {
        final Button button = (Button) findViewById(R.id.b_406);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 750, 1270, 1270, 1170);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450, 450, 280, 280);
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }

    //407호에서 최단거리 이동
    private void moving_407() {
        final Button button = (Button) findViewById(R.id.b_407);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 940, 1270, 1270, 1170);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450, 450, 280, 280);
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }

    //408호에서 최단거리 이동
    private void moving_408() {
        final Button button = (Button) findViewById(R.id.b_408);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1050, 1270, 1270, 1170);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450, 450, 280, 280);
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }

    //409호에서 최단거리 이동
    private void moving_409() {
        final Button button = (Button) findViewById(R.id.b_409);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1200, 1270, 1270, 1170);
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 500, 500, 280, 280);
                animation3.setDuration(1500);
                animation3.start();

            }
        });
    }

    //410호에서 최단거리 이동
    private void moving_410() {
        final Button button = (Button) findViewById(R.id.b_410);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1320, 1270, 1270, 1170);
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 500, 500, 280, 280);
                animation3.setDuration(1500);
                animation3.start();

            }
        });
    }

    //411호에서 최단거리 이동
    private void moving_411() {
        final Button button = (Button) findViewById(R.id.b_411);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1440, 1270, 1270, 1170);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 500, 500, 280, 280);
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }

    //412호에서 최단거리 이동
    private void moving_412() {
        final Button button = (Button) findViewById(R.id.b_412);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1580, 1660, 1660, 1790, 1790);
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 500, 500, 450, 450, 250);
                animation3.setDuration(1800);
                animation3.start();

            }
        });
    }

    //413호에서 최단거리 이동
    private void moving_413() {
        final Button button = (Button) findViewById(R.id.b_413);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1790, 1790);
                animation1.setDuration(1300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450, 250);
                animation3.setDuration(1300);
                animation3.start();

            }
        });
    }

    //414호에서 최단거리 이동
    private void moving_414() {
        final Button button = (Button) findViewById(R.id.b_414);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1660, 1660, 1790, 1790);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 600, 450, 450, 250);
                animation3.setDuration(1900);
                animation3.start();

            }
        });
    }
}
