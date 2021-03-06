package Command;

import java.util.List;

public class TurnItAllOff implements Command {

	List<ElectronicDevice> theDevices;
	
	public TurnItAllOff(List<ElectronicDevice> newDevice) {
		theDevices = newDevice;
	}
	
	@Override
	public void execute() {
		for (ElectronicDevice device : theDevices) {
			device.off();
		}
	}

	@Override
	public void undo() {
		for (ElectronicDevice device : theDevices) {
			device.on();
		}
	}
}
