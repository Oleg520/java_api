package org.example.sem6.hw;

import java.util.*;

/**
 * 1. Создать множество ноутбуков.
 * 2. Написать метод, который будет запрашивать у пользователя критерий (или критерии)
 * фильтрации и выведет ноутбуки, отвечающие фильтру.
 * Критерии фильтрации можно хранить в Map.
 * Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * 3. Далее нужно запросить минимальные значения для указанных критериев - сохранить
 * параметры фильтрации можно также в Map.
 * 4. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
 * условиям.
 */
public class Main {
    private static int id;
    private static String[] brands;
    private static String[] colors;
    private static int[] rams;
    private static int[] ssds;
    private static String[] displays;
    private static Map<Integer, String> fields = new HashMap<>();

    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        id = 1;
        brands = new String[]{"Asus", "Apple", "MSI", "Huawei", "Lenovo", "Samsung", "Xiaomi", "HP", "Honor"};
        colors = new String[]{"Red", "Black", "White", "Yellow", "Blue", "Green", "Pink", "Grey"};
        rams = new int[]{8, 16, 32};
        ssds = new int[]{256, 512, 1024, 2048};
        displays = new String[]{"14", "15.6", "16", "13.3", "17.3", "18"};
        fields.put(1, "Производитель");
        fields.put(2, "Диагональ экрана");
        fields.put(3, "Объем оперативной памяти");
        fields.put(4, "Общий объем накопителей(SSD)");
        fields.put(5, "Цвет");
        int laptopsToGenerate = 100;
        for (int i = 0; i < laptopsToGenerate; i++) {
            laptops.add(generateLaptop());
        }
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
        printGreeting();
        int[] filtres = getCriteries();
        Map<Integer, String> values = getFilterValues(filtres);
        Set<Laptop> filtredLaptops = filtredLaptops(laptops, values);
        if (filtredLaptops.isEmpty()) {
            System.out.println("По вашим критериям ничего не найдено. Приходите в другой раз");
        } else {
            System.out.println("Подборка ноутбуков специально для вас");
            for (Laptop filtredLaptop : filtredLaptops) {
                System.out.println(filtredLaptop);
            }
        }
    }

    private static void printGreeting() {
        System.out.println("\nДобро пожаловать в магазин техники. Я профессионал по подбору ноутбуков, буду рад помочь вам.");
    }

    private static int[] getCriteries() {
        System.out.println("Вы можете указать один или несколько критериев для поиска.\nЕсли их несколько, введите числа через пробел");
        System.out.println("1 - Производитель");
        System.out.println("2 - Диагональ экрана");
        System.out.println("3 - Объем оперативной памяти");
        System.out.println("4 - Общий объем накопителей(SSD)");
        System.out.println("5 - Цвет");
        String[] choice = new Scanner(System.in).nextLine().split(" ");
        int[] choiceNums = new int[choice.length];
        for (int i = 0; i < choice.length; i++) {
            choiceNums[i] = Integer.parseInt(choice[i]);
        }
        return choiceNums;
    }

    private static Map<Integer, String> getFilterValues(int[] values) {
        Map<Integer, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 3 || values[i] == 4) {
                System.out.println("Укажите минимальное значение для критерия " + fields.get(values[i]));
            } else {
                System.out.println("Укажите значение для критерия " + fields.get(values[i]));
            }
            String s = scanner.next();
            map.put(values[i], s);
        }
        return map;
    }

    private static Set<Laptop> filtredLaptops(Set<Laptop> laptops, Map<Integer, String> values) {
        Set<Laptop> flptp = new HashSet<>();
        for (Laptop laptop : laptops) {
            int cntFilter = values.size();
            for (Map.Entry<Integer, String> value : values.entrySet()) {
                if (value.getKey() == 1 && laptop.brand.equalsIgnoreCase(value.getValue()) ||
                        value.getKey() == 2 && laptop.displaySize.equals(value.getValue()) ||
                        value.getKey() == 3 && laptop.ramSize >= Integer.parseInt(value.getValue()) ||
                        value.getKey() == 4 && laptop.ssdSize >= Integer.parseInt(value.getValue()) ||
                        value.getKey() == 5 && laptop.color.equalsIgnoreCase(value.getValue())
                ) {
                    cntFilter--;
                }
            }
            if (cntFilter == 0) {
                flptp.add(laptop);
            }
        }
        return flptp;
    }

    private static Laptop generateLaptop() {
        Random rnd = new Random();
        Laptop lp = new Laptop();
        lp.id = id++;
        lp.year = rnd.nextInt(2019, 2025);
        lp.ramSize = rams[rnd.nextInt(0, rams.length)];
        lp.brand = brands[rnd.nextInt(0, brands.length)];
        lp.color = colors[rnd.nextInt(0, colors.length)];
        lp.ssdSize = ssds[rnd.nextInt(0, ssds.length)];
        lp.displaySize = displays[rnd.nextInt(0, displays.length)];
        lp.price = rnd.nextInt(40000, 150000);
        return lp;
    }
}
