package practicaHarry;

public class Character {
    private String house;
    private String gender;
    private String name;
    private String boggart;
    private String patronus;

    public String getHouse() { return house; }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getBoggart() {
        return boggart;
    }

    public String getPatronus() {
        return patronus;
    }

    public boolean validarString(String chain){
        return chain.matches("^[A-Za-z]\\w{5,29} $");
    }

    public boolean setHouse(String house) {
        if(!validarString(house)){
            this.house = house;
            return true;
        }else
            return false;
    }

    public boolean setGender(String gender) {
        if(!validarString(gender)){
            this.gender = gender;
            return true;
        }else
            return false;
    }

    public boolean setName(String name) {
        if(!validarString(name)){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart) {
        if(!validarString(boggart)){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus) {
        if(!validarString(patronus)){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }
}
