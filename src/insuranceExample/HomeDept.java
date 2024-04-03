package insuranceExample;

public class HomeDept extends Department {

    

    public HomeDept() {
        super("Home claim department");
    }

    @Override
    public boolean canAccept(Claim claim) {
        return claim.isHome();
    }
    
}
