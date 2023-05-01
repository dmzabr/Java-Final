import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        Random rd = new Random();

        String manuf[] = {"Apple", "HP", "Dell", "Lenovo", "ASUS"};
        String os[] = {"Windows", "Ubuntu", "MacOS"};
        String color[] = {"Black", "Silver", "Gold"};

        for(int i = 0; i < 100; i++){
            notebooks.add(new Notebook(4 + rd.nextInt(29), 500 + rd.nextInt(1501), os[rd.nextInt(3)],color[rd.nextInt(3)], manuf[rd.nextInt(5)]));
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню фильтров:");
            System.out.println("1. Фильтр по ОЗУ");
            System.out.println("2. Фильтр по размеру ЖД");
            System.out.println("3. Фильтр по операционной системе");
            System.out.println("4. Фильтр по цвету");
            System.out.println("5. Фильтр по производителю");
            System.out.println("6. Выход");
            System.out.println("Выберите пункт меню: ");

            int choice = scanner.nextInt();

            if (choice == 6) {
                break;
            }

            int min;
            int max;
            String value;

            switch (choice) {
                case 1:
                    System.out.println("Введите минимальный размер ОЗУ: ");
                    min = scanner.nextInt();
                    System.out.println("Введите максимальный размер ОЗУ: ");
                    max = scanner.nextInt();
                    for (Notebook notebook : notebooks) {
                        if (notebook.getRam() >= min && notebook.getRam() <= max) {
                            System.out.println(notebook);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Введите минимальный размер ЖД: ");
                    min = scanner.nextInt();
                    System.out.println("Введите максимальный размер ЖД: ");
                    max = scanner.nextInt();
                    for (Notebook notebook : notebooks) {
                        if (notebook.getHddSize() >= min && notebook.getHddSize() <= max) {
                            System.out.println(notebook);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите операционную систему: ");
                    value = scanner.next();
                    for (Notebook notebook : notebooks) {
                        if (notebook.getOs().equalsIgnoreCase(value)) {
                            System.out.println(notebook);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Введите цвет: ");
                    value = scanner.next();
                    for (Notebook notebook : notebooks) {
                        if (notebook.getColor().equalsIgnoreCase(value)) {
                            System.out.println(notebook);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Введите производителя: ");
                    value = scanner.next();
                    for (Notebook notebook : notebooks) {
                        if (notebook.getManufacturer().equalsIgnoreCase(value)) {
                            System.out.println(notebook);
                        }
                    }
                    break;
            }
        }
    }
}

