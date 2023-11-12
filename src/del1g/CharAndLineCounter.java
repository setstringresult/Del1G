package del1g;

public class CharAndLineCounter {
    private int lineCounter = 0;
    private int charCounter = 0;
    public void count(String userString) {
        lineCounter++;
        charCounter += userString.length();


    }
    public int getLineCounter() {
        return lineCounter;
    }
    public int getCharCounter() {
        return charCounter;
    }

}
