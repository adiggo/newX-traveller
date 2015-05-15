package controller;


import Exception.AuthenticateException;

/**
 * This class will compare the access token with our server token
 * Created by i843719 on 11/7/14.
 */
public class Authenticate {
    public static boolean isValid(String accesstokenFromClient, String accesstokenInServer) throws AuthenticateException {
        if (accesstokenFromClient != null && accesstokenInServer != null)
            return accesstokenFromClient.equals(accesstokenInServer);
        if (accesstokenFromClient == null)
            throw new AuthenticateException("token cannot be null");
        return false;
    }
}
