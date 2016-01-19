<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.zhisheng.navdrawer">
    <uses-sdk android:minSdkVersion="17" />
    <uses-permission android:name="ANDROID.PERMISSION.INTERNET"></uses-permission>
    <application
        android:allowBackup="true"
        android:icon="@drawable/icon_menu"
        android:label="SRJ_Drawer"
        android:theme="@style/Theme.AppCompat.Light.DarkActionBar">
        <activity
            android:name=".MainActivity"
            android:label="@string/app_name">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>


        <activity
            android:name=".MainActivity1"
            android:label="@string/app_name">

        </activity>

        <activity
            android:name=".ShowDetails"
            android:label="@string/app_name">

        </activity>

        <activity
            android:name=".BikeList"
            android:label="@string/app_name">

        </activity>
        <activity
            android:name=".Show"
            android:label="@string/app_name">

        </activity>

        <activity
            android:name=".CarList"
            android:label="@string/app_name">

        </activity>
        <activity
            android:name=".MobileList"
            android:label="@string/app_name">

        </activity>

        <activity
            android:name=".JSonActivity"
            android:label="@string/app_name">

        </activity>

    </application>

</manifest>
