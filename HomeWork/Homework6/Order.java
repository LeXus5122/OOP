package Homework.Homework6;

import java.util.List;

public class Order<T extends Product> { // Принцип единственной ответственности, Принцип открытости/закрытости

  private List<T> productList;
  private Human human;
  private Automat automat;
  private double price;

  public Order(List<T> productList, Human human, Automat automat, double price) {
    this.productList = productList;
    this.human = human;
    this.automat = automat;
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public List<T> getProductList() {
    return productList;
  }

  public void setProductList(List<T> productList) {
    this.productList = productList;
  }

  public Human getHuman() {
    return human;
  }

  public void setHuman(Human human) {
    this.human = human;
  }

  public Automat getAutomat() {
    return automat;
  }

  public void setAutomat(Automat automat) {
    this.automat = automat;
  }

  @Override
  public String toString() {
    String result = "Order [";
    for (int index = 0; index < productList.size(); index++) {
      result += "Product" + (index + 1) + "=" + productList.get(index).getName() + ", ";
    }
    return result + "name=" + human.getName() + ", totalPrice=" + price + "]";

  }

}
