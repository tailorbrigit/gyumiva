package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;


import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;


public class MainFrame extends JFrame{

    JPanel mainPanel;
    JPanel buttonPanel;
    JComboBox<String> combo1;

    public JList<String> list1;
    public DefaultListModel<String> model1;

    public JButton goButton;

public MainFrame(){
    setComponent();
    setButtonPanelComponent();
    setButtonPanel();
    setMainPanel();
    setMainFrame();
   
    
    
}

private void setComponent(){
    this.combo1 = new JComboBox<>();
    this.combo1.addItem("Alma");
    this.combo1.addItem("Körte");
    this.combo1.addItem("Szilva");
    this.combo1.addItem("Cseresznye");

    this.model1 = new DefaultListModel<>();
    this.list1 = new JList<>(this.model1);
    this.model1.addElement("Alma");
    this.model1.addElement("Paradicsom");
    this.model1.addElement("Uborka");
    this.model1.addElement("Krumpli");
    this.model1.addElement("Saláta");
    
}

private void setMainPanel(){
    this.mainPanel = new JPanel(); 
    this.mainPanel.setLayout(new BorderLayout());
    this.mainPanel.add(this.combo1,BorderLayout.NORTH);
    this.mainPanel.add(this.list1,BorderLayout.CENTER);
    this.mainPanel.add(this.buttonPanel,BorderLayout.SOUTH);


}
private void setButtonPanelComponent(){
    this.goButton = new JButton("Mehet");
   

}

private void setButtonPanel(){
    this.buttonPanel = new JPanel();
    this.buttonPanel.setLayout(new FlowLayout());
    this.buttonPanel.add(this.goButton);

}

private void setMainFrame(){
    this.add(this.mainPanel);
    this.setLayout(new FlowLayout());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400,300);
    this.setVisible(true);
}
}