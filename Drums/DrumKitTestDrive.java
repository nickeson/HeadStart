class DrumKitTestDrive {

	public static void main(String[] args) {
		// create instance of DrumKit named 'd' and do stuff with it
		DrumKit d = new DrumKit();

		// set state of snare field in DrumKit instance
		d.snare = false;

		if (d.snare == true) {
			d.playSnare();
		}

		// call methods from DrumKit instance
		d.playSnare();
		d.playTopHat();
	}
}
