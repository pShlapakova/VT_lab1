package main.objects;

public final class Kiosk
        extends Infrastructure
        implements Comparable<Kiosk> {
    private Product[] products;

    public Kiosk() {
        super();
        products = new Product[0];
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = new Product[products.length];
        System.arraycopy(products, 0, this.products, 0,
                products.length);
    }

    public Product getProducts(int index) {
        return this.products[index];
    }

    public void setProducts(Product product, int index) {
        this.products[index] = product;
    }

    public void sell (Product[] products) {
        for (Product product: this.products) {
            for (Product soldProduct: products) {
                if (product == soldProduct)
                    product.setCount(product.getCount() - soldProduct.getCount());
            }
        }
    }

    public void procure (Product[] products) {
        for (Product product: this.products) {
            for (Product newProduct: products) {
                if (product == newProduct)
                    product.setCount(product.getCount() + newProduct.getCount());
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj != null) && (obj.getClass() == this.getClass())) {
            Kiosk anotherKiosk = (Kiosk)obj;
            if (this.getName() == anotherKiosk.getName())
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }

    @Override
    public String toString() {
        String strProducts = "";
        for (Product product: this.products) {
            strProducts += product.getName() + "; ";
        }
        return "Kiosk " + this.getName() + "\n   Products: " + strProducts;
    }

    @Override
    public int compareTo(Kiosk anotherKiosk) {
        return this.getName().compareTo(anotherKiosk.getName());
    }
}
