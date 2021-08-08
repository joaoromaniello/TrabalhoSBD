package com.company.databaseAPI;

import java.sql.Connection;
import java.sql.Statement;

public class DBConfiguration {
    public static void main(String[] args)  {
        new DBConfiguration().launch();
    }

    public void launch(){

        String driver = "org.apache.derby.jdbc.EmbeddedDriver";
        DBMateriaisConnection dbConnection = new DBMateriaisConnection(driver);

        Connection conn;
        Statement stmt;

        String dropLivroString = "DROP TRABLE Livro";
        String createlivroString = "CREATE TABLE Livro"
                + "(titulo VARCHAR(30) NOT NULL,"
                + "autor VARCHAR(30) NOT NULL,"
                + "ano int NOT NULL)";

        String dropRevistaString = "DROP TRABLE Revista";
        String createRevistaString = "CREATE TABLE Revista"
                + "(titulo VARCHAR(30) NOT NULL,"
                + "org VARCHAR(30) NOT NULL,"
                + "ano int NOT NULL,"
                + "numero int NOT NULL)";

        conn = dbConnection.getMateriaLConnection();
        if(conn == null)
            return;

        try{
            stmt = conn.createStatement();
            System.out.println("... dropping table Livro");
            stmt.execute(dropLivroString);
            System.out.println("... table Livro dropped\n");

            System.out.println("... dropping table Revista");
            stmt.execute(dropRevistaString);
            System.out.println("... table Revista dropped\n");

            System.out.println("... creating table Livro");
            stmt.execute(createlivroString);
            System.out.println("... table Livro created");

            System.out.println("... creating table Revista");
            stmt.execute(createRevistaString);
            System.out.println("... table Revista created");

            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
