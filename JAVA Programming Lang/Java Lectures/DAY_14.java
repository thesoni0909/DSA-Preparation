// Bit Manipulation

public class DAY_14 {

    // Check if a number is even or odd?
    static void EvenOrOdd(int n){
        if((n&1)==1){
            System.out.println("The number is an odd number.");
        }
        else{
            System.out.println("The number is an even number.");
        }
    }

    // Get ith bit in a number
    static int GetithBit(int n, int i){
        int bitmask=1<<i;
        int ithBit=n&bitmask;
        if(ithBit==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    // Set ith Bit in a number
    static int SetithBit(int n, int i){
        int bitmask=1<<i;
        n=n|bitmask;
        return n;
    }

    // Clear ith Bit in a number
    static int ClearithBit(int n, int i){
        int bitmask = ~(1<<i);
        n=n&bitmask;
        return n;
    }

    // Update ith Bit ,,, if ith bit == 1 then update it with "0" or ith bit == 0 then update it with "1"
    static void UpdateithBit(int n, int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            System.out.println(SetithBit(n, i));
        }
        else{
            System.out.println(ClearithBit(n, i));
        }
    }

    // Update ith Bit ,,, if 0 is given then clear ith bit and if 1 is given then set ith bit
    static void UpdateithBit01(int n, int i, int newbit){
        // 1st method
        // if(newbit==1){
        //     System.out.println(SetithBit(n, i));
        // }
        // else{
        //     System.out.println(ClearithBit(n, i));
        // }

        // 2nd method
        n=ClearithBit(n, i);
        int bitmask=newbit<<i;
        System.out.println(n|bitmask);
    }

    // Clear last i bits
    static void ClearLastiBits(int n, int i){

        // 1st method
        // for(int j=0;j<i;j++){
        //     n=ClearithBit(n, j);
        // }
        // System.out.println(n);

        // 2nd method
        int bitmask=(~0)<<i;
        System.out.println(n&bitmask);
    }

    // Clear bits between specific range
    static void ClearRangeBits(int n, int i, int j){

        // 1st method
        // for(int k=i; k<=j; k++){
        //     n=ClearithBit(n, k);
        // }
        // System.out.println(n);

        // 2nd method
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        System.out.println(n&bitmask);
    }

    // check if a number is power of 2 or not
    static boolean IsPowerOf2(int n){
        if((n&n-1)==0){
            return true;
        }
        else{
            return false;
        }
    }

    // Count set bits in a binary number
    static int CountSetBits(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    // Fast exponentiation
    static void FastExpo(int a, int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
            ans *=a;}
            a=a*a;
            n=n>>1;
        }
        System.out.println(ans);
    }

    // Modular Exponentiation
    static void ModExpo(int a, int n, int m){
        int ans = 1;
        while(n>0){
            if((n&1)!=0){
                ans=(ans*a)%m;
            }
            a=(a*a)%m;
            n=n>>1;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {

        // Bitwise operators
        System.out.println(5&6);
        System.out.println(5|6);
        System.out.println(5^6);
        System.out.println(~5);
        System.out.println(5<<2);
        System.out.println(6>>1);

        EvenOrOdd(5);

        System.out.println(GetithBit(10, 2));

        System.out.println(SetithBit(10, 2));

        System.out.println(ClearithBit(10, 1));
        
        UpdateithBit(10, 1);
        UpdateithBit01(10, 1, 0);

        ClearLastiBits(15, 2);

        ClearRangeBits(2515, 2, 7);

        if(IsPowerOf2(8)){
            System.out.println("The given number is a power of 2");
        }
        else{
            System.out.println("The given number is not a power of 2");
        }

        System.out.println("Set bits in given number is "+CountSetBits(7));

        FastExpo(2, 13);

        ModExpo(10, 100, 9);
    }
}
