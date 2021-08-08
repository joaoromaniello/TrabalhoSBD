package com.company.data;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public List<Book> books = new ArrayList<>();
    public List<Magazine> magazines = new ArrayList<>() ;

    @Override
    public String toString() {
        StringBuilder returnedBooks = new StringBuilder();
        StringBuilder returnedMagazines = new StringBuilder();
        for (Book book : books) {
            returnedBooks.append(book.toString());
        }
        for (Magazine magazine : magazines) {
            returnedMagazines.append(magazine.toString());
        }

        return returnedBooks.toString() + returnedMagazines ;

    }
}
