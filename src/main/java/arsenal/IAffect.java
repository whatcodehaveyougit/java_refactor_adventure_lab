package arsenal;

public class IAffect {

    private String implement;
    private int affect;

    public IAffect(String implement, int affect){
        this.implement= implement;
        this.affect = affect;
    }

    public String getImplement() {
        return implement;
    }

    public int getIAffectAmount() {
        return this.affect;
    }

}
