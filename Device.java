public class Device {
    void poweron(){
        System.out.println("Device is powered on");
    }
}

class Laptop extends Device{
    void boot(){
        System.out.println("laptop is booting");
    }
}

class GamingLaptop extends Laptop{
    void startgame(){
        System.out.println("the game is starting");
    }
}

class o{
    public static void main(String[] args){
        GamingLaptop g=new GamingLaptop();
        g.boot();
        g.startgame();
        g.poweron();
    }
}

