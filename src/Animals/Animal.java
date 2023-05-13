package Animals;

public class Animal {
private String name;
private Boolean isThisADog;
private String color;

    Animal(String name, Boolean isThisADog){
        this.name = name;
        this.isThisADog = isThisADog;
    }
    Animal(String name, Boolean isThisADog, String color){
        this.name = name;
        this.isThisADog = isThisADog;
        this.color = color;
    }
    public String getName(){
        return this.name;
    }
    public boolean isThisADog(){
        return this.isThisADog;
    }
    public String getColor(){
        return this.color;
    }
    public String toString(){
        return this.name + " is a dog = " + this.isThisADog + " and the tone is " + this.color;
    }
}
