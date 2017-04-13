package com.example.darek.myalarmclock;

import android.content.Intent;
import android.provider.AlarmClock;

/**
 * Created by Darek on 2017-04-12.
 */
public class SetAlarm implements ToSettingAlarms {

    public Intent setAlarm(int hour, int minute) {
        Intent newAlarm = new Intent(AlarmClock.ACTION_SET_ALARM);

        newAlarm.putExtra(AlarmClock.EXTRA_MESSAGE, "NEW ALARM");
        newAlarm.putExtra(AlarmClock.EXTRA_HOUR, hour);
        newAlarm.putExtra(AlarmClock.EXTRA_MINUTES, minute);
        newAlarm.putExtra(AlarmClock.EXTRA_SKIP_UI, true);

        return newAlarm;
    }
}
