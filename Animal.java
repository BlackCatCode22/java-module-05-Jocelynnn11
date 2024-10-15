package jocelyn.zoo.com;

import java.util.Date;

public class Animal {

    // Create a static int that keep track of the number of animals created.
    static  int numOfAnimals = 0;
    // Create a constructor for our new Animal objects

    public Animal() {numOfAnimals++;}
    // Create a constructor that accepts a name
    public Animal(String aName){ this.animalName = aName; numOfAnimals++;}
    // Create a constructor that will accept all fields as arguments
    public Animal(String sex, int age, int weight, String animalName, String animalID, String animalBirthdate, String animalColor,String animalOrigin){
        this.sex = sex;
        this.age = age;
        this. weight = weight;
        this.animalName = animalName;
        this.animalID = animalID;
        this.animalBirthDate = animalBirthdate;
        this.animalColor = animalColor;
        this. animalOrigin = animalOrigin;

    }

    // Create all attributes (fields) that we need.
    // sex will be 'male' or 'female'
    private String sex;
    // age will be in years
    private int age ;
    // weight will be in pounds
    private int weight ;
    // a unique ID for each animal
    private String animalID;

    private String animalName;
    // animal birthdate.
    private String animalBirthDate;
    // animal color
    private String animalColor;
    // origin zoo
    private String animalOrigin;
    // arrival date
    private Date animalArrivalDate;
    // origin will be a string like: "from Friguia Park, Tunisia"



    // Create getters and setters

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalID(){return animalID;}
    public void setAnimalID(String animalID){ this.animalID = animalID;}

    public String getAnimalName(){return animalName;}
    public void setAnimalName(String animalName){this.animalName = animalName;}

    public String getAnimalBirthDate() {
        return animalBirthDate;
    }
    public void setAnimalBirthDate(String animalBirthDate) {
        this.animalBirthDate = animalBirthDate;
    }

    public String getAnimalColor(){return animalColor;}
    public void setAnimalColor(String animalColor){ this.animalColor = animalColor;}

    public String getAnimalOrigin(){return animalOrigin;}
    public void setAnimalOrigin(String animalOrigin){this.animalOrigin = animalOrigin;}

    public Date getAnimalArrivalDate(){return animalArrivalDate;}
    public void setAnimalArrivalDate(Date animalArrivalDate){this.animalArrivalDate = animalArrivalDate;}



}


