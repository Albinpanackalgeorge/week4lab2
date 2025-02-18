public class Main {
    public static void main(String[] args) {
        try {
            Movie movie1 = new Movie("Inception", "Christopher Nolan", 2010, 8.8);
            System.out.println(movie1);

            // Uncomment to test validation errors
            // Movie movie2 = new Movie("", "Nolan", 2025, 9.0); // Invalid title
            // Movie movie3 = new Movie("Interstellar", "Nolan", 1800, 9.0); // Invalid year
            // Movie movie4 = new Movie("Tenet", "Nolan", 2020, 11.0); // Invalid rating

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
