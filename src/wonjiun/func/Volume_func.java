package wonjiun.func;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import wonjiun.NumDTO;

public class Volume_func {
	
private Parent root;
private NumDTO dto = new NumDTO();
private Label lbl;
private Power_func power = new Power_func();
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void volumeUp() {
		lbl = (Label)root.lookup("#lblVol");
		
		if(power.powerStatus() == 1) {
			int num = dto.getVol();
			
			if(dto.getVol() >= 20) {
				dto.setVol(20);
				message("더는 올릴 수 없습니다");
			}else {
				num++;
				dto.setVol(num);
				lbl.setText(dto.getVol() + "");
				message("");
			}	
		}else {
			message("전원이 꺼진 상태에서는 볼륨조절을 할 수 없습니다");
		}
	}
	public void volumeDown() {
		lbl = (Label)root.lookup("#lblVol");
		
		if(power.powerStatus() == 1) {
			int num = dto.getVol();
			
			if(dto.getVol() <= 0) {
				dto.setVol(0);
				message("더는 내릴 수 없습니다");
			}else {
				num--;
				dto.setVol(num);
				lbl.setText(dto.getVol() + "");
				message("");
			}	
		}else {
			message("전원이 꺼진 상태에서는 볼륨조절을 할 수 없습니다");
		}
	}
	public void volumeZero() {
		lbl = (Label)root.lookup("#lblVol");
		
		if(power.powerStatus() == 1) {
			dto.setVol(0);
			lbl.setText("0");
			message("음소거 되었습니다");
			
		}else {
			message("전원이 꺼진 상태에서는 볼륨조절을 할 수 없습니다");
		}
	}
	
	public void message(String msg) {
		Label message = (Label)root.lookup("#msg");
		message.setText(msg);
	}
}
