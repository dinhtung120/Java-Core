package model;

import Util.Transaction;
import Util.Util;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TransactionHistory {
    private String id;
    private String idUser;
    private LocalDate date;
    private Transaction transaction;
    private long amount;

    public TransactionHistory(String idUser, LocalDate date, Transaction transaction, long amount) {
        this.id = Util.randomId(5);
        this.idUser = idUser;
        this.date = date;
        this.transaction = transaction;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return id + " - " + idUser + " - " + Util.formatDate(date) +
                " - " + transaction + " - " + amount;
    }
}
