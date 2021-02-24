package com.jsfd.week1.day10;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/**
 * Gokul R
 * SRM Technologies
 * The thread dump is a snapshot of exactly what your Java program is running at a moment in time.

Although the format and content of the thread dump can vary between different Java vendors, it gives you a list of the stack traces for all Java threads in the Java Virtual Machine at the bare minimum.

You can either analyze-the-problem yourself using this knowledge, or collaborate with those who wrote the running code to analyze the issue.

Thread dump is just a list of all threads running on each thread and the complete stack trace of the code. 
The definition of a stack trace may be alien to you if you are a J2EE Application Server administrator and you have never done development before.

A stack trace is a dump of the current execution stack showing from the bottom up the method calls running on that line.
 */
public class ThreadDump implements ThreadFactory {
  private static final ConcurrentHashMap<String, AtomicInteger> POOL_NUMBER =
                                                       new ConcurrentHashMap<String, AtomicInteger>();
  private final ThreadGroup group;
  private final AtomicInteger threadNumber = new AtomicInteger(1);
  private final String namePrefix;

  public ThreadDump(String threadPoolName) {

      if (threadPoolName == null) {
          throw new NullPointerException("threadPoolName");
      }
            POOL_NUMBER.putIfAbsent(threadPoolName, new AtomicInteger());

      SecurityManager securityManager = System.getSecurityManager();
      group = (securityManager != null) ? securityManager.getThreadGroup() :
                                                    Thread.currentThread().getThreadGroup();

      AtomicInteger poolCount = POOL_NUMBER.get(threadPoolName);

      if (poolCount == null) {
            namePrefix = threadPoolName + " pool-00-thread-";
      } else {
            namePrefix = threadPoolName + " pool-" + poolCount.getAndIncrement() + "-thread-";
      }
  }

  public Thread newThread(Runnable runnable) {
      Thread thread = new Thread(group, runnable, namePrefix + threadNumber.getAndIncrement(), 0);

      if (thread.isDaemon()) {
            thread.setDaemon(false);
      }

      if (thread.getPriority() != Thread.NORM_PRIORITY) {
            thread.setPriority(Thread.NORM_PRIORITY);
      }

      return thread;
  }
  public static void main(String[] args) {
    ThreadMXBean mxBean = ManagementFactory.getThreadMXBean();
    long[] threadIds = mxBean.getAllThreadIds();
    ThreadInfo[] threadInfos =
                    mxBean.getThreadInfo(threadIds);
    
    for (ThreadInfo threadInfo : threadInfos) {
      System.out.println(
          threadInfo.getThreadName());
      System.out.println(
          threadInfo.getBlockedCount());
      System.out.println(
          threadInfo.getBlockedTime());
      System.out.println(
          threadInfo.getWaitedCount());
      System.out.println(
          threadInfo.getWaitedTime());
    }
  }
}
