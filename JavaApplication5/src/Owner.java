public class Owner {
    protected final String name;
    protected Animal animal;
    public Owner(){
        this.name = "";
        this.animal = null;
    }
    public Owner(String name){
        this.name = name;
        this.animal = null;
    }
    public Owner(Animal animal){
        this.animal = animal;
        this.name = "";
    }
    public Owner(String name, Animal animal){
        this.animal = animal;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public void feedFood(Food f){
        animal.eat(f);
    }
    @Override
    public String toString(){
        return "Owner : name = " + name + ", Animal : name = " + animal.getName() + ", power = " + animal.getPower() + ", age = " + animal.getAge();
    }
    public void protectOwnerFrom(Animal a){
        if (animal instanceof Dog){
            Dog dog =(Dog) animal;
            dog.kick(a);
        }
        else{
            Pigeous p =(Pigeous) animal;
            p.wingAttack(a);
        }
    }
    
    
}
