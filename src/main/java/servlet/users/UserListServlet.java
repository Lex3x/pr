package servlet.users;

import model.User;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by User on 3/15/2017.
 */
@WebServlet("/userList")
public class UserListServlet extends HttpServlet {

    private UserService userService;

    public UserListServlet() {
        super();
        userService = new UserService();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<User> userList = userService.getAllUsers();
        request.setAttribute("userList", userList);

        RequestDispatcher view = request.getRequestDispatcher("userList.jsp");
        view.forward(request, response);
    }

}
