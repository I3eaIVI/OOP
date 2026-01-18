public abstract class Animal {
    private String name;
    private int power;
    private int age;
    
    public Animal() {
        this.name = "";
        this.power = 0;
        this.age = 0 ;
    }
    public Animal(String name, int power , int age) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public boolean equals(Animal a){
        if (this.name.equals(a.name) & this.age == a.age ){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString(){
        return "Animal : name = " + name + ", power = " + power + ", age = " + age;
    }
    public abstract void eat(Food f);
    
    
}
