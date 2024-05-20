package entity;

/**
 * @author Wang.Kone
 * @date 2024/4/2 9:19
 */
public class Login {
    private int login_id;
    private int login_user_id;
    private int login_role_id;
    private String login_username;
    private String login_password;
    private String login_last_login;

    // Constructor
    public Login(int login_id, int login_user_id, int login_role_id, String login_username, String login_password, String login_last_login) {
        this.login_id = login_id;
        this.login_user_id = login_user_id;
        this.login_role_id = login_role_id;
        this.login_username = login_username;
        this.login_password = login_password;
        this.login_last_login = login_last_login;
    }

    // Getters and Setters
    public int getLoginId() {
        return login_id;
    }

    public void setLoginId(int login_id) {
        this.login_id = login_id;
    }

    public int getLoginUserId() {
        return login_user_id;
    }

    public void setLoginUserId(int login_user_id) {
        this.login_user_id = login_user_id;
    }

    public int getLoginRoleId() {
        return login_role_id;
    }

    public void setLoginRoleId(int login_role_id) {
        this.login_role_id = login_role_id;
    }

    public String getLoginUsername() {
        return login_username;
    }

    public void setLoginUsername(String login_username) {
        this.login_username = login_username;
    }

    public String getLoginPassword() {
        return login_password;
    }

    public void setLoginPassword(String login_password) {
        this.login_password = login_password;
    }

    public String getLoginLastLogin() {
        return login_last_login;
    }

    public void setLoginLastLogin(String login_last_login) {
        this.login_last_login = login_last_login;
    }
    @Override
    public String toString() {
        return "Login [id=" + login_id + ", userId=" + login_user_id + ", roleId=" + login_role_id + ", username=" + login_username + ", password=" + login_password + ", lastLogin=" + login_last_login + "]";
    }


}
