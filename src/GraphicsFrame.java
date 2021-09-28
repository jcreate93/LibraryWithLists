
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
	public JTextField textFieldIsbn;
	private JButton btnSearch;
	List<Book> arrayBooks = new ArrayList<Book>();

	GraphicsFrame(List<Book> books) {

		JFrame frame = new JFrame();

		JLabel LabelSearchBy = new JLabel("Search by:");
		JLabel LabelSortBy = new JLabel("Sort by:");
		JLabel LabelBookID = new JLabel("Book ID/Key:");
		JTextArea textArea = new JTextArea();

		textFieldBookID = new JTextField();

		frame.setSize(700, 500);

		JLabel LabelIsbn = new JLabel("ISBN:");

		textFieldIsbn = new JTextField();
		textFieldIsbn.setColumns(10);
		
		

		JScrollPane scrollPane = new JScrollPane();

		JTextArea TextAreaPrint = new JTextArea();

		for (int i = 0; i < books.size() && i < 10; i++) {
			TextAreaPrint.append("\n" + books.get(i).toString());

		}

		JButton btnBookID = new JButton("Book ID");
		btnBookID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectionSortArrayList.sortByBookID(books);
				TextAreaPrint.setText(null);
				TextAreaPrint.append("\n" + books);
			}
		});
		
		JButton ButtonYear = new JButton("Year");
		ButtonYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectionSortArrayList.sortByPublicationYear(books);
				TextAreaPrint.setText(null);
				TextAreaPrint.append("\n" + books);
			}
		});
		
		
		JButton ButtonAuthor = new JButton("Author");
		ButtonAuthor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SelectionSortArrayList.sortByAuthor(books);
				TextAreaPrint.setText(null);
				TextAreaPrint.append("\n" + books);
				//System.out.println(books);
					
			}

			private void SelectionSortArrayList(List<Book> arrayBooks) {
				// TODO Auto-generated method stub
				
			}
		});

		

		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				long a = System.currentTimeMillis(); // Time value before run
				for (Book i : books) {
					if (i.getBookID().equals(textFieldBookID.getText())) {
						long b = System.currentTimeMillis();     // Time value after run
						TextAreaPrint.setText(null);
						TextAreaPrint.append("\n" + i.toString());
						TextAreaPrint.append("\n" + "Actual run time value: " + (b-a) + " milliseconds");
						System.out.println("Time difference: " + (b - a) + "milliseconds");    // Actual run time value
						System.out.println(i);
					}
					if (i.getIsbn().equals(textFieldIsbn.getText())) {
						TextAreaPrint.setText(null);
						TextAreaPrint.append("\n" + i.toString());
						System.out.println(i);
					}
				}
			}
		});
		
		JButton btnBinarySearch = new JButton("Binary Search");
		btnBinarySearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SelectionSortArrayList.sortByBookID(books);
				long a = System.currentTimeMillis(); // Time value before run
				int x = SelectionSortArrayList.BinarySearch(books, textFieldBookID.getText());
				long b = System.currentTimeMillis();     // Time value after run
				if (x != -1) {
				TextAreaPrint.setText(null);
				TextAreaPrint.append("\n" + books.get(x));
				TextAreaPrint.append("\n" + "Actual run time value: " + (b-a) + " milliseconds");
				System.out.println("Time difference: " + (b - a) + "milliseconds");    // Actual run time value
				//System.out.println(books.get(x);
				}
				else {
					TextAreaPrint.setText(null);
					TextAreaPrint.append("Can't find book");
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
										.addComponent(LabelBookID, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
										.addComponent(LabelSearchBy, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textFieldBookID, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(LabelIsbn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textFieldIsbn, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
							.addGap(751))
						.addComponent(btnSearch))
					.addGap(194))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(38)
							.addComponent(btnBinarySearch))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(LabelSortBy, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(ButtonYear)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ButtonAuthor))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnBookID, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)))
					.addGap(74)
					.addComponent(TextAreaPrint, GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
					.addGap(0))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(LabelSearchBy)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(LabelBookID))
								.addComponent(textFieldBookID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBinarySearch)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(LabelIsbn)
								.addComponent(textFieldIsbn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnSearch)
							.addGap(14)
							.addComponent(LabelSortBy)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(ButtonYear)
								.addComponent(ButtonAuthor))
							.addGap(14)
							.addComponent(btnBookID))
						.addComponent(TextAreaPrint, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
					.addGap(91))
		);

		frame.getContentPane().add(LabelSortBy);
		frame.getContentPane().add(LabelSearchBy);
		frame.getContentPane().add(btnBookID);
		frame.getContentPane().setLayout(groupLayout);
		frame.getContentPane().add(TextAreaPrint);
		frame.getContentPane().add(scrollPane);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}
}
