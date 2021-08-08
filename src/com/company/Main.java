package com.company;


import com.company.data.DataBase;
import com.company.views.BookView;


public class Main {
    public static void main(String[] args) {
        DataBase newDataBase = new DataBase();
        new BookView(newDataBase);
    }
}
