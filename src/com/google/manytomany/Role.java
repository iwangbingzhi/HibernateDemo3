package com.google.manytomany;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by 王炳智 on 2017/9/25.
 */
public class Role {
    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_password() {
        return role_password;
    }

    public void setRole_password(String role_password) {
        this.role_password = role_password;
    }

    public Set<User> getSetUser() {
        return setUser;
    }

    public void setSetUser(Set<User> setUser) {
        this.setUser = setUser;
    }

    private Set<User> setUser = new HashSet<User>();
    private Integer role_id;
    private String role_name;
    private String role_password;
}
