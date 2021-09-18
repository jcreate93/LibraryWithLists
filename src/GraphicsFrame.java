import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;


public class GraphicsFrame extends JFrame implements ActionListener{

		JFrame frame;
		private JTextField textFieldBookID;
		private JTextField textFieldISBN;
		
		
		
	GraphicsFrame(){
		
		
		frame = new JFrame("Book Library");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		
	//A to Z button
		JButton azAsc = new JButton("A to Z");
		frame.add(azAsc);
		
	
	//Z to A button
		JButton zaDesc = new JButton("Z to A");
		
	// BookID textField
		textFieldBookID = new JTextField();
		textFieldBookID.setColumns(10);
		JLabel LabelBookID = new JLabel("Book ID:");
	
		
	//Main Labels
		JLabel LabelSearchBy = new JLabel("Search by:");
		JLabel LabelSortBy = new JLabel("Sort by:");
		
		
	//Label ISBN
		JLabel LabelISBN = new JLabel("ISBN:");
		textFieldISBN = new JTextField();
		textFieldISBN.setColumns(10);
		
	//Author button
		JButton ButtonAuthor = new JButton("Author");
	
	//Year button
		JButton ButtonYear = new JButton("Year");
		
		
		GroupLayout groupLayout_1 = new GroupLayout(getContentPane());
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addGroup(groupLayout_1.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(LabelSearchBy, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGap(48)
							.addGroup(groupLayout_1.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout_1.createSequentialGroup()
									.addComponent(LabelBookID, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textFieldBookID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout_1.createSequentialGroup()
									.addComponent(LabelISBN, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textFieldISBN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGap(64)
							.addComponent(LabelSortBy, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGap(21)
							.addGroup(groupLayout_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(ButtonAuthor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(azAsc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(ButtonYear, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(zaDesc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addContainerGap(236, Short.MAX_VALUE))
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addGap(16)
					.addComponent(LabelSearchBy)
					.addGap(18)
					.addGroup(groupLayout_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(LabelBookID)
						.addComponent(textFieldBookID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(LabelISBN)
						.addComponent(textFieldISBN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addComponent(LabelSortBy)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(azAsc)
						.addComponent(zaDesc))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(ButtonAuthor)
						.addComponent(ButtonYear))
					.addContainerGap(47, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout_1);
		
		
		
		
	//GroupLayout
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 406, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 383, Short.MAX_VALUE)
		);
		
		
		//frame
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
		
		
		
		
	
		
		}
		
		
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
}
