/*WAP to create a file that can store information about five products*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ProductDetails extends JFrame {
    private Label Productno;
    private JPanel contentPane;
    private JTextField nameField;
    private JTextField idfield;
    private JTextField pricefield;
    private JTextField discountField;
    private JTextField DatesoldField;
    String FinalDetails = " ";
    int count = 0;
    JButton btnSubmit;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ProductDetails frame = new ProductDetails();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ProductDetails() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JLabel lblNewLabel = new JLabel("Product Details");
        lblNewLabel.setBounds(152, 11, 94, 14);
        contentPane.add(lblNewLabel);
        Productno = new Label("Product 1");
        Productno.setBounds(10, 43, 61, 14);
        contentPane.add(Productno);
        JLabel lblProductName = new JLabel("Product Name :");
        lblProductName.setBounds(10, 68, 94, 14);
        contentPane.add(lblProductName);
        JLabel lblld = new JLabel("ID :");
        lblld.setBounds(10, 93, 46, 14);
        contentPane.add(lblld);
        JLabel lblPrice = new JLabel("Price(Rs) :");
        lblPrice.setBounds(10, 118, 46, 14);
        contentPane.add(lblPrice);
        JLabel lblDiscount = new JLabel("Discount(%) :");
        lblDiscount.setBounds(10, 143, 69, 14);
        contentPane.add(lblDiscount);
        JLabel lblDateSold = new JLabel("Date Sold :");
        lblDateSold.setBounds(10, 168, 61, 14);
        contentPane.add(lblDateSold);
        nameField = new JTextField();
        nameField.setBounds(108, 65, 316, 20);
        contentPane.add(nameField);
        nameField.setColumns(10);
        idfield = new JTextField();
        idfield.setBounds(108, 90, 316, 20);
        contentPane.add(idfield);
        idfield.setColumns(10);
        pricefield = new JTextField();
        pricefield.setBounds(108, 115, 316, 20);
        contentPane.add(pricefield);
        pricefield.setColumns(10);
        discountField = new JTextField();
        discountField.setBounds(108, 140, 316, 20);
        contentPane.add(discountField);
        discountField.setColumns(10);
        DatesoldField = new JTextField();
        DatesoldField.setBounds(108, 165, 316, 20);
        contentPane.add(DatesoldField);
        DatesoldField.setColumns(10);
        btnSubmit = new JButton("Submit");

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                submitActionPerformed(event);
            }
        });

        btnSubmit.setBounds(10, 209, 109, 42);
        contentPane.add(btnSubmit);
    }

    protected void submitActionPerformed(ActionEvent event) {
        // TODO Auto-generated method stub
        if (count == 4) {
            btnSubmit.setText("Save");
            JFileChooser fc = new JFileChooser();
            int k = fc.showSaveDialog(ProductDetails.this);
            if (k == JFileChooser.APPROVE_OPTION)
                try {
                    FileWriter fw = new FileWriter(fc.getSelectedFile().getPath() + ".txt");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(FinalDetails);
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            JOptionPane.showMessageDialog(null, fc.getSelectedFile().getName()+"is Saved", "Success",
                    JOptionPane.INFORMATION_MESSAGE);

            Productno.setText("Product 1");
            count = 0;
            FinalDetails = "";
            btnSubmit.setText("Submit");
        } else {
            String name, id, price, discount, datesold;
            String temp;
            name = "Name : " + nameField.getText();
            id = "ID:" + idfield.getText();
            price = "Price:" + pricefield.getText();
            discount = "Discount : " + discountField.getText();
            datesold = "Date Old :" + DatesoldField.getText();
            temp = "Product" + String.valueOf(count+ 1) + '\n' + name + '\n' + id + '\n' + price+ '\n'
                    + discount + '\n' + datesold + '\n';
            FinalDetails += temp;
            count++;
            nameField.setText("");
            idfield.setText("");
            pricefield.setText("");
            discountField.setText("");
            DatesoldField.setText("");
            Productno.setText("Product" + String.valueOf(count+ 1));
        }
    }
}