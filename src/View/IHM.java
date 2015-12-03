package View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Model.Traitement;

public class IHM extends JFrame implements ActionListener{
	
	private JTextField textFieldAnnee;
	private JTextField textFieldMois;
	private JTextField textFieldJour;
	private JTextField textFieldHeure;
	private JTextField textFieldMinute;
	private JTextField textFieldSecondes;
	
	private JLabel labelAnnee;
	private JLabel labelMois;
	private JLabel labelJour;
	private JLabel labelHeure;
	private JLabel labelMinute;
	private JLabel labelSecondes;
	
	private JButton buttonValider;
	
	private JLabel labelResultat;
	
	
	
	public IHM()
	{
		create();
	}
	
	
	private void create()
	{
		Traitement traitement = new Traitement();
		setTitle("Vérificateur de date");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		/* Year */
		
		labelAnnee = new JLabel("Ann\u00E9e : ");
		labelAnnee.setBounds(81, 48, 100, 14);
		getContentPane().add(labelAnnee);
		
		textFieldAnnee = new JTextField();
		textFieldAnnee.setBounds(150, 45, 100, 20);
		getContentPane().add(textFieldAnnee);
		textFieldAnnee.setColumns(10);
		
		
		
		/* Month */
		
		labelMois = new JLabel("Mois : ");
		labelMois.setBounds(81, 73, 100, 14);
		getContentPane().add(labelMois);
		
		textFieldMois = new JTextField();
		textFieldMois.setColumns(10);
		textFieldMois.setBounds(150, 70, 100, 20);
		getContentPane().add(textFieldMois);
		
		
		/* Day */
		
		labelJour = new JLabel("Jour : ");
		labelJour.setBounds(81, 98, 100, 14);
		getContentPane().add(labelJour);
		
		textFieldJour = new JTextField();
		textFieldJour.setColumns(10);
		textFieldJour.setBounds(150, 95, 100, 20);
		getContentPane().add(textFieldJour);
		
		
		
		/* Hour */
		
		labelHeure = new JLabel("Heure : ");
		labelHeure.setBounds(81, 123, 100, 14);
		getContentPane().add(labelHeure);
		
		textFieldHeure = new JTextField();
		textFieldHeure.setColumns(10);
		textFieldHeure.setBounds(150, 120, 100, 20);
		getContentPane().add(textFieldHeure);
		
		
		
		/* Minute */
		
		labelMinute = new JLabel("Minute : ");
		labelMinute.setBounds(81, 148, 100, 14);
		getContentPane().add(labelMinute);
		
		textFieldMinute = new JTextField();
		textFieldMinute.setColumns(10);
		textFieldMinute.setBounds(150, 145, 100, 20);
		getContentPane().add(textFieldMinute);
		
		
		
		/* Seconds */
		
		labelSecondes = new JLabel("Secondes : ");
		labelSecondes.setBounds(81, 173, 100, 14);
		getContentPane().add(labelSecondes);
		
		textFieldSecondes = new JTextField();
		textFieldSecondes.setColumns(10);
		textFieldSecondes.setBounds(150, 170, 100, 20);
		getContentPane().add(textFieldSecondes);
		
		textFieldSecondes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean verifDate = traitement.FormatDate(textFieldAnnee.getText(), textFieldMois.getText(), textFieldJour.getText(), textFieldHeure.getText(), textFieldMinute.getText(), textFieldSecondes.getText());
				
				String labelResultatString = (verifDate) ? "La date est correcte !" : "La date est incorrecte !";
				labelResultat.setText(labelResultatString);
				
			}
		});
		
		
		/* Button */
		
		buttonValider = new JButton("Valider");
		buttonValider.setBounds(100, 200, 104, 55);
		getContentPane().add(buttonValider);
		
		buttonValider.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean verifDate = traitement.FormatDate(textFieldAnnee.getText(), textFieldMois.getText(), textFieldJour.getText(), textFieldHeure.getText(), textFieldMinute.getText(), textFieldSecondes.getText());
				
				String labelResultatString = (verifDate) ? "La date est correcte !" : "La date est incorrecte !";
				labelResultat.setText(labelResultatString);
						
			}
		});
		
		labelResultat = new JLabel("");
		labelResultat.setBounds(100, 250, 150, 150);
		getContentPane().add(labelResultat);
		
		
		
		
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
