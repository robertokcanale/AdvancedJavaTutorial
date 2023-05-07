package Chapter6.Theads;

//CAN extend other classes as well!
public class RunnableExample implements Runnable{

    @Override
    public void run() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i + " " + Thread.currentThread().getName());
            i++;
        }
    }
}
