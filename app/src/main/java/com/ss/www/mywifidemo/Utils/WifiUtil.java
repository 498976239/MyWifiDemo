package com.ss.www.mywifidemo.Utils;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Administrator on 2017/8/14.
 */

public class WifiUtil {
    private Context mContext;
    private WifiManager mWifiManager;// 定义WifiManager对象
    private WifiInfo mWifiInfo;//定义WifiInfo对象
    private List<ScanResult> mWifiList;// 扫描出的网络连接列表
    private List<WifiConfiguration> mWifiConfiguration;// 网络连接列表
    private WifiManager.WifiLock mWifiLock;// 定义一个WifiLock
    public WifiUtil(Context context){
        this.mContext = context;
        // 取得WifiManager对象
        mWifiManager = (WifiManager) mContext.getSystemService(Context.WIFI_SERVICE);
        // 取得WifiInfo对象
        mWifiInfo = mWifiManager.getConnectionInfo();
    }
    public void openWifi(Context context){
        if(mWifiManager != null && !mWifiManager.isWifiEnabled()){
            if(mWifiManager.getWifiState() == 2 || mWifiManager.getWifiState() == 3){
                Toast.makeText(context,"Wifi正在或者已经打开",Toast.LENGTH_SHORT).show();
            }else {
                mWifiManager.setWifiEnabled(true);
            }

        }
    }
}
