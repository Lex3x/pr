package service;

import dao.RoleDao;
import model.Role;

import java.util.List;

/**
 * Created by Tatsiana on 11.06.17.
 */
public class RoleService {

    private RoleDao roleDao;

    public RoleService() {
        super();
        roleDao = new RoleDao();
    }

    public void addRole(Role role) {
        roleDao.addRole(role);
    }

    public void deleteRole(int roleId) {
        roleDao.deleteRole(roleId);
    }

    public void updateRole(Role role) {
        roleDao.updateRole(role);
    }

    public List<Role> getAllRoles() {
        return roleDao.getAllRoles();
    }

    public Role getRoleById(int roleId) {
        return roleDao.getRoleById(roleId);
    }

    public int getMaxId() {
        List<Role> roleList = roleDao.getAllRoles();
        int max = 0;
        for (Role role : roleList) {
            if (max < role.getIdRole()) {
                max = role.getIdRole();
            }
        }
        return max;
    }

}
