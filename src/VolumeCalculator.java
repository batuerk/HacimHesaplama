public class VolumeCalculator {
    int kenar1;
    int kenar2;
    int yukseklik;

    public VolumeCalculator(int kenar1, int kenar2, int yukseklik) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.yukseklik = yukseklik;
        System.out.println((kenar1*kenar2)*yukseklik);
    }
}
