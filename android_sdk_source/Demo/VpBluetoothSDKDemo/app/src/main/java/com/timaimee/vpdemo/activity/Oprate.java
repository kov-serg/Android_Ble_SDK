package com.timaimee.vpdemo.activity;

/**
 * Created by Administrator on 2017/11/25.
 */

public interface Oprate {
    public final static String PWD_COMFIRM = "1. Device Password-Authentication";
    public final static String PERSONINFO_SYNC = "2. Personal Information-Settings";
    public final static String SETTING_FIRST = "<-First operation 1, 2";
    public final static String PWD_MODIFY = "Device Password-Change";
    public final static String HEART_DETECT_START = "Measuring Heart Rate-Start";
    public final static String HEART_DETECT_STOP = "Measuring Heart Rate-End";
    public final static String BP_DETECT_START = "Measuring blood pressure-start";
    public final static String BP_DETECT_STOP = "Measuring Blood Pressure-End";
    public final static String BP_DETECTMODEL_SETTING = "Blood pressure mode-settings";
    public final static String BP_DETECTMODEL_SETTING_ADJUSTE = "Blood Pressure Mode [Dynamic Adjustment] -Settings";
    public final static String BP_DETECTMODEL_SETTING_ADJUSTE_CANCEL = "Blood pressure mode [dynamic adjustment] -cancel";
    public final static String BP_DETECTMODEL_READ = "Blood Pressure Mode-Read";
    public final static String SPORT_CURRENT_READ = "Current step count-read";
    public final static String CAMERA_START = "Shooting Mode-Start";
    public final static String CAMERA_STOP = "Shooting Mode-Stop";
    public final static String ALARM_SETTING = "Alarm clock-settings";
    public final static String ALARM_READ = "Alarm clock-read";
    public final static String ALARM_NEW_READ = "New alarm clock-read";
    public final static String ALARM_NEW_ADD = "New Alarm-Added";
    public final static String ALARM_NEW_MODIFY = "New alarm clock-modified";
    public final static String ALARM_NEW_DELETE = "New alarm-delete";
    public final static String LONGSEAT_SETTING_OPEN = "Sit-Open";
    public final static String LONGSEAT_SETTING_CLOSE = "Sit-Closed";
    public final static String LONGSEAT_READ = "Sit-Read";
    public final static String LANGUAGE_CHINESE = "Language Settings-Chinese";
    public final static String LANGUAGE_ENGLISH = "Language Settings-English";
    public final static String BATTERY = "Battery Status-Read";
    public final static String NIGHT_TURN_WRIST_OPEN = "Wrist Turn at Night-Open";
    public final static String NIGHT_TURN_WRIST_CLOSE = "Wrist Turns At Night-Closed";
    public final static String NIGHT_TURN_WRIST_READ = "Wrist Turn at Night-Read";
    public final static String NIGHT_TURN_WRIST_CUSTOM_TIME = "Wrist Turn at Night-Custom Time";
    public final static String NIGHT_TURN_WRIST_CUSTOM_TIME_LEVEL = "Wrist Turn at Night-Custom Time and Level";
    public final static String FINDPHONE = "Anti-lost mobile phones";
    public final static String CHECK_WEAR_SETING_OPEN = "Wear Detection-Open";
    public final static String CHECK_WEAR_SETING_CLOSE = "Wear Detection-Off";
    public final static String FINDDEVICE_SETTING_OPEN = "Equipment anti-lost-open";
    public final static String FINDDEVICE_SETTING_CLOSE = "Anti-lost device-shutdown";
    public final static String FINDDEVICE_READ = "Device Lost-Reading";
    public final static String DEVICE_COUSTOM_READ = "Personalization-Reading";
    public final static String DEVICE_COUSTOM_SETTING = "Personalization-Settings";
    public final static String SOCIAL_MSG_SETTING = "Social Message Reminders-Settings";
    public final static String SOCIAL_MSG_READ = "Social Message Reminders-Reading Settings";
    public final static String SOCIAL_MSG_SEND = "Social Message Reminder-Send Content";
    public final static String SOCIAL_PHONE_IDLE_OR_OFFHOOK = "Social Message Alert-Answered Call";
    public final static String DEVICE_CONTROL_PHONE = "Monitoring Bracelet-Hang Up, Mute";
    public final static String HEARTWRING_READ = "Heart Rate Alarm-Read";
    public final static String HEARTWRING_OPEN = "Heart rate alarm-on";
    public final static String HEARTWRING_CLOSE = "Heart rate alarm-off";
    public final static String SPO2H_OPEN = "Blood Oxygen-Read";
    public final static String SPO2H_CLOSE = "Blood Oxygen-End";
    public final static String SPO2H_AUTO_DETECT_READ = "Automatic blood oxygen detection-read";
    public final static String SPO2H_AUTO_DETECT_OPEN = "Blood oxygen automatic detection-open";
    public final static String SPO2H_AUTO_DETECT_CLOSE = "Automatic blood oxygen detection-off";
    public final static String FATIGUE_OPEN = "Fatigue-reading";
    public final static String FATIGUE_CLOSE = "Fatigue-End";
    public final static String WOMEN_SETTING = "Women's Status-Setting";
    public final static String WOMEN_READ = "Women's Status-Reading";
    public final static String COUNT_DOWN_WATCH = "Countdown-watch alone";
    public final static String COUNT_DOWN_APP = "Countdown-App Use";
    public final static String COUNT_DOWN_APP_READ = "Countdown-Read";
    public final static String SCREEN_LIGHT_SETTING = "Screen Adjustments-Settings";
    public final static String SCREEN_LIGHT_READ = "Screen Adjustment-Read";
    public final static String SCREEN_STYLE_READ = "Screen Style-Reading";
    public final static String SCREEN_STYLE_SETTING = "Screen Style-Settings";
    public final static String AIM_SPROT_CALC = "Target steps-calculation";
    public final static String INSTITUTION_TRANSLATION = "Metric and English Conversion";
    public final static String READ_HEALTH_DRINK = "Reading Health Data-Drinking";
    public final static String READ_HEALTH_SLEEP = "Read Health Data-Sleep";
    public final static String READ_HEALTH_SLEEP_FROM = "Read Health Data-Sleep-From What Day";
    public final static String READ_HEALTH_SLEEP_SINGLEDAY = "Read Health Data-Sleep-Read This Day";
    public final static String READ_HEALTH_ORIGINAL = "Read health data-5 minutes";
    public final static String READ_HEALTH_ORIGINAL_FROM = "Reading Health Data-From Which Day";
    public final static String READ_HEALTH_ORIGINAL_SINGLEDAY = "Read health data-read this day";
    public final static String READ_HEALTH = "Read Health Data-All";
    public final static String OAD = "Firmware Update";
    public final static String SHOW_SP = "show sp";
    public final static String SPORT_MODE_ORIGIN_READ = "Reading Data-Sports Mode";
    public final static String SPORT_MODE_ORIGIN_READSTAUTS = "Read status-sport mode";
    public final static String SPORT_MODE_ORIGIN_START = "On-Sport Mode";
    public final static String SPORT_MODE_ORIGIN_END = "End-Sport Mode";
    public final static String SPO2H_ORIGIN_READ = "Reading Data-SpO2 Data";
    public final static String HRV_ORIGIN_READ = "Reading Data-HRV Data";
    public final static String CLEAR_DEVICE_DATA = "Clear data";
    public final static String DISCONNECT = "Bluetooth connection-disconnect";
    public final static String DETECT_PTT = "PTT";
    public final static String DETECT_START_ECG = "Start measuring ECG";
    public final static String DETECT_STOP_ECG = "End of measurement of ECG";
    public final static String LOW_POWER_READ = "Low Power-Read";
    public final static String LOW_POWER_OPEN = "Low Power-On";
    public final static String LOW_POWER_CLOSE = "Low Power-Off";
    public final static String S22_READ_DATA = "S22-Data Read";
    public final static String S22_READ_STATE = "S22-Status Read";
    public final static String S22_SETTING_STATE_OPEN = "S22-Status Setting (On)";
    public final static String S22_SETTING_STATE_CLOSE = "S22-Status Setting (Off)";
    public final static String NONE = "NONE";
    public final static String[] oprateStr = new String[]{
            PWD_COMFIRM, PERSONINFO_SYNC, SETTING_FIRST, PWD_MODIFY,
            HEART_DETECT_START, HEART_DETECT_STOP, BP_DETECT_START, BP_DETECT_STOP, BP_DETECTMODEL_SETTING, BP_DETECTMODEL_READ,
            BP_DETECTMODEL_SETTING_ADJUSTE_CANCEL, BP_DETECTMODEL_SETTING_ADJUSTE,
            SPORT_CURRENT_READ, CAMERA_START, CAMERA_STOP, ALARM_SETTING, ALARM_READ, ALARM_NEW_READ, ALARM_NEW_ADD, ALARM_NEW_MODIFY, ALARM_NEW_DELETE,
            LONGSEAT_SETTING_OPEN, LONGSEAT_SETTING_CLOSE, LONGSEAT_READ, LANGUAGE_CHINESE, LANGUAGE_ENGLISH,
            BATTERY, NIGHT_TURN_WRIST_OPEN, NIGHT_TURN_WRIST_CLOSE, NIGHT_TURN_WRIST_READ, NIGHT_TURN_WRIST_CUSTOM_TIME, NIGHT_TURN_WRIST_CUSTOM_TIME_LEVEL,
            DEVICE_COUSTOM_READ, DEVICE_COUSTOM_SETTING, FINDPHONE,
            CHECK_WEAR_SETING_OPEN, CHECK_WEAR_SETING_CLOSE,
            FINDDEVICE_SETTING_OPEN, FINDDEVICE_SETTING_CLOSE, FINDDEVICE_READ,
            SOCIAL_MSG_SETTING, SOCIAL_MSG_READ, SOCIAL_MSG_SEND, DEVICE_CONTROL_PHONE, SOCIAL_PHONE_IDLE_OR_OFFHOOK, HEARTWRING_READ, HEARTWRING_OPEN, HEARTWRING_CLOSE,
            SPO2H_OPEN, SPO2H_CLOSE, SPO2H_AUTO_DETECT_READ, SPO2H_AUTO_DETECT_OPEN, SPO2H_AUTO_DETECT_CLOSE, FATIGUE_OPEN, FATIGUE_CLOSE, WOMEN_SETTING, WOMEN_READ, COUNT_DOWN_WATCH, COUNT_DOWN_APP, COUNT_DOWN_APP_READ, SCREEN_LIGHT_SETTING, SCREEN_LIGHT_READ, SCREEN_STYLE_READ, SCREEN_STYLE_SETTING, AIM_SPROT_CALC, INSTITUTION_TRANSLATION,
            READ_HEALTH_SLEEP, READ_HEALTH_SLEEP_FROM, READ_HEALTH_SLEEP_SINGLEDAY, READ_HEALTH_DRINK, READ_HEALTH_ORIGINAL,
            READ_HEALTH_ORIGINAL_FROM, READ_HEALTH_ORIGINAL_SINGLEDAY, READ_HEALTH,
            OAD, SHOW_SP, SPORT_MODE_ORIGIN_READ, SPORT_MODE_ORIGIN_READSTAUTS, SPORT_MODE_ORIGIN_START, SPORT_MODE_ORIGIN_END, SPO2H_ORIGIN_READ, HRV_ORIGIN_READ, CLEAR_DEVICE_DATA, DISCONNECT
            , DETECT_START_ECG, DETECT_STOP_ECG, NONE, LOW_POWER_READ, LOW_POWER_OPEN, LOW_POWER_CLOSE,S22_READ_DATA,S22_READ_STATE,S22_SETTING_STATE_OPEN,S22_SETTING_STATE_CLOSE,DETECT_PTT
    };
}
