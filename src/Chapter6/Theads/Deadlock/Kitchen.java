package Chapter6.Theads.Deadlock;

//DEADLOCK: two or more threads wait on each-other FOREVER
public class Kitchen {
    public static final Object spoon = new Object();
    public static final Object bowl = new Object();
    //SYNCHRONIZED: Piece of CODE that only ONE THREAD at a TIME can Access
    public static void main(String[] args) {
        Thread cook1 = new Thread(() -> {
            synchronized (spoon){
                System.out.println("Cook1: HOLD SPOON");
                System.out.println("Cook1: WAIT BOWL");
                synchronized ( bowl){
                    System.out.println("Cook1: HOLD SPOON AND BOWL");
                }
            }
        });

        Thread cook2 = new Thread(() -> {
            synchronized (bowl){
                System.out.println("Cook2: HOLD SPOON");
                System.out.println("Cook2: WAIT BOWL");
                synchronized ( spoon){
                    System.out.println("Cook2: HOLD SPOON AND BOWL");
                }
            }
        });
        cook1.start();
        cook2.start();
    }

    }
