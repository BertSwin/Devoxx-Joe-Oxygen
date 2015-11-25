package be.xploregroup.joe.oxygen.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by bertswinnen on 07/11/15.
 */
public final class SystemUtil {
    public static String getHostName() {
        String ip = "Unknown";
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            return ip;
        }
    }

    public static String getIp() {
        String ip = "Unknown";
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            return ip;
        }
    }
}
