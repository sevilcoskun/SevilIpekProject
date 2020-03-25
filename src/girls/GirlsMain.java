package girls;

public class GirlsMain {
    public static void main (String[] args) {

        Sevil s = new Sevil();
        s.isBlonde("yellow");
        s.printIsSleeping();

        Ipek i = new Ipek();
        i.isBlonde("brown");
        i.printIsSleeping();

        GirlyBehaviours gb = (String color) -> {System.out.println("Her hair color is " + color); return true;};
        gb.isBlonde("yellow");
        //GirlyBehaviours gb = () -> {System.out.println("All girls are jealous"); return true;};
        //gb.isJealous();
        gb.printIsSleeping();
    }
}
