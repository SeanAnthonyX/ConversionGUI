import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Wed May 22 20:22:52 EDT 2019
 */



/**
 * @author christoph
 */
public class ConversionFrame {
    public ConversionFrame() {
        initComponents();

        JFrame jf = new JFrame("ConversionGUI");
        jf.add(pnlWindow);
        jf.setSize(450, 110);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - christoph
        pnlWindow = new JPanel();
        pnlOperation = new JPanel();
        lblGallons = new JLabel();
        tfGallons = new JTextField();
        tfFluidOunces = new JTextField();
        btnConvert = new JButton();

        //======== pnlWindow ========
        {

            // JFormDesigner evaluation mark
            pnlWindow.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), pnlWindow.getBorder())); pnlWindow.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            pnlWindow.setLayout(new GridBagLayout());
            ((GridBagLayout)pnlWindow.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)pnlWindow.getLayout()).rowHeights = new int[] {0, 0, 0};
            ((GridBagLayout)pnlWindow.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)pnlWindow.getLayout()).rowWeights = new double[] {1.0, 0.0, 1.0E-4};

            //======== pnlOperation ========
            {
                pnlOperation.setLayout(new GridBagLayout());
                ((GridBagLayout)pnlOperation.getLayout()).columnWidths = new int[] {290, 0, 0, 0};
                ((GridBagLayout)pnlOperation.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)pnlOperation.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0E-4};
                ((GridBagLayout)pnlOperation.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

                //---- lblGallons ----
                lblGallons.setText("Please enter number of gallons to convert to fluid Ounces");
                pnlOperation.add(lblGallons, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));
                pnlOperation.add(tfGallons, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- tfFluidOunces ----
                tfFluidOunces.setEditable(false);
                pnlOperation.add(tfFluidOunces, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            pnlWindow.add(pnlOperation, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- btnConvert ----
            btnConvert.setText("Convert");
            pnlWindow.add(btnConvert, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - christoph
    private JPanel pnlWindow;
    private JPanel pnlOperation;
    private JLabel lblGallons;
    private JTextField tfGallons;
    private JTextField tfFluidOunces;
    private JButton btnConvert;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
