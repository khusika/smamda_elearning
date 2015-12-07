package com.smamda.elearning.models;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.smamda.elearning.activities.LoginActivity;
import com.smamda.elearning.activities.MainActivity;
import com.smamda.elearning.R;

/**
 * Created by khusika on 07/12/15.
 */
public class SplashScreen extends Activity {

    private static int splashInterval = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent i = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(i);

                this.finish();
            }

            private void finish() {
                // TODO Auto-generated method stub

            }
        }, splashInterval);

    };
}