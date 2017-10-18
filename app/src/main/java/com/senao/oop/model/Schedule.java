package com.senao.oop.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by chrisweng on 2017/10/18.
 */

public class Schedule implements Serializable {
    @SerializedName("ext")
    private String ext;
    @SerializedName("time")
    private String time;
    @SerializedName("interval")
    private String interval;

    public String getExt() {
        return ext;
    }

    public String getTime() {
        return time;
    }

    public String getInterval() {
        return interval;
    }
}
