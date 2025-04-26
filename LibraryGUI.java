import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryGUI extends JFrame {
    private JTextField titleField, authorField, quantityField;
    private JButton addButton, viewButton;
    private Library library;

    public LibraryGUI() {
        library = new Library();
        
        setTitle("Library Management System (No DB)");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Title:"));
        titleField = new JTextField();
        add(titleField);

        add(new JLabel("Author:"));
        authorField = new JTextField();
        add(authorField);

        add(new JLabel("Quantity:"));
        quantityField = new JTextField();
        add(quantityField);

        addButton = new JButton("Add Book");
        viewButton = new JButton("View Books");

        add(addButton);
        add(viewButton);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String author = authorField.getText();
                int quantity = Integer.parseInt(quantityField.getText());
                library.addBook(title, author, quantity);
                JOptionPane.showMessageDialog(null, "Book Added Successfully!");
            }
        });

        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ViewBooksFrame(library);
            }
        });

        setVisible(true);
    }
}
