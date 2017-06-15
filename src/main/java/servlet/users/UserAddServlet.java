package servlet.users;

import model.User;
import service.RoleService;
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
@WebServlet("/users/add")
public class UserAddServlet extends HttpServlet {

    private UserService userService;
    private RoleService roleService;

    public UserAddServlet() {
        super();
        userService = new UserService();
        roleService = new RoleService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String roleStr = request.getParameter("role");
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        int role = Integer.valueOf(roleStr);

        User user = new User();
        user.setIdUser(userService.getMaxId() + 1);
        user.setRole(roleService.getRoleById(role));
        user.setLogin(login);
        user.setPassword(password);

        userService.addUser(user);

        List<User> userList = userService.getAllUsers();
        request.setAttribute("userList", userList);
        response.sendRedirect("/userList");
    }
}
