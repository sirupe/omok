package frames;


import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import enums.GameRoomEnum;
import enums.searchPwdEnum;
import enums.searchRePwdEnum;

@SuppressWarnings("serial")
public class SearchRePwdPanel extends JPanel {
	private JPanel searchPwdPanel;
	private Image backGround;

	public void SearchRePwdPanel() throws IOException {
		this.setLayout(null);
		
		this.searchPwdPanel   = new JPanel();
		
		this.setsearchPwdPanel();
	} //������
	
	// �г� ���� -- ��й�ȣ �Է�, ���й�ȣ �Է� �ؽ�Ʈ
	public void setsearchPwdPanel() throws IOException {

		this.searchPwdPanel.setLayout(null);
		this.searchPwdPanel.setOpaque(false);
		
		// �г��� ����̹���
		backGround = ImageIO.read(new File("resources/signUp/backg.png")).getScaledInstance(
				searchPwdEnum.SEARCH_PWD_FRAME_WIDTH.getSize(),
				searchPwdEnum.SEARCH_PWD_FRAME_HEIGHT.getSize(),
                Image.SCALE_SMOOTH);
		this.add(new JLabel(new ImageIcon(backGround)));
		//this.setContentPane(new JLabel(new ImageIcon(backGround))); 

		this.setBounds(
				searchRePwdEnum.SEARCH_REPWD_FRAME_POSITION_X.getSize(),
				searchRePwdEnum.SEARCH_REPWD_FRAME_POSITION_Y.getSize(),
				searchRePwdEnum.SEARCH_REPWD_FRAME_WIDTH.getSize(),
				searchRePwdEnum.SEARCH_REPWD_FRAME_HEIGHT.getSize()
				);
		//��й�ȣ ��
		JLabel searchPwdLabel = new JLabel("PW");
		searchPwdLabel.setBounds(searchRePwdEnum.SEARCH_PWD_LABEL.getRectangle());
		searchPwdLabel.setFont(searchRePwdEnum.LABELFONT_DEFAULT.getFont());
		
		//��й�ȣ �Է�â
		JTextField searchPwdText = new JTextField();
		searchPwdText.setBounds(searchRePwdEnum.SEARCH_PWD_TEXTFIELD.getRectangle());
		searchPwdText.setBorder(searchRePwdEnum.LABEL_DEFAULT.getBorder());
		searchPwdText.setFont(searchRePwdEnum.LABELFONT_DEFAULT.getFont());

		// ���й�ȣ ��
		JLabel searchRePwdLabel = new JLabel("PW���Է�");
		searchRePwdLabel.setBounds(searchRePwdEnum.SEARCH_REPWD_LABEL.getRectangle());
		searchRePwdLabel.setFont(searchRePwdEnum.LABELFONT_DEFAULT.getFont());
		
		// ����й�ȣ �ؽ�Ʈâ
		JTextField searchRePwdText = new JTextField();
		searchRePwdText.setBounds(searchRePwdEnum.SEARCH_REPWD_TEXTFIELD.getRectangle());
		searchRePwdText.setBorder(searchRePwdEnum.LABEL_DEFAULT.getBorder());
		searchRePwdText.setFont(searchRePwdEnum.LABELFONT_DEFAULT.getFont());
		
		// ���� �޼��� ��
		JLabel searchRePwdErrorLabel = new JLabel
				("<html>��й�ȣ�� ��ġ���� �ʽ��ϴ�. "
				+ "<br>�ٽ� �Է����ּ���<br></html>");
		searchRePwdErrorLabel.setBounds(searchRePwdEnum.SEARCH_ERROR_LABEL.getRectangle());
		searchRePwdErrorLabel.setBorder(searchRePwdEnum.LABEL_DEFAULT.getBorder());
		searchRePwdErrorLabel.setFont(searchRePwdEnum.LABELFONT_DEFAULT.getFont());
		
		//Ȯ�� ��ưâ
		JButton searchConfirmButton = new JButton() {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			try {
				g.drawImage(ImageIO.read(
					new File("resources/signUp/confirm.jpg")), 
					0, 
					0, 
					searchRePwdEnum.SEARCH_CONFIRM_BUTTON.getRectangle().width,
					searchRePwdEnum.SEARCH_CONFIRM_BUTTON.getRectangle().height,
					this);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	};	
		this.searchPwdPanel.add(searchPwdLabel);
		this.searchPwdPanel.add(searchRePwdText);
		this.searchPwdPanel.add(searchPwdText);
		this.searchPwdPanel.add(searchRePwdLabel);
		this.searchPwdPanel.add(searchRePwdErrorLabel);
		this.searchPwdPanel.add(searchConfirmButton);
		
	
	}
	
}