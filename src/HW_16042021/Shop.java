package HW_16042021;

import java.util.ArrayList;

public class Shop {
    private final ArrayList<Product> listOfProduct = new ArrayList<>();
    private int count = 0;

    public void addProduct(Product product) throws CustomException {
        if (!listOfProduct.isEmpty()) {
            for (Product a : listOfProduct) {
                if (a.getId() != product.getId()) {
                    count++;
                }
            }
            if (count == listOfProduct.size()) {
                listOfProduct.add(product);
            } else {
                count = 0;
                throw new CustomException("Ошибка! Введено id, которое уже сушествует!");
            }
        } else {
            listOfProduct.add(product);
        }
        count = 0;
    }

    public ArrayList<Product> listOfProducts() throws CustomException {
        if (listOfProduct.size() > 0) {
            return listOfProduct;
        } else {
            throw new CustomException("Список пуст!\n");
        }
    }

    public void removeProduct(int id) {
        listOfProduct.removeIf(a -> a.getId() == id);
    }

    public void editProduct(int id, String name, int price) {
        for (Product a : listOfProduct) {
            if (a.getId() == id) {
                a.setPrice(price);
                a.setName(name);
            }
        }
    }

    public void printListOfProduct() {
        for (Product a : listOfProduct) {
            System.out.printf("Индекс-%-4d товар-%-20s цена-%d\n", a.getId(), a.getName(), a.getPrice());
        }
    }
}
