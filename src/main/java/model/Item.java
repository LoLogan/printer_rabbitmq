package model;

/**
 * Created by logan on 2017/4/7.
 */
public class Item {
    private String name;
    private int price;
    private int count;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public int getCost() {
        return price * count;
    }

    @Override
    public String toString() {
        return getName() +"   X" + getCount() + "        " + getCost();
    }
}
