public class Call {

    private int sourceNumber=0;
    private int destinationNumber=0;
    private int duration=0;
    private int band=0;
    private boolean local=true;

    public Call (int sourceNumber, int destinationNumber, int duration, int band, boolean local){
        this.sourceNumber=sourceNumber;
        this.destinationNumber=destinationNumber;
        this.duration=duration;
        this.band=band;
        this.local=local;
    }
    public int getSourceNumber() {
        return sourceNumber;
    }
    public void setSourceNumber(int sourceNumber) {
        this.sourceNumber = sourceNumber;
    }
    public int getDestinationNumber() {
        return destinationNumber;
    }
    public void setDestinationNumber(int destinationNumber) {
        this.destinationNumber = destinationNumber;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getBand() {
        return band;
    }
    public void setBand(int band) {
        this.band = band;
    }

    public boolean isLocal() {
        return local;
    }
    public void setLocal(boolean local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Call{" +
                "sourceNumber=" + sourceNumber +
                ", destinationNumber=" + destinationNumber +
                ", duration=" + duration +
                ", band=" + band +
                ", local/provincial= " + (local ? " Local " : " Provincial ") +
                //", is local:" + local +
                '}';
    }

    public double callCost() {
        double totalCost=0;
        if (this.local == true){
            totalCost = (15* this.duration);
        } else if (this.band==1) {
            totalCost = (20* this.duration);
        } else if (this.band==2) {
            totalCost = (25* this.duration);
        } else {
            totalCost = (30* this.duration);
        }
        return totalCost;
    }

}
