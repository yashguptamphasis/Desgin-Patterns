package builder;

public class PhoneBuilder {
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	String os;
	int ram;
	String processor;
	double screenSize;
	int battery;

	public Phone getPhone()
	{
		return new Phone(os, ram, processor, screenSize, battery);
	}
}
