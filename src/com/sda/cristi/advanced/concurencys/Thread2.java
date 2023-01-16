package com.sda.cristi.advanced.concurencys;

public class Thread2 implements Runnable  {

    @Override
    public void run() {
      System.gc();
      System.runFinalization();
        System.out.println(Thread.currentThread().getName() + " Garbage collector invoked");
    }
}
