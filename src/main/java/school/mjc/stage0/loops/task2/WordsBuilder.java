package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String res="";
        int counter=0;
        while(counter<chars.length){
            res+=chars[counter];
            counter++;
        }
        System.out.print(res);
    }
}
