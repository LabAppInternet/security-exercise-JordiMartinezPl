package cat.tecnocampus.securityjwt.application.dtp;


import cat.tecnocampus.securityjwt.domain.Role;

import java.util.HashSet;
import java.util.Set;

public class UserDTO {

    private String username;
    private String password;
    private String email;
    private Set<Role> roles = new HashSet<>();

    public UserDTO() {}
    public UserDTO(String username, String password, String email, Set<Role> roles) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
