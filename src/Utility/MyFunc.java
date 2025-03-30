package Utility;

public class MyFunc {

    public static void Wait(int sc) {
        try {
            Thread.sleep(sc * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
