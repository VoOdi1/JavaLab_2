package myPackege;

public class makePassword extends make {

    String Password (int length,int m) {
        String password = "";
        int i = 0;
        while (i < length - (m + 1)) {
            password = password + randomCharacter("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz");
            i++;
        }
        for (int j = 0; j < (m); j++) {
            String randomDigit = randomCharacter("0123456789");
            password = password + randomDigit;
        }
        if (m == length) return password;
        else if (m <= length) {
            String randomSymbol = randomCharacter("_!?");
            password = insertAtRandom(password, randomSymbol);
            return password;
        } else return password;
    }
}
