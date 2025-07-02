package spring_pratice;

public class get_set_05 {
    private String username;
    private String password;

    // Set username (no condition)
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password){
        if(password.length() >= 6){
            this.password = password;
        }
        else{
            System.out.println("Password Must be 6 character long !!");
        }
    }

    public String getPassword() {
        if (password != null) {
            return "*".repeat(password.length());
        }
        return "Not Set";
    }

    public String getUsername() {
        return username;
    }

    public static void main(String[] args) {
        get_set_05 hack = new get_set_05();
        hack.setUsername("root");
        hack.setPassword("root@12346");
        System.out.println("The username is " + hack.getUsername());
        System.out.println("The Password is " + hack.getPassword());
    }
}


