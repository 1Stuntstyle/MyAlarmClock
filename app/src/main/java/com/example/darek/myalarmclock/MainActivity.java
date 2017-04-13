package com.example.darek.myalarmclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bGtime = (Button) findViewById(R.id.bGetHour);
        Button bGmin = (Button) findViewById(R.id.bGetMinutes);
        bGtime.setOnClickListener(this);
        bGmin.setOnClickListener(this);
    }


    public void onClick(View v){
        //// TODO: 2017-03-21

       TimePicker bTpicker = (TimePicker) findViewById(R.id.timePicker);


        switch (v.getId()){


            case R.id.bGetHour:


                ToSettingAlarms newAlrm;


                ToSettingAlarms.getTime(bTpicker.getCurrentHour(), bTpicker.getCurrentMinute());
                startActivity(newAlarm.setAlarm());
                break;


        }
    }
}
