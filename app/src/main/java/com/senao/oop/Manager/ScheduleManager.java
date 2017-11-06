package com.senao.oop.Manager;

import android.util.Log;

import com.senao.oop.Utility;
import com.senao.oop.model.Schedule;
import com.senao.oop.model.Schedules;

/**
 * Created by chrisweng on 2017/11/6.
 */

public class ScheduleManager extends JsonManager {
    private static String TAG = "ScheduleManager";

    private String json = "{\"schedules\": [{\"ext\": \"jpg\",\"time\": \"7:00\",\"interval\": \"Monday\"},{\"ext\": \"docx\",\"time\": \"20:00\",\"interval\": \"Everyday\"},{\"ext\": \"cs\",\"time\": \"12:00\",\"interval\": \"Everyday\"}]}";

    @Override
    public void processSchedules() {
        super.processSchedules();
        Schedules schedules = Utility.covertObj(json, Schedules.class);
        for (Schedule model : schedules.getSchedules()) {
            Log.i(TAG, "schedule model  Ext : " + model.getExt());
            Log.i(TAG, "schedule model  Time : " + model.getTime());
            Log.i(TAG, "schedule model  Interval : " + model.getInterval());
        }
    }
}
