package com.testcusview;


import android.util.Log;

public class LogUtil {
    private static final String TAG = "LogUtil-sdk";
    public static boolean isDebug = true;

    public LogUtil() {
    }

    public static void d(String tag, String msg) {
        if (isDebug) {
            Log.d(tag, msg);
        }

    }

    public static void logE(String content) {
        int p = 2048;
        long length = (long)content.length();
        if (length >= (long)p && length != (long)p) {
            while(true) {
                if (content.length() <= p) {
                    Log.e("LogUtil-sdk", content);
                    break;
                }

                String logContent = content.substring(0, p);
                content = content.replace(logContent, "");
                Log.e("LogUtil-sdk", logContent);
            }
        } else {
            Log.e("LogUtil-sdk", content);
        }

    }

    public static void d(String msg) {
        if (isDebug) {
            Log.d("LogUtil-sdk", msg);
        }

    }

    public static void i(String msg) {
        if (isDebug) {
            Log.i("LogUtil-sdk", msg);
        }

    }

    public static void w(String msg) {
        if (isDebug) {
            Log.w("LogUtil-sdk", msg);
        }

    }

    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.e(tag, msg);
        }

    }

    public static void e(String msg) {
        if (isDebug) {
            Log.e("LogUtil-sdk", msg);
        }

    }
}
