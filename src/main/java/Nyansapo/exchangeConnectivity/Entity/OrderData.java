package Nyansapo.exchangeConnectivity.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderData {

    private String productName;

    private int quantity;

    private  Double price;

    private  String side;

    private String exchange_Path;

    public OrderData (){}

    public OrderData (String productName, int quantity, Double price, String side, String exchange_Path) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.side = side;
        this.exchange_Path = exchange_Path;
    }

    public OrderData (String productName, int quantity, Double price, String side) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.side = side;
    }

    //Setters
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setExchange_Path(String exchange_Path) {
        this.exchange_Path = exchange_Path;
    }

    //Getter

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public String getSide() {
        return side;
    }

    public String getExchange_Path() {
        return exchange_Path;
    }
}
