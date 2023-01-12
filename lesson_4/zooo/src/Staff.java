public class Staff {
    private String name;
    private int age;
    private String profession;
    private int salary;

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getProfession(){
        return this.profession;
    }
    public int getSalary() {
        return this.salary;
    }
    public void sell() {}
    public void feedAnimal (Animal animal) {}
    public void clean (Enclosure enclosure) {}
    public void acceptPayment() {}
}
