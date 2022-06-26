import java.util.Enumeration;

public class HtmlStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getHeaderText(aCustomer.getName());
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for each rental
            result += getRentalText(each);
        }
        // add footer lines
        result += getFooterText(aCustomer);
        return result;
    }

    private String getHeaderText(String customerName) {
        return "<H1>Rentals for <EM>" + customerName +
                "</EM></H1><P>\n";
    }

    private String getRentalText(Rental rental) {
        return rental.getMovie().getTitle() + ": " +
                String.valueOf(rental.getCharge()) + "<BR>\n";
    }

    private String getFooterText(Customer customer) {
        String result = "";
        result += "<P>You owe <EM>" +
                String.valueOf(customer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                String.valueOf(customer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
        return result;
    }
}