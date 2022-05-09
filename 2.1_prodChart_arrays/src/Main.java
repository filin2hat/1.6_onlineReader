import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String products[] = {"Хлеб", "Молоко", "Яблоки", "Чай"};
        int prices[] = {50, 100, 75, 65};
        int[] allProductCnt = new int[4];
        int sumProducts = 0;

        while (true) {
            System.out.println("Список возможных товаров для покупки:");
            printProdsAndPrices(products, prices);
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String parts[] = input.split(" ");
            int inputProduct = Integer.parseInt(parts[0]) - 1;
            int inputCount = Integer.parseInt(parts[1]);
            allProductCnt[inputProduct] += inputCount;
        }
        finalCart(allProductCnt, prices, products, sumProducts);
    }

    public static void printProdsAndPrices(String prod[], int prices[]) {
        for (int i = 0; i < prod.length; i++) {
            System.out.println((i + 1) + ". " + prod[i] + " " + prices[i] + " руб./шт.");
        }
        System.out.println("Выберите товар и количество или введите `end` \n");
    }

    public static void finalCart(int[] allProductCnt, int prices[], String products[], int sumProducts) {
        System.out.println("Ваша корзина: " + "\n" + "Нименование" + " | " + "Количество" + " | " +
                "Цена/шт" + " | " + "Общая стоимость" + "\n");
        for (int i = 0; i < products.length; i++) {
            if (allProductCnt[i] > 0) {
                sumProducts += (allProductCnt[i] * prices[i]);
                System.out.println(products[i] + " | " + +allProductCnt[i] + " | " + prices[i] + " | " +
                                    allProductCnt[i] * prices[i]);
            }
        }
        System.out.println("Итого покупок на сумму " + sumProducts + " рублей.");
    }
}