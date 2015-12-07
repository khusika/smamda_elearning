package com.smamda.elearning.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.smamda.elearning.R;

/**
 * Created by khusika on 10/12/15.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView Guide;
    private Spinner spinner;

    EditText Username;
    EditText Password;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = (EditText) findViewById(R.id.Username);
        Password = (EditText) findViewById(R.id.Password);
        Login = (Button) findViewById(R.id.Login);
        Login.setOnClickListener(this);
        Guide = (TextView) findViewById(R.id.Guide);
        Guide.setOnClickListener(this);

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.user_login, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.Login:
                Intent mainIntent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(mainIntent);
                break;
            case R.id.Guide:
                Intent guideIntent = new Intent(LoginActivity.this, GuideActivity.class);
                startActivity(guideIntent);
                break;
        }
    }

}
