package com.example.thirdmodule;

import android.app.Activity;
import android.os.Bundle;


import com.xingfeng.android.annotation.Path;

@Path("/ThrirdActivityMoudleActivity")
public class ThrirdActivity extends Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
    }
}
