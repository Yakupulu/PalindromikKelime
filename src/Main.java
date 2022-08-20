import  java.util.Scanner;

public class Main {

    //1.yontem:
    static boolean isPalindromik(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //2.yontem:

    static boolean isPalindromik2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
            return (str.equals(reverse));
    }

//kullanicinin girdigi kelimenin palindromik kelime olup olmadigini sorgular:

    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        String str;
        System.out.print("Kelime giriniz:");
        str=scanner.next();

        if(isPalindromik2(str))
           System.out.println(str+" palindromik bir kelimedir");
       else
           System.out.println(str+" palindromik bir kelime degildir.");
    }
}
