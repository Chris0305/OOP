package com.senao.oop.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

import static com.senao.oop.Utility.covertObj;

/**
 * Created by chrisweng on 2017/10/18.
 */

public class ConfigManager implements Serializable {
    @SerializedName("configs")
    private ArrayList<Config> configs;

    public ArrayList<Config> getConfigs() {
        return configs;
    }

    public ConfigManager processConfigs(String json) {
        return covertObj(json, ConfigManager.class);
    }
}
