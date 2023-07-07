package ru.netology.repository;

import ru.netology.domain.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProductRepository {
    private List<Product> items = new ArrayList<>();

    public void save(Product item) {
        this.items.add(item);
    }

    public Product findById(int id) {
        for (Product item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public Collection<Product> findAll() {
        return items;
    }

    public void removeById(int id) {
        this.items.removeIf(element -> element.getId() == id);
    }

    public void saveAll(Collection<? extends  Product> items) {
        this.items.addAll(items);
    }
}
