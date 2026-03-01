// Patterns (Part 02)

import java.util.*;
public class DAY_08 {

    //print hollow square pattern
    static void HollowSquare(int Alllines){
        for(int line=1;line<=Alllines;line++){
            for(int star=1;star<=Alllines;star++){
                if(line==1||line==Alllines){
                    System.out.print("* ");
                }
                else{
                    if(star==1||star==Alllines){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
    }

    //print hollow rectangle pattern
    static void HollowRectangle(int Alllines, int columnLines){
        for(int r=1;r<=Alllines;r++){
            for(int c=1;c<=columnLines;c++){
                if(r==1||r==Alllines){
                    System.out.print("* ");
                }
                else if(c==1||c==columnLines){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    //print inverted and rotated half pyramid pattern
    static void inv_rotHalfPyramid(int Alllines){
        // 1st Method
        for(int r=1;r<=Alllines;r++){
            for(int c=1;c<=Alllines;c++){
                if(r+c>=Alllines+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        //2nd Method
        // for(int r=1; r<=Alllines; r++){
        //     //space
        //     for(int c=1; c<=Alllines-r; c++){
        //         System.out.print("  ");
        //     }
        //     //stars
        //     for(int c=1;c<=r;c++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }
    }

    //print inverted half pyramid with numbers
    static void invHalfPyramid(int Alllines){
        for(int r=1; r<=Alllines; r++){
            int i=1;
            for(int c=Alllines;c>=r;c--){
                System.out.print(i + " ");
                i++;
            }
            System.out.println("");
        }
    }

    //print FLOYD'S triangle
    static void FloydTriangle(int Alllines){
        int i=1;
        for(int r=1; r<=Alllines;r++){
            for(int c=1;c<=r;c++){
                System.out.print(i + " ");
                i++;
            } System.out.println("");
        }
    }

    //print 0 1 triangle pattern
    static void zero_one_triangle(int Alllines){
        for(int r=1;r<=Alllines;r++){
            for(int c=1;c<=r;c++){
                if((r+c)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            } System.out.println("");
        }
    }

    //print butterfly pattern
    static void butterfly(int Alllines){
        //1st Method:
        // int c1; int columnLines=2*Alllines;

        // //Ist half part
        // for(int r=1;r<=Alllines;r++){
        //     for(c1=1;c1<=r;c1++){
        //         System.out.print("* ");
        //     }
        //     while(c1<=columnLines){
        //         if(r+c1>=columnLines+1){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         } c1++;
        //     }
        //     System.out.println("");
        // }

        // //2nd Half Part
        // for(int r=Alllines;r>=1;r--){
        //     for(c1=1;c1<=r;c1++){
        //         System.out.print("* ");
        //     }
        //     while(c1<=columnLines){
        //         if(r+c1>=columnLines+1){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         } c1++;
        //     }
        //     System.out.println("");
        // }

        //2nd Method :

        //1st Half Part
        for(int r=1;r<=Alllines;r++){
            //stars
            for(int c=1;c<=r;c++){
                System.out.print("* ");
            }
            //spaces
            for(int c=1;c<=2*(Alllines-r);c++){
                System.out.print("  ");
            }
            //stars
            for(int c=1;c<=r;c++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        //2nd Half Part
        for(int r=Alllines;r>=1;r--){
            //stars
            for(int c=1;c<=r;c++){
                System.out.print("* ");
            }
            //spaces
            for(int c=1;c<=2*(Alllines-r);c++){
                System.out.print("  ");
            }
            //stars
            for(int c=1;c<=r;c++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    //print solid rhombus
    static void solidRhombus(int Alllines){

        // 1st Method :
        // for(int r=1;r<=Alllines;r++){
        //     for(int c=1;c<=Alllines;c++){
        //         if(r+c>=Alllines+1){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     for(int c=Alllines;c>r;c--){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }

        //2nd Method :
        for(int r=1; r<=Alllines; r++){
            //space
            for(int c=1;c<=Alllines-r;c++){
                System.out.print("  ");
            }

            //stars
            for(int c=1;c<=Alllines;c++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    //print hollow rhombus pattern
    static void hollowRhombus(int Alllines){
        for(int r=1;r<=Alllines;r++){
            // spaces
            for(int c=1;c<=Alllines-r;c++){
                System.out.print("  ");
            }

            //hollow rhombus
            for(int c=1;c<=Alllines;c++){
                if(r==1||r==Alllines||c==1||c==Alllines){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    //print diamond pattern
    static void diamond(int Alllines){

        //1st half part(triangle)
        for(int r=1;r<=Alllines;r++){
            //spaces
            for(int c=1;c<=Alllines-r;c++){
                System.out.print("  ");
            }
            //stars
            for(int c=1;c<=(2*r)-1;c++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        //2nd half part(mirror triangle)
        for(int r=Alllines-1;r>=1;r--){
             //spaces
            for(int c=1;c<=Alllines-r;c++){
                System.out.print("  ");
            }
            //stars
            for(int c=1;c<=(2*r)-1;c++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    //print triangle pattern
    static void trianglePattern(int Alllines){
        for(int r=1;r<=Alllines;r++){
            //spaces
            for(int c=1;c<=Alllines-r;c++){
                System.out.print("  ");
            }
            //stars
            for(int c=1;c<=(2*r)-1;c++){
                System.out.print("* ");
            }
            //next line
            System.out.println("");
        }
    }

    //print inverted upper right triangle
    static void upper_right_triangle(int n){
        for(int r=1;r<=n;r++){
            //spaces
            for(int c=1;c<=r-1;c++){
                System.out.print(" ");
            }
            //stars
            for(int c=1;c<=(n-r)+1;c++){
                System.out.print("*");
            }
            System.out.println("");
        }

        }

    //print number pyramid pattern
    static void num_pyramid(int n){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n-r;c++){
                System.out.print("  ");
            }
            for(int c=1;c<=(2*r)-1;c++){
                System.out.print(r+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the number of lines here : ");
        // int Alllines=sc.nextInt();
        // HollowSquare(Alllines);
        // HollowRectangle(7,14);
        // inv_rotHalfPyramid(10);
        // invHalfPyramid(5);
        // FloydTriangle(4);
        // zero_one_triangle(5);
        // butterfly(10);
        // solidRhombus(14);
        // hollowRhombus(14);
        // diamond(4);
        // trianglePattern(20);
        // upper_right_triangle(4);
        // num_pyramid(5);
        sc.close();
    }
}
