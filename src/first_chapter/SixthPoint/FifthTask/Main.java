package first_chapter.SixthPoint.FifthTask;

public class Main {
    public static void main(String[] args) {
        var gun = new Gun(7);
        gun.reload(3);
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.reload(8);
        gun.shot();
        gun.shot();
        gun.discharge();
        gun.shot();
    }
}
