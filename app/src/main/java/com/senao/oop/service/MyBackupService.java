package com.senao.oop.service;

import com.senao.oop.Manager.ConfigManager;
import com.senao.oop.Manager.JsonManager;
import com.senao.oop.Manager.ScheduleManager;

import java.util.ArrayList;

/**
 * Created by chrisweng on 2017/11/6.
 */

public class MyBackupService {

    private ArrayList<JsonManager> managers;

    public void myBackupService() {
        managers = new ArrayList<>();
        managers.add(new ConfigManager());
        managers.add(new ScheduleManager());
    }

    public void processJsonConfigs() {
        for (JsonManager manager : managers) {
            manager.processSchedules();
        }
    }

    public void doBackup() {

    }
}
