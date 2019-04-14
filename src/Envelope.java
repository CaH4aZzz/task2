public class Envelope {
    private double length;
    private double width;

    public Envelope(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Envelope{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
