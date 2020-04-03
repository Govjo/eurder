package item;


public class Item {

    private String name;
    private String description;
    private int numberInStock;
    private double price;

    public Item(String name, String description, int numberInStock, double price) {
        this.name = name;
        this.description = description;
        this.numberInStock = numberInStock;
        this.price = price;
    }

    public Item(ItemBuilder itemBuilder) {
        this.name = name;
        this.description = description;
        this.numberInStock = numberInStock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static class ItemBuilder {
        private String name;
        private String description;
        private int numberInStock;
        private float price;

        private ItemBuilder() {
        }

        public static ItemBuilder itemBuilder() {
            return new ItemBuilder();
        }

        public Item build() {

            return new Item(this);
        }

        public ItemBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ItemBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public ItemBuilder withNumberInStock(int numberInStock) {
            this.numberInStock = numberInStock;
            return this;
        }

        public ItemBuilder withPrice(float price) {
            this.price = price;
            return this;
        }
    }
}
