package practiceMona;

public class Octocat{
    //Attributes
    private String name;

    //Constructor
    public Octocat(){
        this.name = null;
    }

    //Methods
    public String getName(){
        return name;
    }

    public boolean validateString(String words){
        return words.matches("^[A-Za-z]\\w{5,29} $");
    }

    public boolean setName(String name){
        if(!validateString(name)){
            this.name = name;
            return true;
        }else
            return false;
    }
}
