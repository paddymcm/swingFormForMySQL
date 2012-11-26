/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cascon;
import javax.swing.JOptionPane;
/**
 *
 * @author jennypaddy
 */
public class CASCON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String email;
      String pw;
      IDCheck ID = new IDCheck();
      //Form main = new Form();
      
      email = JOptionPane.showInputDialog(null, "Enter your full email address: ");
      JOptionPane.showMessageDialog(null, "Your email address is " + email);
      pw = JOptionPane.showInputDialog(null, " Enter your Password: ");
      
      if (ID.ID(email, pw) == true)
      {
          JOptionPane.showMessageDialog(null, "Starting the program!");
          //main= new Form();
          Form main;
          main = new Form();
          main.setVisible(true);
      }
      
      else{
          JOptionPane.showMessageDialog(null, "Try again Sucka!");
          System.exit(0);
          }
        // TODO code application logic here
    }
}
