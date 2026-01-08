package info.jemsit.common;


import info.jemsit.common.data.enums.Roles;

import java.util.List;

public class UserContext {
    public static final ThreadLocal<List<Roles>> userRole = new ThreadLocal<>();
    public static final ThreadLocal<String> userToken = new ThreadLocal<>(); //be careful with this token, it can be User token or Agent token, it is  not always Agent Token
    public static void userRole(List<Roles> roles) {
        userRole.set(roles);
    }
    public static List<Roles> getRoles() {
        return userRole.get();
    }
    public static void setUserToken(String token) {
        userToken.set(token);
    }
    public static String getUserToken() {
        return userToken.get();
    }
}
