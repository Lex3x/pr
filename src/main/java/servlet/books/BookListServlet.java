package servlet.books;

import model.Book;
import service.BookService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Book on 3/15/2017.
 */
@WebServlet("/bookList")
public class BookListServlet extends HttpServlet {

    private BookService bookService;

    public BookListServlet() {
        super();
        bookService = new BookService();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Book> bookList = bookService.getAllBooks();
        request.setAttribute("bookList", bookList);

        RequestDispatcher view = request.getRequestDispatcher("bookList.jsp");
        view.forward(request, response);
    }

}