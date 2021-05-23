import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    public static int CODON_LENGTH = 3;

    public enum Codons {
        AUG("Methionine"),
        UUU("Phenylalanine"),
        UUC("Phenylalanine"),
        UUA("Leucine"),
        UUG("Leucine"),
        UCU("Serine"),
        UCC("Serine"),
        UCA("Serine"),
        UCG("Serine"),
        UAU("Tyrosine"),
        UAC("Tyrosine"),
        UGU("Cysteine"),
        UGC("Cysteine"),
        UGG("Tryptophan"),
        UAA("STOP"),
        UAG("STOP"),
        UGA("STOP");

        private String value;

        Codons(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


    List<String> translate(String rnaSequence) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < rnaSequence.length(); i += CODON_LENGTH) {
            String rnaSubstr = rnaSequence.substring(i, i + CODON_LENGTH);
            Codons currentCodon = Codons.valueOf(rnaSubstr);

            if (currentCodon.getValue().equals("STOP")) {
                break;
            }
            result.add(currentCodon.getValue());
        }

        return result;
    }
}
