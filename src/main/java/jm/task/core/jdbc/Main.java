package jm.task.core.jdbc;


import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 35);
        userService.saveUser("Antov", "Kulibin", (byte) 25);
        userService.saveUser("Stas", "Mihailjlob", (byte) 55);
        userService.saveUser("Andrey", "Zadrotov", (byte) 27);
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }
       userService.cleanUsersTable();
       userService.dropUsersTable();

        // реализуйте алгоритм здесь
    }
}
