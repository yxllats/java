/**
 * Author: dts
 * DateTime: 2020/5/13 15:37
 * Description: TODO
 */
class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}
public class TestDemo {
    private static String userName = "admin";
    private static String password = "123456";

    public static void main(String[] args) {
        try {
            login("admin", "123456");
        } catch (UserException userException) {
            userException.printStackTrace();
        } catch (PasswordException passwordException) {
            passwordException.printStackTrace();
        }
    }

    public static void login(String userName, String password) throws UserException,PasswordException {
        if (!TestDemo.userName.equals(userName)) {
            throw new UserException("用户名错误");
        }if (!TestDemo.password.equals(password)) {
            throw new PasswordException("密码错误");
        }
        System.out.println("登陆成功"); }
}
