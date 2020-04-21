package com.stackroute.service;

import com.stackroute.domain.UserDetails;

import java.util.List;

public interface UserService {
    public void addUserDetails();

    public List<UserDetails> getAllUserDetails();

    public void deleteUserDetails(UserDetails userDetails);

    public void updateUserDetails(int id);

}
