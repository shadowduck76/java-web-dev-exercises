package Exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String rawString = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        String firstSentence = rawString.toLowerCase();
        System.out.println("Enter a string to search for: ");
        String searchTerm = input.nextLine().toLowerCase();

        Boolean result = firstSentence.contains(searchTerm);
        System.out.println("The first sentence contains your search term: "+ result);

        Integer index = firstSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index: " + index + ". Your term is "+ length + " characters long.");
        String modifiedSentence = firstSentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);
    }
}
