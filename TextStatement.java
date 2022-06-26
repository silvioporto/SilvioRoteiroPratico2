public class TextStatement extends Statement {
    protected String getHeaderText(String customerName) {
        return "Rental Record for " + customerName + "\n";
    }

    protected String getRentalText(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
    }

    protected String getFooterText(Customer customer) {
        String result = "";
        result += "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }
}