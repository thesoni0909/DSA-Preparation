//operators and their precedence and associativity

public class DAY_03 {
    public static void main(String[] args) {
        //artihtmetic operator
        //binary operators
        int x=30;
        int y=4;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        //unary operators
        int a=10;
        int b=++a;        //pre increment operator
        System.out.println(a);
        System.out.println(b);
        int c=20;
        int d=c++;         //post increment operator
        System.out.println(c);
        System.out.println(d);
        int g=30;
        int h= --g;       //pre decrement operator
        System.out.println(g);
        System.out.println(h);
        int i=67;
        int j=i--;          //post decrement operator
        System.out.println(i);
        System.out.println(j);

        //logical operator
        int num1=10;
        int num2=5;
        System.out.println((num1>num2)&&(num1!=num2));
        System.out.println((num1>num2)||(num1==num2));
        System.out.println(!(num1!=num2));

    }
}
