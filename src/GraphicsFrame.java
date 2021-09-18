
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
import javax.swing.SwingConstants;
//trial

public class GraphicsFrame  implements ActionListener {
	
	JTextField textFieldBookID;
	private JTextField textField;

		
GraphicsFrame(){
	JFrame frame = new JFrame();
	
	JButton ButtonAZ = new JButton("A to Z");
	JButton ButtonZA = new JButton("Z to A");
	
	JLabel LabelSearchBy = new JLabel("Search by:");
	JLabel LabelSortBy = new JLabel("Sort by:");
	JLabel LabelBookID = new JLabel("Book ID:");

	
	textFieldBookID = new JTextField();
	
	
	frame.setSize(420,420);
	
	JLabel LabelIsbn = new JLabel("ISBN:");
	
	textField = new JTextField();
	textField.setColumns(10);
	
	JButton ButtonAuthor = new JButton("Author");
	
	JButton ButtonYear = new JButton("Year");
	
	 
	
	
	
//groups layout
	GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
	groupLayout.setHorizontalGroup(
		groupLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(groupLayout.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(113)
						.addComponent(LabelSearchBy, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(81)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(LabelBookID, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textFieldBookID))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(LabelIsbn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(41)
								.addComponent(LabelSortBy, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(ButtonAZ, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(ButtonAuthor))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(ButtonYear, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(ButtonZA))))))
				.addContainerGap(180, Short.MAX_VALUE))
	);
	groupLayout.setVerticalGroup(
		groupLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(groupLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(LabelSearchBy)
				.addGap(18)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
					.addComponent(LabelBookID)
					.addComponent(textFieldBookID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
					.addComponent(LabelIsbn)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(40)
				.addComponent(LabelSortBy)
				.addGap(18)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
					.addComponent(ButtonZA)
					.addComponent(ButtonAZ))
				.addGap(18)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
					.addComponent(ButtonAuthor)
					.addComponent(ButtonYear))
				.addContainerGap(155, Short.MAX_VALUE))
	);
	
	frame.getContentPane().add(LabelSortBy);
	frame.getContentPane().add(LabelSearchBy);
	frame.getContentPane().add(ButtonAZ);
	frame.getContentPane().setLayout(groupLayout);
	frame.setVisible(true);
	
}
	
		
				

		
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
}
