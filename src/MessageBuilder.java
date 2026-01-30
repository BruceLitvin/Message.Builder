public class MessageBuilder{
private String message;
private int numWords;

public MessageBuilder(String startingWord)
{
    message= startingWord;
    for (int i = 0; i < message.length() ; i++) {
        if(message.substring(i,i+1).equals("")){
            numWords++;
        }
    }

}
public int num(){
    return numWords;
}
//public String getNextWord(String s)
//{ return null;}

//public String getAbbreviation()
//{  }

}
