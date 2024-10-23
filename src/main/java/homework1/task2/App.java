package homework1.task2;

import homework1.task2.logic.PaymentService;
import homework1.task2.model.Account;
import homework1.task2.model.Client;
import homework1.task2.model.CreditCard;
import homework1.task2.model.Order;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Client client = new Client(1, new Account(LocalDate.now()), new CreditCard("1-1-1-1", 500.0));
        Order order = new Order(50.0);
        System.out.println(client.getCard().getAmount());
        PaymentService.payForOrder(client, order);
        System.out.println(client.getCard().getAmount());
    }
}
