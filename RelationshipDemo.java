import java.util.*;

class Driver {
    String name;
    Driver(String name) { this.name = name; }
}

class Book {
    String title;
    Book(String title) { this.title = title; }
}

class Library {
    List<Book> books;
    Library(List<Book> books) { this.books = books; }
}

class Room {
    String type;
    Room(String type) { this.type = type; }
}

class House {
    private final Room room;
    House() {
        this.room = new Room("Living Room");
    }
}

public class RelationshipDemo {
    public static void main(String[] args) {
        Driver d = new Driver("YoYo");
        
        Book b = new Book("Java Basics");
        List<Book> list = new ArrayList<>();
        list.add(b);
        Library lib = new Library(list);
        
        House h = new House();
    }
}