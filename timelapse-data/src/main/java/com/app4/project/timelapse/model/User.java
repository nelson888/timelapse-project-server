package com.app4.project.timelapse.model;

public class User {

  private String username;
  private String password;
  private String role;

  public User(String username, String password, String role) {
    this.username = username;
    this.password = password;
    this.role = role;
  }

  public User(String username, String password) {
    this(username, password, null);
  }

    public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getRole() {
    return role;
  }
}
