package first_chapter.FifthPoint.FirstTask;

public class Gun {
    int cartridge;
    Gun() {
        cartridge = 5;
    }

    Gun(int cartridge) {
        this.cartridge = cartridge;
    }

    public boolean shot() {
        if (cartridge-- > 0) {
            System.out.println("Бах!");
            return true;
        }
        System.out.println("Клац!");
        return false;
    }
}
