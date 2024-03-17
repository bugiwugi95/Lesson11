package lesson11;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class LessonWhile_3 {
    public static void main(String[] args) throws IOException {
        //7
        InputStream stream = Files.newInputStream(Paths.get("gameW"));
        Scanner sc = new Scanner(stream);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        String res = "";
        System.out.println("Угадайте секрктное слово: ");

        while (!res.equals(str1)) {
            System.out.println("Подсказка " + str);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите слово: ");
            res = scanner.nextLine();
            if (res.equals(str1)) {
                System.out.println("Win: " + str1);
            } else {
                if (res.contains("ja") || res.contains("va")) {
                    System.out.println(res + "Горячо!!!");

                }
            }


        }

    }
}
