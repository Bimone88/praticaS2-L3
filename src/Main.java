
import entitites.Product;
import entitites.Order;
import entitites.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import entitites.Product;
import entitites.Order;
import entitites.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Creare qui le liste di esempio dei prodotti e ordini
        List<Product> productList = new ArrayList<>();
        List<Order> orderList = new ArrayList<>();
        List<Customer> customerList = new ArrayList<>();

        // ((aggiungeee lista )

        // Esercizio #1: Lista di prodotti della categoria "Books" con prezzo > 100
        List<Product> expensiveBooks = productList.stream()
                .filter(product -> "Books".equals(product.getCategory()) && product.getPrice() > 100)
                .collect(Collectors.toList());

        // Stampa i risultati di libriCostosi
        expensiveBooks.forEach(System.out::println);

        // Esercizio #2: Lista di ordini con prodotti della categoria "Baby"
        List<Order> ordersWithBabyProducts = orderList.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> "Baby".equals(product.getCategory())))
                .collect(Collectors.toList());

        // Stampa i risultati di ordiniConProdottiPerBambini
        ordersWithBabyProducts.forEach(System.out::println);

        // Esercizio #3: Lista di prodotti della categoria "Boys" con uno sconto del 10% applicato
        List<Product> discountedBoysProducts = productList.stream()
                .filter(product -> "Boys".equals(product.getCategory()))
                .map(product -> new Product(product.getId(), product.getName(), product.getCategory(), product.getPrice() * 0.9))
                .collect(Collectors.toList());

        // Stampa i risultati di prodottiScontatiPerRagazzi
        discountedBoysProducts.forEach(System.out::println);

        // Esercizio #4: Lista di prodotti ordinati da clienti di livello (tier) 2 tra l’01-Feb-2021 e l’01-Apr-2021
        LocalDate startDate = LocalDate.of(2021, 2, 1);
        LocalDate endDate = LocalDate.of(2021, 4, 1);
        List<Product> productsOrderedByTier2Customers = orderList.stream()
                .filter(order -> order.getOrderDate().compareTo(startDate) >= 0 &&
                        order.getOrderDate().compareTo(endDate) <= 0 &&
                        order.getCustomer().getTier() == 2)
                .flatMap(order -> order.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());

        // Stampa i risultati di prodottiOrdinatiDaTier2
        productsOrderedByTier2Customers.forEach(System.out::println);
    }
}


