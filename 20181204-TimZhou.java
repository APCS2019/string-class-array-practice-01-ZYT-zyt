//pastPaper-2015
//key idea: String, Class.
public class HiddenWord{
    private String word;
    public HiddenWord(String word){
        this.word = word;
    }
    public String getHint(String guess){
        String hint = "";
        for(int i = 0; i < word.length(); i++){
            if(word.subString(i).equals(guess.subString(i)){
                hint += word.subString(i);
            }
            else if(word.indexOf(guess.subString(i)) != -1){
                hint += "+";
            }
            else
                hint += "*";
        }
        return hint;
    }
}
    
