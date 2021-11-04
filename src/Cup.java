public class Cup {

    private String madeBy;
    private String material;
    private boolean hasHandel;
    private int volume;
    private boolean isFilled;


    public void fillUp(int milliliters, String liquid){
        int leftOverVolume = this.volume - milliliters;

        if (milliliters > this.volume){
            isFilled = false;

            System.out.println( "The cup can only hold up to " + this.volume + " milliliters.");
            System.out.println( "Please empty " + -1 * (leftOverVolume) + " milliliters,\n" +
                                "or prepare to spil your " + liquid);
        }
        else if (milliliters == this.volume){
            isFilled = true;
            System.out.println("You cup is completely full");
        }
        else{
            isFilled = true;
            System.out.println("Ahh! a nice cup off " + liquid);
            System.out.println("Your cup can still hold " + leftOverVolume + " millilitters");
        }
    }

    public void emptyCup() {
        isFilled = false;
        System.out.println("The cup is now empty.");

    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setHasHandel(boolean hasHandel) {
        this.hasHandel = hasHandel;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "madeBy='" + madeBy + '\'' +
                ", material='" + material + '\'' +
                ", hasHandel=" + hasHandel +
                ", volume=" + volume +
                ", isFilled=" + isFilled +
                '}';
    }
}
