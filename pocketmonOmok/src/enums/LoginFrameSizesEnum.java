package enums;

import java.awt.Dimension;
import java.awt.Toolkit;
// 태성(경로)

public enum LoginFrameSizesEnum {
	//전체화면 사이즈
	SCREEN_SIZE(Toolkit.getDefaultToolkit().getScreenSize()),
	
	//로그인 프레임 가로 길이
	LOGIN_FRAME_SIZE_WIDTH((int)(SCREEN_SIZE.getDimension().getWidth() * 0.67)),
	//로그인 프레임 세로 길이
	LOGIN_FRAME_SIZE_HEIGHT((int)(LOGIN_FRAME_SIZE_WIDTH.getSize() * 0.7)),

	//로그인 프레임의 X위치
	LOGIN_FRAME_POSITION_X((int)((SCREEN_SIZE.getDimension().getWidth() / 2) - (LOGIN_FRAME_SIZE_WIDTH.getSize() / 2))),
	//로그인 프레임의 Y위치
	LOGIN_FRAME_POSITION_Y((int)((SCREEN_SIZE.getDimension().getHeight() / 2)) - (LOGIN_FRAME_SIZE_HEIGHT.getSize() / 2)),	
	
	//ID이미지의 X위치
	LOGIN_RESOURCE_ID_POSITION_X((int)(LOGIN_FRAME_SIZE_WIDTH.getSize() * 0.37)),
	//ID이미지의 Y위치
	LOGIN_RESOURCE_ID_POSITION_Y((int)(LOGIN_FRAME_SIZE_HEIGHT.getSize() * 0.34)),
		
	//PW이미지의 X위치
	LOGIN_RESOURCE_PASSWORD_POSITION_X((int)(LOGIN_FRAME_SIZE_WIDTH.getSize() * 0.368)),
	//PW이미지의 Y위치
	LOGIN_RESOURCE_PASSWORD_POSITION_Y((int)(LOGIN_FRAME_SIZE_HEIGHT.getSize() * 0.40)),
	
	//로그인 이미지의 X위치
	LOGIN_RESOURCE_LOGIN_BUTTON_POSITION_X((int)(LOGIN_FRAME_SIZE_WIDTH.getSize() * 0.46)),
	//로그인 이미지의 Y위치
	LOGIN_RESOURCE_LOGIN_BUTTON_POSITION_Y((int)(LOGIN_FRAME_SIZE_HEIGHT.getSize() * 0.55)),
	
	//회원가입(sign up) 이미지의  X위치
	LOGIN_RESOURCE_JOIN_BUTTON_POSITION_X((int)(LOGIN_FRAME_SIZE_WIDTH.getSize() * 0.37)),
	//회원가입(sign up) 이미지의 Y위치
	LOGIN_RESOURCE_JOIN_BUTTON_POSITION_Y((int)(LOGIN_FRAME_SIZE_HEIGHT.getSize() * 0.49)),
	
	//아이디찾기(forgot ID) 이미지의 X위치
	LOGIN_RESOURCE_SEARCHID_BUTTON_POSITION_X((int)(LOGIN_FRAME_SIZE_WIDTH.getSize() * 0.455)),
	//아이디찾기(forgot ID) 이미지의 Y위치
	LOGIN_RESOURCE_SEARCHID_BUTTON_POSITION_Y((int)(LOGIN_FRAME_SIZE_HEIGHT.getSize() * 0.49)),
	
	//비밀번호찾기(forgot PW) 이미지의 X위치
	LOGIN_RESOURCE_SEARCHPW_BUTTON_POSITION_X((int)(LOGIN_FRAME_SIZE_WIDTH.getSize() * 0.54)),
	//비밀번호찾기(forgot PW) 이미지의 Y위치
	LOGIN_RESOURCE_SEARCHPW_BUTTON_POSITION_Y((int)(LOGIN_FRAME_SIZE_HEIGHT.getSize() * 0.49)),
	
	//아이디 입력창 필드의 X위치
	LOGIN_RESOURCE_ID_FIELD_POSITION_X((int)(LOGIN_FRAME_SIZE_WIDTH.getSize() * 0.44)),
	//아이디 입력창 필드의 Y위치
	LOGIN_RESOURCE_ID_FIELD_POSITION_Y((int)(LOGIN_FRAME_SIZE_HEIGHT.getSize() * 0.35)),
	
	//패스워드 입력창 필드의 X위치
	LOGIN_RESOURCE_PW_FIELD_POSITION_X((int)(LOGIN_FRAME_SIZE_WIDTH.getSize() * 0.44)),
	//패스워드 입력창 필드의 Y위치
	LOGIN_RESOURCE_PW_FIELD_POSITION_Y((int)(LOGIN_FRAME_SIZE_HEIGHT.getSize() * 0.41)),
	
	//로그인 화면창의  아이콘들의 가로 크기
	LOGIN_ICON_WIDTH((int)(LOGIN_FRAME_SIZE_WIDTH.getSize() * 0.07)),
	//로그인 화면창의 아이콘들의 세로 크기
	LOGIN_ICON_HEIGHT((int)(LOGIN_FRAME_SIZE_HEIGHT.getSize() * 0.08)),
	
	//ID, PW 이미지의 가로 크기
	SIZE_LABEL_WIDTH((int)(LOGIN_FRAME_SIZE_WIDTH.getSize() * 0.06)),
	//ID, PW 이미지의 세로 크기
	SIZE_LABEL_HEIGHT((int)(LOGIN_FRAME_SIZE_HEIGHT.getSize() * 0.05)),
	
	//ID, PW 입력창의 가로 크기
	SIZE_TEXT_WIDTH((int)(LOGIN_FRAME_SIZE_WIDTH.getSize() * 0.15)),
	//ID, PW 입력창의 세로 크기
	SIZE_TEXT_HEIGHT((int)(LOGIN_FRAME_SIZE_HEIGHT.getSize() * 0.035)),
	
	ICON_SIZE_WIDTH((int)(LOGIN_FRAME_SIZE_WIDTH.getSize() * 0.03)),
	ICON_SIZE_HEIGHT((int)(LOGIN_FRAME_SIZE_HEIGHT.getSize() * 0.13)),
	
	//============================================================================================
	
	LOGIN_ACCESS_SIZE_WIDTH((int)(SCREEN_SIZE.getDimension().getWidth() * 0.2)),
	LOGIN_ACCESS_SIZE_HEIGHT((int)(SCREEN_SIZE.getDimension().getHeight() * 0.27)),
	
	LOGIN_ACCESS_FRAME_POSITION_X((int)((SCREEN_SIZE.getDimension().getWidth() / 2) - (LOGIN_ACCESS_SIZE_WIDTH.getSize() / 2))),
	LOGIN_ACCESS_FRAME_POSITION_Y((int)((SCREEN_SIZE.getDimension().getHeight() / 2) - (LOGIN_ACCESS_SIZE_HEIGHT.getSize() / 2))),
	
	LOGIN_ACCESS_LABEL_WIDTH(300),
	LOGIN_ACCESS_LABEL_HEIGTH(100),
	
	LOGIN_ACCESS_LABEL_POSITION_X((int)(LOGIN_ACCESS_SIZE_WIDTH.getSize() / 4.2)),
	LOGIN_ACCESS_LABEL_POSITION_Y((int)(LOGIN_ACCESS_SIZE_HEIGHT.getSize() / 6)),
	
	LOGIN_ACCESS_OK_BUTTON_WIDTH(100),
	LOGIN_ACCESS_OK_BUTTON_HEIGHT(50),
	
	LOGIN_ACCESS_OK_BUTTON_POSITION_X((int)(LOGIN_ACCESS_SIZE_WIDTH.getSize() / 2.66)),
	LOGIN_ACCESS_OK_BUTTON_POSITION_Y((int)(LOGIN_ACCESS_SIZE_HEIGHT.getSize() / 2));
	
	private int size;

	private Dimension dimension;
	
	private LoginFrameSizesEnum() {}
	
	private LoginFrameSizesEnum(int x) {
		this.size = x;
	}
	
	private LoginFrameSizesEnum(Dimension dimension) {
		this.dimension = dimension;
	}
	
	public int getSize() {
		return size;
	}

	public Dimension getDimension() {
		return dimension;
	}
}
