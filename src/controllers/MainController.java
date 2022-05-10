package controllers;

import models.MainModel;
import views.MainFrame;

public class MainController {

    MainFrame mainFrame;
    MainModel mainModel;


    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        this.setEvents();
    }
    private void setEvents(){
        this.mainFrame.goButton.addActionListener(e -> onClickButton());
    }
    private void onClickButton(){
        if (this.mainFrame.model1.isEmpty()){
            System.out.println("Üres");

        }else{
            System.out.println("Van benne valami");
        }
        this.mainFrame.model1.addElement("Ismeretlen");
        System.out.println(this.mainFrame.model1.firstElement());
        System.out.println(this.mainFrame.model1.size());
        System.out.println(this.mainFrame.model1.contains("szilva"));
        
        System.out.println(this.mainFrame.list1.getSelectedIndex());
        System.out.println(this.mainFrame.list1.getSelectedValue());
    }
    
}
