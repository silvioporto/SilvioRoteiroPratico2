public class HtmlStatement extends Statement {
    protected String getHeaderText(String customerName) {
        return "<H1>Rentals for <EM>" + customerName + "</EM></H1><P>\n";
    }

    protected String getRentalText(Rental rental) {
        return rental.getMovie().getTitle() + ": " + String.valueOf(rental.getCharge()) + "<BR>\n";
    }

    protected String getFooterText(Customer customer) {
        String result = "";
        result += "<P>You owe <EM>" + String.valueOf(customer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" + String.valueOf(customer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
        return result;
    }
}