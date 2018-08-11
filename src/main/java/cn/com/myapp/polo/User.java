package cn.com.myapp.polo;

/**
 * Created by Yangzu on 2018/8/9
 */
public class User {

    private String pid;
    private String loginName;
    private String password;

    public User() {
    }

    public User(String pid, String loginName, String password) {
        this.pid = pid;
        this.loginName = loginName;
        this.password = password;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "pid='" + pid + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
