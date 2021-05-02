public class User{
    private int id ;
    private String login;
    private String passwordHash;
    private String lastName;
    private String firstName;
    private boolean isConnected = false;
    private boolean isChief = false;

    public User(int id){
        this.id = id;
    }
    public void Copy(User user){

    }
    public void Disconnect(){
        
    }
    
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getLogin(){
        return this.login;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public String getPasswordHash(){
        return this.passwordHash;
    }
    public void setPasswordHash(String passwordHash){
        this.passwordHash = passwordHash;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public boolean getIsConnected(){
        return this.isConnected;
    }
    public void setIsConnected(boolean isConnected){
        this.isConnected = isConnected;
    } 
    public boolean getIsChief(){
        return this.isChief;
    }
    public void setIsChief(boolean isChief){
        this.isChief = isChief;
    }


}