public class Notebook {
    private int ram;
    private int hddSize;
    private String os;
    private String color;
    private String manufacturer;

    @Override
    public String toString() {
        return manufacturer + "{" + "ram=" + ram + ", " + "HDD=" + hddSize + ", " + "os=" + os + ", " + "color=" + color + "}";
    }

    public Notebook(int ram, int hddSize, String os, String color, String manufacturer) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.os = os;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    public int getRam() {
        return ram;
    }

    public int getHddSize() {
        return hddSize;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
