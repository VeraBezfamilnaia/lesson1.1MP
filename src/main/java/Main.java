public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("Group");
        Thread thread1 = new MyThread(group, "Thread1");
        Thread thread2 = new MyThread(group, "Thread2");
        Thread thread3 = new MyThread(group, "Thread3");
        Thread thread4 = new MyThread(group, "Thread4");
        group.setDaemon(true);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(15000);
        group.interrupt();
    }
}
