package service;

import dao.BookDao;
import model.Book;

import java.util.List;

/**
 * Created by Tatsiana on 11.06.17.
 */
public class BookService {

    private BookDao bookDao;

    public BookService() {
        super();
        bookDao = new BookDao();
    }

    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    public void deleteBook(int bookId) {
        bookDao.deleteBook(bookId);
    }

    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    public Book getBookById(int bookId) {
        return bookDao.getBookById(bookId);
    }

    public int getMaxId() {
        List<Book> bookList = bookDao.getAllBooks();
        int max = 0;
        for (Book book : bookList) {
            if (max < book.getIdBook()) {
                max = book.getIdBook();
            }
        }
        return max;
    }

}