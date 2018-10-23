/**
 * Class for book.
 */
class Book implements Comparable<Book> {

    /**
     * name of the book.
     */
    private String name;

    /**
     * author of the book.
     */
    private String author;

    /**
     * price of the book.
     */
    private double price;

    /**
     * Constructs the object.
     * @param      n   is  name.
     * @param      a   is  author.
     * @param      p   is  price.
     */
    Book(final String n, final String a,
         final String p) {
        name = n;
        author = a;
        price = Double.parseDouble(p);
    }

    /**
     * Gets the name.
     * @return     The name.
     * The time complexity is O(1).
     */
    String getName() {
        return name;
    }

    /**
     * compareTo method.
     * @param      b     b of type Book.
     * @return     integer.
     * The time complexity is O(1).
     */
    public int compareTo(final Book b) {
        return getName().compareTo(b.getName());
    }

    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return this.name + ", " + this.author + ", " + this.price;
    }

}
