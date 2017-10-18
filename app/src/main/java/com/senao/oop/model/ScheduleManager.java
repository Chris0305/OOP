package com.senao.oop.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

import static com.senao.oop.Utility.covertObj;

/**
 * Created by chrisweng on 2017/10/18.
 */

public class ScheduleManager implements Serializable {
    @SerializedName("schedules")
    private ArrayList<Schedule> schedules;

    public ArrayList<Schedule> getSchedules() {
        return schedules;
    }

    public ScheduleManager processSchedules(String json) {
        return covertObj(json, ScheduleManager.class);
    }
}
