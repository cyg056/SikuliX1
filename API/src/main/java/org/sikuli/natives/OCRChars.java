/*
 * Copyright (c) 2010-2018, sikuli.org, sikulix.com - MIT license
 */

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sikuli.natives;

public class OCRChars {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OCRChars(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCRChars obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        VisionProxyJNI.delete_OCRChars(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public OCRChars() {
    this(VisionProxyJNI.new_OCRChars__SWIG_0(), true);
  }

  public OCRChars(long n) {
    this(VisionProxyJNI.new_OCRChars__SWIG_1(n), true);
  }

  public long size() {
    return VisionProxyJNI.OCRChars_size(swigCPtr, this);
  }

  public long capacity() {
    return VisionProxyJNI.OCRChars_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    VisionProxyJNI.OCRChars_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return VisionProxyJNI.OCRChars_isEmpty(swigCPtr, this);
  }

  public void clear() {
    VisionProxyJNI.OCRChars_clear(swigCPtr, this);
  }

  public void add(OCRChar x) {
    VisionProxyJNI.OCRChars_add(swigCPtr, this, OCRChar.getCPtr(x), x);
  }

  public OCRChar get(int i) {
    return new OCRChar(VisionProxyJNI.OCRChars_get(swigCPtr, this, i), false);
  }

  public void set(int i, OCRChar val) {
    VisionProxyJNI.OCRChars_set(swigCPtr, this, i, OCRChar.getCPtr(val), val);
  }

}
