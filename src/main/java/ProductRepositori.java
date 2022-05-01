public class ProductRepositori {

    protected Product[] products = new Product[0];

    public Product[] addProduct(Product product) {
        int length = products.length + 1;
        Product[] tmp = new Product[length];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
        return products;
    }

    public Product[] findAll() {
        return products;
    }

    public Product[] deleteProduct(int id) {
        if (products.length == 0) {
            return products;
        } else {
            int length = products.length - 1;
            Product[] tmp = new Product[length];
            int index = 0;
            for (Product product : products) {
                if (product.id != id) {
                    tmp[index] = product;
                    index++;
                }
            }
            Product[] tmp2 = new Product[index];
            for (int i = 0; i < index; i++) {
                tmp2[i] = tmp[i];
            }
            products = tmp2;
            return products;
        }
    }
}
