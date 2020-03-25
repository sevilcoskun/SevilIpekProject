package abstractPractise;

public abstract class Database {

    //Common methods with body
    public void add(){
        System.out.println("The record is added to the DB");
    }
    public void delete(){
        System.out.println("The record is deleted from DB");
    }

    //Methods without Body
    abstract void update();
    abstract void get();
}
