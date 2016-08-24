package com.yhy.refreshlistview.network;

import android.content.Context;
import android.util.Log;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.apache.http.HttpEntity;


/**
 * request client,depend async-http lib
 *
 * @author Johan.H
 *
 */
public class KoraRestClient {
    private String BASE_URL;
    private AsyncHttpClient client;
    private static KoraRestClient instance;
    private Context context;
    public static KoraRestClient getInstance(Context context) {
        if (null == instance) {
            instance = new KoraRestClient();
        }

        return instance;
    }

    private KoraRestClient() {
        super();
        client = new AsyncHttpClient();
        client.setConnectTimeout(5000);

    }

    public void get(String url,
            AsyncHttpResponseHandler responseHandler) {
        client.get(url, responseHandler);
    }

    public void get2(String url,AsyncHttpResponseHandler responseHandler) {
        client.get(url,responseHandler);
    }

    public void get2(String url,HttpEntity entity,AsyncHttpResponseHandler responseHandler){
        client.put(context, url, entity, "application/json", responseHandler);
    }

    public void get2(String url, String token,AsyncHttpResponseHandler responseHandler) {
        client.addHeader("token",token);
        client.get(url,responseHandler);
    }
    public void put3(String url, String token, HttpEntity entity, AsyncHttpResponseHandler responseHandler) {
        if(entity!=null)
            Log.d("johan", "param=="+entity.toString());
        try {
            client.addHeader("token",token);
            client.put(context, url, entity, "application/json", responseHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //适配移动互联
    public void post2(String url,
            AsyncHttpResponseHandler responseHandler) {
        try {
           // url = ActionConst.httpserverIp+"/"+url;
            client.post(url,responseHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void post(String url, HttpEntity entity,
            AsyncHttpResponseHandler responseHandler) {
        if(entity!=null)
            Log.d("johan", "param=="+entity.toString());
        try {
            url = ActionConst.httpserverIp+"/"+url;
            client.post(context, url, entity, "application/json", responseHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void post3(String url, HttpEntity entity,
                     AsyncHttpResponseHandler responseHandler) {
        if(entity!=null)
            Log.d("johan", "param=="+entity.toString());
        try {
            client.post(context, url, entity, "application/json", responseHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void put(String url, HttpEntity entity,
                      AsyncHttpResponseHandler responseHandler) {
        if(entity!=null)
            Log.d("johan", "param=="+entity.toString());
        try {
            client.put(context, url, entity, "application/json", responseHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void put2(String url, String token,AsyncHttpResponseHandler responseHandler) {
        client.addHeader("token",token);
        client.put(url,responseHandler);
    }


}
