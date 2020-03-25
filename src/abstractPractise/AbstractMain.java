/*
* Abstract classes are the combination of interface and inheritance
* We can write both methods with and without body!!
* Inside of the project if we have some common methods(with body; the same functionality),
*   and also we can specify signature of other methods without body.
** IMPORTANTLY if we want to create an abstract class, we need to specify after "public" notation
 **********************************************************************************
 * WE CANNOT CREATE AN OBJECT TO USE INTERFACE CLASS METHODS LIKE INTERFACE CLASS *
 **********************************************************************************
* */

package abstractPractise;

public class AbstractMain {
    public static void main(String args[]){
        //Decleration of objects;
        /*
        * We can produce object with Abstract class referans but we need to specify class
        *                                           --> Database d = new Mongo()
        * Secondly we can produce normal class objects like
        *                                           --> Mongo m = new Mongo()
        * */

        Database d1 = new Mongo();
        Database d2 = new MySql();

        d1.add();
        d2.add();

        d1.update();
        d2.update();

    }
}
