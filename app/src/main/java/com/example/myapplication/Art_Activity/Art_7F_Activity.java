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


public class Art_7F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_7f);
        textview=findViewById(R.id.textView6);
        moving_701();
        moving_702();
        moving_703();
        moving_704();
        moving_705();
        moving_706();
        moving_707();
        moving_708();
        moving_709();
        moving_710();
        moving_711();
        moving_712();
        moving_713();
        moving_714();
        moving_715();
        moving_716();
        moving_717();
        moving_718();
        moving_719();
        moving_720();
        moving_721();
        moving_722();
        moving_723();
        moving_724();
        moving_725();
        moving_726();
        moving_727();


        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    // 701호에서 최단거리 이동
    private void moving_701() {
        final Button b = (Button) findViewById(R.id.a_701);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 600,780,780,790); //x 좌표
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

    // 702호에서 최단거리 이동
    private void moving_702() {
        final Button b = (Button) findViewById(R.id.a_702);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 500,780,780,790); //x 좌표
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

    // 703호에서 최단거리 이동
    private void moving_703() {
        final Button b = (Button) findViewById(R.id.a_703);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 400,780,780,790); //x 좌표
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

    //704호에서 최단거리 이동
    private void moving_704() {
        final Button button = (Button) findViewById(R.id.a_704);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 305,305,780,780,790);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 660,520,520,635,635);
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

    //705호에서 최단거리 이동
    private void moving_705() {
        final Button button = (Button) findViewById(R.id.a_705);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 305,305,780,780,790);
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  615,520,520,635,635);
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

    //706호에서 최단거리 이동
    private void moving_706() {
        final Button button = (Button) findViewById(R.id.a_706);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 305,780,780,790);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 465,465,635,635);
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

    //707호에서 최단거리 이동
    private void moving_707() {
        final Button button = (Button) findViewById(R.id.a_707);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 305,780,780,790);
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

    //708호에서 최단거리 이동
    private void moving_708() {
        final Button button = (Button) findViewById(R.id.a_708);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 400,780,780,790);
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

    //709호에서 최단거리 이동
    private void moving_709() {
        final Button button = (Button) findViewById(R.id.a_709);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 500,780,780,790);
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

    //710호에서 최단거리 이동
    private void moving_710() {
        final Button button = (Button) findViewById(R.id.a_710);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 600,780,780,790);
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

    //711호에서 최단거리 이동
    private void moving_711() {
        final Button button = (Button) findViewById(R.id.a_711);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 700,780,780,790);
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

    //712호에서 최단거리 이동
    private void moving_712() {
        final Button button = (Button) findViewById(R.id.a_712);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 780,780,790);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520,635,635);
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

    //713호에서 최단거리 이동
    private void moving_713() {
        final Button button = (Button) findViewById(R.id.a_713);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 880,780,780,790);
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

    //714호에서 최단거리 이동
    private void moving_714() {
        final Button button = (Button) findViewById(R.id.a_714);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 980,780,780,790);
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

    //715호에서 최단거리 이동
    private void moving_715() {
        final Button button = (Button) findViewById(R.id.a_715);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1100,1350,1350);
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

    //716호에서 최단거리 이동
    private void moving_716() {
        final Button button = (Button) findViewById(R.id.a_716);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1200,1350,1350);
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

    //717호에서 최단거리 이동
    private void moving_717() {
        final Button button = (Button) findViewById(R.id.a_717);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1300,1350,1350);
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

    //718호에서 최단거리 이동
    private void moving_718() {
        final Button button = (Button) findViewById(R.id.a_718);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1350,1350);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520,530);
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

    //719호에서 최단거리 이동
    private void moving_719() {
        final Button button = (Button) findViewById(R.id.a_719);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1450,1350,1350);
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

    //720호에서 최단거리 이동
    private void moving_720() {
        final Button button = (Button) findViewById(R.id.a_720);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1550,1350,1350);
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

    //721호에서 최단거리 이동
    private void moving_721() {
        final Button button = (Button) findViewById(R.id.a_721);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1650,1350,1350);
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

    //722호에서 최단거리 이동
    private void moving_722() {
        final Button button = (Button) findViewById(R.id.a_722);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1750,1350,1350);
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

    //723호에서 최단거리 이동
    private void moving_723() {
        final Button button = (Button) findViewById(R.id.a_723);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1750,1350,1350);
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

    //724호에서 최단거리 이동
    private void moving_724() {
        final Button button = (Button) findViewById(R.id.a_724);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1650,1350,1350);
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

    //725호에서 최단거리 이동
    private void moving_725() {
        final Button button = (Button) findViewById(R.id.a_725);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1550,1350,1350);
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

    //726호에서 최단거리 이동
    private void moving_726() {
        final Button button = (Button) findViewById(R.id.a_726);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1350,1300,1300,1350,1350);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 730,730,520,520,530);
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

    //727호에서 최단거리 이동
    private void moving_727() {
        final Button button = (Button) findViewById(R.id.a_727);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1100,1350,1350);
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
}

