package tcp.echo;

import java.util.Date;

/**
 * Author: dts
 * DateTime: 2020/6/30 11:32
 * Description: 把打印日志的代码封装一下
 */
public class Logger {
    public static void debug(String message) {
        System.out.printf("%s: %s: DEBUG: %s%n", Thread.currentThread().getName(), new Date(), message);
    }

    public static void error(String message) {
        System.out.printf("%s: %s: ERROR: %s%n", Thread.currentThread().getName(), new Date(), message);
    }
}
