package com.example.darek.myalarmclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ToSettingAlarms toSettingAlarms;
    private Button bGetHour;
    private Button bGetMinutes;
    private TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toSettingAlarms = new SetAlarm();

        bGetHour = (Button) findViewById(R.id.bGetHour);
        bGetMinutes = (Button) findViewById(R.id.bGetMinutes);
        timePicker = (TimePicker) findViewById(R.id.timePicker);

        bGetHour.setOnClickListener(this);
        bGetMinutes.setOnClickListener(this);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bGetHour:
                startActivity(toSettingAlarms.setAlarm(
                        timePicker.getCurrentHour(),
                        timePicker.getCurrentMinute()));
                break;
        }
    }
}
