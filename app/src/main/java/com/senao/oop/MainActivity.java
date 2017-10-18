package com.senao.oop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.senao.oop.model.ConfigManager;
import com.senao.oop.model.ScheduleManager;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";

    private String config = "{\"configs\": [{\"ext\": \"cs\",\"location\": \"c:\\\\Projects\",\"subDirectory\": true,\"unit\": \"file\",\"remove\": false,\"handler\": \"zip\",\"destination\": \"directory\",\"dir\": \"c:\\\\MyArchieves\",\"connectionString\": \"\"},{\"ext\": \"DOCX\",\"location\": \"c:\\\\Documents\",\"subDirectory\": true,\"unit\": \"file\",\"remove\": false,\"handler\": \"encode\",\"destination\": \"db\",\"dir\": \"\",\"connectionString\": \"MyConnectionString\"},{\"ext\": \"jpg\",\"location\": \"c:\\\\Pictures\",\"subDirectory\": true,\"unit\": \"file\",\"remove\": false,\"handler\": \"\",\"destination\": \"directory\",\"dir\": \"c:\\\\MyArchieves\",\"connectionString\": \"\"}]}";
    private String schedule = "{\"schedules\": [{\"ext\": \"jpg\",\"time\": \"7:00\",\"interval\": \"Monday\"},{\"ext\": \"docx\",\"time\": \"20:00\",\"interval\": \"Everyday\"},{\"ext\": \"cs\",\"time\": \"12:00\",\"interval\": \"Everyday\"}]}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConfigManager configModel = covertObj(config, ConfigManager.class);
        logModelDetail(configModel);

        ScheduleManager scheduleModel = covertObj(schedule, ScheduleManager.class);
        logModelDetail(scheduleModel);
    }

    private static <T> T covertObj(String content, Class<T> classOfT) {
        Gson gson = new Gson();
        T obj = null;
        try {
            obj = gson.fromJson(content, classOfT);
        } catch (JsonSyntaxException e) {
            Log.e(TAG, "Failed to convert gson:" + content);
            e.printStackTrace();
        }
        return obj;
    }

    private void logModelDetail(Object model) {
        if (model instanceof ConfigManager) {
            for (int i = 0; i < ((ConfigManager) model).getConfigs().size(); i++) {
                Log.i(TAG, "config model " + i + " Ext : " + ((ConfigManager) model).getConfigs().get(i).getExt());
                Log.i(TAG, "config model " + i + " Location : " + ((ConfigManager) model).getConfigs().get(i).getLocation());
                Log.i(TAG, "config model " + i + " isSubDirectory : " + ((ConfigManager) model).getConfigs().get(i).isSubDirectory());
                Log.i(TAG, "config model " + i + " Unit : " + ((ConfigManager) model).getConfigs().get(i).getUnit());
                Log.i(TAG, "config model " + i + " isRemove : " + ((ConfigManager) model).getConfigs().get(i).isRemove());
                Log.i(TAG, "config model " + i + " Handler : " + ((ConfigManager) model).getConfigs().get(i).getHandler());
                Log.i(TAG, "config model " + i + " Destination : " + ((ConfigManager) model).getConfigs().get(i).getDestination());
                Log.i(TAG, "config model " + i + " Dir : " + ((ConfigManager) model).getConfigs().get(i).getDir());
                Log.i(TAG, "config model " + i + " ConnectionString : " + ((ConfigManager) model).getConfigs().get(i).getConnectionString());
            }
        } else {
            for (int i = 0; i < ((ScheduleManager) model).getSchedules().size(); i++) {
                Log.i(TAG, "schedule model " + i + " Ext : " + ((ScheduleManager) model).getSchedules().get(i).getExt());
                Log.i(TAG, "schedule model " + i + " Time : " + ((ScheduleManager) model).getSchedules().get(i).getTime());
                Log.i(TAG, "schedule model " + i + " Interval : " + ((ScheduleManager) model).getSchedules().get(i).getInterval());
            }
        }
    }
}
