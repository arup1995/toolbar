package com.example.pc43.myanimation;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ToolbarWidgetWrapper;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    android.support.v7.widget.Toolbar mToolbar;
    CollapsingToolbarLayout mCollapsingToolBar;
    private TextView mTextView1;
    private TextView mTextView2;
    private TextView mTextView3;
    private TextView mTextView4;
    private TextView mTextView5;
    private TextView mTextView6;
    private TextView mTextView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar1);
        mCollapsingToolBar=(CollapsingToolbarLayout)findViewById(R.id.CollapsingToolbarLayout1);
        mTextView1=(TextView)findViewById(R.id.textview1);
        mTextView2=(TextView)findViewById(R.id.textview2);
        mTextView3=(TextView)findViewById(R.id.textview3);
        mTextView4=(TextView)findViewById(R.id.textview4);
        mTextView5=(TextView)findViewById(R.id.textview5);
        mTextView6=(TextView)findViewById(R.id.textview6);
        mTextView7=(TextView)findViewById(R.id.textview7);
        setSupportActionBar(mToolbar);
        mCollapsingToolBar.setTitle("Collapsing Toolbar");
        mTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=mTextView1.getText().toString();
                mCollapsingToolBar.setTitle(text);
            }
        });
        mTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=mTextView2.getText().toString();
                mCollapsingToolBar.setTitle(text);
            }
        });
        mTextView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=mTextView3.getText().toString();
                mCollapsingToolBar.setTitle(text);
            }
        });
        mTextView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=mTextView4.getText().toString();
                mCollapsingToolBar.setTitle(text);
            }
        });
        mTextView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=mTextView5.getText().toString();
                mCollapsingToolBar.setTitle(text);
            }
        });
        mTextView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=mTextView6.getText().toString();
                mCollapsingToolBar.setTitle(text);
            }
        });
        mTextView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=mTextView7.getText().toString();
                mCollapsingToolBar.setTitle(text);
            }
        });
    }
}
