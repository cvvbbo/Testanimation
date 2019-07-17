package com.testcusview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TestCus test;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test = findViewById(R.id.test);
        tv1 = findViewById(R.id.tv1);
    }


    public void hehe(View view){
        tv1.scrollTo(-20,-20);
    }

    public void haha(View view){
        tv1.scrollBy(-40,-40);
    }


}
