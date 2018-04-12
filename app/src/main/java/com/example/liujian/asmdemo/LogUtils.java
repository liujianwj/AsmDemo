package com.example.liujian.asmdemo;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by liujian on 2018/4/11.
 */

public class LogUtils {

    public static void system(View v){
        Log.d("MainActivity-asm--", "onclick---"+v.getId());
    }
}
