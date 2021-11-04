public class WifiHeatCup extends Cup {

    private int tempeture;
    private boolean wifiOn;


    public void warmCupUp(int tempeture){
        if (getVolume() > 0 && wifiOn){
            this.tempeture = tempeture;
            System.out.println("Steady tempeture at " + tempeture + " degrees celsius");
        }
        else {
            System.out.println("No connection to the wifi found");
        }
    }
    @Override
    public void emptyCup() {
        System.out.println("This cup can't be emptiet");
    }

    public void setWifiOn(boolean wifiOn) {
        this.wifiOn = wifiOn;
    }

    @Override
    public String toString() {
        return "WifiHeatCup{" +
                "tempeture=" + tempeture +
                ", wifiOn=" + wifiOn +
                "} " + super.toString();
    }
}
