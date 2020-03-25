/*
* Inheritance is a concept that we can produce subclasses(lowclass) from a base class(upperclass).
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

        Humans h2 = new Humans("Charles", 35, "yellow", "British");
        h2.printInfo();

        Men m2 = new Men("Cem", 27, "brown", "Turkish");
        m2.setFavoriteActivities("play game");
        m2.setFavoriteActivities("drinking alchol");
        m2.printInfo();

        Women w2 = new Women("Sevil", 28, "yellow", "Turkish");
        System.out.println(w2.getName() + " can be mother? " + w2.canBeMother());

        Humans h3 = new Women();
        h3.printInfo();

    }
}
