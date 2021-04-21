package HW_16042021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;

public class ApplicationMenu {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));// Не использовал Scanner, т.к. он оставляет пробел после числа. Не понял как по другому сделать.
    Shop shop = new Shop();

    public void start() {
        while (true) {
            try {
                System.out.println("""
                        Выберите действие:
                        1-Вывод всех товаров
                        2-Добавление товара
                        3-Удаление товара
                        4-Редактирование товара
                        5-Выход""");
                switch (Integer.parseInt(reader.readLine())) {
                    case 1 -> {
                        try {
                            if (shop.listOfProducts().size() > 0) {
                                System.out.println("""
                                        Выберите способ вывода:
                                        1-по цене(возрастание)
                                        2-по цене(убывание)
                                        3-по добавлению(сначало новые, потом старые)""");
                                {
                                    switch (Integer.parseInt(reader.readLine())) {
                                        case 1 -> {
                                            shop.listOfProducts().sort(Comparator.comparing(Product::getPrice));
                                            shop.printListOfProduct();
                                        }
                                        case 2 -> {
                                            shop.listOfProducts().sort(Comparator.comparing(Product::getPrice).reversed());
                                            shop.printListOfProduct();
                                        }
                                        case 3 -> {
                                            shop.listOfProducts().sort(Comparator.comparing(Product::getId).reversed());//Вообще не понял как сортировать по порядку добавления
                                            shop.printListOfProduct();
                                        }
                                    }
                                }
                            }
                        } catch (CustomException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 2 -> {
                        try {
                            System.out.println("Введите 3 параметра: id товара, название товара, цена тоавра");
                            shop.addProduct(new Product(Integer.parseInt(reader.readLine()), reader.readLine(), Integer.parseInt(reader.readLine())));
                        } catch (CustomException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 3 -> {
                        try {
                            if (shop.listOfProducts().size() > 0) {
                                System.out.println("Введите id товара, который нужно удалить");
                                shop.removeProduct(Integer.parseInt(reader.readLine()));
                            }
                        } catch (CustomException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 4 -> {
                        try {
                            if (shop.listOfProducts().size() > 0) {
                                System.out.println("Введите 3 параметра: id товара, название нового товара и новую цену");
                                shop.editProduct(Integer.parseInt(reader.readLine()), reader.readLine(), Integer.parseInt(reader.readLine()));
                            }
                        } catch (CustomException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 5 -> {
                        return;
                    }
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Введено не верное значение!\n");
            }
        }
    }
}
