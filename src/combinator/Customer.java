package combinator;

import java.math.BigInteger;
import java.time.LocalDate;

public class Customer {

    private final String name;
    private final String email;
    private final BigInteger phoneNumber;
    private final LocalDate dob;

    public Customer(String name,
                    String email,
                    BigInteger phoneNumber,
                    LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public BigInteger getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDob() {
        return dob;
    }
}
