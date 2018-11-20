package com.yueping.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'image' library on application startup.
//    static {
//        System.loadLibrary("image");
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(CwUtils.stringFromJNI());
//        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'image' native library,
     * which is packaged with this application.
     */
//    public native String stringFromJNI();
}
