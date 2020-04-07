package aplicatia1;

public class Fir2 extends Thread{
    private Object P9;
    private Object P10;

    Fir2(Object P9,Object P10){
        this.P9=P9;
        this.P10=P10;
    }

    public void run(){
        try {
            System.out.println("P11");

            synchronized (P9) {
                synchronized (P10) {
                    System.out.println("P12");
                    int temp = (int) (Math.random() * (6 - 3 + 1) + 3);
                    for (int i = 0; i < temp * 0.625 * Math.pow(10, 8); i++) {
                        i++;
                        i--;
                    }
                    System.out.println("P12 ends");
                    Thread.sleep(3000);
                }
            }
            System.out.println("P13");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
