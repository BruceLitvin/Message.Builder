public class MessageBuilder{
private String message;
private int numWords;

public MessageBuilder(String startingWord)
{
    numWords=1;
    message= startingWord;
    String next= getNextWord(startingWord);
    while (next!= null){
        message += " "+next;
        numWords++;
        next=getNextWord(next);
    }

}

public String getNextWord(String s)
{
    return null;
}

public String getAbbreviation()
{
    String abbr = "";
    int index=0;
    while (index < message.length()){
        abbr+= message.substring(index,index+1);
        int space= message.indexOf(" ", index);
        if(space==-1)
        {
            index=message.length();
        }
        else {
            index=space+1;
        }
    }

    return abbr;
}

}
