package com.swpu.change;

public class Bri {
    static {
        System.loadLibrary("JNIlib");
    }
    public native void intSixteen(int n);
    public native void intAddress(int n);
    public native void floatSixteen(float f);
    public native void floatAddress(float f);
    public native void charSixteen(char c);
    public native void charAddress(char c);
}
