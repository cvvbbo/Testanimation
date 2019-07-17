package com.testcusview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewanimTES extends AppCompatActivity {


    private ImageView im;
    private Button bt1;
    private Animation animation;

    Button scaleBtn	;
    Animation scaleAnimation;

    TextView tv;
    private Button bt4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tes_anim1);
        im = findViewById(R.id.im);
        bt1 = findViewById(R.id.bt1);

        // todo 核心方法就是这个，然后最后在startanimation即可。
        animation = AnimationUtils.loadAnimation(this, R.anim.translate);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt1.startAnimation(animation);

            }
        });

    }

    public void scale(View view){

        bt1.startAnimation(animation);
        LogUtil.e("1111");

    }



}
