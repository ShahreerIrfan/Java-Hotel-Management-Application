package hotel.management.system;
import javax.swing.*;

public class HotelManagementSystem extends JFrame{
    HotelManagementSystem(){
        setSize(1366,565);
        setLocation(100,100);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1366,565);
        add(image);

        JLabel text = new JLabel("WElcome to Hotem management system");

        setVisible(true);
    }

    public static void main(String[] args) {
        new HotelManagementSystem();

    }
    
}