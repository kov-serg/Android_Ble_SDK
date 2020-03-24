# SDK latest version
## [Version: 2.1.26.15] (https://github.com/HBandSDK/Android_Ble_SDK/blob/master/android_sdk_source/jar_core)

# Directory description

  * -apidoc is the javadoc document, enter the homepage from index.html
  * -demo is the sample code project
  * -jar_core is the main reference package required to use this project, and iterative versions of jar packages will be placed under this file
  * -jar_base is the base package needed to use this project
  * -jniLibs ECG function requires JNI, please refer to demo project for specific configuration
  * -sdkdoc contains some necessary instructions for this project

## Note: To upgrade from 1.x.x.x to 2.x.x.x, you need to modify the following


Due to the unreasonable design of the SDK in the early stage, in order to ensure that the internal enumeration classes are not confused, and maintain the same class name,
This update will transfer all internal enumeration classes under the com.veepoo.protocol.operate package to the com.veepoo.protocol.model.enums package.
If you use the following enumeration, then you will need to modify the class name and redirect the package


Features Involved | Before Modifications <br> com.veepoo.protocol.operate. * | After Modifications <br> com.veepoo.protocol.model.enums. * |
| :------| :------: | :------: |
01. Alarm Clock | AlarmOperater.AOStatus | EAalarmStatus |
02. Blood Pressure Mode | BPModelOprate.BPStatus | EBPStatus |
03. Blood pressure test | BPOperater.BPDetectStatus | EBPDetectStatus |
04. Take Photo | CameraOperater.COStatus | ECameraStatus |
05. Countdown | CountDownOprate.DCStatus | ECustomStatus |
06. Fatigue | FatigueOperate.FatigueStatus | EFatigueStatus |
07. Find Device | FindDeviceOperater.FDStatus | EFindDeviceStatus |
08. Heart Rate | HeartOperater.HeartStatus | EHeartStatus |
09. Heart rate abnormal | HeartWarningOperate.HWStatus | EHeartWaringStatus |
10. Sedentary | LongSeatOperater.LSStatus | ELongSeatStatus |
11. Night Turn Wrist | NightTurnWristOperate.NTStatus | ENightTurnWristeStatus |
12. Blood Oxygen Test | Spo2hDetectOperate.SPO2HStatus | ESPO2HStatus |
13. Women | WomenOperater.OperateStatus | EWomenOprateStatus |
