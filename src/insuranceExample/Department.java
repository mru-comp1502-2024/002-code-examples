package insuranceExample;

public abstract class Department {

    private String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department [name=" + name + "]";
    }

    public abstract boolean canAccept(Claim claim);
    
}
