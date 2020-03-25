package girls;

public class Sevil implements GirlyBehaviours {

    @Override
    public void printIsSleeping() {
        System.out.println("Sevil never sleeps!!");
    }

    @Override
    public boolean isBlonde(String color) {
        if(color.equals("yellow")) {
            System.out.println("Sevil is blonde");
            return true;
        }
        else
            return false;
    }

    /*@Override
    public boolean isJealous() {
        System.out.println("Sevil is not a jealous girl");
        return false;
    }*/
}
