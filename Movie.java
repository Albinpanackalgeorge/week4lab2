public class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private double rating;

    // Constructor that calls set methods for validation
    public Movie(String title, String director, int releaseYear, double rating) {
        setTitle(title);
        setDirector(director);
        setReleaseYear(releaseYear);
        setRating(rating);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty or null.");
        }
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        if (director == null || director.trim().isEmpty()) {
            throw new IllegalArgumentException("Director cannot be empty or null.");
        }
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        int currentYear = java.time.Year.now().getValue();
        if (releaseYear < 1888 || releaseYear > currentYear) {
            throw new IllegalArgumentException("Release year must be between 1888 and " + currentYear);
        }
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating < 0.0 || rating > 10.0) {
            throw new IllegalArgumentException("Rating must be between 0.0 and 10.0");
        }
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                '}';
    }
}
