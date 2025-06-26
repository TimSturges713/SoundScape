package com.soundscape.soundscape.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String username;

  private String bio;

  private String email;

  private String city;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getBio() {
    return this.bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

}