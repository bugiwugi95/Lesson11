package lesson11;

import java.io.IOException;
import java.util.Scanner;

public class LessonWhile_5 {
    public static void main(String[] args) throws IOException {
        //9 Пока пользователь не введёт строку, содержащую пробел, считывайте строки и выводите их первые буквы
        Scanner sc = new Scanner(System.in);

        String str = "";
        while (!str.contains(" ")) {
            str = sc.nextLine();
            char c = str.charAt(0);
            if (str.contains(" ")) {
                System.out.println("С пробелом: ");
                System.out.println(str);
            } else {
                System.out.println(str + "= " + c);
            }
        }


    }

}

