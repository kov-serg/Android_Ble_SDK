package com.timaimee.vpbluetoothsdkdemo.oad.service;

import android.app.Activity;

import com.timaimee.vpbluetoothsdkdemo.oad.activity.NotificationActivity;

import vpno.nordicsemi.android.dfu.DfuBaseService;


/**
 * Created by timaimee on 2016/9/6.
 */
public class DfuService extends DfuBaseService {
    @Override
    protected Class<? extends Activity> getNotificationTarget() {
        return NotificationActivity.class;
    }
}
