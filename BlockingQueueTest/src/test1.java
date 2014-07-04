public class test1 implements Runnable {
    public static void main(final String[] args) {
        new Thread(new test1()).start();
    }

    @Override public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("fff");
        }
    }
}