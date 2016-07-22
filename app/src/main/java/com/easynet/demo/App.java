package com.easynet.demo;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * 描述：
 * 创建人：郑永伟
 * 创建时间：2016/7/22
 */
public class App extends Application {

    String APPID = "900042194";//腾讯bugly APPID

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化网易云捕
//        CrashHandler.init(getApplicationContext());


        /**腾讯bugly
         * 第三个参数为SDK调试模式开关，调试模式的行为特性如下：
         ● 输出详细的Bugly SDK的Log；
         ● 每一条Crash都会被立即上报；
         ● 自定义日志将会在Logcat中输出。
         建议在测试阶段建议设置成true，发布时设置为false。
         */
        CrashReport.initCrashReport(getApplicationContext(), APPID, false);//
    }
}
