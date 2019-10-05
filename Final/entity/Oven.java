package by.tc.task01.entity;

public class Oven extends Appliance {
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven(String name, double powerConsumption, double weight, double capacity, double depth, double height,
	    double width) {
	super(name);
	this.powerConsumption = powerConsumption;
	this.weight = weight;
	this.capacity = capacity;
	this.depth = depth;
	this.height = height;
	this.width = width;
    }

    public double getPowerConsumption() {
	return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
	this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
	return weight;
    }

    public void setWeight(double weight) {
	this.weight = weight;
    }

    public double getCapacity() {
	return capacity;
    }

    public void setCapacity(double capacity) {
	this.capacity = capacity;
    }

    public double getDepth() {
	return depth;
    }

    public void setDepth(double depth) {
	this.depth = depth;
    }

    public double getHeight() {
	return height;
    }

    public void setHeight(double height) {
	this.height = height;
    }

    public double getWidth() {
	return width;
    }

    public void setWidth(double width) {
	this.width = width;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	long temp;
	temp = Double.doubleToLongBits(capacity);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(depth);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(height);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(powerConsumption);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(weight);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(width);
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
	Oven other = (Oven) obj;
	if (Double.doubleToLongBits(capacity) != Double.doubleToLongBits(other.capacity))
	    return false;
	if (Double.doubleToLongBits(depth) != Double.doubleToLongBits(other.depth))
	    return false;
	if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
	    return false;
	if (Double.doubleToLongBits(powerConsumption) != Double.doubleToLongBits(other.powerConsumption))
	    return false;
	if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
	    return false;
	if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Oven [powerConsumption=" + powerConsumption + ", weight=" + weight + ", capacity=" + capacity
		+ ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
    }
}