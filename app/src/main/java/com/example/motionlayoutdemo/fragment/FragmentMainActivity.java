package com.example.motionlayoutdemo.fragment;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import com.example.motionlayoutdemo.R;

public class FragmentMainActivity extends AppCompatActivity implements View.OnClickListener, MotionLayout.TransitionListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);



        getFragmentManager().beginTransaction().replace(R.id.container,new FirstFragment());

    }


    @Override
    public void onClick(View v) {

    }

    @Override
    public void onTransitionStarted(MotionLayout motionLayout, int i, int i1) {

    }

    @Override
    public void onTransitionChange(MotionLayout motionLayout, int i, int i1, float v) {

    }

    @Override
    public void onTransitionCompleted(MotionLayout motionLayout, int i) {

    }

    @Override
    public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean b, float v) {

    }
}
