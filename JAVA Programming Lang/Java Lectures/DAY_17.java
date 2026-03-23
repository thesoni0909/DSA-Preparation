// Recursion Part02

public class DAY_17 {
    // Tiling Problem
    static int tilingProbelm(int n){
        if(n==0||n==1){
            return 1;
        }
        // vertical choice
        int fnm1 = tilingProbelm(n-1);
        // horizontal choice
        int fnm2 = tilingProbelm(n-2);
        // total ways
        return fnm1+fnm2;
    }
    // Remove Duplicates in a String (Strings are given from a to z range only)
    static StringBuilder remDuplicates(String str, int i, StringBuilder newStr, boolean map[]){
        if(i==str.length()){
            return newStr;
        }
        if(map[str.charAt(i)-'a']!=true){
            map[str.charAt(i)-'a']=true;
            newStr.append(str.charAt(i));
        }
        return remDuplicates(str, i+1, newStr, map);
    }
    // Friends Pairing Problem
    static int friendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        // Single Choice
        int fnm1 = friendsPairing(n-1);
        // Pairing Choice
        int fnm2 = (n-1)*friendsPairing(n-2);
        // total ways
        return fnm1+fnm2;
    }
    // Print all binary Strings of size N without consecutive 1's
    static void binStr(int n, String str, int lp) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // set n as 0 in starting and call for rest n
        String newStr = str + "0";
        binStr(n-1, newStr, 0);
        // set n as 1 if last place !=1 and call for rest n
        if(lp==0){
            String newStr1 = str + "1";
            binStr(n-1, newStr1, 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("The total ways : "+tilingProbelm(4));
        String str = "appnnacollege";
        System.out.println(remDuplicates(str, 0, new StringBuilder(""), new boolean[26]));
        System.out.println(friendsPairing(4));
        binStr(3, new String(""), 0);
    }
}
