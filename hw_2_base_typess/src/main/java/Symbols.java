import java.util.Scanner;

public class Symbols {
    int buf;
    private String enterTheString(){
        System.out.println("Enter the string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        buf = str.length();
        return str;
    }
    private String convertStringToStringNotNum(String line) {
        return line.replaceAll("[^A-Za-z]", "");
    }
    public void getNumberSymbols(){
        String s = convertStringToStringNotNum(enterTheString());
        int [] arrLowerL = new int[26];
        int [] arrUpperL = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i)<91&&(int)s.charAt(i)>64){
                arrUpperL[(int)s.charAt(i)%65]++;
            }
            if ((int)s.charAt(i)<123&&(int)s.charAt(i)>96){
                arrLowerL[(int)s.charAt(i)%97]++;
            }
        }
        for (int i = 0; i < arrUpperL.length; i++) {
            if (arrUpperL[i]!=0)
                System.out.println((char)(i+65)+" - "+arrUpperL[i]);
        }

        for (int i = 0; i < arrLowerL.length; i++) {
            if (arrLowerL[i]!=0)
                System.out.println((char)(i+97)+" - "+arrLowerL[i]);
        }

        for (int i = buf; i > 0; i--) {

        }
    }
}
