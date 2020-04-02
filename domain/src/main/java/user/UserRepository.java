package user;

import org.springframework.stereotype.Repository;
import user.exception.EmailAlreadyRegisteredException;

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


    public Collection<? extends User> getAllUsers() {
        return userRepository.values();
    }
}
