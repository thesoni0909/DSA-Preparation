// OOPS - Object Oriented Programming Language

public class DAY_15{
    public static void main(String[] args) {
        // Class Pen
        // Object p1
        Pen p1 = new Pen();
        p1.type = "Ball Pen";
        p1.color = "Blue";
        p1.tipSize = 5;
        System.out.print("Pen p1 Type: "+p1.type+"\n"+"Pen p1 Color : "+p1.color+"\n"+"Pen p1 TipSize : "+p1.tipSize);
        p1.setColor("Red");
        p1.setTipSize(10);
        System.out.println();
        System.out.println("Changed");
        System.out.print("Pen p1 Color : "+p1.color+"\n"+"Pen p1 TipSize : "+p1.tipSize+"\n");
        p1.setColor("Yellow");
        p1.setTipSize(15);
        System.out.println("Changed");
        System.out.print("Pen p1 Color : "+p1.color+"\n"+"Pen p1 TipSize : "+p1.tipSize+"\n\n");


        // Object p2
        Pen p2 = new Pen();
        p2.type = "Gel Pen";
        p2.color = "SkyBlue";
        p2.tipSize = 10;
        System.out.print("Pen p2 Type: "+p2.type+"\n"+"Pen p2 Color : "+p2.color+"\n"+"Pen p2 TipSize : "+p2.tipSize);

        // Class BankAccount
        // Object Account01
        BankAccount Account01 = new BankAccount();
        Account01.username="Soni Kumari";
        Account01.setPassword("abcdefghijkl");
        Account01.printPassword();

        // Class Student
        // Object s1
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setName("Riya Kumari");
        System.out.print("Student s1 Name : "+s1.getName()+"\n");
        s1.setAge(19);
        System.out.print("Student s1 Age : "+s1.getAge()+"\n\n");
        s2.setName("Raghav Kush");
        System.out.print("Student s2 Name : "+s2.getName()+"\n");
        s2.setAge(18);
        System.out.print("Student s2 Age : "+s2.getAge()+"\n");

        // Class Car
        // Object c1
        Car c1 = new Car();
        Car c2 = new Car("Thar");
        Car c3 = new Car("Royals", 2350);
        Car c4 = new Car(c1);
        System.out.println(c1.brandName+" "+c1.color+" "+c1.carNo);
        System.out.println(c2.brandName);
        System.out.println(c3.brandName+" "+c3.carNo);
        System.out.println(c4.brandName+" "+c4.color+" "+c4.carNo+" "+c4.CarType);

        // Class Kids
        // Object k1
        Kids k1 = new Kids();
        k1.name = "Ansh Singh";
        k1.marks[0]=20;
        k1.marks[1]=17;
        k1.marks[2]=19;
        Kids k2 = new Kids(k1);
        System.out.println("Kids k2 Name : "+k2.name);

        // // marks of k2 before changing marks[2] of k1
        for(int i=0;i<3; i++){
            System.out.println("Kids k2 Mark : "+k2.marks[i]);
        }

        System.out.println();

        // // changing the marks[2] of k1 and see, does it effect marks[2] of k2 also?
        k1.marks[2]=15;
        for(int i=0;i<3; i++){
            System.out.println("Kids k2 Mark : "+k2.marks[i]);
        }

        // Class Fish
        // Object Shark
        Fish f1 = new Fish();
        f1.name = "Shark Fish";
        f1.type = "Water Animal";
        System.out.print("Fish f1 Name : "+f1.name+"\nFish f1 Type : "+f1.type+"\n");
        f1.breathe(); f1.swims();
    }
}
class Pen{
    String type;
    String color;
    int tipSize;
    void setColor(String newColor){
        color=newColor;
    }
    void setTipSize(int newTipSize){
        tipSize=newTipSize;
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
    void printPassword(){
        System.out.println("The Password of "+username+"'s Account is "+password);
    }
}

class Student{
    private String name;
    private int age;

    // Setter method
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }

    // Getter method
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }

}

class Car{
    String brandName;
    String color;
    int carNo;
    String CarType;

    // constructor
    // Non-Parameterized constructor
    Car(){
        brandName="BMW";
        color="Black";
        carNo=2343;
    }
    // Parameterised Constructor
    Car(String brandName){
        this.brandName = brandName;
    }
    Car(String brandName, int carNo){
        this.brandName = brandName;
        this.carNo = carNo;
    }
    // Copy Constructor
    Car(Car c1){
        brandName = c1.brandName;
        color = c1.color;
        carNo = c1.carNo;
        CarType = "Car";
    }
}

//Copying the marks array
class Kids{
    String name;
    int marks[]=new int[3];
    Kids(){
        System.out.println("Constructor Called!");
    }
    Kids(Kids k1){
        name = k1.name;

        // Shallow Copy
        // marks = k1.marks;

        // Deep Copy
        for(int i=0; i<marks.length; i++){
            marks[i]=k1.marks[i];
        }
    }
}

// inheritance
// Single level Inheritance
// Base/Parent Class
class Animal{
    String type;
    String name;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
// Derived class
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("swims in water");
    }
}