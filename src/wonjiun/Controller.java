package wonjiun;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.stage.Stage;
import wonjiun.func.Channel_func;
import wonjiun.func.Power_func;
import wonjiun.func.Volume_func;

public class Controller implements Initializable {
	
	private Parent root;
	private Power_func power;
	private Volume_func vol;
	private Channel_func chan;
	
	public void setRoot(Parent root) {
		this.root = root;
		power.setRoot(root);
		vol.setRoot(root);
		chan.setRoot(root);
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		power = new Power_func();
		vol = new Volume_func();
		chan = new Channel_func();
	}
	
	public void PowerOn() {
		power.powerOn();
	}
	public void PowerOff() {
		power.powerOff();
	}
	public void ChannelUp() {
		chan.channelUp();
	}
	public void ChannelDown() {
		chan.channelDown();
	}
	public void VolumeUp() {
		vol.volumeUp();
	}
	public void VolumeDown() {
		vol.volumeDown();
	}
	public void VolumeZero() {
		vol.volumeZero();
	}
	public void Close() {
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
	}
	

}
