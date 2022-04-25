package practiceMona;

public class Mona extends Octocat{
    //Attributes
    private String activity;

    //Constructor
    public Mona(){
        this.activity = null;
    }

    //Methods
    public String getActivity(){
        return activity;
    }

    public boolean validateString(String words){
        return words.matches("^[A-Za-z]\\w{5,29} $");
    }

    public boolean setActivity(String activity){
        if(!validateString(activity)){
            this.activity = activity;
            return true;
        }else
            return false;
    }

    public void display(String name, String activity){
        setName(name);
        setActivity(activity);

        System.out.println("\n" + "Name: " + getName());
        System.out.println("Activity : " + getActivity());
    }
}
