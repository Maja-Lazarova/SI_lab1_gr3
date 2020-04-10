class Item {
    int id;
    String name;
    double price;

    //TODO add variable.
    double tax;

    //TODO constructor

    public Item(int id, String name, double price, double tax) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }


    //TODO setters and getters


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    double taxReturn (double price, double tax) {
        //TODO
        double tax1=0.15;
        double p=price.getPrice()*tax.getTax;
        return tax1*p;

    }
}
