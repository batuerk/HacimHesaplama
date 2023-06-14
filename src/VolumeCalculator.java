public class VolumeCalculator {
    int side1;
    int side2;
    int height;

    public VolumeCalculator(int side1, int side2, int height) {
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;

    }
    public void Print() {
        System.out.println((side1*side2)*height);
    }

}
