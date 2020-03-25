package interfacePractise;

public class EuropeanGirls implements IGirlDatabase {

    @Override
    public void addGirl() {
        System.out.println(("An European girl is added"));
    }

    @Override
    public void removeGirl() {
        System.out.println(("An European girl is removed"));
    }

    @Override
    public void updateGirl() {
        System.out.println(("An European girl is updated"));
    }

    @Override
    public void getGirlInfo() {
        System.out.println(("An European girl info"));
    }
}
