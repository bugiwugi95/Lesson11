package lesson11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LessonWhile_4 {
    public static void main(String[] args) throws IOException {
        //8 Первый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй.
        // Игра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово противника
        Scanner sc = new Scanner(System.in);
        // 1 игрок сохроняет в файл слово и подсказку
        String file1 = "File1";
        PrintWriter writer = new PrintWriter(file1);
        System.out.print("Введите секретное слово в 1 файл: ");
        String player1 = sc.nextLine();
        System.out.print("Введите подсказку в 1 файл: ");
        String playerPod1 = sc.nextLine();
        writer.println(player1);
        writer.println(playerPod1);
        writer.close();
        // 2 игрок сохроняет в файл слово и подсказку
        String file2 = "File2";
        PrintWriter writer2 = new PrintWriter(file2);
        System.out.print("Введите секретное слово в 2 файл: ");
        String player2 = sc.nextLine();
        System.out.print("Введите подсказку в 2 файл: ");
        String playerPod2 = sc.nextLine();
        writer2.println(player2);
        writer2.println(playerPod2);
        writer2.close();

        String str1 = "";
        String str2 = "";
        while (!str1.equals(player2) || !str2.equals(player1)) {
            System.out.println("Подсказка " + playerPod2);
            System.out.print("Введите слово: ");
            str1 = sc.nextLine();

            System.out.println("Подсказка " + playerPod1);
            System.out.print("Введите слово: ");
            str2 = sc.nextLine();

            if (str1.equals(player2) && !str2.equals(player1)) {
                System.out.println("Win 1 player");
                break;
            } else if (str2.equals(player1) && !str1.equals(player2)) {
                System.out.println("Win 2 player");
                break;
            } else if (str1.equals(player2) && str2.equals(player1)){
                System.out.println("Ничья!");
            }else {
                System.out.println("Обе не угадали! Попробуйте еще раз.");
            }


        }


    }

}

