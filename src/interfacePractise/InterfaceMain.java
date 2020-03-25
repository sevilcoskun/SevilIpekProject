/*Interface is a concept that we can design of our system from a base class.
 * Importantly interfaces are not like inheritance classes, Interface class has just signature of each functions(WITHOUT BODY)
 * in every produced sub-class needs to implement that class and its methods(without body methods should be filled with body in sub-classes)
 * POLYMORPHISM is also used in interface classes as well
 * Interfaces are useful to provide stability of our code, for example if in the future there should be added a new sub-class,
 * we dont need to discover the world from the beginning, when we implement interface, it suggest us fill that methods
*/

package interfacePractise;

class GirlDatabaseManager{
    public void AddDatabase(IGirlDatabase girlDatabase){
        girlDatabase.addGirl();
    }

    public void DeleteDatabase(IGirlDatabase girlDatabase){
        girlDatabase.removeGirl();
    }

    public void UpdateDatabase(IGirlDatabase girlDatabase){
        girlDatabase.updateGirl();
    }

    public void GetInfoDatabase(IGirlDatabase girlDatabase){
        girlDatabase.getGirlInfo();
    }
}

public class InterfaceMain {
    public static void main(String args[]){

        GirlDatabaseManager manager = new GirlDatabaseManager();
        manager.AddDatabase(new EuropeanGirls());
        manager.AddDatabase(new AsianGirls());

    }
}
