import java.util.HashMap;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        HashMap<Character, String> sequenceMap = new HashMap<>();
        sequenceMap.put('G', "C");
        sequenceMap.put('C', "G");
        sequenceMap.put('T', "A");
        sequenceMap.put('A', "U");

        String rnaStrand = "";
        char[] dnaStrandChars = dnaStrand.toCharArray();
        for (int i = 0; i < dnaStrandChars.length; i++) {
            rnaStrand += sequenceMap.get(dnaStrandChars[i]);
        }
        return rnaStrand;
    }

}
