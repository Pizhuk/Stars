package main.com;


public class Main {

    public static void main(String[] args) {
        String[][] massiv1 = {
                {"*","*","*","*","*","*","*", " ", " ", " ","*","*","*","*","*","*","*", " ", " ", " ","*","*","*","*","*","*","*"},
                {"*","*","*","*","*","*","*", " ", " ", " ","*"," "," "," "," "," ","*", " ", " ", " ","*"," "," "," "," ","*"," "},
                {"*","*","*","*","*","*","*", " ", " ", " ","*"," "," "," "," "," ","*", " ", " ", " ","*"," "," "," ","*"," "," "},
                {"*","*","*","*","*","*","*", " ", " ", " ","*"," "," "," "," "," ","*", " ", " ", " ","*"," "," ","*"," "," "," "},
                {"*","*","*","*","*","*","*", " ", " ", " ","*"," "," "," "," "," ","*", " ", " ", " ","*"," ","*"," "," "," "," "},
                {"*","*","*","*","*","*","*", " ", " ", " ","*"," "," "," "," "," ","*", " ", " ", " ","*","*"," "," "," "," "," "},
                {"*","*","*","*","*","*","*", " ", " ", " ","*","*","*","*","*","*","*", " ", " ", " ","*"," "," "," "," "," "," "}
        };

        for (int i = 0; i < massiv1.length; i++) {
            for (int j = 0; j < massiv1[i].length; j++) {
                System.out.print(massiv1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        String[][] massiv2 = {
                {"*"," "," "," "," "," "," ", " ", " ", " "," "," "," "," "," "," ","*", " ", " ", " ","*","*","*","*","*","*","*"},
                {"*","*"," "," "," "," "," ", " ", " ", " "," "," "," "," "," ","*","*", " ", " ", " "," ","*"," "," "," "," ","*"},
                {"*"," ","*"," "," "," "," ", " ", " ", " "," "," "," "," ","*"," ","*", " ", " ", " "," "," ","*"," "," "," ","*"},
                {"*"," "," ","*"," "," "," ", " ", " ", " "," "," "," ","*"," "," ","*", " ", " ", " "," "," "," ","*"," "," ","*"},
                {"*"," "," "," ","*"," "," ", " ", " ", " "," "," ","*"," "," "," ","*", " ", " ", " "," "," "," "," ","*"," ","*"},
                {"*"," "," "," "," ","*"," ", " ", " ", " "," ","*"," "," "," "," ","*", " ", " ", " "," "," "," "," "," ","*","*"},
                {"*","*","*","*","*","*","*", " ", " ", " ","*","*","*","*","*","*","*", " ", " ", " "," "," "," "," "," "," ","*"}
        };

        for (int i = 0; i < massiv2.length; i++) {
            for (int j = 0; j < massiv2[i].length; j++) {
                System.out.print(massiv2[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        String[][] massiv3 = {
                {"*"," "," "," "," "," ","*", " ", " ", " ","*","*","*","*","*","*","*", " ", " ", " "," "," "," "," "," "," "," "},
                {" ","*"," "," "," ","*"," ", " ", " ", " "," ","*"," "," "," ","*"," ", " ", " ", " "," "," "," "," "," "," "," "},
                {" "," ","*"," ","*"," "," ", " ", " ", " "," "," ","*"," ","*"," "," ", " ", " ", " "," "," "," "," "," "," "," "},
                {" "," "," ","*"," "," "," ", " ", " ", " "," "," "," ","*"," "," "," ", " ", " ", " "," "," "," ","*"," "," "," "},
                {" "," ","*"," ","*"," "," ", " ", " ", " "," "," "," "," "," "," "," ", " ", " ", " "," "," ","*"," ","*"," "," "},
                {" ","*"," "," "," ","*"," ", " ", " ", " "," "," "," "," "," "," "," ", " ", " ", " "," ","*"," "," "," ","*"," "},
                {"*"," "," "," "," "," ","*", " ", " ", " "," "," "," "," "," "," "," ", " ", " ", " ","*","*","*","*","*","*","*"}
        };

        for (int i = 0; i < massiv3.length; i++) {
            for (int j = 0; j < massiv3[i].length; j++) {
                System.out.print(massiv3[i][j]+" ");
            }
            System.out.println();
        }
    }

}

