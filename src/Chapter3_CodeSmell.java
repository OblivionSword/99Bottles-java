public class Chapter3_CodeSmell {

    public String verses(int number)
    {

         switch (number) {
            case 0:
                return  "No more bottles of milk on the wall, " + 
                        "no more bottles of milk.\n" + 
                        "Go to the store and buy some more, " + 
                        "99 bottles of milk on the wall.\n";

            case 1:
                return  "1 bottle of milk on the wall, " +
                        "1 bottle of milk.\n" +
                        "Take it down and pass it around, " +
                        "no more bottles of milk on the wall.\n";
            
            default:
                return  number + " bottles of milk on the wall, " +
                        number + " bottles of milk.\n" +
                        "Take one down and pass it around, " +
                        (number - 1) + this.container(number - 1) 
                        + " of milk on the wall.\n";
         }
    }

    public String container(int number)
    {
        if (number == 1) {
            return "bottle";
        } else {
            return "bottles";
        }
    }

    

}
