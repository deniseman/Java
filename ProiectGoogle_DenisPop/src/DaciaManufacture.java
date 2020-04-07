public class DaciaManufacture {
    private String daciaType;
    private boolean automaticGearbox;
    private int nrOfPieces;
    private int yearOfProduction;
    private int numberOfKilometers;
    private int monthlyRate;
    private int horsepower;

    private DaciaManufacture(Builder builder) {
        this.daciaType=builder.daciaType;
        this.automaticGearbox=builder.automaticGearbox;
        this.nrOfPieces=builder.nrOfPieces;
        this.yearOfProduction=builder.yearOfProduction;
        this.numberOfKilometers=builder.numberOfKilometers;
        this.monthlyRate=builder.monthlyRate;
        this.horsepower=builder.horsepower;
    }


    public static class Builder{
        private String daciaType;
        private boolean automaticGearbox;
        private int nrOfPieces;
        private int yearOfProduction;
        private int numberOfKilometers;
        private int monthlyRate;
        private int horsepower;
        
        public Builder(String daciaType, boolean automaticGearbox,int nrOfPieces, int yearOfProduction,
                       int numberOfKilometers, int monthlyRate, int horsepower){
            this.daciaType=daciaType;
            if(automaticGearbox==true) this.automaticGearbox=true;
                else this.automaticGearbox=false;
            this.nrOfPieces=nrOfPieces;
            this.yearOfProduction=yearOfProduction;
            this.numberOfKilometers=numberOfKilometers;
            this.monthlyRate=monthlyRate;
            this.horsepower=horsepower;

        }

        public DaciaManufacture build(){
            return new DaciaManufacture(this);
        }
    }


    public String getDaciaType() {
        return daciaType;
    }

    public int getNumberOfKilometers() {
        return numberOfKilometers;
    }

    public boolean hasAutomaticGearbox() {
        return automaticGearbox;
    }

    public int getNrOfPieces() {
        return nrOfPieces;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getmonthlyRate() {
        return monthlyRate;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return "Dacia Manufactured" +
                "\ndaciaType=" + daciaType +
                ",\nautomaticGearbox=" + automaticGearbox +
                ",\nnrOfPieces=" + nrOfPieces +
                ",\nyearOfProduction=" + yearOfProduction +
                ",\nnumberOfKilometers=" + numberOfKilometers +
                ",\nmonthlyRate=" + monthlyRate +
                ",\nhorsepower=" + horsepower ;
    }
}
