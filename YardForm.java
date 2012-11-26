/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cascon;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Patrick McMahon
 */
public class YardForm extends JFrame 
{
    public static final int WIDTH = 650;
    public static final int HEIGHT = 350;
    private JMenu saveMenu;	//horizontal menu bar
    private JMenuBar mBar;
    private JPanel formPanel;
    private JPanel leftPanel;
    private JPanel bottPanel;
    private String[] yardArray = { "Select Yard","Portsmouth N.S.Y.", "Pearl Harobr", "Norfolk N.S.Y.", "Puget Sound N.S.Y."};
    private JComboBox yardCB = new JComboBox<String>(yardArray);
    private JButton dbWriteButton = new JButton("**Write Info To Database**");
    private JButton pnsyButton = new JButton("pnsy");
    private JButton pearlButton = new JButton("pearl");
    private JButton pugetButton = new JButton("puget");
    private JButton nnsyButton = new JButton("norfolk");
    private JTextField yStreet;
    private JTextField yStreet2;
    private JTextField yCity;
    private JTextField yState;
    private JTextField yZip;
    
    /** Constructor 
    */
   public YardForm()
   {
        super("Navy Yard Information");
        setSize(WIDTH, HEIGHT);
	setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
	Container contentPane = getContentPane(); //get contentPane and set layout of the window
	contentPane.setLayout(new BorderLayout());
	saveMenu();//creates the vertical menus
        mBar = new JMenuBar();
	mBar.add(saveMenu);
        setJMenuBar(mBar);
        buildFormPanel();
        add(formPanel, BorderLayout.CENTER);
        buildLeftPanel();
        add(leftPanel, BorderLayout.WEST);
        buildBottPanel();
        add(bottPanel, BorderLayout.SOUTH);
   }
    public void saveMenu()
	 {
            saveMenu = new JMenu("Save");
            JMenuItem item;

            item = new JMenuItem("Save");
            item.addActionListener(new YardForm.MenuListener());
            saveMenu.add(item);

            item = new JMenuItem("Exit");
            item.addActionListener(new YardForm.MenuListener());
            saveMenu.add(item);
	}
    private void buildFormPanel()
    {
       formPanel = new JPanel();
       yStreet = new JTextField("Street",24);
       yStreet2 = new JTextField("Street",24);
       yCity = new JTextField("City",24);
       yState = new JTextField("State",2);
       yZip = new JTextField("Zip",9);
       formPanel.add(yStreet);
       formPanel.add(yStreet2);
       formPanel.add(yCity);
       formPanel.add(yState);
       formPanel.add(yZip);
    }
     private void buildLeftPanel()
    {
       //yardCB.addActionListener(new YardForm.MenuListener());
       leftPanel = new JPanel();
       leftPanel.setPreferredSize(new Dimension(75, 350));
   

       //leftPanel.add(yardCB);
       leftPanel.add(pnsyButton);
       pnsyButton.addActionListener(new YardForm.MenuListener());
       leftPanel.add(pearlButton);
       pearlButton.addActionListener(new YardForm.MenuListener());
       leftPanel.add(pugetButton);
       pugetButton.addActionListener(new YardForm.MenuListener());
       leftPanel.add(nnsyButton);
       nnsyButton.addActionListener(new YardForm.MenuListener());
     }
     
     private void buildBottPanel()
    {
       //yardCB.addActionListener(new YardForm.MenuListener());
       bottPanel = new JPanel();
       bottPanel.setPreferredSize(new Dimension(350, 45));
       bottPanel.add(dbWriteButton);
       dbWriteButton.addActionListener(new YardForm.MenuListener());
       
    }
       
    
     /**this private class is the action listener for button clicks*/
	private class MenuListener implements ActionListener
	{
            @Override
            public void actionPerformed(ActionEvent e)
	{
            String actionCommand = e.getActionCommand();
	    if (actionCommand.equals("Save")) {
                System.out.println("written to DB");
            }
	    else if (actionCommand.equals("Exit")) {
                  YardForm.this.dispose();
            }
            else if (actionCommand.equals("pnsy")) {
              //JOptionPane.showMessageDialog(null, "Po-Diddy!");
              yStreet.setText("Walker St.");
              yStreet2.setText(" ");
              yCity.setText("Kittery");
              yState.setText("ME");
              yZip.setText("03903");
              
              
            }
            
        }
    }
    
    
}
