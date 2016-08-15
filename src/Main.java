import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.SystemFlavorMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    private JButton btn_save;
    private JButton btn_exit;
    private JButton btn_clear;

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

        btn_save=new JButton("Save");
        btn_save.setBounds(10,10,100,30);
        btn_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=txt_name.getText();
                String family=txt_family.getText();

                System.out.println("Name  Is : "+name+"\nFamily Is : "+family);
            }
        });

        btn_clear=new JButton("Clear");
        btn_clear.setBounds(jPanel2.getWidth()/2-50,jPanel2.getHeight()/2-15,100,30);
        btn_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_name.setText("");
                txt_family.setText("");
            }
        });

        btn_exit=new JButton("Exit");
        btn_exit.setBounds(jPanel3.getWidth()/2-50,jPanel3.getHeight()/2-15,100,30);
        btn_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        Login_Frame.add(jPanel1);
        Login_Frame.add(jPanel2);
        Login_Frame.add(jPanel3);

        jPanel1.add(lbl_name);
        jPanel1.add(txt_name);
        jPanel1.add(lbl_family);
        jPanel1.add(txt_family);

        jPanel2.add(btn_save);
        jPanel2.add(btn_clear);

        jPanel3.add(btn_exit);

        Login_Frame.setVisible(true);

        jPanel1.setVisible(true);
        jPanel2.setVisible(true);
        jPanel3.setVisible(true);

        lbl_name.setVisible(true);
        txt_name.setVisible(true);
        lbl_family.setVisible(true);
        txt_family.setVisible(true);

        btn_save.setVisible(true);
        btn_clear.setVisible(true);
        btn_exit.setVisible(true);
    }
    public static void main(String[] args)
    {
        Main m=new Main();
        m.initView();
    }
}