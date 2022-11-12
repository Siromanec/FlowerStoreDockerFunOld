package ua.edu.ucu.apps.flower_store_web.order.strategy.payment;

public class CreditCardPaymentStrategy implements Payment{
    /**
     * pay the price
     * @param price price you have to pay
     */
    @Override
    public void pay(double price) {

    }

    /**
     * steal 3% of your money
     * @param totalPrice totalPrice
     * @return totalPrice with fees
     */
    @Override
    public double fees(double totalPrice) {
        return totalPrice*1.03;
    }
}
