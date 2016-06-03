package CarCustomizer;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class Frame {

	private JFrame frame;
	int algorehasarrived = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 816, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Car Generator");
		Image icon = new ImageIcon(this.getClass().getResource("/icon.jpg")).getImage();
		frame.setIconImage(icon);
		
		final JLabel flamesBody = new JLabel("");
		flamesBody.setBounds(26, 33, 400, 300);
		frame.getContentPane().add(flamesBody);
		
		final JLabel skirtBody = new JLabel("");
		skirtBody.setBounds(26, 33, 400, 300);
		frame.getContentPane().add(skirtBody);
		
		final JLabel tintBody = new JLabel("");
		tintBody.setBounds(26, 33, 400, 300);
		frame.getContentPane().add(tintBody);
		
		final JLabel alBody = new JLabel("");
		alBody.setBounds(26, 33, 400, 300);
		frame.getContentPane().add(alBody);
		
		final JLabel wheels = new JLabel("");
		wheels.setBounds(26, 33, 400, 300);
		Image wheel = new ImageIcon(this.getClass().getResource("/8-spoked.png")).getImage();
		wheels.setIcon(new ImageIcon(wheel));
		frame.getContentPane().add(wheels);
		
		final JLabel carBody = new JLabel("");
		Image car = new ImageIcon(this.getClass().getResource("/red.png")).getImage();
		carBody.setIcon(new ImageIcon(car));
		carBody.setBounds(26, 33, 400, 300);
		frame.getContentPane().add(carBody);
		
		String[] colors = {"Red", "Yellow", "Purple", "Green"};
		final JComboBox comboBox = new JComboBox(colors);
		comboBox.setBounds(494, 61, 211, 22);
		frame.getContentPane().add(comboBox);
		
		String[] wheelOptions = {"8-spoked", "Flower", "Whitewall"};
		final JComboBox comboBox_1 = new JComboBox(wheelOptions);
		comboBox_1.setBounds(494, 150, 211, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(494, 32, 56, 16);
		frame.getContentPane().add(lblColor);
		
		JLabel lblWheelType = new JLabel("Wheel type:");
		lblWheelType.setBounds(494, 121, 77, 16);
		frame.getContentPane().add(lblWheelType);
		
		final JToggleButton tglbtnSkirt = new JToggleButton("Skirt");
		tglbtnSkirt.setBounds(535, 244, 137, 25);
		frame.getContentPane().add(tglbtnSkirt);
		
		final JToggleButton tglbtnTinting = new JToggleButton("Tinting");
		tglbtnTinting.setBounds(535, 282, 137, 25);
		frame.getContentPane().add(tglbtnTinting);
		
		final JToggleButton tglbtnFlames = new JToggleButton("Flames");
		tglbtnFlames.setBounds(535, 320, 137, 25);
		frame.getContentPane().add(tglbtnFlames);
		
		final JToggleButton tglbtnAlgore = new JToggleButton("");
		tglbtnAlgore.setBounds(781, 452, 17, 16);
		frame.getContentPane().add(tglbtnAlgore);
		
		JButton btnGenerateCar = new JButton("Generate Dream Car");
		btnGenerateCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(tglbtnAlgore.isSelected()){
					Image algore = new ImageIcon(this.getClass().getResource("/al-gore.png")).getImage();
					alBody.setIcon(new ImageIcon(algore));
					frame.getContentPane().add(alBody);
					algorehasarrived++;
				}else{
					if(algorehasarrived >= 1){
						System.out.println("Once Al Gore has arrived, HE NEVER LEAVES.");
						algorehasarrived++;
					}
				}
				
				if(tglbtnSkirt.isSelected()){
					Image skirt = new ImageIcon(this.getClass().getResource("/skirt.png")).getImage();
					skirtBody.setIcon(new ImageIcon(skirt));
					frame.getContentPane().add(skirtBody);
				}else{
					frame.getContentPane().remove(skirtBody);
				}
				
				if(tglbtnTinting.isSelected()){
					Image tint = new ImageIcon(this.getClass().getResource("/tint.png")).getImage();
					tintBody.setIcon(new ImageIcon(tint));
					frame.getContentPane().add(tintBody);
				}else{
					frame.getContentPane().remove(tintBody);
				}
				
				if(tglbtnFlames.isSelected()){
					Image flames = new ImageIcon(this.getClass().getResource("/flames.png")).getImage();
					flamesBody.setIcon(new ImageIcon(flames));
					frame.getContentPane().add(flamesBody);
				}else{
					frame.getContentPane().remove(flamesBody);
				}
				
				Image wheel = new ImageIcon(this.getClass().getResource("/" + comboBox_1.getSelectedItem().toString().toLowerCase() + ".png")).getImage();
				wheels.setIcon(new ImageIcon(wheel));
				frame.getContentPane().add(wheels);
				
				Image car = new ImageIcon(this.getClass().getResource("/" + comboBox.getSelectedItem().toString().toLowerCase() + ".png")).getImage();
				carBody.setIcon(new ImageIcon(car));
				frame.getContentPane().add(carBody);
				
			}
		});
		btnGenerateCar.setBounds(240, 385, 151, 25);
		frame.getContentPane().add(btnGenerateCar);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().remove(skirtBody);
				frame.getContentPane().remove(flamesBody);
				frame.getContentPane().remove(tintBody);
				
				Image car = new ImageIcon(this.getClass().getResource("/8-spoked.png")).getImage();
				carBody.setIcon(new ImageIcon(car));
				frame.getContentPane().add(carBody);
				
				Image wheel = new ImageIcon(this.getClass().getResource("/red.png")).getImage();
				wheels.setIcon(new ImageIcon(wheel));
				frame.getContentPane().add(wheels);
			}
		});
		btnReset.setBounds(98, 385, 97, 25);
		frame.getContentPane().add(btnReset);
		
	}
}