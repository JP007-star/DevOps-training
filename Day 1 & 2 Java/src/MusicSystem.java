public class MusicSystem {
    private String msName;
    private int noOfSpeakers;
    private boolean subwoofers;
    private int lcdScreenSize;

    public MusicSystem(String msName, int noOfSpeakers, boolean subwoofers, int lcdScreenSize) {
        this.msName = msName;
        this.noOfSpeakers = noOfSpeakers;
        this.subwoofers = subwoofers;
        this.lcdScreenSize = lcdScreenSize;
    }

    public String getMsName() {
        return msName;
    }

    public void setMsName(String msName) {
        this.msName = msName;
    }

    public int getNoOfSpeakers() {
        return noOfSpeakers;
    }

    public void setNoOfSpeakers(int noOfSpeakers) {
        this.noOfSpeakers = noOfSpeakers;
    }

    public boolean isSubwoofers() {
        return subwoofers;
    }

    public void setSubwoofers(boolean subwoofers) {
        this.subwoofers = subwoofers;
    }

    public int getLcdScreenSize() {
        return lcdScreenSize;
    }

    public void setLcdScreenSize(int lcdScreenSize) {
        this.lcdScreenSize = lcdScreenSize;
    }
}
