class Display {
    public synchronized void print(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("]");
    }
}

class SyncThread extends Thread {
    private Display d;
    private String msg;

    public SyncThread(Display d, String msg) {
        this.d = d;
        this.msg = msg;
    }

    public void run() {
        d.print(msg);
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) {
        Display d = new Display();
        SyncThread thread1 = new SyncThread(d, "Hello");
        SyncThread thread2 = new SyncThread(d, "World");
        thread1.start();
        thread2.start();
    }
}

