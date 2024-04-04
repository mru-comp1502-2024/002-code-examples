package insuranceExample;

public class FraudDept extends Department {

    
    public FraudDept() {
        super("Fraud investigation department");
    }

    @Override
    public boolean canAccept(Claim claim) {
        return claim.isRecent();
    }
  
    
}
