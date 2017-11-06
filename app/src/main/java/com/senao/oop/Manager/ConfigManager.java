package com.senao.oop.Manager;

import android.util.Log;

import com.senao.oop.Utility;
import com.senao.oop.model.Config;
import com.senao.oop.model.Configs;

/**
 * Created by chrisweng on 2017/11/6.
 */

public class ConfigManager extends JsonManager {
    private static String TAG = "ConfigManager";

    private String json = "{\"configs\": [{\"ext\": \"cs\",\"location\": \"c:\\\\Projects\",\"subDirectory\": true,\"unit\": \"file\",\"remove\": false,\"handler\": \"zip\",\"destination\": \"directory\",\"dir\": \"c:\\\\MyArchieves\",\"connectionString\": \"\"},{\"ext\": \"DOCX\",\"location\": \"c:\\\\Documents\",\"subDirectory\": true,\"unit\": \"file\",\"remove\": false,\"handler\": \"encode\",\"destination\": \"db\",\"dir\": \"\",\"connectionString\": \"MyConnectionString\"},{\"ext\": \"jpg\",\"location\": \"c:\\\\Pictures\",\"subDirectory\": true,\"unit\": \"file\",\"remove\": false,\"handler\": \"\",\"destination\": \"directory\",\"dir\": \"c:\\\\MyArchieves\",\"connectionString\": \"\"}]}";

    @Override
    public void processSchedules() {
        super.processSchedules();
        Configs configs = Utility.covertObj(json, Configs.class);
        for (Config model : configs.getConfigs()) {

            Log.i(TAG, "config model ext: " + model.getExt());
            Log.i(TAG, "config model location: " + model.getLocation());
            Log.i(TAG, "config model subDirectory: " + model.isSubDirectory());
            Log.i(TAG, "config model unit: " + model.getUnit());
            Log.i(TAG, "config model remove: " + model.isRemove());
            Log.i(TAG, "config model handler: " + model.getHandler());
            Log.i(TAG, "config model destination: " + model.getDestination());
            Log.i(TAG, "config model dir: " + model.getDir());
            Log.i(TAG, "config model connectionString: " + model.getConnectionString());
        }
    }
}
