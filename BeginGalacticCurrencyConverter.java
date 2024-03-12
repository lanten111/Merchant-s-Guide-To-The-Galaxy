import java.util.List;

public class BeginGalacticCurrencyConverter {


    public static void main(String[] args) {

        final String sentenceInputFileName = "input.txt";

        NotesProcessor notesProcessor = new NotesProcessor();

        List<String> notes =  notesProcessor.getSentencesFromNotes(sentenceInputFileName);
        BeginGalacticCurrencyConverter  converter = new BeginGalacticCurrencyConverter();

        notes.forEach(line -> {
            if (line.startsWith("how many") || line.startsWith("how much")){
                converter.hanndleQuery(line);
            } else if (line.contains("is") && line.endsWith("Credits")){
                converter.hanndlePrices(line);
            }else {
                converter.hanndleConverseion(line);
            }
        });

    }

    public void hanndleConverseion(String line){
//        if (line.startsWith(""))
    }

    public void hanndleQuery(String line){
//        if (line.startsWith(""))
    }

    public void hanndlePrices(String line){
//        if (line.startsWith(""))
    }
}
