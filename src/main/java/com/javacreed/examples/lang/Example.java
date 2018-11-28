package com.javacreed.examples.lang;

import java.lang.ref.WeakReference;

public class Example {

  public static void main(final String[] args) {
    Object object = new Object();
    final WeakReference<Object> ref = new WeakReference<>(object);
    object = null;
    while (ref.get() != null) {
      System.gc();
    }
  }
}
