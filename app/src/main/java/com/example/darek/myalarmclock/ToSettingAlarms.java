package com.example.darek.myalarmclock;

import android.content.Intent;

/**
 * Created by Darek on 2017-04-12.
 */
public interface ToSettingAlarms {

     //get hour and minute to set new alarm
     void getTime(int hours, int minutes);

     // set new alarm using time picked by getTime
     Intent setAlarm();

}
