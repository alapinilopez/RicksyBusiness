package edu.poniperro.ricksybusiness;

public class CreditCard {
    final String owner;
    final String number;
    private double credit;
    final String SYMBOL = null;

    protected CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    protected boolean pay(double credit) {
        if (credit <= this.credit) {
            this.credit -= credit;
            return true;
        }else {
            return false;
        }
    }

    protected String number() {
        return number;
    }

    protected String cardOwner() {
        return owner;
    }

    protected double credit() {
        return credit;
    }
}

