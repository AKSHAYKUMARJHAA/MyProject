package Practice;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setAddressList(List.of(
                createAddress("1", "Pune", LocalDate.of(2020, 3, 1)),
                createAddress("2", "Delhi", LocalDate.of(2021, 3, 1)),
                createAddress("3", "Patna", LocalDate.of(2022, 3, 1)),
                createAddress("4", "Jamshedpur", LocalDate.of(2023, 3, 1))
        ));
        customer.setName("Akshay");
       // System.out.println(customer);

        LocalDate greatestDate = LocalDate.MIN;
        Address addressWithGreatestDate = null;

        for (Address address : customer.getAddressList()) {
            LocalDate updatedDate = address.getUpdatedDate();
            if (updatedDate.isAfter(greatestDate)) {
                greatestDate = updatedDate;
                addressWithGreatestDate = address;
            }
        }

        if (addressWithGreatestDate != null) {
            System.out.println("Latest Address of Customer " + customer.getName() + ":");
            System.out.println(addressWithGreatestDate);
        } else {
            System.out.println("No addresses found for customer " + customer.getName());
        }
    }

    private static Address createAddress(String flat, String district, LocalDate updatedDate) {
        Address address = new Address();
        address.setFlat(flat);
        address.setDistrict(district);
        address.setUpdatedDate(updatedDate);
        return address;
    }
}