package homework1.task2.logic;

import homework1.task2.model.Client;
import homework1.task2.model.CreditCard;
import homework1.task2.model.Order;

public class PaymentService {

    private PaymentService() {
    }

    public static boolean payForOrder(Client client, Order order) {
        CreditCard card = client.getCard();
        double price = order.getPrice();

        if (card.getAmount() > price) {
            card.setAmount(card.getAmount() - price);
            return true;
        } else {
            System.out.println("Недостаточно средств");
            return false;
        }
    }

    public static void blockCard(CreditCard card) {
        if (card.isExpired()) {
            System.out.println("Карта заблокирована");
        }
    }
}
