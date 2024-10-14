package first_chapter.SixthPoint.SeventhTask;

public class Name {
    private final String lastName;
    private final String firstName;
    private final String patronymic;

    public Name(String lastName, String firstName, String patronymic) {
        if (
                lastName != null && !lastName.isEmpty() ||
                firstName != null && !firstName.isEmpty() ||
                patronymic != null && !patronymic.isEmpty()
        ) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.patronymic = patronymic;
        } else {
            throw new NullPointerException("Хотя бы один из объектов должен быть не null и не пустой строкой");
        }
    }

    public Name(String firstName) {
        this(null, firstName, null);
    }

    public Name(String lastName, String firstName) {
        this(lastName, firstName, null);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
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

        if (patronymic != null && !patronymic.isEmpty()) {
            if (!result.isEmpty()) {
                result.append(" ");
            }
            result.append(patronymic);
        }

        return result.toString();
    }
}

