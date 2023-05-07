package Chapter6.Theads;

//If I extend the THREAD class, I CANNOT extend any other class
public class ThreadExample extends Thread {
    @Override
    public void run(){
        int i = 1;
        while(i<=100){
                System.out.println(i + " " + this.getName());
                i++;
        }
    }
}

// EXTENDS
// Classic interface of a parent-method paradigm of OOF
// child_class extends parent_class
// IMPLEMENTS
// It is used to implement an INTERFACE. An interface only provides ABSTRACT METHODS
// The class itself will implement these abstract methods
