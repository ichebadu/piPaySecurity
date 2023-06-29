package com.piPay.security.user.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class UserDTO {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private int age;
    private String occupation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDTO userDTO)) return false;
        return age == userDTO.age && Objects.equals(username, userDTO.username) && Objects.equals(password, userDTO.password) && Objects.equals(firstName, userDTO.firstName) && Objects.equals(lastName, userDTO.lastName) && Objects.equals(occupation, userDTO.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, firstName, lastName, age, occupation);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public UserDTO(){

    }

}
