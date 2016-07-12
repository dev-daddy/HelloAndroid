package com.dev_daddy.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvHello = (TextView) findViewById(R.id.tv_hello);
        mTvHello.setText("Hello Android~");
        mTvHello.setTextSize(12.5f);
        mTvHello.setHint("hint!");
    }
}
