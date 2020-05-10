package utils;


import org.apache.log4j.Logger;

public class Log {
    private static Logger testlog = Logger.getLogger(Log.class.getName());

    public static void startLog(String testName) {
        testlog.info(testName);
    }

    public static void endLog(String testName) {
        testlog.info(testName);
    }

    public static void info(String testName) {
        testlog.info(testName);
    }

    public static void warn(String testName) {
        testlog.warn(testName);
    }

    public static void error(String testName) {
        testlog.error(testName);
    }

    public static void fatal(String testName) {
        testlog.error(testName);
    }

    public static void debug(String testName) {
        testlog.debug(testName);
    }

}
