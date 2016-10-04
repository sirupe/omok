package actions.modifyMyInfo;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

import actions.adapters.Adapters;
import frames.modifyMyInfo.ModifyMyInfoFrame;

public class ModifyMyInfoAction extends Adapters {
	private ModifyMyInfoFrame modifyFrame;
	public ModifyMyInfoAction(ModifyMyInfoFrame modifyFrame) {
		this.modifyFrame = modifyFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonName = ((JButton)e.getSource()).getName();
		
		switch(buttonName) {
		case "cancelButton" :
			this.modifyFrame.clickCancelButton();
			break;
		case "modifyButton" :
			System.out.println("이 버튼이 아닌거여 ?");
			this.modifyFrame.confirmButtonCheck();
			break;
		case "dropoutButton" :
			this.modifyFrame.clickDropButton();
			break;
		case "confirm" :
			this.modifyFrame.getCorrectPwdFrame().confirmButtonClick();
			break;
		case "reset" :
			break;
			
		}
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		this.modifyFrame.close();
	}
}
