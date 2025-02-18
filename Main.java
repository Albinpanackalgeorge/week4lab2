public class Main {
    public static void main(String[] args) {
        try {
            Movie movie1 = new Movie("Inception", "Christopher Nolan", 2010, 8.8);
            System.out.println(movie1);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
