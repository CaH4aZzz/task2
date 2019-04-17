package model;

public class MyEnvelope {
    private double length;
    private double width;

    public MyEnvelope(double length, double width) {
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
        return "model.MyEnvelope{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
