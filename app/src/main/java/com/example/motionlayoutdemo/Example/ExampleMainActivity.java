package com.example.motionlayoutdemo.Example;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import com.example.motionlayoutdemo.R;
import com.google.android.material.appbar.AppBarLayout;

public class ExampleMainActivity extends AppCompatActivity {

    private static final String TAG = "ExampleMainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Log.i(TAG, "onCreate: ");
        setContentView(R.layout.activity_step8_completed);
        coordinateMotion();
    }


    private void coordinateMotion() {
        AppBarLayout appBarLayout  = findViewById(R.id.appbar_layout);
        MotionLayout motionLayout  = findViewById(R.id.motion_layout);

        AppBarLayout.OnOffsetChangedListener listener = new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                float range = new Integer(appBarLayout.getTotalScrollRange());

                float seekPosition = -verticalOffset / range;

                Log.i(TAG, "onOffsetChanged: " +seekPosition);

                motionLayout.setProgress(seekPosition);
            }
        };
        appBarLayout.addOnOffsetChangedListener(listener);
    }


}
