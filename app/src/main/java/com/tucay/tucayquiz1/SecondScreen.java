package com.tucay.tucayquiz1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by James on 9/28/2017.
 */

public class SecondScreen extends AppCompatActivity {
    Button btn_Home;
    Button btn_Down1;
    Button btn_Down2;
    Button btn_Down3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display1);
    }

    public void goBackToMain (View view) {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }

}
