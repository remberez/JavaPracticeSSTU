package first_chapter.FourthPoint.FifthTask;

public class Name {
    private String lastName;
    private String firstName;
    private String patronymic;

    public Name(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public Name(String firstName) {
        this.firstName = firstName;
    }

    public Name(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
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

