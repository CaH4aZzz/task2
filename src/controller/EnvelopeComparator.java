package controller;

import model.MyEnvelope;

public class EnvelopeComparator {

    static boolean compareEnvelopes(MyEnvelope envelope1, MyEnvelope envelope2) {
        if ((envelope1.getLength() < envelope2.getLength()) && envelope1.getWidth() < envelope2.getWidth()
                || ((envelope1.getLength() < envelope2.getWidth()) && (envelope1.getWidth() < envelope2.getLength()))) {
            return true;
        }
        return false;
    }
}
