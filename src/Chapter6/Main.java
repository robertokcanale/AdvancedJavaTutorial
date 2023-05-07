package Chapter6;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ThreadExample thread = new ThreadExample();
        thread.run();
        System.out.println(Thread.activeCount());
    }
}
