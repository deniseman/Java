package aplicatia2;

public class Fir1 extends Thread {
    Object P9;
    Object P10;

    Fir1(Object P9, Object P10) {
        this.P9 = P9;
        this.P10 = P10;
    }

    public void run() {
        try {
            int temp1 = (int) (Math.random() * (4 - 2 + 1) + 2);
            System.out.println("P1");
            for (int i = 0; i < temp1 * 0.625 * Math.pow(10, 8); i++) {
                i++;
                i--;
            }
            System.out.println("P1 ends");

            synchronized (P9) {
                int temp2 = (int) (Math.random() * (6 - 4 + 1) + 4);
                System.out.println("P4");
                for (int i = 0; i < temp2 * 0.625 * Math.pow(10, 8); i++) {
                    i++;
                    i--;
                }
                System.out.println("P4 ends");

                synchronized (P10) {
                    System.out.println("P6");
                    Thread.sleep(4000);
                }

                System.out.println("P7");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
