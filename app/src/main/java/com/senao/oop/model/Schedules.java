package com.senao.oop.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by chrisweng on 2017/10/18.
 */

public class Schedules implements Serializable {

    @SerializedName("schedules")
    private ArrayList<Schedule> schedules;

    public ArrayList<Schedule> getSchedules() {
        return schedules;
    }
}
