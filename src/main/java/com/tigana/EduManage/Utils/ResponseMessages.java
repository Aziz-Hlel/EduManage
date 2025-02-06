package com.tigana.EduManage.Utils;

public class ResponseMessages {

    public static class Common{
        public static final String INTERNAL_SERVER_ERROR = "Internal Server Error";
        public static final String REQUIRED_FIELDS = "All fields are required.";
        public static final String SOMETHING_WRONG = "Something went wrong";
        public static final String NOT_ALLOWED= "You are not allowed to perform this action.";

    }

    public static class Users {
        public static final String SIGNED_UP = "New user created";
        public static final String SIGNED_IN = "Successfully signed in";
        public static final String SIGNED_OUT = "Successfully signed out";
        public static final String USER_EMAIL_EXISTS = "Email already exists";
        public static final String USER_USERNAME_EXISTS = "Username already exists";
        public static final String EMAIL_ALREADY_IN_USE = "Email has already been used.";
        public static final String USER_NOT_EXISTS = "User doesn't exist";
        public static final String AUTH_CODE_NOT_FOUND = "Something went wrong";
        public static final String INVALID_PASSWORD = "Invalid password.";
        public static final String INVALID_TOKEN = "Token is invalid or expired!";
        public static final String VALID_TOKEN = "Token is valid";
        public static final String UNAUTHORIZED_USER = "You are not authorized!";
        public static final String RE_LOGIN = "Please log in again";
        public static final String UPDATE = "User updated successfully!";
        public static final String DELETED = "User deleted successfully!";
    }

}
