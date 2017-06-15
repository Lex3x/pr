package service;

import dao.RoleDao;
import dao.UserDao;
import model.Role;
import model.User;

import java.util.List;

/**
 * Created by Tatsiana on 11.06.17.
 */
public class UserService {

    private UserDao userDao;

    public UserService() {
        super();
        userDao = new UserDao();
    }

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void deleteUser(int userId) {
        userDao.deleteUser(userId);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public User getUserById(int userId) {
        return userDao.getUserById(userId);
    }

    public int getMaxId() {
        List<User> userList = userDao.getAllUsers();
        int max = 0;
        for (User user : userList) {
            if (max < user.getIdUser()) {
                max = user.getIdUser();
            }
        }
        return max;
    }

}
