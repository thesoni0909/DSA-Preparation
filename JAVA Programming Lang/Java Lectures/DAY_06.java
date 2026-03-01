// Pattern(Part 01)

import java.util.*;
public class DAY_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nested Loops
        //Print square star pattern according the user input like 4 x 4 and 5 x 5 .....
        System.out.print("Enter the size of square (nxn) : ");
        int size=sc.nextInt();
        int c;
        for(int r=1;r<=size;r++){
            for(c=1;c<=size;c++){
                System.out.print("*");
        }
        System.out.println(" "); //for adding next line after prinitng stars in each line
    }

        //print lower left right triangle pattern of stars
        System.out.print("Enter number of lines here : ");
        int lines_total=sc.nextInt();
        for(int line=1; line<=lines_total;line++){
            for(int stars=1;stars<=line;stars++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //print top left right triangle pattern of stars
        System.out.print("Enter number of lines here : ");
        int total_lines=sc.nextInt();
        for(int line=1;line<=total_lines;line++){
            for(int stars=total_lines;stars>=line;stars--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //print half pyramid pattern
        System.out.print("Enter number of lines here : ");
        int all_lines=sc.nextInt();
        for(int line=1;line<=all_lines;line++){
            for(int num=1;num<=line;num++){
                System.out.print(num);

            }
            System.out.println(" ");
        }

        //print character pattern
        System.out.print("Enter number of lines here : ");
        int lines_all=sc.nextInt();
        char letter='A';
        for(int line=1;line<=lines_all;line++){
            for(int i=1;i<=line;i++){
                System.out.print(letter);
                letter++;
            }
            System.out.println("");
        }

        //print a trianle pattern
        System.out.print("Enter the number of lines here : ");
        int TotLines=sc.nextInt();
        for(int line=1;line<=TotLines;line++){
            for(int space=TotLines;space>line;space--){
                System.out.print(" ");
            }
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        sc.close();
}
}
