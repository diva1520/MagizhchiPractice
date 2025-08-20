
package j42;

public class LoginModel {
    
    private String uName;
    private String uPass;

    public LoginModel(String uName, String uPass) {
        this.uName = uName;
        this.uPass = uPass;
    }

    public LoginModel() {
    }
    
    
    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }
    
}
