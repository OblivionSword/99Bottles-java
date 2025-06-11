import java.util.ArrayList;

public class Bottles {

    public String verse(int bottle)
    {
        String song ="";

        song = bottle + " bottles of beer on the wall, "+ bottle +" bottles of beer.\n" +
            "Take one down and pass it around, "+ (bottle - 1) +" bottles of beer on the wall.\n";

        if (bottle == 2)
        {
            song = bottle + " bottles of beer on the wall, "+ bottle +" bottles of beer.\n" +
            "Take one down and pass it around, "+ (bottle - 1) +" bottle of beer on the wall.\n";
        }

        if (bottle == 1) 
        {
            song = bottle + " bottle of beer on the wall, "+ bottle +" bottle of beer.\n" +
            "Take it down and pass it around, no more bottles of beer on the wall.\n";
        }

        if (bottle == 0) {
            song = "No more bottles of beer on the wall, no more bottles of beer.\n"  +
            "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
        }

        return song;
    }

    public String verses(int start,int end)
    {
        String song ="test";

        ArrayList<String> songs = new ArrayList<String>();

        int bottles = start;

        int currentBottles = 0;

        for(int i = start; i > end - 1; i--)
        {
            currentBottles = bottles;

            if (i == 2) {
                song = currentBottles + " bottles of beer on the wall, " + currentBottles +" bottles of beer.\n" +
                "Take one down and pass it around, "+ (currentBottles - 1) +" bottle of beer on the wall.\n" + 
                "\n";
            }
            else if (i == 1) {
                song = currentBottles + " bottle of beer on the wall, "+ currentBottles +" bottle of beer.\n" +
                "Take it down and pass it around, no more bottles of beer on the wall.\n" +
                "\n";
            }
            else if (i == 0) {
                song = "No more bottles of beer on the wall, no more bottles of beer.\n"  +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n" +
                "\n";
            }
            else{
                song = currentBottles + " bottles of beer on the wall, " + currentBottles + " bottles of beer.\n" +
                "Take one down and pass it around, " + (currentBottles - 1) + " bottles of beer on the wall.\n" + 
                "\n";
            }
            
            songs.add(song);

            bottles--;
        }

        String songText = String.join("", songs);

        return songText;
    }

    public String wholeSong()
    {
        return verses(99, 0);
    }

}
