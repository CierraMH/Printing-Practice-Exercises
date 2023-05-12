package Animals;

public class Animal {
private String name;
private Boolean isThisADog;

    Animal(String name, Boolean isThisADog){
        this.name = name;
        this.isThisADog = isThisADog;
    }
    public String getName(){
        return this.name;
    }
    public boolean isThisADog(){
        return this.isThisADog;
    }
    public String toString(){
        return this.name + " is a dog = " + this.isThisADog;
    }
}
