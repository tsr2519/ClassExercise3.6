import javax.swing.JOptionPane;
public class EnumDemo {
	public enum Months {January, February, March, April, May, June, July, August, September, October, November, December}
		public static void main(String[] args) {
/**
 * Develop an application to prompt the user with JOptionPane showInputDialog box as a selection options to prompt the user to select a month from a list of the months in one year. The program will response to the user with the following message according to the month that the user have selected.

December – February: Do you want to build a snow man?

March – May: Happy Spring days!

June – August: It’s a summer time.

September – November: Welcome to the foliage season!
 */
	
		
			Months[] choices = {Months.January, Months.February, Months.March, Months.April, Months.May, Months.June, Months.July, Months.August, Months.September, Months.October, Months.November, Months.December};
				
				Months Input = (Months) JOptionPane.showInputDialog(null, "What is the current month?", "Months",
						JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]);
				
								while(Input != null){
									switch (Input)  {
									
									case December :
										JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
										break;
									case January :
										JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
										break;
									case February :
										JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
										break;
									case March :
										JOptionPane.showMessageDialog(null, "Happy Spring days!");
										break;
									case April :
										JOptionPane.showMessageDialog(null, "Happy Spring days!");
										break;
									case May :
										JOptionPane.showMessageDialog(null, "Happy Spring days!");
										break;
									case June :
										JOptionPane.showMessageDialog(null, "It's Summer time!");
										break;
									case July :
										JOptionPane.showMessageDialog(null, "It's Summer time!");
										break;
									case August :
										JOptionPane.showMessageDialog(null, "It's Summer time!");
										break;
									case September :
										JOptionPane.showMessageDialog(null, "Welcome to the Foliage Season!");
										break;
									case October :
										JOptionPane.showMessageDialog(null, "Welcome to the Foliage Season!");
										break;
									case November :
										JOptionPane.showMessageDialog(null, "Welcome to the Foliage Season!");
										break;}
				Input = (Months) JOptionPane.showInputDialog(null, "What is the current month?", "Months",
												JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]);
		}
		}
}
				
				
									
										
									
		
		

		
		
		


