package cascon;

import javax.swing.*;
/**
 *
 * @author jennypaddy
 */
public class IDCheck extends CASCON
{
    //private String password;
    //private String email;
    public boolean ID(String eml, String  pw)
    {
        if ("jqs".equals(eml) && "2468".equals(pw))
        {
            return true;
        }
        else
        {
             return false;
        }
    }
    
}
