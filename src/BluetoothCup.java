public class BluetoothCup extends Cup{

    private boolean LEDStripOn;
    private String LEDColor;
    private boolean bluetoothOn;


    public void LEDSwitch() {
        if (bluetoothOn){
            if (LEDStripOn){
                this.LEDStripOn = false;
                System.out.println("LED lights are switched off!");
            }
            else {
                this.LEDStripOn = true;
                System.out.println("LED lights are switched on!");
                System.out.println("There color is " + LEDColor);
            }

        }
        else{
            System.out.println("Please connect to bluetooth");
        }
    }

    public void setBluetoothOn(boolean bluetoothOn) {
        this.bluetoothOn = bluetoothOn;
    }

    public void setLEDColor(String LEDColor) {
        this.LEDColor = LEDColor;
    }

    @Override
    public String toString() {
        return "BluetoothCup{" +
                "LEDStripOn=" + LEDStripOn +
                ", LEDColor='" + LEDColor + '\'' +
                ", bluetoothOn=" + bluetoothOn +
                "} " + super.toString();
    }
}
