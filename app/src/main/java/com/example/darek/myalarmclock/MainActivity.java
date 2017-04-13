package com.example.darek.myalarmclock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private SetAlarmAccess setAlarmAccess;
    private TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setAlarmAccess = new SetAlarm();

        Button bSetAlarm = (Button) findViewById(R.id.bSetAlarm);
        timePicker = (TimePicker) findViewById(R.id.timePicker);

        bSetAlarm.setOnClickListener(this);
    }


    public void onClick(View v) {
        startActivity(setAlarmAccess.setAlarm(
                timePicker.getCurrentHour(),
                timePicker.getCurrentMinute()));
    }
}
