package com.wql.uniplugin_test;



import android.util.Log;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import io.dcloud.feature.uniapp.annotation.UniJSMethod;
import io.dcloud.feature.uniapp.bridge.UniJSCallback;
import io.dcloud.feature.uniapp.common.UniModule;

public class TestModule extends UniModule {
    String TAG = "TestModule";
    //run ui thread
    @UniJSMethod(uiThread = true)
    public void testAsyncFunc(JSONObject options, UniJSCallback callback) {
        //前端请求testAsyncFunc方法，将返回 code：successF
        if(callback != null) {
            Log.e(TAG, "testAsyncFunc--"+options);
            JSONObject data = new JSONObject();
            data.put("code", "success");
            callback.invoke(data);
        }
    }

}
