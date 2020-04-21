//package com.stackroute.repository;
//
//import com.stackroute.config.AWSDynamoDBUtil;
//import com.stackroute.domain.UserDetails;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserDetailsRepository {
//
//    public static List<UserDetails> userDetailsList = new ArrayList<>();
//
//
//    public static void addUserDetails() {
//        UserDetails userDetails1 = new UserDetails();
//        userDetails1.setId(1);
//        userDetails1.setName("John");
//
//        userDetailsList.add(userDetails1);
//        AWSDynamoDBUtil.getMapper().batchSave(userDetailsList);
//    }
//
//}
