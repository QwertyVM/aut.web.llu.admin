package Object;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserList {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void addAllUsers(Collection<User> users) {
        this.users.addAll(users);
    }

}
