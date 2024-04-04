package insuranceExample;

public class AutoDept extends Department {

    

    public AutoDept() {
        super("Auto claims dept");
    }

    @Override
    public boolean canAccept(Claim claim) {
        return claim.isAuto() && !claim.isHome() && !claim.isRecent();
    }

    
    
}
