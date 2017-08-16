package com.ss.www.mywifidemo.Utils;

import android.content.Context;
import android.net.wifi.WifiManager;

/**
 * Created by Administrator on 2017/8/14.
 */

public class WifiUtil {
    private Context mContext;
    private WifiManager mWifiManager;
    public WifiUtil(Context context){
        this.mContext = context;
        mWifiManager = (WifiManager) mContext.getSystemService(Context.WIFI_SERVICE);
    }
}
