/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package StudyWork;

/**
 *
 * @author NC
 */
import java.util.Scanner;
public class FixNameProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String UserInput = sc.nextLine();

        System.out.println(firstCharToUpperCase(UserInput));

    }

    public static String firstCharToUpperCase(String str){

        char[] chars = str.toLowerCase().toCharArray();

        boolean found = false;

        for (int i = 0; i < chars.length; ++i){

            if (!found && Character.isLetter(chars[i]) ){
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i])) {
                found = false;
            }

            }
        return String.valueOf(chars);
        }
    }
