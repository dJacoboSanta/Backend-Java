package PracticeMultivers;

public class SpiderMan implements Attack {
    //Attributes
    private String realName;
    private String alias;
    private String universe;

    //Constructor
    public SpiderMan() {
    }

    //Methods
    public String getRealName() {
        return realName;
    }

    public String getAlias() {
        return alias;
    }

    public String getUniverse() {
        return universe;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setAlias(String alias) {
            this.alias = alias;
    }

    public void setUniverse(String universe) {
            this.universe = universe;
    }

    public String specialAttack(String attack) {
        if (!" ".equals(attack)) {
            return attack;
        }else
            return null;
    }
}
