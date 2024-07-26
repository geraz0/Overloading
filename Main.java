import java.util.ArrayList;

class Animal {
    private String name;
    private boolean isDog;

    // Overloaded Constructors
    Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    Animal(String name) {
        this(name, false); // Assume it's not a dog if not specified
    }

    @Override
    public String toString() {
        return name + " is a dog = " + isDog;
    }
}

class TvShow {
    private String title;
    private int episodes;
    private String genre;

    // Overloaded Constructors
    TvShow(String title, int episodes, String genre) {
        this.title = title;
        this.episodes = episodes;
        this.genre = genre;
    }

    TvShow(String title) {
        this(title, 10, "Drama"); // Default genre and episode count
    }

    @Override
    public String toString() {
        return title + ", " + episodes + " episodes, " + genre;
    }
}

class Book {
    private String title;
    private int pages;
    private int publicationYear;

    // Overloaded Constructors
    Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    Book(String title) {
        this(title, 0, 0); // Default pages and year when unknown
    }

    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + publicationYear;
    }
}

class Counter {
    private int value;

    // Overloaded Constructors
    Counter(int startValue) {
        value = startValue;
    }

    Counter() {
        this(0); // Default start value is 0
    }

    // Getter for the counter value
    int value() {
        return value;
    }

    // Increase by 1
    void increase() {
        increase(1);
    }

    // Overloaded increase method
    void increase(int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        }
    }

    // Decrease by 1
    void decrease() {
        decrease(1);
    }

    // Overloaded decrease method
    void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Using overloaded constructors
        Animal dog = new Animal("Buddy", true);
        TvShow show = new TvShow("Mandalorian", 8, "Sci-Fi");
        Book book = new Book("1984", 328, 1949);

        // Counter examples
        Counter counter = new Counter();
        counter.increase();
        counter.increase(3);
        counter.decrease(2);

        // Output
        System.out.println(dog);
        System.out.println(show);
        System.out.println(book);
        System.out.println("Counter value: " + counter.value());
    }
}
