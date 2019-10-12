package main.objects;

public final class Product
        implements Comparable<Product> {
    private String name;
    private int price;
    private int count;

    public Product() {
        name = "";
        price = 0;
        count = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            this.name = "";
        else
            this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0)
            this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count >= 0)
            this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj != null) && (obj.getClass() == this.getClass())) {
            Product anotherProduct = (Product)obj;
            if ((this.name == anotherProduct.name) &&
                    (this.price == anotherProduct.price))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 37*this.getName().hashCode() + this.price;
    }

    @Override
    public String toString() {
        return "Product " + this.name + "\n   price: " + this.price +
                "\n   count: " + this.count;
    }

    @Override
    public int compareTo(Product anotherProduct) {
        return this.price - anotherProduct.price;
    }
}
