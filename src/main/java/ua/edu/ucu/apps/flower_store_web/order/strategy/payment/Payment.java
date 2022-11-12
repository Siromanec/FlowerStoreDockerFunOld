package ua.edu.ucu.apps.flower_store_web.order.strategy.payment;

public interface Payment {
    void pay(double price);
    double fees(double totalPrice);
}
