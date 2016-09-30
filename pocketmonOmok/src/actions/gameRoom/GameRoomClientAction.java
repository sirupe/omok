package actions.gameRoom;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import actions.adapters.Adapters;
import frames.gameRoom.GameRoomPanel;

public class GameRoomClientAction extends Adapters {
	private GameRoomPanel gameRoomPanel;
	private boolean isReadyCheck;
	private boolean isStartCheck;
	
	public GameRoomClientAction(GameRoomPanel gameRoomPanel) {
		this.gameRoomPanel = gameRoomPanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.gameRoomPanel.chattingInfoSendServer();
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		JButton button = (JButton)e.getSource();
		this.gameRoomPanel.changeButtonColorImage(button.getName());
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		JButton button = (JButton)e.getSource();
		this.gameRoomPanel.changeButtonGrayImage(button.getName());
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("클릭클릭!!");
		JButton button = (JButton)e.getSource();
		// 게스트가 레디를 누르면 게스트 레디 버튼의 이미지를 바꿔주고 사용자가 레디를 눌렀다고 서버에 전송한다.
		if(button.getName().equals("ready")) {
			this.gameRoomPanel.changeGameReadyButton();
		}

	}
}
