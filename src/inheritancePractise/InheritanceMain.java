/*
* Inheritance is a concept that we can produce subclasses(lowclass) from a base class(upperclass).
 ***********************************************************
 * WE MUST CREATE AN OBJECT TO USE INHERITED CLASS METHODS *
 ***********************************************************
* we can inherit field(variables) and methods from the base class.
* If we want to modify one inherited class in the sub-class we need to specificy @Override before change the method
* Each sub-class can have specific other methods than base class
* ENCAPSULATION -> BAse class fields should be private in order to protect our class info, only methods should be public and accessible
* POLYMORPHISM -> diversity of the objects for example we can create a Woman object with Human reference.
*/
package inheritancePractise;

public class InheritanceMain {
    public static void main(String args[]){

        Humans h1 = new Humans();
        h1.printInfo();

        Men m1 = new Men();
        m1.printInfo();

        Women w1 = new Women();
        w1.printInfo();
        System.out.println(w1.getName() + " and " + m1.getName() + " can marry? " + w1.canMarry(w1, m1));

        Humans h2 = new Humans("Charles", 35, "yellow", "British");
        h2.printInfo();

        Men m2 = new Men("Cem", 27, "brown", "Turkish");
        m2.setFavoriteActivities("play game");
        m2.setFavoriteActivities("drinking alcohol");
        System.out.println("?? " + m2.getName() + " can be soldier? " + m2.isSoldier());
        m2.printInfo();

        Women w2 = new Women("Sevil", 28, "yellow", "Turkish");
        System.out.println("?? " + w2.getName() + " can be mother? " + w2.canBeMother());

        Humans h3 = new Men("David", 27, "red", "Irish");
        //why I cannot use Men functions???
        //System.out.println(h3.isSoldier());
        h3.printInfo();

        Humans h4 = new Women();
        h4.printInfo();

    }
}
