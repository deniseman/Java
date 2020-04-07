import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        /* //Testare cateva functii initiale de inceput
        DaciaManufacture dacia1=new DaciaManufacture.Builder(DaciaType.DUSTER,10000).build();
        System.out.println(dacia1.getNumberOfKilometers());
        System.out.println(dacia1.getDaciaType());*/

        //Testare array de Dacii
          List<DaciaManufacture> daciaArrayList=new ArrayList<>();
//
          DaciaManufacture dacia1=new DaciaManufacture.Builder("Duster",true, 2,
                2010, 3000, 100,94).build();
          DaciaManufacture dacia2=new DaciaManufacture.Builder("Sandero",false,1,
                2012, 5500,80,72).build();
//          DaciaManufacture dacia3=new DaciaManufacture.Builder("Sandero",false,1,
//                2014, 4000,100,72).build();
//          DaciaManufacture dacia4=new DaciaManufacture.Builder("Sandero",false,1,
//                2014, 5000,80,72).build();
//          DaciaManufacture dacia5=new DaciaManufacture.Builder("Sandero",false,1,
//                2013, 6230,85,72).build();
          DaciaManufacture dacia6=new DaciaManufacture.Builder("Duster",true,1,
                2017, 1200,100,72).build();
          DaciaManufacture dacia7=new DaciaManufacture.Builder("Duster",true,1,
                2016, 4721,110,72).build();

        daciaArrayList.add(dacia1);
        daciaArrayList.add(dacia2);
//        daciaArrayList.add(dacia3);
////        daciaArrayList.add(dacia4);
//        daciaArrayList.add(dacia5);
        daciaArrayList.add(dacia6);
        daciaArrayList.add(dacia7);

//        for(DaciaManufacture dacia:daciaArrayList){
//            System.out.println(dacia.toString());
//        }

        new Dealership(daciaArrayList);

    }
}
