package com.lintag.christofferjohn;

        import android.app.IntentService;
        import android.content.Intent;
        import android.support.annotation.Nullable;
        import android.util.Log;

public class MyCustomService extends IntentService {
    public MyCustomService()
    {
        super("MyCustomService");
    }

    protected void onHandleIntent(@Nullable Intent intent){
        Log.d("4ITH", "Service is running");
    }
}
