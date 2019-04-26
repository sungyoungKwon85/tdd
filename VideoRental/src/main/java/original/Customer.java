package original;

import java.util.ArrayList;
import java.util.List;

class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";

        totalAmount = getTotalAmount(totalAmount);

        result = makeFigureWithRentals(result);

        frequentRenterPoints = getFrequentRenterPoints(frequentRenterPoints);

        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter pointers";

        return result;
    }

    private int getFrequentRenterPoints(int frequentRenterPoints) {
        for (Rental each : rentals) {
            frequentRenterPoints += calculateFrequentRenterPoints(each);
        }
        return frequentRenterPoints;
    }

    private double getTotalAmount(double totalAmount) {
        for (Rental each : rentals) {
            double thisAmount = calculateAmount(each);
            totalAmount += thisAmount;
        }
        return totalAmount;
    }

    private String makeFigureWithRentals(String result) {
        for (Rental each : rentals) {
            double thisAmount = calculateAmount(each);

            result += "\t" + thisAmount + "(" + each.getMovie().getTitle() + ")" + "\n";
        }
        return result;
    }

    private int calculateFrequentRenterPoints(Rental each) {
        int frequentRenterPoints = 0;
        frequentRenterPoints++;
        if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

    private double calculateAmount(Rental each) {
        double thisAmount = 0;
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (each.getDaysRented() > 2) {
                    thisAmount += (each.getDaysRented() - 2) * 1.5;
                }
                break;

            case Movie.NEW_RELEASE:
                thisAmount += each.getDaysRented() * 3;
                break;

            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (each.getDaysRented() > 3) {
                    thisAmount += (each.getDaysRented() - 3) * 1.5;
                }
                break;
        }
        return thisAmount;
    }
}