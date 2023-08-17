package Question2;

import java.util.Scanner;

public class Emoticons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split(" ");

        String srtHappy = ":-)";
        String srtUpset = ":-(";
        int happyFace = 0;
        int upsetFace = 0;

        for (int i = 0; i<word.length; i++){

            if (word[i].equals(srtHappy)){
                happyFace = happyFace+1;
            }else if (word[i].equals(srtUpset)){
                upsetFace = upsetFace+1;
            }

        }
        if (happyFace == upsetFace) {
            System.out.println("Neutral");
        } else if (happyFace > upsetFace) {
            System.out.println("Fun");
        }else {
            System.out.println("Upset");
        }
    }
}
