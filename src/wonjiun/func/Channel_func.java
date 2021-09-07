package wonjiun.func;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import wonjiun.NumDTO;

public class Channel_func {
	
private Parent root;
private NumDTO dto = new NumDTO();
private Label lbl;
private Power_func power = new Power_func();

	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void channelUp() {
		lbl = (Label)root.lookup("#lblChan");
		
		if(power.powerStatus() == 1) {
			int num = dto.getChan();
			
			if(dto.getChan() >= 20) {
				dto.setChan(20);
				message("더는 올릴 수 없습니다");
			}else {
				num++;
				dto.setChan(num);
				lbl.setText(dto.getChan() + "");
				message("");
			}	
		}else {
			message("전원이 꺼진 상태에서는 채널조절을 할 수 없습니다");
		}
	
	}
	
	public void channelDown() {
		lbl = (Label)root.lookup("#lblChan");
		
		if(power.powerStatus() == 1) {
			int num = dto.getChan();
			
			if(dto.getChan() <= 1) {
				dto.setChan(1);
				message("더는 내릴 수 없습니다");
			}else {
				num--;
				dto.setChan(num);
				lbl.setText(dto.getChan() + "");
				message("");
			}
		}else {
			message("전원이 꺼진 상태에서는 채널조절을 할 수 없습니다");
		}
	}
	
	public void message(String msg) {
		Label message = (Label)root.lookup("#msg");
		message.setText(msg);
	}
}
