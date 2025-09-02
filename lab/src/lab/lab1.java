package lab;

public class lab1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        

        featureC("Sahar", 1234);

        featureB();
    }
    
    public static void featureB() {
    	System.out.println("Im adding feature_B");

    }
    
    
    public static void featureC(String name, int ID) { //feature C
        System.out.println("Hello, " + name + " with ID " + ID + "!");
    }
    
}


