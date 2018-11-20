package com.yueping.test;

public class CwUtils {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("image");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public static native String stringFromJNI();
}
