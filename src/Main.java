import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //In Movies, I used .shuffle to randomize the list order and then selected the movie at index 0 to recommend.
        //Here I will instead use a random number generator to help randomly select a movie to recommend.
        ArrayList<String> movies = new ArrayList<>();

        Scanner key = new Scanner(System.in);
        String another = "";
        while(!another.equalsIgnoreCase("q")){
            System.out.println("Please enter the title of one of your favorite movies: ");
            String newMovie = key.nextLine();
            movies.add(newMovie);
            System.out.println("Do you want enter another color or quit? (a/q)" );
            another = key.nextLine();
        }

        System.out.println("The movies you entered are: " + movies + "\n");

        Collections.sort(movies);
        System.out.println("Here is your list of movies sorted alphabetically:" + movies + "\n");

        //Here is the alternative way to randomly select a movie.
        Random r = new Random();
        int random;
        random = 1 + r.nextInt(movies.size());
        System.out.println("Tonight would be a great time to watch " + movies.get(random) + "!");
    }
}