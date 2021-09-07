package wonjiun.func;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import wonjiun.NumDTO;

public class Power_func {
	
	private Parent root;
	private NumDTO dto;
	public Label lblPower = null;
	public Label lblChan = null;
	public Label lblVol = null;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void powerOn() {
		dto = new NumDTO();
		dto.setPower("ON");
		
		lblPower = (Label)root.lookup("#lblPower");
		lblPower.setText("ON");
		
		lblChan = (Label)root.lookup("#lblChan");
		lblChan.setText(dto.getChan() + "");
		
		lblVol = (Label)root.lookup("#lblVol");
		lblVol.setText(dto.getVol()+"");
		
	}
	public void powerOff() {
		dto = new NumDTO();
		dto.setPower("OFF");
		
		lblPower = (Label)root.lookup("#lblPower");
		lblPower.setText("OFF");
	
		
		lblChan = (Label)root.lookup("#lblChan");
		lblChan.setText("");
		
		lblVol = (Label)root.lookup("#lblVol");
		lblVol.setText("");
		
		message("");
	}
	
	public int powerStatus() {
		dto = new NumDTO();
		
		if(dto.getPower().equals("ON")) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public void message(String msg) {
		Label message = (Label)root.lookup("#msg");
		message.setText(msg);
	}
}
