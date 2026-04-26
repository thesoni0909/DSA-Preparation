// variables and datatypes

import java.util.*;
public class DAY_02{
    public static void main(String[] args) {

        //output in java
        System.out.print("hello world\n");

        //print specific pattern
        System.out.print("****\n***\n**\n*\n");

        //defining variable in java
        int num=10;
        int num1=20;
        System.out.println(num);  //10
        System.out.println(num1);  //20
        num=num1;
        System.out.println(num);  //20

        //sum of a&b
        int a=20;
        int b=40;
        int c=a+b;
        System.out.println(c); //60

        //inputs in java
        Scanner sc = new Scanner(System.in);
        String name=sc.next();        //captures a word without space and stores it into variable of string data type
        sc.nextLine();
        String fullName=sc.nextLine();             //captures multiple words and multiple lines including space
        int num2=sc.nextInt();        //captures an integer value of 4 bytes
        float num3=sc.nextFloat();   //captures a decimal value of 4 bytes from user
        long num4=sc.nextLong();        //captures large integer values
        boolean value=sc.nextBoolean();         //captures true or false values
        short num5=sc.nextShort();        //short integer values 
        byte num6=sc.nextByte();     //captures very short integer 
        double num7=sc.nextDouble();   //captures very large decimal values
        System.out.println(name);
        System.out.println(fullName);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(value);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);

        //sum of x and y (input from user)
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sum=x+y;
        System.out.println(sum);

        //product of e and f
        int e=sc.nextInt();
        int f=sc.nextInt();
        int product=e*f;
        System.out.println(product);

        //area of circle
        double radius=sc.nextInt();
        double sqradius=radius*radius;
        double area_of_circle= 3.14 * sqradius;
        System.out.println(area_of_circle);

        //type conversion
        byte d=126;
        short g=d;
        System.out.println(g);

        long xxx=2345667568790099980L;
        float yyy=xxx;
        System.out.println(yyy);          //long to float is possible only ....not float to long

        // float x=23.45f;
        // int y=x;
        // System.out.println(y);     //type conversion does not takes place when destination type is small and source type is greater


        //type casting
        float h=23.45f;
        int i=(int) h;
        System.out.println(i);

        //special case of type conversion
        char ch='a';
        int number=ch;
        System.out.println(number);

        // int numm=97;
        // char letter_a=(int) numm;
        // System.out.println(letter_a);      //we can not convert int to char via explicitly also

        // String my_name="soni";
        // int number2=my_name;
        // System.out.println(number2);         //string can not be converted into int ,, only char is allowed to convert into int 

        //type promotion 
        int j=23;
        float k=23.45f;
        char ch1='a';
        long l=2345L;
        float m=j+k*ch1/l;
        System.out.println(m);

        int n=10;
        float o=20.25f;
        long p=25;
        double q=30;
        int ans=(int)(n+o+p+q) ;
        System.out.println(ans);


        

        sc.close();
    }
}