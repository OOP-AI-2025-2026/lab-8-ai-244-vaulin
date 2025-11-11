package ua.opnu;

class BookData implements Comparable<BookData> {

    private String title;
    private String author;
    private int reviews;
    private double total;

    public BookData(String title, String author, int reviews, double total) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
        this.total = total;
    }

    public double getRating() {
        return reviews == 0 ? 0.0 : total / reviews;
    }

    @Override
    public int compareTo(BookData other) {
        int cmp = Double.compare(other.getRating(), this.getRating());
        if (cmp == 0) {
            return this.title.compareTo(other.title);
        }
        return cmp;
    }

    @Override
    public String toString() {
        return title + " (" + getRating() + ")";
    }
}
