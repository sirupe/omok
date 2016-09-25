package frames.waitingRoom;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import enums.frames.GamePayRoomEnum;
import enums.frames.GameRoomCreateEnum;
import enums.frames.GameRoomFullEnum;
import enums.frames.SearchIdEnum;
import enums.frames.SearchRePwdEnum;

public class CreateGameRoomFrame extends JFrame {
	private JLabel createRoomNameLabel;
	private JLabel createRoomPwdLabel;
	
	private JTextField createRoomNameText;
	private JTextField createRoomPwdText;
		
	private JButton createRoomConfirmButton;
	private JButton createRoomCancelButton;
	
	private JRadioButton roomCreatePrivate;
	private JRadioButton roomCreateOpen;
	private ButtonGroup roomCreateGroup;
	
	private Image backGround;
	
	public CreateGameRoomFrame() throws IOException {
		//방이름, 방비밀번호 라벨 생성
		this.createRoomNameLabel = new JLabel("방이름");
		this.createRoomPwdLabel  = new JLabel("방비밀번호");
		
		//방이름, 방비밀번호 텍스트 생성
		this.createRoomNameText = new JTextField(10);
		this.createRoomPwdText  = new JTextField(10);
		
		//공개 비공개방 라디오 박스
		this.roomCreateGroup   = new ButtonGroup();
		this.roomCreatePrivate = new JRadioButton("공개방");
		this.roomCreateOpen    = new JRadioButton("비밀방");
		
		//버튼 생성
		//확인 버튼
		createRoomConfirmButton  = new JButton();
		createRoomConfirmButton.setBorderPainted(false);
		createRoomConfirmButton.setFocusPainted(false);
		createRoomConfirmButton.setContentAreaFilled(false);
		
		//취소 버튼
		createRoomCancelButton  = new JButton();
		createRoomCancelButton.setBorderPainted(false);
		createRoomCancelButton.setFocusPainted(false);
		createRoomCancelButton.setContentAreaFilled(false);
		
		
		
		//배경화면	
				backGround = ImageIO.read(new File("resources/background/popup.png")).getScaledInstance(
						SearchIdEnum.SEARCHFRAME_SIZE_WIDTH.getSize(),
						SearchIdEnum.SEARCHFRAME_SIZE_HEIGHT.getSize(),
		                Image.SCALE_SMOOTH);

				this.setContentPane(new JLabel(new ImageIcon(backGround)));
						
				this.setBounds(
						GameRoomCreateEnum.GAMEROOM_CREATE_FRAME_POSITION_X.getSize(),
						GameRoomCreateEnum.GAMEROOM_CREATE_FRAME_POSITION_Y.getSize(),
						GameRoomCreateEnum.GAMEROOM_CREATE_FRAME_SIZE_WIDTH.getSize(),
						GameRoomCreateEnum.GAMEROOM_CREATE_FRAME_SIZE_HEIGHT.getSize()
				);
				
		//레이블 폰트 -- searchIdEnum 에서 불러옴
		this.createRoomNameLabel.setFont(SearchIdEnum.LABELFONT_DEFAULT.getFont());	
		this.createRoomPwdLabel.setFont(SearchIdEnum.LABELFONT_DEFAULT.getFont());
		
		
		this.createRoomNameText.setFont(SearchIdEnum.LABELFONT_DEFAULT.getFont());
		this.createRoomPwdText.setFont(SearchIdEnum.LABELFONT_DEFAULT.getFont());
		
		this.roomCreateOpen.setFont(SearchIdEnum.LABELFONT_DEFAULT.getFont());
		this.roomCreatePrivate.setFont(SearchIdEnum.LABELFONT_DEFAULT.getFont());
		//레이블 색깔
		this.createRoomNameLabel.setForeground(Color.black);
		this.createRoomPwdLabel.setForeground(Color.black);
				
		this.setLabelPosition();
		this.setTextPosition();
		this.setButtonPosition();
		this.setRadioPosition();
		
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(false);
		
	}
	//========================================================================================================
	//라벨 위치
	public void setLabelPosition() {
		this.createRoomNameLabel.setBounds(GameRoomCreateEnum.GAMEROOM_CREATE_ROOM_NAME_LABEL.getRectangle());
		this.createRoomPwdLabel.setBounds(GameRoomCreateEnum.GAMEROOM_CREATE_ROOM_PWD_NAME_LABEL.getRectangle());
		
		this.add(createRoomPwdLabel);
		this.add(createRoomNameLabel);
	}
	
	//텍스트필드 위치
	public void setTextPosition() {
		this.createRoomNameText.setBounds(GameRoomCreateEnum.GAMEROOM_CREATE_ROOM_NAME_TEXT.getRectangle());
		this.createRoomPwdText.setBounds(GameRoomCreateEnum.GAMEROOM_CREATE_ROOM_PWD_TEXT.getRectangle());
		this.add(createRoomNameText);
		this.add(createRoomPwdText);
		
	}
	//========================================================================================================
	//확인, 취소 버튼 메소드
	public void setButtonPosition() throws IOException {
		//확인 버튼
		this.createRoomConfirmButton.setIconTextGap(this.createRoomConfirmButton.getIconTextGap() - 15);
    	this.createRoomConfirmButton.setIcon(
    			new ImageIcon(ImageIO.read(
    				new File("resources/signUp/confirm.jpg")).getScaledInstance(
    						GameRoomCreateEnum.GAMEROOM_CREATE_ROOM_CONFIRM_BUTTON.getRectangle().width,
    						GameRoomCreateEnum.GAMEROOM_CREATE_ROOM_CONFIRM_BUTTON.getRectangle().height,
    						Image.SCALE_AREA_AVERAGING))
    		);
    	this.createRoomConfirmButton.setBounds(GameRoomCreateEnum.GAMEROOM_CREATE_ROOM_CONFIRM_BUTTON.getRectangle());
    	
    //취소버튼
    	this.createRoomCancelButton.setIconTextGap(this.createRoomCancelButton.getIconTextGap() - 15);
    	this.createRoomCancelButton.setIcon(
    			new ImageIcon(ImageIO.read(
    				new File("resources/signUp/reset.jpg")).getScaledInstance(
    						GameRoomCreateEnum.GAMEROOM_CREATE_ROOM_CANCEL_BUTTON.getRectangle().width,
    						GameRoomCreateEnum.GAMEROOM_CREATE_ROOM_CANCEL_BUTTON.getRectangle().height,
    						Image.SCALE_AREA_AVERAGING))
    		);
    	this.createRoomCancelButton.setBounds(GameRoomCreateEnum.GAMEROOM_CREATE_ROOM_CANCEL_BUTTON.getRectangle());
    	
    	this.add(createRoomConfirmButton);
    	this.add(createRoomCancelButton);    	 
	}
	//========================================================================================================
	public void setRadioPosition() throws IOException {
		//공개방라디오 박스
    	this.roomCreateOpen.setBounds(GameRoomCreateEnum.GAMEROOM_CREATE_ROOM_OPEN_RADIO.getRectangle());
    	this.roomCreatePrivate.setBounds(GameRoomCreateEnum.GAMEROOM_CREATE_ROOM_PRIVATE_RADIO.getRectangle());
    	
    	
    	this.roomCreateOpen.setOpaque(false);
    	this.roomCreatePrivate.setOpaque(false);
    	this.add(roomCreatePrivate);
		this.add(roomCreateOpen);
	}
	//========================================================================================================
	public static void main(String[] args) throws IOException {
		new CreateGameRoomFrame();
	}
}
