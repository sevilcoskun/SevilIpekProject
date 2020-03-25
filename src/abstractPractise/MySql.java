package abstractPractise;

public class MySql extends Database {
    @Override
    void update() {
        System.out.println("MySql is updated!");
    }

    @Override
    void get() {
        System.out.println("This is MySql DB");
    }
}
