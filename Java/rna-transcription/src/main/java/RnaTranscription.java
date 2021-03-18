import java.util.HashMap;
import java.util.stream.Stream;

class RnaTranscription {
    private final HashMap<String, String> dnaToRnaMap;

    public RnaTranscription() {
        this.dnaToRnaMap = new HashMap<String, String>();
        this.dnaToRnaMap.put("G", "C");
        this.dnaToRnaMap.put("C", "G");
        this.dnaToRnaMap.put("T", "A");
        this.dnaToRnaMap.put("A", "U");
    }


    public String transcribe(String dnaStrand) {
        if (dnaStrand.length() == 0) {
            return "";
        }

        StringBuilder transcription = new StringBuilder();
        Stream.of(dnaStrand.split("")).map(n -> dnaToRnaMap.get(n)).forEach(transcription::append);

        return transcription.toString();
    }

}
