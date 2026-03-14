// Strings

import java.util.*;
public class DAY_13 {

    // Print letters of a String fullName
    static void PrintLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println(" ");
    }

    // Find given string is plaindrome or not
    static boolean isPalindrome(String str){
        int start=0; int end=str.length()-1; boolean bool=false;
        while(start<end){
            if(str.charAt(start)==str.charAt(end)){
                bool=true;
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return bool;
    }

    // cleaner version
    static boolean isPalindrome01(String str){
        int n=str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i)){
                return false;
            }
        }
        return true;
    }

    // Find the shortest path
    static void shortestPath(String str){
        int n=str.length(); int x=0; int y=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='W'){
                x--;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else{
                y--;
            }
        }
        double shortestdistance=Math.sqrt(((x-0)*(x-0))+((y-0)*(y-0)));
        System.out.println("The Shortest Distance to reach destination is "+shortestdistance+" meter.");
        
    }

    // find substring between specific indexes
    static void findSubstring(String str, int si, int ei){
        String subString="";
        for(int i=si;i<=ei;i++){
            subString+=str.charAt(i);
        }
        System.out.println("The substring from "+si+" to "+ei+" is "+subString);
    }

    // For a given set of strings, print the largest string on the basis of its length
    // 1st method
    static void LargestString(String arr[]){
        int len=arr.length; int max=0;

        // largest element
        for(int i=1;i<len;i++){
            if(arr[i].length()>arr[max].length()){
                max=i;
            }
        }

        // equality check
        if(arr[max].length()==arr[0].length() && arr[max].length()==arr[len-1].length()){
            System.out.println("All elements are of same length!");
        }

        // print largest string
        else{
        System.out.println(arr[max]);
        }
    }

    // 2nd method
    static void LargestString02(String arr[]){
        int len=arr.length; int max=0; boolean same = true;

        // equality check
        for(int i=0;i<len-1;i++){
            if(arr[i+1].length()!=arr[i].length()){
                same=false;
                break;
            }
        }
        if(same){
            System.out.println("All elements are of same length!");
            return;
        }

        // largest element
        for(int i=1;i<len;i++){
            if(arr[i].length()>arr[max].length()){
                max=i;
            }
        }

        // print largest string
        System.out.println(arr[max]);
    }

     // For a given set of strings, print the largest string lexicographically
    static void LargestString03(String arr[]){
        int len=arr.length; String largestStr=arr[0];
        for(int i=1;i<len;i++){
            int islarge=largestStr.compareToIgnoreCase(arr[i]);
            if(islarge<0){
                largestStr=arr[i];
            }
        }
        System.out.println(largestStr);
    }

    // For a given string, convert the first letter of each word into capital letter.
    static void Uppercase(StringBuilder str){
        int n=str.length(); char ch;
        for(int i=0; i<n-1; i++){
            if(i==0){
                ch =  Character.toUpperCase(str.charAt(i));
                str.setCharAt(i, ch);
            }
            if(str.charAt(i)==' '){
                ch = Character.toUpperCase(str.charAt(i+1));
                str.setCharAt(i+1, ch);
            }
        }
        System.out.println(str);
    }

    // String Compression
    // using String
    static String StringCompress(String str){
        String str1="";
        str1+=str.charAt(0); int count=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else if(count>1){
                str1+=count;
                str1+=str.charAt(i+1);
                count=1;
            }
            else{
                str1+=str.charAt(i+1);
            }
        }
        if(count>1){
        str1+=count;}
        return str1;
    }

    // using stringbuilder
    static String StringCompress01(String str){
        StringBuilder str1=new StringBuilder();
        str1.append(str.charAt(0)); int count=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else if(count>1){
                str1.append(count);
                str1.append(str.charAt(i+1));
                count=1;
            }
            else{
                str1.append(str.charAt(i+1));
            }
        }
        if(count>1){
        str1.append(count);}
        return str1.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Declaration
        String str="Hello";
        String str01=new String("World!");
        System.out.println(str+" "+str01);

        // Input
        System.out.print("Enter your name here : ");
        String name=sc.nextLine();
        System.out.println(str+" "+name);

        // String length : String.length();
        System.out.println(name.length());

        // stringaname.charAt(index) method : to print the specific letters from string
        System.out.println(str.charAt(0));

        String fullName="Soni Kumari";
        PrintLetters(fullName);

        String Palindrome="Noon";
        if(isPalindrome(Palindrome)==true){
            System.out.println("The given string is a palindrome string.");
        }
        else{
            System.out.println("The given string is not a palindrome string.");
        }

        if(isPalindrome01(Palindrome)==true){
            System.out.println("The given string is a palindrome string.");
        }
        else{
            System.out.println("The given string is not a palindrome string.");
        }

        String path="WNEENESENNN";
        shortestPath(path);

        // String comparison
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");

        // // comparing s1 and s2    //result=true
        if(s1==s2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        // // comparing s1 and s3   //result=false
        if(s1==s3){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        String greet="Hello World!";
        findSubstring(greet,0,4);

        String arr[]={"apple", "mango", "banana"};
        LargestString(arr);
        LargestString02(arr);
        LargestString03(arr);

        StringBuilder sb=new StringBuilder("Hello World!");
        System.out.println(sb);

        // .append() function
        StringBuilder sb01=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb01.append(ch);
        }
        System.out.println(sb01);

        StringBuilder sentence=new StringBuilder("hii, i am soni ");
        Uppercase(sentence);

        // String replace functions
        String s="hello123world49";
        System.out.println(s.replaceAll("[a-z]", "*"));
        System.out.println(s.replace("123", "321"));

        System.out.println(StringCompress("aaabbccdd"));
        System.out.println(StringCompress01("aaabbccdd"));

        sc.close();

        
    }
}
