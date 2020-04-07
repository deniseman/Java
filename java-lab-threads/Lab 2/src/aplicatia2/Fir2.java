package aplicatia2;

public class Fir2 extends Thread{
    Object P9;
    Object P10;

    Fir2(Object P9, Object P10) {
        this.P9 = P9;
        this.P10 = P10;
    }

    public void run() {
        try {
            int temp1 = (int) (Math.random() * (5 - 3 + 1) + 3);
            System.out.println("P2");
            for (int i = 0; i < temp1 * 0.625 * Math.pow(10, 8); i++) {
                i++;
                i--;
            }
            System.out.println("P2 ends");

            synchronized (P10) {
                int temp2 = (int) (Math.random() * (7 - 5 + 1) + 5);
                System.out.println("P3");
                for (int i = 0; i < temp2 * 0.625 * Math.pow(10, 8); i++) {
                    i++;
                    i--;
                }
                System.out.println("P3 ends");

                synchronized (P9) {
                    System.out.println("P5");
                    Thread.sleep(5000);
                }
            }
            System.out.println("P8");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
