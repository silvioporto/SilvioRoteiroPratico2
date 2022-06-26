import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getHeaderText(aCustomer.getName());
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for this rental
            result += getRentalText(each);
        }
        // add footer lines
        result += getFooterText(aCustomer);
        return result;
    }

    private String getHeaderText(String customerName) {
        return "Rental Record for " + customerName + "\n";
    }

    private String getRentalText(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" +
                String.valueOf(rental.getCharge()) + "\n";
    }

    private String getFooterText(Customer customer) {
        String result = "";
        result += "Amount owed is " +
                String.valueOf(customer.getTotalCharge()) + "\n";
        result += "You earned " +
                String.valueOf(customer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
        return result;
    }
}