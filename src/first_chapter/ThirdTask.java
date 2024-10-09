package first_chapter;

class Name {
    private final String lastName;
    private final String firstName;
    private final String patronymic;

    public Name(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        if (lastName != null && !lastName.isEmpty()) {
            result.append(lastName);
        }

        if (firstName != null && !firstName.isEmpty()) {
            if (!result.isEmpty()) {
                result.append(" ");
            }
            result.append(firstName);
        }

        // Добавляем отчество, если оно не null или пустое
        if (patronymic != null && !patronymic.isEmpty()) {
            if (!result.isEmpty()) {
                result.append(" ");
            }
            result.append(patronymic);
        }

        return result.toString();
    }
}


public class ThirdTask {
    public static void main(String[] args) {
        Name name1 = new Name(null, "Клеопатра", null);
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name("Маяковский", "Владимир", null);

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}
