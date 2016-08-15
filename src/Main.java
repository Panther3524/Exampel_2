import javax.swing.*;
import java.awt.*;

public class Main
{
    private Dimension dimension;
    private JFrame Login_Frame;

    private JPanel jPanel1=null;
    private JPanel jPanel2=null;
    private JPanel jPanel3=null;

    private JLabel lbl_name;
    private JLabel lbl_family;

    private JTextField txt_name;
    private JTextField txt_family;

    public void initView()
    {
        dimension=Toolkit.getDefaultToolkit().getScreenSize();
        int ws=dimension.width;
        int hs= dimension.height;

        Login_Frame=new JFrame("Login");
        Login_Frame.setBounds(0,0,ws,hs);
        Login_Frame.setLayout(null);
        Login_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        jPanel1=new JPanel(null);
        jPanel1.setBounds(0,0,ws/2,hs);
        jPanel1.setBackground(Color.PINK);

        jPanel2=new JPanel(null);
        jPanel2.setBounds(ws/2,0,ws/2,hs/2);
        jPanel2.setBackground(Color.BLUE);

        jPanel3=new JPanel(null);
        jPanel3.setBounds(ws/2,hs/2,ws/2,hs/2);
        jPanel3.setBackground(Color.RED);

        lbl_name=new JLabel("Name :",JLabel.CENTER);
        lbl_name.setBounds(10,10,50,30);

        txt_name=new JTextField();
        txt_name.setBounds(70,10,200,30);

        lbl_family=new JLabel("Family :");
        lbl_family.setBounds(10,50,50,30);

        txt_family=new JTextField();
        txt_family.setBounds(70,50,200,30);

        Login_Frame.add(jPanel1);
        Login_Frame.add(jPanel2);
        Login_Frame.add(jPanel3);

        jPanel1.add(lbl_name);
        jPanel1.add(txt_name);
        jPanel1.add(lbl_family);
        jPanel1.add(txt_family);

        Login_Frame.setVisible(true);
        jPanel1.setVisible(true);
        jPanel2.setVisible(true);
        jPanel3.setVisible(true);
        lbl_name.setVisible(true);
        txt_name.setVisible(true);
        lbl_family.setVisible(true);
        txt_family.setVisible(true);
    }
    public static void main(String[] args)
    {
        Main m=new Main();
        m.initView();
    }
}
