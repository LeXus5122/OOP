package Homework.Homework6;

import java.util.List;

public interface ActorBehavior { // Принцип Разделения интерфейса

  void setMakeOrder(boolean setTade);

  void setTakeOrder(boolean setMake);

  boolean isMakeOrder(boolean isMake);

  boolean isTakeOrder(boolean isTake);

  Order makeOrder(List<String> listHuman, Automat automat, Human human);

}
