package mapper;

import bean.User;

import java.util.List;

public interface userMapper {
    List<User> getUser();

    User getUserById(int id);

    void deleteUserById(int id);
}
