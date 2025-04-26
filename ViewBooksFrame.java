import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewBooksFrame extends JFrame {
    public ViewBooksFrame(Library library) {
        setTitle("View Books");
        setSize(500, 300);
        setLayout(new BorderLayout());

        String[] columnNames = {"ID", "Title", "Author", "Quantity"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (Book book : library.getAllBooks()) {
            Object[] row = {book.getId(), book.getTitle(), book.getAuthor(), book.getQuantity()};
            model.addRow(row);
        }

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }
}
