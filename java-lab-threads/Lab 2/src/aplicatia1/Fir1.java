package aplicatia1;

public class Fir1 extends Thread{
    private Object P9;
    Fir1(Object P9){
        this.P9=P9;
    }

    public void run(){
        try {
            System.out.println("P1");

            synchronized (P9) {
                System.out.println("P4");
                int temp = (int) (Math.random() * (4 - 2 + 1) + 2);
                for (int i = 0; i < temp * 0.625 * Math.pow(10, 8); i++) {
                    i++;
                    i--;
                }
                System.out.println("P4 ends");
                Thread.sleep(4000);
            }
            System.out.println("P6");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
