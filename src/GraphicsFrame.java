
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
//trial

public class GraphicsFrame implements ActionListener {

	public JTextField textFieldBookID;
	private JTextField textField;
	private JButton btnSearch;

	GraphicsFrame(List<Book> books) {

		JFrame frame = new JFrame();

		JButton ButtonAZ = new JButton("A to Z");
		JButton ButtonZA = new JButton("Z to A");

		JLabel LabelSearchBy = new JLabel("Search by:");
		JLabel LabelSortBy = new JLabel("Sort by:");
		JLabel LabelBookID = new JLabel("Book ID:");
		JTextArea textArea = new JTextArea();

		textFieldBookID = new JTextField();

		frame.setSize(700, 500);

		JLabel LabelIsbn = new JLabel("ISBN:");

		textField = new JTextField();
		textField.setColumns(10);

		JButton ButtonAuthor = new JButton("Author");

		JButton ButtonYear = new JButton("Year");

		JScrollPane scrollPane = new JScrollPane();

		JTextArea TextAreaPrint = new JTextArea();

		for (int i = 0; i < books.size() && i < 10; i++) {
			TextAreaPrint.append("\n" + books.get(i).toString());

		}

		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for (Book i : books) {
					if (i.getBookID().equals(textFieldBookID.getText())) {
						TextAreaPrint.setText(null);
						TextAreaPrint.append("\n" + i.toString());
						System.out.println(i);
					}
				}
			}
		});

//groups layout
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(ButtonAZ, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
										.addComponent(ButtonAuthor)
										.addComponent(btnSearch, Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(LabelIsbn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
												.addComponent(LabelBookID, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(textFieldBookID, 54, 54, 54)
												.addComponent(textField, 0, 0, Short.MAX_VALUE))))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(ButtonYear)
										.addComponent(ButtonZA))
									.addGap(6))
								.addComponent(LabelSortBy, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(TextAreaPrint, GroupLayout.PREFERRED_SIZE, 469, GroupLayout.PREFERRED_SIZE))
						.addComponent(LabelSearchBy, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(LabelSearchBy)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(LabelBookID)
								.addComponent(textFieldBookID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(LabelIsbn)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSearch)
							.addGap(21)
							.addComponent(LabelSortBy)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(ButtonAZ)
								.addComponent(ButtonZA))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(ButtonAuthor)
								.addComponent(ButtonYear)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addComponent(TextAreaPrint, GroupLayout.PREFERRED_SIZE, 372, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(68, Short.MAX_VALUE))
		);

		frame.getContentPane().add(LabelSortBy);
		frame.getContentPane().add(LabelSearchBy);
		frame.getContentPane().add(ButtonAZ);
		frame.getContentPane().setLayout(groupLayout);
		frame.getContentPane().add(TextAreaPrint);
		frame.getContentPane().add(scrollPane);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}
}
