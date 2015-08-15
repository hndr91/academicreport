package org.academicreport.job;


import android.app.Application;
import android.text.TextUtils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class JobQueueHandling extends Application {
    /**
     * Properties
     */
    private static final String TAG = "Job Queue";
    private RequestQueue mRequestQueue;
    private static JobQueueHandling mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static synchronized JobQueueHandling getmInstance() {
        return mInstance;
    }

    public RequestQueue getmRequestQueue() {

        if (mRequestQueue == null ) {

            mRequestQueue = Volley.newRequestQueue(getApplicationContext());
        }

        return mRequestQueue;
    }

    //set text if empty
    public <T> void addToReqQueue (Request<T> request, String tag) {
        request.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
        getmRequestQueue().add(request);
    }

    public <T> void addToReqQueue (Request<T> request) {
        request.setTag(TAG);
        getmRequestQueue().add(request);
    }

    public void cancelPendingReq(Object tag) {
        if (mRequestQueue != null) {
            mRequestQueue.cancelAll(tag);
        }
    }
}
