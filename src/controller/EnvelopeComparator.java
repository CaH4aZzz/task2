package controller;

import model.MyEnvelope;

public class EnvelopeComparator {

    boolean isFit(MyEnvelope envelope1, MyEnvelope envelope2) {
        double lengthEnv1 = envelope1.getLength();
        double widthEnv1 = envelope1.getWidth();
        double lengthEnv2 = envelope2.getLength();
        double widthEnv2 = envelope2.getWidth();

        return lengthEnv1 < lengthEnv2 && widthEnv1 < widthEnv2
                || widthEnv1 < lengthEnv2 && lengthEnv1 < widthEnv2;
    }
}