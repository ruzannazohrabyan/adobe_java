package com.company.week6.classwork.task1;

public final class Order implements Comparable<Order> {
    private final Integer price;
    private final String recipient;

    public Order(Integer price, String recipient) {
        this.price = price;
        this.recipient = recipient;
    }

    public Integer getPrice() {
        return price;
    }

    public String getRecipient() {
        return recipient;
    }

    @Override
    public int compareTo(Order obj) {

        final int result = this.getPrice().compareTo(obj.getPrice());
        if(result == 0) {
            return this.getRecipient().compareTo(obj.getRecipient());
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "adfgkghjhgj";
        String s2 = "bdfafg";
        System.out.println(s1.compareTo(s2));
    }


    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Order)) {
            return false;
        }

        final Order order = (Order) obj;
        return Objects.equals(getPrice(), order.getPrice()) &&
        order.getPrice().equals(getPrice()) && order.getRecipient().equals(getRecipient());


    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", recipient='" + recipient + '\'' +
                '}';
    }
}
