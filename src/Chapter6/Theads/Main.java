package Chapter6.Theads;

public class Main {
    public static void main(String[] args) {
        //Now creating and starting a thread
        ThreadExample thread1 = new ThreadExample();
        thread1.setName("Thread1");
        thread1.start(); //will call the RUN method by itself

        ThreadExample thread2 = new ThreadExample();
        thread2.setName("Thread2");
        thread2.start();

        //BOTH threads are running and executing at the same tie

        System.out.println(Thread.activeCount());

        //Runnable Example Thread
        Thread thread3 = new Thread(new RunnableExample());
        thread3.setName("Thread3");
        thread3.start(); //will call the RUN method by itself
    }
}
