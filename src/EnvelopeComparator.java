public class EnvelopeComparator {

    static void compereEnvelopes(Envelope envelope1, Envelope envelope2){
        if (isFit(envelope1, envelope2)){
            System.out.println("Envelope1 fits in Envelope2");
        }else {
            System.out.println("Envelope1 doesn't fit in Envelope2");
        }
    }

    private static boolean isFit(Envelope envelope1, Envelope envelope2){
        if ((envelope1.getLength() < envelope2.getLength()) && envelope1.getWidth() < envelope2.getWidth()
                || ((envelope1.getLength() < envelope2.getWidth()) && (envelope1.getWidth() < envelope2.getLength()))){
            return true;
        }
        return false;
    }
}
