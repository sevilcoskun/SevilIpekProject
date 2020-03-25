package girls;

public class Ipek implements GirlyBehaviours {

    @Override
    public boolean isBlonde(String color) {
        if(color.equals("brown")) {
            System.out.println("Ipek is brunette");
            return false;
        }
        else
            return true;
    }

    /*@Override
    public boolean isJealous() {
        System.out.println("Ipek is not a jealous girl");
        return false;
    }*/

}
