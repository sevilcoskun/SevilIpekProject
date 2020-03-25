package inheritancePractise;

public class Women extends Humans {

    public Women(){
        super();
    }
    public Women(String name, int age, String hairColor, String ethnicity){
        super.setName(name);
        super.setAge(age);
        super.setHairColor(hairColor);
        super.setEthnicity(ethnicity);
    }

    public boolean canBeMother(){
        if(getAge() > 18){
            System.out.println("You can have a baby!");
            return true;
        }
        else{
            System.out.println("You need to wait until to be 18!");
            return false;
        }
    }

    @Override
    public void printInfo(){
        System.out.println("\nThe person(woman) info:\n" +
                "Name: " + getName() + "\t" +
                "Age: " + getAge() + "\t" +
                "HairColor: " + getHairColor() + "\t" +
                "Ethnicity: " + getEthnicity()+ "\t" +
                "Favorite Activities: " + getFavoriteActivities());
    }
}
