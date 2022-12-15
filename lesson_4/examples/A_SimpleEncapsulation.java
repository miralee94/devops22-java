package lesson_4.examples;

public class A_SimpleEncapsulation {
 
    // Others should not be able to modify this value.
    private String firstName = "Olle";
    private String lastName = "Svensson";
    
    public String getFullname(){
        return firstName + " " + lastName; 
    }    
}

class Example {
    public static void main(String[] args) {
        A_SimpleEncapsulation simpleEncapsulation = new A_SimpleEncapsulation();
        System.out.println(simpleEncapsulation.getFullname());
        // firstName is hidden
        // System.out.println(simpleEncapsulation.firstName);
    }
}
