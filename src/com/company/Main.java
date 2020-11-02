package com.company;

import Input.Input;
import Task.Task;

public class Main {

    public static void main(String[] args) {
        boolean flag = false;
        Task tasker = new Task();
        while (!flag)
        {
            System.out.println("\nВыберите задание:\n" +
                    "1.\tРазветвляющийся процесс с помощью if\n" +
                    "2.\tРазветвляющийся процесс с помощью switch\n" +
                    "3.\tЦиклический професс, реализуемый с помощью for\n" +
                    "4.\tОбработка строки, вводимой с клавиатуры\n" +
                    "5.\tВыход");
            int switchCase = Input.inputInteger("");
            switch (switchCase){
                case 1:
                    tasker.ifTask();
                    break;
                case 2:
                    tasker.switchTask();
                    break;
                case 3:
                    tasker.forTask();
                    break;
                case 4:
                    tasker.stringTask();
                    break;
                case 5:
                    System.out.println("Выход");
                    flag = true;
                    break;
                default:
                    System.out.println("Нет такого задания");
            }
        }
    }
}
