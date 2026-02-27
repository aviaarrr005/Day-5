class BufferTask implements Runnable {
    private StringBuffer buffer;

    public BufferTask(StringBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            buffer.append(Thread.currentThread().getName().charAt(7));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class BufferThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer sharedBuffer = new StringBuffer();
        
        Thread t1 = new Thread(new BufferTask(sharedBuffer), "Thread-1");
        Thread t2 = new Thread(new BufferTask(sharedBuffer), "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(sharedBuffer.toString());
        System.out.println(sharedBuffer.length());
    }
}