/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cascon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Patrick McMahon
 */
public class Form extends JFrame //implements ActionListener
{
    public static final int WIDTH = 350;
    public static final int HEIGHT = 350;
    private JMenu saveMenu;	//horizontal menu bar
    private JMenuBar mBar;
    private JButton yardFormButton = new JButton("Yard Info");
    private JButton newYardButton = new JButton("New Yard");
    private JButton sysFormButton = new JButton("System");
    private JButton newSystemButton = new JButton("New System");
    private JButton serialLookUp = new JButton("Serial Look Up");
    private JPanel formPanel;
    
    public Form()
   {
        super("Form Selection");
        setSize(WIDTH, HEIGHT);
	setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	Container contentPane = getContentPane(); //get contentPane and set layout of the window
	contentPane.setLayout(new BorderLayout());
	saveMenu();//creates the vertical menus
        mBar = new JMenuBar();
	mBar.add(saveMenu);
        setJMenuBar(mBar);
        buildFormPanel();
        add(formPanel, BorderLayout.CENTER);
   }
    
      /**saveMenu will have the options wo write data to the DB or to clear the form
   */
   public void saveMenu()
	 {
            saveMenu = new JMenu("Save");
            JMenuItem item;

            item = new JMenuItem("Save");
            item.addActionListener(new MenuListener());
            saveMenu.add(item);

            item = new JMenuItem("Exit");
            item.addActionListener(new MenuListener());
            saveMenu.add(item);
	}
   private void buildFormPanel()
    {
       
       //yNames.addActionListener(new MenuListener());
       
       formPanel = new JPanel();
       formPanel.add(yardFormButton);
       yardFormButton.addActionListener(new MenuListener());
       formPanel.add(newYardButton);
       newYardButton.addActionListener(new MenuListener());
       formPanel.add(sysFormButton);
       sysFormButton.addActionListener(new MenuListener());
       formPanel.add(newSystemButton);
       newSystemButton.addActionListener(new MenuListener());
       formPanel.add(serialLookUp);
       serialLookUp.addActionListener(new MenuListener());
              
    }
   public void actionPerformed(ActionEvent e) {
       
   }
   
   /**this private class is the action listener for button clicks*/
	private class MenuListener implements ActionListener
	{

            public void actionPerformed(ActionEvent e)
	{
			//JComboBox jcmb = (JComboBox) e.getSource();
            String actionCommand = e.getActionCommand();
	    if (actionCommand.equals("Save"))
                System.out.println("written to DB");
	    else if (actionCommand.equals("Exit"))
            	System.exit(0);
            else if (actionCommand.equals("Yard Info"))
            {
                //JOptionPane.showMessageDialog(null, "Opening the Yard Info form");
                YardForm yard;
                yard = new YardForm();
                yard.setVisible(true);
             }
            else if (actionCommand.equals("New Yard"))
                {
                //JOptionPane.showMessageDialog(null, "Opening the Yard Info form");
                NewYard newYard;
                newYard = new NewYard();
                newYard.setVisible(true);
             }
            else if (actionCommand.equals("System"))
                JOptionPane.showMessageDialog(null, "Opening the System Form");
             else if (actionCommand.equals("New System"))
                JOptionPane.showMessageDialog(null, "Opening the **New** System form");
             
             else if (actionCommand.equals("Serial Look Up"))
                JOptionPane.showMessageDialog(null, "Opening the Serial Look Up form");

	}
    }
}
