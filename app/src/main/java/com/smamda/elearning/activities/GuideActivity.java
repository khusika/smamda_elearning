package com.smamda.elearning.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.smamda.elearning.R;

/**
 * Created by khusika on 13/12/15.
 */
public class GuideActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        toolbar = (Toolbar) findViewById(R.id.guide_toolbar);

        setupToolbar();

    }

    private void setupToolbar(){
        toolbar.setTitle(getString(R.string.app_name));
    }

}
