package nyx.com.aaustads.nyx.com.aaustads.logic;

/**
 * Created by tools on 04/08/14.
 */
public class CheckCredentials {

    public static boolean isStadsUser(String username, String password){

        //TODO Update to check toward STADS
        return ksoap.isUserInStads(username, password);
    }
}
