package inheritancePractise;

import java.util.ArrayList;

public class Humans {
    private String name;
    private int age;
    private String hairColor;
    private String ethnicity;
    private ArrayList<String> favoriteActivities;

    public Humans(){
        this.name = "No data";
        this.age = 0;
        this.hairColor = "No data";
        this.ethnicity = "No data";
        this.favoriteActivities = new ArrayList<String>();
    }

    public Humans(String name, int age, String hairColor, String ethnicity) {
        this.name = name;
        this.age = age;
        this.hairColor = checkHairColor(hairColor);
        this.ethnicity = ethnicity;
    }

    public String checkHairColor(String hairColor){
        if(hairColor.equals("yellow")){
            return  "blonde";
        }
        else if(hairColor.equals("brown")||hairColor.equals("black")){
            return "brunette";
        }
        else if(hairColor.equals("red") || hairColor.equals("orange")){
           return "ginger";
        }
        else {
            return"brunette";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEthnicity(){
        return ethnicity;
    }

    public ArrayList<String> getFavoriteActivities() {
        return favoriteActivities;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int girlAge) {
        this.age = girlAge;
    }

    public void setHairColor(String girlHairColor) {
        this.hairColor = checkHairColor(girlHairColor);
    }

    public void setEthnicity(String ethnicity){
        this.ethnicity = ethnicity;
    }

    public void setFavoriteActivities(ArrayList<String> favoriteActivities) {
        this.favoriteActivities = favoriteActivities;
    }
    public void setFavoriteActivities(String activity) {
        this.favoriteActivities = addActivity(activity);;
    }

    public ArrayList<String> addActivity(String activity){
        getFavoriteActivities().add(activity);
        return getFavoriteActivities();
    }

    public boolean canMarry(Women w, Men m){
        if(w.getAge() > 18 && m.getAge() > 18){
            return true;
        }
        else return false;
    }

    public void printInfo(){
        System.out.println("The person info:\n" +
                "Name: " + this.name + "\t" +
                "Age: " + this.age + "\t" +
                "HairColor: " + this.hairColor + "\t" +
                "Ethnicity: " + this.ethnicity + "\t" +
                "Favorite Activities: " + this.favoriteActivities);
    }
}
