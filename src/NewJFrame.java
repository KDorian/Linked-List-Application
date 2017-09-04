
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewJFrame extends JFrame{

    List list = new List("My list");

    private JButton insertAtFrontButton;
    private JTextField insertAtBack;
    private JTextField insertAtFront;
    private JButton insertAtBackButton;
    private JButton randomListButton;
    private JButton removeFromFrontButton;
    private JButton removeFromBackButton;
    private JButton removeAllButton;
    private JLabel JLabel1;
    private JButton printTheListButton;
    private JTextArea printList;
    private JPanel panel;

    public NewJFrame() {
        setContentPane(panel);
        insertAtFrontButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = insertAtFront.getText();
                list.insertAtFront(str);
                JLabel1.setText("Insert At Front");
            }
        });
        insertAtBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = insertAtBack.getText();
                list.insertAtBack(str);
                JLabel1.setText("Insert At Back");
            }
        });
        randomListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i<10; i++){

                    list.insertAtFront(i*i+1);
                }
            }
        });
        removeFromFrontButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    list.removeFromFront();
                } catch (EmptyListException e1) {
                    e1.printStackTrace();
                }
            }
        });
        removeFromBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    list.removeFromBack();
                } catch (EmptyListException e1) {
                    e1.printStackTrace();
                }
            }
        });
        removeAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.removeAll();
            }
        });
        printTheListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printList.setText(list.print());
            }
        });
    }
}
