
public class HiddenWord {
    private String word;
    
    public HiddenWord(String hiddenWord) {
        word = hiddenWord;
    }
    
    public String getHint(String guess) {
        String str = "";
        int letterFound = 0;
        int matchesIdx = 0;
        if (guess.equals(word)) {
            return word;
        } else {
            for (int guessIdx = 0; guessIdx < guess.length(); guessIdx++) {
                for (int hiddenIdx = 0; hiddenIdx < word.length(); hiddenIdx++) {
                    if (guess.charAt(guessIdx) == word.charAt(hiddenIdx) && guessIdx == hiddenIdx) {
                        if (guessIdx + 1 == guess.length()) {
                            str += guess.substring(guessIdx);
                            letterFound++;
                            matchesIdx++;
                        } else {
                            str += guess.substring(guessIdx,guessIdx + 1);
                            letterFound++;
                            matchesIdx++;
                        }
                    }
    
                if (guess.charAt(guessIdx) == word.charAt(hiddenIdx) && guessIdx != hiddenIdx) {
                     letterFound++;
                     matchesIdx = 0;
                    }
            }
                    if (letterFound == 0) {
                        str += "*";
                    }
                    if (letterFound > 0 && matchesIdx == 0) {
                        str += "+";
                        letterFound = 0;
                    } 
                    matchesIdx = 0;
                    letterFound = 0;
                }
    
            }
                return str;
            }
        }