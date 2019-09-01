# concurrency2

## Assignment

- Create a new maven project in IntelliJ
- The main method of a program is running on a thread. Print the name of the thread that main is running on
- In main print that another thread is about to start and then start another thread and
    - have main wait for the other thread to complete
    - have the other thread print out the name of the thread
    - have the other print that it is about to sleep, then sleep for 1 seconds, then print that sleep is over and then return (which ends the thread)
-In main print that main is running again now that the other thread has ended