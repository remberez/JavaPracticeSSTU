package first_chapter.SixthPoint.FifthTask;

public class Gun {
    private int cartridge;
    private final int maxCartridge;

    Gun(int maxCartridge) {
        this.maxCartridge = maxCartridge;
    }

    public void reload(int cartridge) {
        if (cartridge <= 0) throw new IllegalArgumentException("Ожидалось значение > 0");
        this.cartridge = cartridge;
    }

    public int getCartridge() {
        return cartridge;
    }

    public int getMaxCartridge() {
        return maxCartridge;
    }

    public void discharge() {
        cartridge = 0;
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
