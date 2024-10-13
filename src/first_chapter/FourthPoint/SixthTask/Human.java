package first_chapter.FourthPoint.SixthTask;
import java.util.Objects;

class Human {
    Name name;
    int height;
    Human father;

    Human(String lastName, String firstName, String patronymic, int height, Human father) {
        this.name = new Name(lastName, firstName, patronymic);
        this.height = height;
        setFatherParameters(father, lastName, patronymic);
    }

    Human(String firstName, int height) {
        this(null, firstName, null, height, null);
    }

    Human(String firstName, int height, Human father) {
        this(null, firstName, null, height, father);
    }

    Human(Name name, int height) {
        this(name.lastName, name.firstName, name.patronymic, height, null);
    }

    Human(Name name, int height, Human father) {
        this(name.lastName, name.firstName, name.patronymic, height, father);
    }

    private void setFatherParameters(Human father, String lastName, String patronymic) {
        if (!Objects.isNull(father)) {
            this.father = father;

            if (Objects.isNull(lastName) && !Objects.isNull(father.name.lastName)) {
                name.lastName = father.name.lastName;
            }

            if (Objects.isNull(patronymic) && !Objects.isNull(father.name.firstName)) {
                name.patronymic = father.name.firstName + "ович";
            }
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.height;
    }
}
