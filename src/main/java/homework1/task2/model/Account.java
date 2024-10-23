package homework1.task2.model;

import java.time.LocalDate;

public class Account {
    private final LocalDate lastWithdraw;

    public Account(LocalDate lastWithdraw) {
        this.lastWithdraw = lastWithdraw;
    }
}
