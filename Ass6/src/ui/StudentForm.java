package  ui;
import dao.StudentDAO;
import model.Student;

import javax.swing.*;
import java.awt.event.*;
import java.util.List;

public class StudentForm extends JFrame {
    private JTextField txtID, txtName, txtGender;
    private JButton btnAdd, btnShow;
    private JTextArea txtArea;
    private StudentDAO dao = new StudentDAO();

    public StudentForm() {
        setTitle("Student Manager");
        setSize(400, 400);
        setLayout(null);

        JLabel lbl1 = new JLabel("ID:");
        lbl1.setBounds(30, 30, 80, 25);
        add(lbl1);

        txtID = new JTextField();
        txtID.setBounds(120, 30, 200, 25);
        add(txtID);

        JLabel lbl2 = new JLabel("Name:");
        lbl2.setBounds(30, 70, 80, 25);
        add(lbl2);

        txtName = new JTextField();
        txtName.setBounds(120, 70, 200, 25);
        add(txtName);

        JLabel lbl3 = new JLabel("Gender:");
        lbl3.setBounds(30, 110, 80, 25);
        add(lbl3);

        txtGender = new JTextField();
        txtGender.setBounds(120, 110, 200, 25);
        add(txtGender);

        btnAdd = new JButton("Add Student");
        btnAdd.setBounds(30, 150, 140, 30);
        add(btnAdd);

        btnShow = new JButton("Show All");
        btnShow.setBounds(180, 150, 140, 30);
        add(btnShow);

        txtArea = new JTextArea();
        txtArea.setBounds(30, 200, 300, 120);
        add(txtArea);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Student s = new Student(
                    Integer.parseInt(txtID.getText()),
                    txtName.getText(),
                    txtGender.getText()
                );
                dao.insert(s);
                JOptionPane.showMessageDialog(null, "Student Added!");
            }
        });

        btnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtArea.setText("");
                List<Student> list = dao.getAll();
                for (Student s : list) {
                    txtArea.append(s.getStudentID() + " - " + s.getStudentName() + " - " + s.getGender() + "\n");
                }
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
