package interfacePractise;

public class AsianGirls implements IGirlDatabase{

    @Override
    public void addGirl() {
        System.out.println(("An Asian girl is added"));
    }

    @Override
    public void removeGirl() {
        System.out.println(("An Asian girl is removed"));
    }

    @Override
    public void updateGirl() {
        System.out.println(("An Asian girl is updated"));
    }

    @Override
    public void getGirlInfo() {
        System.out.println(("An Asian girl info"));
    }
}
