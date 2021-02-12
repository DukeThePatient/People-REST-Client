package com.example.dataAccessObject;

public interface PersonDAO {

    String getAllUsers();
    String getOneUserByID();
    void updateUser();
    void deleteUser();

}
