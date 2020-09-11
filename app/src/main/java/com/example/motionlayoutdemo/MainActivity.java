package com.example.motionlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.motionlayoutdemo.Example.ExampleOneActivity;
import com.example.motionlayoutdemo.fragment.FragmentMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void demoOne(View view) {
        startActivity(new Intent(MainActivity.this,DemoOne.class));
    }

    public void keyFrameDemo(View view) {
        startActivity(new Intent(MainActivity.this,KeyFrameDemoOne.class));

    }

    public void keyFrameCircle(View view) {
        startActivity(new Intent(MainActivity.this,KeyFrameCircle.class));
    }

    public void keyFrameValue(View view) {
        startActivity(new Intent(MainActivity.this,KeyFrameValue.class));
    }

    public void FragmentChange(View view) {
        startActivity(new Intent(MainActivity.this, FragmentMainActivity.class));

    }

    public void ExampleOne(View view) {
        startActivity(new Intent(MainActivity.this, ExampleOneActivity.class));
    }
}