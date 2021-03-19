package HW_19032021;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ValidatorCards {
    public void validateCards(String numberDigit, String sowner, String svalidity, String scode) throws ParseException {
        class Validator {
            private String numberDigits;
            private String owner;
            private String validity;
            private String code;

            public Validator() {
                this.numberDigits = numberDigit;
                this.owner = sowner;
                this.validity = svalidity;
                this.code = scode;
            }

            public String getNumberDigits() {
                return numberDigits;
            }

            public String getOwner() {
                return owner;
            }

            public String getValidity() {
                return validity;
            }

            public String getCode() {
                return code;
            }

            public void validateCardsNumber() {
                try {
                    long cardNumber = Long.parseLong(getNumberDigits());
                    if (getNumberDigits().length() == 16) {
                        System.out.println(cardNumber + "-Верный номер карточки");
                    } else {
                        System.out.println(cardNumber + "-Не верный номер карточки");
                    }
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            }

            public void viewCard() {
                try {
                    long cardNumber = Long.parseLong(getNumberDigits());
                    char[] array = getNumberDigits().toCharArray();
                    if (array[0] == '1' || array[0] == '2' || array[0] == '3') {
                        System.out.println("Debit Card");
                    }
                    else if(array[0] == '4' || array[0] == '5' || array[0] == '6') {
                        System.out.println("Credit Card");
                    }
                    else if (array[0] == '7' || array[0] == '8' || array[0] == '9') {
                        System.out.println("Saving Card");
                    } else {
                        System.out.println("Ошибка!");
                    }
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            }

            public void validateOwner() {
                if (getOwner().isEmpty()) {
                    System.out.println("Отсутствует фамилия и имя владельца");
                } else {
                    System.out.println("Поле имени заполнено");
                }
            }

            public void validity() throws ParseException {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy");
                simpleDateFormat.setLenient(false);
                Date date = simpleDateFormat.parse(getValidity());
                boolean d = date.before(new Date());
                if (d == true) {
                    System.out.println("Карточка просрочена");
                } else {
                    System.out.println("Карточка не просрочена");
                }
            }

            public void code() {
                try {
                    int code = Integer.parseInt(getCode());
                    char[] array = getCode().toCharArray();
                    if (array.length == 3) {
                        System.out.println("CVV код верный");
                    }
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            }
        }
        Validator validator = new Validator();
        validator.validateCardsNumber();
        validator.viewCard();
        validator.validateOwner();
        validator.validity();
        validator.code();
    }
}

class Main {
    public static void main(String[] args) throws ParseException {
        ValidatorCards validatorCards = new ValidatorCards();
        validatorCards.validateCards("1234567891234567", "Petr Petrov", "12/25", "123");

    }
}
