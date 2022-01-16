package Class;

public class Ex3 {
    public static void main(String[] args){
        Unit group [] = {new Marine(), new Tank(), new Dropship()};

        for(int i=0;i<group.length;i++){
            group[i].move(100,200);
        }
        //group[2].load();
    }
}

abstract class Unit{
    int x,y;
    abstract void move(int x, int y);
    void stop(){ System.out.println("Stop"); }
}

class Marine extends Unit{
    void move(int x, int y){
        System.out.println("Marine::move");
    }
    void StimPack(){ System.out.println("Marine::StimPack"); }
}

class Tank extends Unit{
    void move(int x, int y){
        System.out.println("Tank::move");
    }
    void changeMode(){ System.out.println("Tank::changeMode");}
}

class Dropship extends Unit{
    void move(int x, int y){
        System.out.println("Dropship::move");
    }
    void load(){ System.out.println("Dropship::load");}
    void unload() { System.out.println("Dropship::unload");}
}
