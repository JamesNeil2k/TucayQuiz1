package com.tucay.tucayquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn_Home;
    Button btn_Down1;
    Button btn_Down2;
    Button btn_Down3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Home = (Button) findViewById(R.id.home);
        btn_Down1 = (Button) findViewById(R.id.down1);
        btn_Down2 = (Button) findViewById(R.id.down2);
        btn_Down3 = (Button) findViewById(R.id.down3);
    }

    public void callSecondActivity (View view) {
        Intent intent = new Intent(this,SecondScreen.class);
        intent.putExtra("name", et_Name.getText().toString());
        startActivity(intent);

    }
}
