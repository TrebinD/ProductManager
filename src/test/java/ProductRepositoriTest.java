import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoriTest {
    ProductRepositori productRepositori = new ProductRepositori();
    Product book1 = new Book(1, "Учебник по Java", 150, "Bary Bred");
    Product smartphone1 = new Smartphone(2, "Iphone 12ProMax", 250, "Apple");
    Product book2 = new Book(3, "Java для чайников", 150, "Bary Bred");
    Product smartphone2 = new Smartphone(4, "m30", 350, "Motorola");
    Product book3 = new Book(5, "Воина и мир", 150, "Л.Н. Толстой");
    Product smartphone3 = new Smartphone(6, "54", 450, "Samsung");

    @Test
    public void addProduct() {

        ProductManager manager = new ProductManager(productRepositori);
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);


        Product[] actual = new Product[]{book1,book2,book3,smartphone1, smartphone2, smartphone3,};
        Product[] excpeted = productRepositori.findAll();

        assertArrayEquals(actual, excpeted);
    }

    @Test
    public void deleteProduct() {

        ProductManager manager = new ProductManager(productRepositori);
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        manager.delete(3);

        Product[] actual = new Product[]{book1,book3,smartphone1, smartphone2, smartphone3,};
        Product[] excpeted = productRepositori.findAll();

        assertArrayEquals(actual, excpeted);
    }

    @Test
    public void searchProductSeveralTrue() {

        ProductManager manager = new ProductManager(productRepositori);
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = new Product[]{book1, book2};
        Product[] excpeted = manager.searchBy("Java");

        assertArrayEquals(actual, excpeted);
    }

    @Test
    public void searchProductNoTrue() {

        ProductManager manager = new ProductManager(productRepositori);
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = new Product[]{};
        Product[] excpeted = manager.searchBy("Help");

        assertArrayEquals(actual, excpeted);
    }

    @Test
    public void searchProductPhoneTrue() {

        ProductManager manager = new ProductManager(productRepositori);
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = new Product[]{smartphone1};
        Product[] excpeted = manager.searchBy("Iphone");

        assertArrayEquals(actual, excpeted);
    }

    @Test
    public void searchProductFewWordssTrue() {

        ProductManager manager = new ProductManager(productRepositori);
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = new Product[]{smartphone1};
        Product[] excpeted = manager.searchBy("Iphone 12ProMax");

        assertArrayEquals(actual, excpeted);
    }



}