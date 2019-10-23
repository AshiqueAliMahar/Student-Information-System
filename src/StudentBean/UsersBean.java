package StudentBean;

public class UsersBean {
    
    private int Id;
    private String Division;
    private String UserName;
    private String Password;

    public UsersBean(int Id, String Division, String UserName, String Password) {
        this.Id = Id;
        this.Division = Division;
        this.UserName = UserName;
        this.Password = Password;
    }
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String Division) {
        this.Division = Division;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    @Override
    public String toString(){
        return Division;
    }
}
