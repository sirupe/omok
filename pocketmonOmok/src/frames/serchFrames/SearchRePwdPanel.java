package frames.serchFrames;


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

import enums.frames.GameRoomEnum;
import enums.frames.searchIdEnum;
import enums.frames.searchPwdEnum;
import enums.frames.searchRePwdEnum;

@SuppressWarnings("serial")
public class SearchRePwdPanel extends JPanel {
	private JPanel searchRePwdPanel;
	private Image backGround;
	
	private JLabel searchPwdLabel;
	private JLabel searchRePwdLabel;
	private JTextField searchPwdText;
	private JTextField searchRePwdText;
	private JLabel searchRePwdErrorLabel;
	private JButton searchConfirmButton;

	public SearchRePwdPanel() throws IOException {
		this.setLayout(null);

		this.setsearchPwdPanel();
		
	} //생성자
	// 패널 생성 -- 비밀번호 입력, 재비밀번호 입력 텍스트
	public void setsearchPwdPanel() throws IOException {
		
		// 패널의 배경이미지
		backGround = ImageIO.read(new File("resources/background/popup.png")).getScaledInstance(
				searchPwdEnum.SEARCH_PWD_FRAME_WIDTH.getSize(),
				searchPwdEnum.SEARCH_PWD_FRAME_HEIGHT.getSize(),
                Image.SCALE_SMOOTH);
		this.add(new JLabel(new ImageIcon(backGround)));

		this.setBounds(
				searchRePwdEnum.SEARCH_REPWD_FRAME_POSITION_X.getSize(),
				searchRePwdEnum.SEARCH_REPWD_FRAME_POSITION_Y.getSize(),
				searchRePwdEnum.SEARCH_REPWD_FRAME_WIDTH.getSize(),
				searchRePwdEnum.SEARCH_REPWD_FRAME_HEIGHT.getSize()
				);
		//비밀번호 라벨
		
		this.searchPwdLabel = new JLabel("PW");
		this.searchPwdLabel.setBounds(searchRePwdEnum.SEARCH_PWD_LABEL.getRectangle());
		this.searchPwdLabel.setFont(searchIdEnum.LABELFONT_DEFAULT.getFont());
		
		//비밀번호 입력창
		this.searchPwdText = new JTextField();
		this.searchPwdText.setBounds(searchRePwdEnum.SEARCH_PWD_TEXTFIELD.getRectangle());
		this.searchPwdText.setFont(searchIdEnum.LABELFONT_DEFAULT.getFont());

		// 재비밀번호 라벨
		this.searchRePwdLabel = new JLabel("PW재입력");
		this.searchRePwdLabel.setBounds(searchRePwdEnum.SEARCH_REPWD_LABEL.getRectangle());
		this.searchRePwdLabel.setFont(searchIdEnum.LABELFONT_DEFAULT.getFont());
		
		// 제비밀번호 텍스트창
		this.searchRePwdText = new JTextField();
		this.searchRePwdText.setBounds(searchRePwdEnum.SEARCH_REPWD_TEXTFIELD.getRectangle());
		this.searchRePwdText.setFont(searchIdEnum.LABELFONT_DEFAULT.getFont());
		
		// 에러 메세지 라벨
		this.searchRePwdErrorLabel = new JLabel
				("<html>비밀번호가 일치하지 않습니다. "
				+ "<br>다시 입력해주세요<br></html>");
		searchRePwdErrorLabel.setBounds(searchRePwdEnum.SEARCH_ERROR_LABEL.getRectangle());
		searchRePwdErrorLabel.setFont(searchIdEnum.LABELFONT_ERROR.getFont());
		searchRePwdErrorLabel.setForeground(searchIdEnum.LABELCOLOR_ERROR.getColor());
		//확인 버튼창
		
		this.searchConfirmButton = new JButton() {
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
		this.searchConfirmButton.setBounds(searchRePwdEnum.SEARCH_CONFIRM_BUTTON.getRectangle());
//				
		this.add(searchPwdLabel);
		this.add(searchRePwdText);
		this.add(searchPwdText);
		this.add(searchRePwdLabel);
		this.add(searchRePwdErrorLabel);
		this.add(searchConfirmButton);
	}
}
