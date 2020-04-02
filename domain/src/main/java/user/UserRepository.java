package user;

import org.springframework.stereotype.Repository;
import user.exception.EmailAlreadyRegisteredException;
import user.feature.UserBuilder;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;


@Repository
public class UserRepository {
    private final ConcurrentHashMap<String, User> userRepository;

    public UserRepository() {
        this.userRepository = new ConcurrentHashMap<>();
    }

    public boolean isEmailAvailable(String email) {
        if (userRepository.values().stream()
                .anyMatch(member -> member.getEmail().equals(email))) {
            throw new EmailAlreadyRegisteredException(email);
        }
        return true;
    }

    public User registerNewUser(User newUser) {
        userRepository.put(newUser.getId(), newUser);
        return newUser;
    }

    private void createDefaultData(){
        User user1 = UserBuilder.userBuilder()
                .withEmail("admin@digibooky.com")
                .withLastName("Admin")
                .withPassWord("root")
                .buildUser();

        User user2 = UserBuilder.userBuilder()
                .withEmail("adrien.helin@gmail.com")
                .withFirstName("Adrien")
                .withLastName("Hélin")
                .withPassWord("funfunfun")
                .buildUser();

        registerNewUser(user1);
        registerNewUser(user2);
    }


    public Collection<? extends User> getAllUsers() {
        return userRepository.values();
    }
}
