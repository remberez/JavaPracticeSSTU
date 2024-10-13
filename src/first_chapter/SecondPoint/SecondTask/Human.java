package first_chapter.SecondPoint.SecondTask;

class Human {
    Name name;
    int height;

    Human(String lastName, String firstName, String patronymic, int age) {
        this.name = new Name(lastName, firstName, patronymic);
        this.height = age;
    }

    @Override
    public String toString() {
        return "Рост - " + this.height + "\nИмя - " + this.name;
    }
}
