package com.example.date;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text);
        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        Date dt=new Date();

        text.setText("Time and Date :"+formatter.format(dt));

    }
}