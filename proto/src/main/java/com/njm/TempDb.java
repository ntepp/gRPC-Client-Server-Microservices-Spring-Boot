package com.njm;

import java.util.ArrayList;
import java.util.List;

public class TempDb {
    public static List<Author> getAuthorsFromTempDb() {
        Author author1 = Author.newBuilder().setAuthorId(1).setBookId(1).build();
        Author author2 = Author.newBuilder().setAuthorId(2).setFirstName("Mola").build();
        Author author3 = Author.newBuilder().setAuthorId(3).setFirstName("JK").build();
        List authors = new ArrayList();
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
        return authors;
    }

    public static List<Book> getBooksFromTempDb() {
        Book book = Book.newBuilder().setAuthorId(1).setBookId(1).setTitle("CONFRONT").build();
        Book book1 = Book.newBuilder().setAuthorId(2).setTitle("La lumiere").build();
        Book book2 = Book.newBuilder().setAuthorId(3).setTitle("La Science").build();
        List books = new ArrayList();
        books.add(book);
        books.add(book1);
        books.add(book2);
        return books;
    }
}
