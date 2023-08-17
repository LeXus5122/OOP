package Homework.Homework6;

import java.util.Calendar;

public class HotBeverage extends Beverage { // Принцип единственной ответственности, Принцип открытости/закрытости

  private Integer temperature;

  public HotBeverage(String name, int price, int quantity, Calendar bestBefore, double volume, Integer temperature) {
    super(name, price, quantity, bestBefore, volume);
    this.temperature = temperature;
  }

  public Integer getTemperature() {
    return temperature;
  }

  public void setTemperature(Integer temperature) {
    this.temperature = temperature;
  }

  @Override
  public String toString() {
    return super.toString() + ", temp=" + temperature;

  }

}
