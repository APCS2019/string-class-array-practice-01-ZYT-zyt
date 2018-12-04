//pastPaper-2015
//key idea: String, Class.
public class HiddenWord{
    private String word;
    public HiddenWord(String word){
        this.word = word;
    }
    public String getHint(String guess){
        String hint = "";
        String str;
        for(int i = 0; i < word.length(); i++){
            str = guess.subString(i,i+1);
            if(word.subString(i,i+1).equals(str){
                hint += word.subString(i+1);
            }
            else if(word.indexOf(str) != -1){
                hint += "+";
            }
            else
                hint += "*";
        }
        return hint;
    }
}
    
