package com.yhy.refreshlistview.util.klog;

import android.util.Log;

import com.yhy.refreshlistview.util.YhyLog;
import com.yhy.refreshlistview.util.Util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JsonLog {

    public static void printJson(String tag, String msg, String headString) {

        String message;

        try {
            if (msg.startsWith("{")) {
                JSONObject jsonObject = new JSONObject(msg);
                message = jsonObject.toString(YhyLog.JSON_INDENT);
            } else if (msg.startsWith("[")) {
                JSONArray jsonArray = new JSONArray(msg);
                message = jsonArray.toString(YhyLog.JSON_INDENT);
            } else {
                message = msg;
            }
        } catch (JSONException e) {
            message = msg;
        }

        Util.printLine(tag, true);
        message = headString + YhyLog.LINE_SEPARATOR + message;
        String[] lines = message.split(YhyLog.LINE_SEPARATOR);
        for (String line : lines) {
            Log.d(tag, "║ " + line);
        }
        Util.printLine(tag, false);
    }
}
