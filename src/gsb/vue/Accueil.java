package gsb.vue;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class Accueil extends JInternalFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JPanel p;
    protected JPanel pImage;

    public Accueil() {
        p = new JPanel(new BorderLayout());  // Use BorderLayout for the main panel

        // Load your image (replace "logo-gsb.png" with the actual filename and adjust the path)
        ImageIcon imageIcon = new ImageIcon("src/gsb/vue/logo-gsb.png");

        // Create a JLabel to display the image
        JLabel imageLabel = new JLabel(imageIcon);
        
        // Add the image label to the center of the main panel
        p.add(imageLabel, BorderLayout.CENTER);

        // Set the main panel as the content pane
        setContentPane(p);

        // Set other properties for the internal frame if needed
        this.setTitle("Accueil");
        this.setSize(800, 600);
        this.setClosable(true);
        this.setResizable(true);
        this.setMaximizable(true);
        this.setIconifiable(true);

        // Set the position of the internal frame to appear at the center of the desktopPane
        Dimension desktopSize = MenuPrincipal.desktopPane.getSize();
        Dimension frameSize = this.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        this.setLocation(x, y);

        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
}
