public class BeginGalacticCurrencyConverter {


    public static void main(String[] args) {

        final String sentenceInputFileName = "input.txt";

        SentenceProcessor sentenceProcessor = new SentenceProcessor();

        sentenceProcessor.getSetanceFromNotes(sentenceInputFileName);
    }
}
