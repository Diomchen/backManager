package mapper;

import bean.User;

import java.util.List;

public interface userMapper {
    public List<User> getUser();

    public User getUserById(int id);

    public void deleteUserById(int id);
}
