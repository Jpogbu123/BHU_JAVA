package DatatypesAndVariables;

public class primeNumber {
    static void isNumberPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0){   // if when divided by i it has a remainder of 0 -> it is a prime number
                System.out.println(number + " is a Prime Number");
                break;
            }
        }
    }

}
