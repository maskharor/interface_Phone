package latihan_interface;

public class Iphone implements Phone{

    private int volume;
    private boolean isPowerOn;
    
    public Iphone(){
        //volume awal
        this.volume = 10;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone turned On...");
        System.out.println("Hello user");
        System.out.println("Ios version 15");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone Turned off");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("Done " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume now: " + this.getVolume());
            }
        } else {
            System.out.println("Please turn on the phone first!!");
        }
    }

    @Override
    public void volumeDown() {
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume = 0%");
                System.out.println("Done "+this.getVolume()+"%");
            }
            else {
                this.volume -= 10;
                System.out.println("Volume now: "+this.getVolume());
            }
        }
        else {
            System.out.println("Please turn the phone first!!");
        }
    }
    
    public int getVolume(){
        return this.volume;
    }    
}
