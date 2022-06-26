import java.util.Enumeration;

public abstract class Statement {
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

    protected abstract String getHeaderText(String customerName);

    protected abstract String getRentalText(Rental rental);

    protected abstract String getFooterText(Customer customer);
}