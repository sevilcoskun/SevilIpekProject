package abstractPractise;

public class Mongo extends Database {
    @Override
    void update() {
        System.out.println("MongoDB is updated!");
    }

    @Override
    void get() {
        System.out.println("This is MongoDB");
    }
}
