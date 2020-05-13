package com.certification.concurrency;

/* newSingleThreadExecutor() : ExecutorService
  Creates a single-threaded executor that uses a single worker thread operating off an unbounded queue.
  Results are processed sequentially in the order in which they are submitted.
*
* newSingleThreadScheduledExecutor() : ScheduledExecutorService
* Creates a single-threaded executor that can schedule commands to run after a given delay or to execute periodically.
*
* newCachedThreadPool() : ExecutorService
  Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available.
  commonly used for pools that require executing many short-lived asynchronous tasks

 newFixedThreadPool(int nThreads) : ExecutorService
 Creates a thread pool that reuses a fixed number of threads operating off a shared unbounded queue.

 newScheduledThreadPool(int nThreads) : Scheduled ExecutorService
 Creates a thread pool that can schedule commands to run after a given delay or to execute periodically.

 */
public class ExecutorsMethods {
}
