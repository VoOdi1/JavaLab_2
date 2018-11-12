package myPackege;

public class make {


    protected String randomCharacter(String characters)
    {
        int n =characters.length();
        int r = (int)(n*Math.random());
        return characters.substring(r,r+1);
    }
    protected String insertAtRandom(String str, String toInsert )
    {
        int n = str.length();
        int r = (int) ((n+1)*Math.random());
        return str.substring(0,r)+ toInsert + str.substring(r);
    }

}
