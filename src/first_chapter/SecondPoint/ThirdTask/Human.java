package first_chapter.SecondPoint.ThirdTask;

import java.util.Objects;

class Human {
    Name name;
    int height;
    Human father;

    Human(String lastName, String firstName, String patronymic, int height, Human father) {
        this.name = new Name(lastName, firstName, patronymic);
        this.height = height;

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
        return "Рост - " + this.height + "\nИмя - " + this.name;
    }
}
