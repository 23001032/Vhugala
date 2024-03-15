import javax.swing.JOptionPane;
public class Registration {
    public static void main(String args[]){
         JOptionPane.showMessageDialog(null,"****Account Registration****"," WELCOME ",JOptionPane.PLAIN_MESSAGE);
         String userName=JOptionPane.showInputDialog(null,"Enter your username:");
         String passWord=JOptionPane.showInputDialog(null,"Enter your password:");
         String firstName=JOptionPane.showInputDialog(null,"Enter your firstname:");
         String lastName=JOptionPane.showInputDialog(null,"Enter your lastname:");
         Login Myaccess=new Login(userName, passWord);
         String registrationMessage=Myaccess.registerUser();
         JOptionPane.showMessageDialog(null,registrationMessage);
    if(registrationMessage.equals("Registration successful")){
        JOptionPane.showMessageDialog(null,"\nLogin");
        String LoginUserName=JOptionPane.showInputDialog(null,"Enter your lastname:");
        String LoginPassword=JOptionPane.showInputDialog(null,"Enter your lastname:");
    if(Myaccess.LoginUser(LoginUserName,LoginPassword)){
            JOptionPane.showMessageDialog(null,"Welcome"+firstName+""+lastName+",it is great to see you again");
    }else{
        JOptionPane.showMessageDialog(null,"Userrname or password incorrect,please try again.");
            } }
        }
        }
            
                class Login{
                    private String userName;
                    private String passWord;
                    public Login(String userName,String passWord){
                        this.userName=userName;
                        this.passWord=passWord;
                    } public boolean checkUserName(){
return userName.contains("_") && userName.length()<=5;
                    }public boolean checkPasswordComplexity(){
return passWord.length()>=8 && passWord.matches(".[A-Z].");                       
                    }public String registerUser(){
                        if(!checkUserName()){
return "Username is not correctly formatted,please ensure that your username contains an underscore and is more than 5 charaters in length";
                        }if(!checkPasswordComplexity()){
return "Password is not correctly formatted,please ensure that the password contains atleast 8 characters,a capital letter,a number,and a special character";                            
                        }
return "Registration successful";
                    }public boolean LoginUser(String userName2,String passWord2){
return userName2.equals(userName) && passWord2.equals(passWord);
                    }
                }
            