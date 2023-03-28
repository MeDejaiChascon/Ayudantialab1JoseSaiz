

package com.mycompany.ayudantialab;

import java.util.ArrayList;
import java.util.Scanner;

public class Ayudantialab1JoseSaiz {

    private ArrayList<String> tasks;

    public Ayudantialab1JoseSaiz() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        tasks.remove(index);
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No hay tareas en el programa");
        } else {
            System.out.println("Tarea:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + 1 + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Ayudantialab1JoseSaiz listaTareas = new Ayudantialab1JoseSaiz();

        while (true) {
            System.out.println("\nSelecciona una opcion:");
            System.out.println("1. Ingresar tarea");
            System.out.println("2. Borrar tarea");
            System.out.println("3. Mostrar tarea");
            System.out.println("4. Salir");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Ingresar Tarea: ");
                    String tarea = scanner.nextLine();
                    listaTareas.addTask(tarea);
                    break;
                case 2:
                    listaTareas.displayTasks();
                    if (!listaTareas.tasks.isEmpty()) {
                        System.out.print("Ingresar el numero de la tarea que desea eliminar: ");
                        int index = scanner.nextInt();
                        listaTareas.removeTask(index - 1);
                    }
                    break;
                case 3:
                    listaTareas.displayTasks();
                    break;
                case 4:
                    System.out.println("Salio del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
