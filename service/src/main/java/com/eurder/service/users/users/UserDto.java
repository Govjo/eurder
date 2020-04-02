package com.eurder.service.users.users;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserDto {
        private String id;
        private String firstName;
        private String lastName;
        private String email;

        @JsonCreator
        public UserDto(@JsonProperty("id") String id, @JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName, @JsonProperty("email") String email) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;

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

        public String getId() {
            return id;
        }
    }
