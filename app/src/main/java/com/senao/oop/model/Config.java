package com.senao.oop.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by chrisweng on 2017/10/18.
 */

public class Config implements Serializable {
    @SerializedName("ext")
    private String ext;
    @SerializedName("location")
    private String location;
    @SerializedName("subDirectory")
    private boolean subDirectory;
    @SerializedName("unit")
    private String unit;
    @SerializedName("remove")
    private boolean remove;
    @SerializedName("handler")
    private String handler;
    @SerializedName("destination")
    private String destination;
    @SerializedName("dir")
    private String dir;
    @SerializedName("connectionString")
    private String connectionString;

    public String getExt() {
        return ext;
    }

    public String getLocation() {
        return location;
    }

    public boolean isSubDirectory() {
        return subDirectory;
    }

    public String getUnit() {
        return unit;
    }

    public boolean isRemove() {
        return remove;
    }

    public String getHandler() {
        return handler;
    }

    public String getDestination() {
        return destination;
    }

    public String getDir() {
        return dir;
    }

    public String getConnectionString() {
        return connectionString;
    }
}
