package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {


    /*public UserServiceImpl() {
        this.userDao = new UserDaoJDBCImpl() {
            @Override
            public void dropUsersTable() {
                UserServiceImpl.this.dropUsersTable();
            }

            @Override
            public void removeUserById(long id) {
                UserServiceImpl.this.removeUserById(id);
            }

            @Override
            public void saveUser(String name, String lastName, byte age) {
                UserServiceImpl.this.saveUser(name,lastName,age);
            }

            @Override
            public void createUsersTable() {
                UserServiceImpl.this.createUsersTable();
            }

            @Override
            public void cleanUsersTable() {
                UserServiceImpl.this.cleanUsersTable();
            }

            @Override
            public List<User> getAllUsers() {
                return UserServiceImpl.this.getAllUsers();
            }
        };
    }

     */
    UserDao userDao = new UserDaoJDBCImpl();

    public void createUsersTable() {
        userDao.createUsersTable();
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name,lastName,age);
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}
