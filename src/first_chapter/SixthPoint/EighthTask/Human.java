package first_chapter.SixthPoint.EighthTask;

import java.util.Objects;

public class Human {
    private Name name;
    private int height;
    private Human father;

    Human(String lastName, String firstName, String patronymic, int height, Human father) {
        this.name = new Name(lastName, firstName, patronymic);
        setHeight(height);
        setFatherParameters(father, lastName, patronymic);
    }

    Human(String firstName, int height) {
        this(null, firstName, null, height, null);
    }

    Human(String firstName, int height, Human father) {
        this(null, firstName, null, height, father);
    }

    Human(Name name, int height) {
        this(name.getLastName(), name.getFirstName(), name.getPatronymic(), height, null);
    }

    Human(Name name, int height, Human father) {
        this(name.getLastName(), name.getFirstName(), name.getPatronymic(), height, father);
    }

    private void setFatherParameters(Human father, String lastName, String patronymic) {
        if (!Objects.isNull(father)) {
            this.father = father;

            if (Objects.isNull(lastName) && !Objects.isNull(father.name.getLastName())) {
                name.setLastName(father.name.getLastName());
            }

            if (Objects.isNull(patronymic) && !Objects.isNull(father.name.getFirstName())) {
                name.setPatronymic(father.name.getFirstName() + "ович");
            }
        }
    }

    public Human getFather() {
        return father;
    }

    public int getHeight() {
        return height;
    }

    public Name getName() {
        return name;
    }

    public void setHeight(int height) {
        if (!(height > 0 && height <= 500)) {
            throw new IllegalArgumentException("Ожидалось значение 0 < x <= 500");
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.height;
    }
}