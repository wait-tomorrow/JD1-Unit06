package by.tc.task01.entity;

public class TabletPC extends Appliance {
    private double batteryCapacity;
    private double displayInchs;
    private double memoryRom;
    private double flashMemoryCapacity;
    private String color;

    public TabletPC(String name, double batteryCapacity, double displayInchs, double memoryRom,
	    double flashMemoryCapacity, String color) {
	super(name);
	this.batteryCapacity = batteryCapacity;
	this.displayInchs = displayInchs;
	this.memoryRom = memoryRom;
	this.flashMemoryCapacity = flashMemoryCapacity;
	this.color = color;
    }

    public double getBatteryCapacity() {
	return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
	this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInchs() {
	return displayInchs;
    }

    public void setDisplayInchs(double displayInchs) {
	this.displayInchs = displayInchs;
    }

    public double getMemoryRom() {
	return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
	this.memoryRom = memoryRom;
    }

    public double getFlashMemoryCapacity() {
	return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
	this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
	return color;
    }

    public void setColor(String color) {
	this.color = color;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	long temp;
	temp = Double.doubleToLongBits(batteryCapacity);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((color == null) ? 0 : color.hashCode());
	temp = Double.doubleToLongBits(displayInchs);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(flashMemoryCapacity);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(memoryRom);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!super.equals(obj))
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	TabletPC other = (TabletPC) obj;
	if (Double.doubleToLongBits(batteryCapacity) != Double.doubleToLongBits(other.batteryCapacity))
	    return false;
	if (color == null) {
	    if (other.color != null)
		return false;
	} else if (!color.equals(other.color))
	    return false;
	if (Double.doubleToLongBits(displayInchs) != Double.doubleToLongBits(other.displayInchs))
	    return false;
	if (Double.doubleToLongBits(flashMemoryCapacity) != Double.doubleToLongBits(other.flashMemoryCapacity))
	    return false;
	if (Double.doubleToLongBits(memoryRom) != Double.doubleToLongBits(other.memoryRom))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInchs=" + displayInchs + ", memoryRom="
		+ memoryRom + ", flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + "]";
    }
}