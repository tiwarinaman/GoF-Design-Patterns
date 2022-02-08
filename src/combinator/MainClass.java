package combinator;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.Month;

import static combinator.CustomerRegistrationValidator.*;

public class MainClass {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Naman Kumar",
                "naman@gmail.com",
                new BigInteger("9898989898"),
                LocalDate.of(2000, Month.JULY, 20)
        );

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);
    }

}
