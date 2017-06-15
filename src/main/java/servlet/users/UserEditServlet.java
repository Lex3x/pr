package servlet.users;

import model.User;
import service.RoleService;
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
 * Created by User on 3/21/2017.
 */
@WebServlet("/users/edit")
public class UserEditServlet extends HttpServlet {

    private UserService userService;
    private RoleService roleService;

    public UserEditServlet() {
        super();
        userService = new UserService();
        roleService = new RoleService();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.valueOf(request.getParameter("id"));
        User user = userService.getUserById(id);
        request.setAttribute("user", user);
        RequestDispatcher view = request.getRequestDispatcher("/editUser.jsp");
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String roleStr = request.getParameter("role");
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        int id = Integer.valueOf(request.getParameter("id"));
        int role = Integer.valueOf(roleStr);


        User user = userService.getUserById(id);
        user.setRole(roleService.getRoleById(role));
        user.setLogin(login);
        user.setPassword(password);

        userService.updateUser(user);

        List<User> userList = userService.getAllUsers();
        request.setAttribute("userList", userList);
        response.sendRedirect("/userList");
    }
}
