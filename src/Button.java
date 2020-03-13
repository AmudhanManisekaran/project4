import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Button {
    public void addButtonsToLeftPanel(LeftPanel panel){

        JButton openButton = new JButton("b1",new ImageIcon(""));
        openButton.setPreferredSize(new Dimension(230,100));

        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openButton.setName("openButton");
                openButton.setText("open bracket clicked");
                resetButtonClicked(openButton);
            }
        });
        panel.add(openButton);

        JButton closeButton = new JButton("b2",new ImageIcon(""));
        closeButton.setPreferredSize(new Dimension(230,100));
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeButton.setName("closeBracketButton");
                closeButton.setText("close bracket clicked");
                resetButtonClicked(closeButton);
            }
        });
        panel.add(closeButton);

        JButton lessThanButton = new JButton("r2",new ImageIcon(""));
        lessThanButton.setPreferredSize(new Dimension(230,100));
        lessThanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lessThanButton.setName("lessThanButton");
                lessThanButton.setText("lessThanButton");
                resetButtonClicked(lessThanButton);
            }
        });
        panel.add(lessThanButton);

        JButton greaterThanButton = new JButton("r2",new ImageIcon(""));
        greaterThanButton.setPreferredSize(new Dimension(230,100));
        greaterThanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                greaterThanButton.setName("greaterThanButton");
                greaterThanButton.setText("greaterThanButton");
                resetButtonClicked(greaterThanButton);
            }
        });
        panel.add(greaterThanButton);

        JButton atTheRateButton = new JButton("r2",new ImageIcon(""));
        atTheRateButton.setPreferredSize(new Dimension(230,100));
        atTheRateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atTheRateButton.setName("atTheRateButton");
                atTheRateButton.setText("atTheRateButton");
                resetButtonClicked(atTheRateButton);
            }
        });
        panel.add(atTheRateButton);

        JButton twoBarButton = new JButton("r2",new ImageIcon(""));
        twoBarButton.setPreferredSize(new Dimension(230,100));
        twoBarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                twoBarButton.setName("twoBarButton");
                twoBarButton.setText("twoBarButton");
                resetButtonClicked(twoBarButton);
            }
        });
        panel.add(twoBarButton);

        JButton hypenButton = new JButton("r2",new ImageIcon(""));
        hypenButton.setPreferredSize(new Dimension(230,100));
        hypenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hypenButton.setName("hypenButton");
                hypenButton.setText("hypenButton");
                resetButtonClicked(hypenButton);
            }
        });
        panel.add(hypenButton);



    }
    private  void resetButtonClicked(JButton button){
        System.out.println(button.getName() + " clicked by the user!!!");
        if(button.getName()=="openBracketButton"){
            LeftPanelMouseListener.setOpenBracketClicked(Boolean.TRUE);
            LeftPanelMouseListener.setCloseBracketClicked(Boolean.FALSE);
            LeftPanelMouseListener.setLessThanClicked(Boolean.FALSE);
            LeftPanelMouseListener.setGreaterThanClicked(Boolean.FALSE);
            LeftPanelMouseListener.setAtTheRateClicked(Boolean.FALSE);
            LeftPanelMouseListener.setTwoBarsClicked(Boolean.FALSE);
            LeftPanelMouseListener.setHyphenClicked(Boolean.FALSE);
        }else if(button.getName()=="closeBracketButton") {
            LeftPanelMouseListener.setCloseBracketClicked(Boolean.TRUE);
            LeftPanelMouseListener.setOpenBracketClicked(Boolean.FALSE);
            LeftPanelMouseListener.setLessThanClicked(Boolean.FALSE);
            LeftPanelMouseListener.setGreaterThanClicked(Boolean.FALSE);
            LeftPanelMouseListener.setAtTheRateClicked(Boolean.FALSE);
            LeftPanelMouseListener.setTwoBarsClicked(Boolean.FALSE);
            LeftPanelMouseListener.setHyphenClicked(Boolean.FALSE);
        }else if(button.getName()=="LessThanButton"){
            LeftPanelMouseListener.setLessThanClicked(Boolean.TRUE);
            LeftPanelMouseListener.setCloseBracketClicked(Boolean.FALSE);
            LeftPanelMouseListener.setOpenBracketClicked(Boolean.FALSE);
            LeftPanelMouseListener.setGreaterThanClicked(Boolean.FALSE);
            LeftPanelMouseListener.setAtTheRateClicked(Boolean.FALSE);
            LeftPanelMouseListener.setTwoBarsClicked(Boolean.FALSE);
            LeftPanelMouseListener.setHyphenClicked(Boolean.FALSE);
        }else if(button.getName()=="greaterThanButton"){
            LeftPanelMouseListener.setGreaterThanClicked(Boolean.TRUE);
            LeftPanelMouseListener.setCloseBracketClicked(Boolean.FALSE);
            LeftPanelMouseListener.setOpenBracketClicked(Boolean.FALSE);
            LeftPanelMouseListener.setLessThanClicked(Boolean.FALSE);
            LeftPanelMouseListener.setAtTheRateClicked(Boolean.FALSE);
            LeftPanelMouseListener.setTwoBarsClicked(Boolean.FALSE);
            LeftPanelMouseListener.setHyphenClicked(Boolean.FALSE);
        }else if(button.getName()=="atTheRateButton"){
            LeftPanelMouseListener.setAtTheRateClicked(Boolean.TRUE);
            LeftPanelMouseListener.setCloseBracketClicked(Boolean.FALSE);
            LeftPanelMouseListener.setOpenBracketClicked(Boolean.FALSE);
            LeftPanelMouseListener.setLessThanClicked(Boolean.FALSE);
            LeftPanelMouseListener.setGreaterThanClicked(Boolean.FALSE);
            LeftPanelMouseListener.setTwoBarsClicked(Boolean.FALSE);
            LeftPanelMouseListener.setHyphenClicked(Boolean.FALSE);
        }else if(button.getName()=="twoBarButton"){
            LeftPanelMouseListener.setTwoBarsClicked(Boolean.TRUE);
            LeftPanelMouseListener.setCloseBracketClicked(Boolean.FALSE);
            LeftPanelMouseListener.setOpenBracketClicked(Boolean.FALSE);
            LeftPanelMouseListener.setLessThanClicked(Boolean.FALSE);
            LeftPanelMouseListener.setGreaterThanClicked(Boolean.FALSE);
            LeftPanelMouseListener.setAtTheRateClicked(Boolean.FALSE);
            LeftPanelMouseListener.setHyphenClicked(Boolean.FALSE);
        }else if(button.getName()=="hypenButton"){
            LeftPanelMouseListener.setHyphenClicked(Boolean.TRUE);
            LeftPanelMouseListener.setCloseBracketClicked(Boolean.FALSE);
            LeftPanelMouseListener.setOpenBracketClicked(Boolean.FALSE);
            LeftPanelMouseListener.setLessThanClicked(Boolean.FALSE);
            LeftPanelMouseListener.setGreaterThanClicked(Boolean.FALSE);
            LeftPanelMouseListener.setAtTheRateClicked(Boolean.FALSE);
            LeftPanelMouseListener.setTwoBarsClicked(Boolean.FALSE);
        }else
            System.out.println("Wrong Input Entry From User!!!!!");
    }
}
