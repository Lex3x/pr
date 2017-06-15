package servlet.books;

import model.Book;
import service.RoleService;
import service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Book on 3/21/2017.
 */
@WebServlet("/books/add")
public class BookAddServlet extends HttpServlet {

    private BookService bookService;
    private RoleService roleService;

    public BookAddServlet() {
        super();
        bookService = new BookService();
        roleService = new RoleService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String bookName = request.getParameter("bookName");
        String bookAuthor = request.getParameter("bookAuthor");
        String year = request.getParameter("year");

        Book book = new Book();
        book.setIdBook(bookService.getMaxId() + 1);
        book.setBookName(bookName);
        book.setBookAuthor(bookAuthor);
        book.setBookYear(year);

        bookService.addBook(book);

        List<Book> bookList = bookService.getAllBooks();
        request.setAttribute("bookList", bookList);
        response.sendRedirect("/bookList");
    }
}