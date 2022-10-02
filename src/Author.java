import java.util.Objects;

public class Author {
    private final String author;

    public Author(String authorName) {
        this.author = authorName;
    }

    public String getAuthor() {
        return this.author;
    }
    public String toString() {
        return this.author;
    }
    @Override
    public boolean equals(Object obj) {
    if (obj == null) {
        return false;
    }
    if (this == obj) {
        return true;
    }
    if (!(obj instanceof Author)) {
        return false;
    }
    Author author1 = (Author) obj;
        return this.author.equals(author1.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(author);
    }
}
