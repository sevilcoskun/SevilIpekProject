package girls;

public interface GirlyBehaviours {

    public default void printIsSleeping() {
        System.out.println("All girls are sleeping");
    }

    public boolean isBlonde(String color);

    //public boolean isJealous();
}
