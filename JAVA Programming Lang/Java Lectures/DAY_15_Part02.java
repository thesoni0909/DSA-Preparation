// OOPS - Object Oriented Programming Language Part02

public class DAY_15_Part02 {
    public static void main(String[] args) {

        // class Calculator 
        // Object calc
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 12));
        System.out.println(calc.sum(1.5f, 2.3f));
        System.out.println(calc.sum(2, 3, 4));

        // class Flowers(Parent) and its derived classes Sunflower and Rose
        // obj of Flowers class
        Flowers f1 = new Flowers();
        f1.smells();
        // obj of Sunflower
        f1= new Sunflower();
        f1.smells();
        // Obj of Rose
        f1 = new Rose();
        f1.smells();

        // class School(Parent) and its Derived classes RoyalSch and MidLasrelSch
        School sch;
        // Object of RoyalSch class
        sch = new RoyalSch();
        sch.totalClasses = 9;
        sch.reputation(); System.out.println(sch.totalClasses);
        // Object of MidLasresSch
        sch = new MidLasrelSch();
        sch.totalClasses = 12;
        sch.reputation(); System.out.println(sch.totalClasses);

        // interface ChessPlayer and classes Queen, Rook, King
        ChessPlayer p;
        p = new Queen();
        p.moves();
        p = new Rook();
        p.moves();
        p = new King();
        p.moves();

        // interface Herbivores, Carnivores and a class bear
        Bear b = new Bear();
        b.eatMeat(); b.eatPlants();

        // class Student
        Student s1 = new Student();
        s1.rollNo = 24;
        s1.school = "JMV";
        Student s2 = new Student();
        System.out.println(s2.school);

        // class Stationary
        Pen p1 = new Pen();
    }
}

// Hybrid Inheritance
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}
// child class1 of ANIMAL
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("swims");
    }
}
// child class2 of ANIMAL
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
// child class3 of ANIMAL
class Mammals extends Animal{
    int legs;
    void walks(){
        System.out.println("walks");
    }
}
// child class1 of FISH
class Tuna extends Fish{
    void define(String name){
        System.out.println("Hello! I am "+name);
    }
}
// child class2 of FISH
class Shark extends Fish{
    
}
// child class1 of BIRD
class Peacock extends Bird{
    String sound;
}
// child class1 of MAMMALS
class Dog extends Mammals{
    void barks(){
        System.out.println("barks");
    }
}
// child class2 of MAMMALS
class Cat extends Mammals{
    void meown(){
        System.out.println("meown");
    }
}
// child class3 of MAMMALS
class Human extends Mammals{
    void talks(){
        System.out.println("talks");
    }
}

// Polymorphism
// 1. Compile Time Polymorphism(Static) : Method Overloading
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

// 2. Run Time Polymorphism(Dynamic) : Method Overiding
class Flowers{
    void smells(){
        System.out.println("smells very good");
    }
}
class Sunflower extends Flowers{
    void smells(){
        System.out.println("smells mild");
    }
}
class Rose extends Flowers{
    void smells(){
        System.out.println("smells like honey");
    }
}

// Abstraction
// 1. Abstract Class
abstract class School{
    int totalClasses;
    abstract void reputation();
}
class RoyalSch extends School{
    void reputation() {
        System.out.println("Very nice");
    }
}
class MidLasrelSch extends School{
    void reputation(){
        System.out.println("not so nice");
    }
}

// 2. Interface
// To achieve abstraction
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("left, right, up, down, diagonally(in all directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("left, right, up, down");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("left, right, up, down, diagonally(by 1 step)");
    }
}

// To implement multiple inheritance
interface Herbivores{
    void eatPlants();
}
interface Carnivores{
    void eatMeat();
}
class Bear implements Herbivores, Carnivores{
    public void eatPlants(){
        System.out.println("bear eats plants");
    }
    public void eatMeat(){
        System.out.println("bear eats meat");
    }
}

// Use of static keyword
// static variables
class Student {
    int rollNo;
    static String school;
}

// Use of super keyword
// parent-child class using super()
class Stationary{
    Stationary(String item){
        System.out.println(item+" "+" is a stationary product");
    }
}
class Pen extends Stationary{
    Pen(){
        super("Pen");
        System.out.println("Pen Constructor is called!");
    }
}

