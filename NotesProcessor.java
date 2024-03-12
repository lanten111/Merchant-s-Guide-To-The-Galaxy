import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NotesProcessor {

    public List<String> getSentencesFromNotes(String notes){
        List<String> sentences = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(notes));
            String line;
            while((line = br.readLine()) != null){
                sentences.add(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return sentences;

    }
}
