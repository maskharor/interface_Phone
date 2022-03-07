package latihan_interface;

public class Samsung implements Phone{
    
    private int volume;
    private boolean isPowerOn;
    
    public Samsung(){
        //volume awal
        this.volume = 30;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone On...");
        System.out.println("Selamat datang di Samsung");
        System.out.println("Android version 29");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan HP terlebih dahulu!!");
        }
    }

    @Override
    public void volumeDown() {
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume = 0%");
                System.out.println("sudah "+this.getVolume()+"%");
            }
            else {
                this.volume -= 10;
                System.out.println("Volume sekarang: "+this.getVolume());
            }
        }
        else {
            System.out.println("Nyalakan HP telebih dahulu!!");
        }
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    
}
