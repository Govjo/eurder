package user.feature;

import org.springframework.security.crypto.bcrypt.BCrypt;
import user.User;

public class Userbuilder {
    public class UserBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String passWord;
        private String inss;

        protected UserBuilder () {
        }

        public UserBuilder userBuilder() {
            return new UserBuilder();
        }

        public User buildUser() {
            return new User(this);
        }


        public UserBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }


        public UserBuilder withPassWord(String passWord) {
            this.passWord = hash(passWord);
            return this;
        }

        public UserBuilder withINSS(String inss) {
            this.inss = inss;
            return this;
        }


        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getEmail() {
            return email;
        }

        public String getPassWord() {
            return passWord;
        }

        public String getInss() {
            return inss;
        }

        private String hash(String password) {
            return BCrypt.hashpw(password, BCrypt.gensalt(12));
        }
} }
