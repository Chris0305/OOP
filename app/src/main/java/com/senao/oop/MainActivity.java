package com.senao.oop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.senao.oop.service.MyBackupService;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";

//    private String config = "{\"configs\": [{\"ext\": \"cs\",\"location\": \"c:\\\\Projects\",\"subDirectory\": true,\"unit\": \"file\",\"remove\": false,\"handler\": \"zip\",\"destination\": \"directory\",\"dir\": \"c:\\\\MyArchieves\",\"connectionString\": \"\"},{\"ext\": \"DOCX\",\"location\": \"c:\\\\Documents\",\"subDirectory\": true,\"unit\": \"file\",\"remove\": false,\"handler\": \"encode\",\"destination\": \"db\",\"dir\": \"\",\"connectionString\": \"MyConnectionString\"},{\"ext\": \"jpg\",\"location\": \"c:\\\\Pictures\",\"subDirectory\": true,\"unit\": \"file\",\"remove\": false,\"handler\": \"\",\"destination\": \"directory\",\"dir\": \"c:\\\\MyArchieves\",\"connectionString\": \"\"}]}";
//    private String schedule = "{\"schedules\": [{\"ext\": \"jpg\",\"time\": \"7:00\",\"interval\": \"Monday\"},{\"ext\": \"docx\",\"time\": \"20:00\",\"interval\": \"Everyday\"},{\"ext\": \"cs\",\"time\": \"12:00\",\"interval\": \"Everyday\"}]}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MyBackupService  myBackupService = new MyBackupService();
        myBackupService.myBackupService();
        myBackupService.processJsonConfigs();
        myBackupService.doBackup();
    }

}
