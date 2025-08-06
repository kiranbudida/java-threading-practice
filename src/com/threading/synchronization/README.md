# Java Synchronization Examples

This folder contains various examples demonstrating different synchronization techniques in Java using threads.

## Contents

### 1. `SynchronizedMethod.java`
Demonstrates how to use the `synchronized` keyword on instance methods to protect shared resources.

### 2. `SynchronizedBlock.java`
Shows how to use synchronized blocks within a method to minimize the synchronized area and improve performance.

### 3. `StaticSynchronization.java`
Illustrates static synchronization using `static synchronized` methods which apply locks at the class level.

### 4. `LockObjectSynchronization.java`
Explains synchronization using a separate `lock` object, which gives more control over locking compared to using `this`.

### 5. `ReentrantLockSynchronization.java`
Demonstrates thread synchronization using ReentrantLock instead of synchronized blocks.
ReentrantLock offers more advanced control over locking, such as:
- Try-locking with timeouts
- Interruptible locks
- Explicit lock and unlock calls

This gives finer-grained control over concurrency compared to implicit locks via synchronized.

## How to Run

Compile and run each class independently to understand how thread synchronization works in Java.
