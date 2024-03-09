import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SentenceProcessor {

    public List<String> getSetanceFromNotes(String notes){
        List<String> setences = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(notes));
            String line;
            while((line = br.readLine()) != null){
                setences.add(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        setences.forEach(s -> {
            System.out.println(s);
        });
        return setences;

    }
}
