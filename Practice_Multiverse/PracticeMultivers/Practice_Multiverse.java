package PracticeMultivers;

public class Practice_Multiverse{
    public static void main(String[] args) {
        SpiderMan Miles = new SpiderMan();
        SpiderMan Gwen = new SpiderMan();
        SpiderMan Superior = new SpiderMan();

        Miles.setRealName("Miles Morales");
        Miles.setAlias("Spider-Man");
        Miles.setUniverse("Earth-1610");

        System.out.println("\nName: " + Miles.getRealName() + "\nAlias: " +
                Miles.getAlias() + "\nUniverse: " + Miles.getUniverse() +
                "\nSpecial Attack: " + Miles.specialAttack("Bioelectric Instincts"));

        Gwen.setRealName("Gwendolyne Maxine Stacy");
        Gwen.setAlias("Ghost-Spider");
        Gwen.setUniverse("Earth-65");

        System.out.println("\nName: " + Gwen.getRealName() + "\nAlias: " +
                Gwen.getAlias() + "\nUniverse: " + Gwen.getUniverse() +
                "\nSpecial Attack: " + Gwen.specialAttack("Spider Senses, Tingling"));

        Superior.setRealName("Otto Gunther Octavius");
        Superior.setAlias("Superior Spider-Man");
        Superior.setUniverse("Earth-616");

        System.out.println("\nName: " + Superior.getRealName() + "\nAlias: " +
                Superior.getAlias() + "\nUniverse: " + Superior.getUniverse() +
                "\nSpecial Attack: " + Superior.specialAttack("Stealth"));
    }
}