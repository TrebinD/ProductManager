public class Product {


    protected int id;
    protected String name;
    protected int coast;

    public Product(int id, String name, int coast) {
        this.name = name;
        this.id = id;
        this.coast = coast;
    }

    public boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

}
