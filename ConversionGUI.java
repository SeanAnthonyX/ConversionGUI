import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversionGUI extends JFrame implements ActionListener {

    double inp, calculation;
    int op1, op2;


    JTextField input = new JTextField(5);

    String[] choice = {"Cup", "Fluid OZ", "TBSP", "Tsp", "Milliliter"};
    JComboBox inputchoice = new JComboBox(choice);


    JTextField results = new JTextField(5);
    JComboBox resultchoice = new JComboBox(choice);
    JButton convert = new JButton("Convert");

    String directions = "some kind of string here";
    JLabel label = new JLabel(directions);

    JPanel top = new JPanel();
    JPanel middle = new JPanel();
    JPanel bottom = new JPanel();

    GridLayout topGrid = new GridLayout(1, 4);
    GridLayout middleGrid = new GridLayout(1, 0);
    GridLayout bottomGrid = new GridLayout(1, 0);

    BorderLayout bord = new BorderLayout();

    Container c;

    public ConversionGUI() {
        setSize(400, 115);
        c = getContentPane();
        c.setBackground(Color.gray);
        c.setLayout(bord);
        setTitle("Magic Converter");


        top.setBackground(Color.gray);
        top.setLayout(topGrid);
        input.setForeground(Color.black);
        top.add(input);
        top.add(inputchoice);
        top.add(results);
        top.add(resultchoice);
        c.add(top, bord.NORTH);

        middle.setLayout(middleGrid);
        middle.add(label);
        c.add(middle, bord.CENTER);

        bottom.setLayout(bottomGrid);
        bottom.add(convert);
        c.add(bottom, bord.SOUTH);

        input.requestFocus();

        convert.addActionListener(this);


        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {

        inp = Double.parseDouble(input.getText());

        op1 = inputchoice.getSelectedIndex();
        op2 = resultchoice.getSelectedIndex();

        if (op1 == 0 && op2 == 1)
            calculation = inp * 8.0;
        else if (op1 == 0 && op2 == 2)
            calculation = inp * 16.0;
        else if (op1 == 0 && op2 == 3)
            calculation = inp * 48.0;
        else if (op1 == 0 && op2 == 4)
            calculation = inp * 237.0;

        if (e.getSource() == convert) {

//            answer = (inp * 8);
//            String ans = Double.toString(answer);
//            results.setText(ans);


            results.setText(Double.toString(calculation));

        }

    }

    public static void main(String[] args) {
        ConversionGUI f = new ConversionGUI();
    }
}
