package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Tatsiana on 11.06.17.
 */
@Entity
@Table(name = "BOOK")
public class Book implements Serializable {

    @Id
    @Column(name = "ID_BOOK")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBook;
    @NotNull
    @Column(name = "NAME", length = 24, nullable = false)
    private String bookName;
    @NotNull
    @Column(name = "AUTHOR", length = 24, nullable = false)
    private String bookAuthor;
    @NotNull
    @Column(name = "YEAR", length = 24, nullable = false)
    private String bookYear;

    public Book() {
    }


    public Book(int idBook,String bookName, String bookAuthor, String bookYear) {
        this.idBook=idBook;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int IdBook) {
        this.idBook = IdBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookYear() {
        return bookYear;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (idBook != book.idBook) return false;
        if (bookName != null ? !bookName.equals(book.bookName) : book.bookName != null) return false;
        if (bookAuthor != null ? !bookAuthor.equals(book.bookAuthor) : book.bookAuthor != null) return false;
        return bookYear != null ? bookYear.equals(book.bookYear) : book.bookYear == null;
    }

    @Override
    public int hashCode() {
        int result = idBook;
        result = 31 * result + (bookName != null ? bookName.hashCode() : 0);
        result = 31 * result + (bookAuthor != null ? bookAuthor.hashCode() : 0);
        result = 31 * result + (bookYear != null ? bookYear.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookYear='" + bookYear + '\'' +
                '}';
    }
}