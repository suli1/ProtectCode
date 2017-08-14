package com.suli.protect;

/**
 * Created by suli on 2017/8/13.
 */

public class Hello {

  static {
    System.loadLibrary("native");
  }

  public static native String say();
}
