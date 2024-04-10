package standardexception;

import java.util.Scanner;

/**
 * IntelliJ IDEA 2021.2.2 (Ultimate Edition)<br>
 * Licensed to Gilberto Rouxinol<br>
 * For educational use only.<br><br>
 * <p>
 * Polytechnic Institute of Viseu<br>
 * School of Technology and Management of Viseu<br><br>
 * <p>
 * Class created by Gilberto Rouxinol on 2024<br>
 * Copyright © 2024 Gilberto Rouxinol<br>
 * All rights reserved<br><br>
 * <p>
 * @author Gilberto Rouxinol
 * @version 2024.04.10
 */
public class StandardException {
    public static void main(String[] args) {
        Scanner anne = new Scanner(System.in);

        int table[];
        int dimension = 0;
        int index = 0;
        int element = 0;
        int value = 0;

        try {
            // RunTimeException
            // NegativeArraySizeException
            System.out.println("(1) NegativeArraySizeException");
            System.out.println("    Enter the table dimension:");
            dimension = anne.nextInt();
            table = new int[dimension];
            for (int i = 0; i < table.length; i++) {
                table[i] = i*10;
            }

            // RunTimeException
            // IndexOutOfBoundsException
            // If array: ArrayIndexOutOfBoundsException
            // If strings: StringIndexOutOfBoundsException
            System.out.println("(2) ArrayIndexOutOfBoundsException");
            System.out.println("    Enter the index of the array:");
            index = anne.nextInt();
            element = index + 1;
            System.out.println("The element " + element + " have the value:");
            System.out.println(table[index]);

            // ArithmeticException
            System.out.println("(3) ArithmeticException");
            System.out.println("    Enter the divider:");
            value = anne.nextInt();
            System.out.println("Division: " + table[0]/value);

        } catch (NegativeArraySizeException e) {

            System.out.println("(1) Error Message (Negative Array Size): " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e){

            System.out.println("(2) Error Message (Array Index Out Of Bound): " + e.getMessage());

        } catch (ArithmeticException e) {

            System.out.println("(3) Error Message (Aritmetic): " + e.getMessage());

        } finally {

            System.out.println("... and finally.");

        }

        System.out.println("Now, outside the try catch block.");

    }
}
