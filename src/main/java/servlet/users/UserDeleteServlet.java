package servlet.users;

import model.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by User on 3/21/2017.
 */
@WebServlet("/users/delete")
public class UserDeleteServlet extends HttpServlet {

    private UserService userService;

    public UserDeleteServlet() {
        super();
        userService = new UserService();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.valueOf(request.getParameter("id"));
        userService.deleteUser(id);

        List<User> userList = userService.getAllUsers();
        request.setAttribute("userList", userList);
        response.sendRedirect("/userList");
    }

}
