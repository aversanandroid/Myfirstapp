package com.example.premrajs.myfirstapp;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample);
        Button button = (Button) findViewById(R.id.button);
        final EditText Etext= (EditText) findViewById(R.id.textbox);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               if(Etext.getText().toString().equalsIgnoreCase("Prem"))
                {
                    setContentView(R.layout.activity_main);
                }
            }
        });


    }


}
