package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repo = new ProductRepository();

    @Test
    void shouldSaveAllProducts() {

        repo.saveAll(List.of(new Product(), new Product(), new Product()));

        assertEquals(3, repo.findAll().size());
    }

    @Test
    void shouldSaveAllBooks() {
        Collection<Book> products = new ArrayList<>();
        products.add(new Book());
        products.add(new Book());
        products.add(new Book());

        repo.saveAll(products);

        assertEquals(3, repo.findAll().size());
    }

}