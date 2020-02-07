package org.d3ifcool.singleton;

import javax.swing.*;

public class Main {

    private JFrame frame;
    private JPanel panel;
    private JScrollPane scrollPane;
    private JTable table;

    private void initGui(){
        frame = new JFrame("Data Kontak");
        panel = new JPanel();

        String column[]={"Nama","Kota Asal"};
        String[][] data = new DataKontak().getData();
        table = new JTable(data,column);
        scrollPane = new JScrollPane(table);

        panel.add(scrollPane);
        frame.add(panel);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
	    new Main().initGui();
    }
}
