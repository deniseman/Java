package aplicatia1;

public class Fir3 extends Thread{
    private Object P10;

    Fir3(Object P10){
        this.P10=P10;
    }

    public void run(){
        try {
            System.out.println("P2");

            synchronized (P10) {
                System.out.println("P3");
                int temp = (int) (Math.random() * (5 - 2 + 1) + 2);
                for (int i = 0; i < temp * 0.625 * Math.pow(10, 8); i++) {
                    i++;
                    i--;
                }
                System.out.println("P3 ends");
                Thread.sleep(4000);
            }
            System.out.println("P5");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
