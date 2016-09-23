package server.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import datasDTO.AbstractEnumsDTO;
import frames.BasicFrame;
// �������� �����ִ� �����͸� �о���̴� �༮.
public class ClientReciever extends Thread {
	private ClientAccept clientAccept;
	private ObjectInputStream clientIS;
	private BasicFrame basicFrame;
	
	public ClientReciever(ClientAccept accept, BasicFrame basicFrame) {
		this.clientAccept = accept;
		this.clientIS 	  = accept.getClientIS();
		this.basicFrame   = basicFrame;
	}
	
	@Override
	public void run() {
		boolean isAccept = true;
		try {
			while(isAccept) {
				Object object = this.clientIS.readObject();
				AbstractEnumsDTO userPosition = (AbstractEnumsDTO)object;
				switch(userPosition.getPosition()) {
				case POSITION_LOGIN :
					this.clientAccept.loginSuccessCheck(userPosition, this.basicFrame);
					break;
				case POSITION_WAITING_ROOM :
					System.out.println("waitingroom ���� �ɴϴ�.");
					this.clientAccept.waitingRoomAction(userPosition, this.basicFrame);
					break;
				case POSITION_JOIN :
					this.clientAccept.joinFrameInputAction(userPosition, this.basicFrame);
					break;
				case POSITION_FIND_ID :   
					break;
				case POSITION_FIND_PW :  
					break;
				case POSITION_GAME_ROOM :         
					break;
				case POSITION_STORE :             
					break;
				case POSITION_OTHER_USER_INFO :   
					break;
				case POSITION_MODIFY_MY_INFO :    
					break;
				case POSITION_EXIT :  
					this.clientAccept.gameExit();
					break;
				}
			}
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}