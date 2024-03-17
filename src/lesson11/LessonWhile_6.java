package lesson11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LessonWhile_6 {
    public static void main(String[] args) throws IOException {
        //10 Пользователь вводит полный путь и название файла. Пока пользователь не ввел путь к существующему файлу, повторять ввод.
        // Проверить, что файл существует, можно так: File f = new File(); boolean isExists = f.exists();
        String file = "lesson6_file/file";
        Scanner sc = new Scanner(System.in);
        File f = new File(file);
        String str = "";
        boolean isExists = f.exists();
        if (isExists){
            System.out.println("Файл существует " + file);
            while (!str.equals(file)) {
                System.out.println("Напишите путь к файлу");
                str = sc.nextLine();
                if (str.equals(file)){
                    System.out.println("Файл найден!");
                }
            }
        }else {
            System.err.println("Нет такого файла " + file);
        }





    }

}

