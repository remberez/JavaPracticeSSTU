package first_chapter.FifthPoint.SecondTask;

public class Cat {
    String name;

    Cat(String name) {
        this.name = name;
    }

    public void sayMeow() {
        System.out.println(this.name + ": мяу!");
    }

    public void sayMeow(int meowNumber) {
        if (meowNumber > 1) {
            String meowFraze = this.name + ": мяу" + "-мяу".repeat(meowNumber - 1) +  "!";
            System.out.println(meowFraze);
        }
    }
}
