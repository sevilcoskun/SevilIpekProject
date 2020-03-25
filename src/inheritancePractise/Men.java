package inheritancePractise;

public class Men extends Humans {

    public Men(){
        super();
    }
    public Men(String name, int age, String hairColor, String ethnicity){
        super.setName(name);
        super.setAge(age);
        super.setHairColor(hairColor);
        super.setEthnicity(ethnicity);
    }

    public boolean isSoldier(){
        if(this.getAge() > 18){
            System.out.println(this.getName() + " can go to military duty!");
            return true;
        }
        else{
            System.out.println(this.getName() + " need to wait until to be 18!");
            return false;
        }
    }

    @Override
    public void printInfo(){
        System.out.println("\nThe person(Man) info:\n" +
                "Name: " + this.getName() + "\t" +
                "Age: " + this.getAge() + "\t" +
                "HairColor: " + this.getHairColor() + "\t" +
                "Ethnicity: " + this.getEthnicity()+ "\t" +
                "Favorite Activities: " + this.getFavoriteActivities());
    }

}
