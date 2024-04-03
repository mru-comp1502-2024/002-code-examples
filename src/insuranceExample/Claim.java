package insuranceExample;

public class Claim {
    
    private boolean isHome;
    private boolean isAuto;
    private boolean isRecent;
    
    public Claim(boolean isHome, boolean isAuto, boolean isRecent) {
        this.isHome = isHome;
        this.isAuto = isAuto;
        this.isRecent = isRecent;
    }

    @Override
    public String toString() {
        return "Claim [isHome=" + isHome + ", isAuto=" + isAuto + ", isRecent=" + isRecent + "]";
    }

    public boolean isHome() {
        return isHome;
    }

    public boolean isAuto() {
        return isAuto;
    }

    public boolean isRecent() {
        return isRecent;
    }

    
}
