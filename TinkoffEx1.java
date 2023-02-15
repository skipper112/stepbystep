package ForGitHub;

import java.util.Arrays;
import java.util.Scanner;

public class TinkoffEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] companyName = sc.nextLine().split(" ");
        String letterColour = sc.nextLine();
        String[] yb = new String[companyName.length];

        int sum = 0;
        for(int i = 0; i<companyName.length; i++) {
            if(i<1) {
                yb[i] = letterColour.substring(0,companyName[i].length());
            }else {
                sum += companyName[i - 1].length();
                yb[i] = letterColour.substring(sum, (sum + companyName[i].length()));
            }
        }
        int neKrasSlova = 0;
        for(int i=0; i<yb.length; i++) {
            if(yb[i].contains("YY") || yb[i].contains("BB"))
                neKrasSlova++;
        }
        System.out.println(neKrasSlova);
    }
}
