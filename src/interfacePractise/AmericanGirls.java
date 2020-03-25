package interfacePractise;

public class AmericanGirls implements IGirlDatabase{

    @Override
    public void addGirl() {
        System.out.println(("An American girl is added"));
    }

    @Override
    public void removeGirl() {
        System.out.println(("An American girl is removed"));
    }

    @Override
    public void updateGirl() {
        System.out.println(("An American girl is updated"));
    }

    @Override
    public void getGirlInfo() {
        System.out.println(("An American girl info"));
    }
}
