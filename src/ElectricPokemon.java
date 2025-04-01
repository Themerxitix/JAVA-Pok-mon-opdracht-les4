public class ElectricPokemon extends Pokemon
{

    private int hp;
    private String attack;

    //constructor, gedeeltelijk overgeerfd van Pokemon super class
    public ElectricPokemon(String name, String type, int hp, String attack)
    {
        super(name, type);
        this.hp = hp;
        this.attack = attack;
    }

    //methode die aansluit bij eigenschappen WaterPokemon, dus de soort attack
    public void thunderPunch()
    {
        System.out.println("thunderPunch: I throw thunderPunch");
    }
    //methode die aansluit bij eigenschappen WaterPokemon, dus de soort attack
    public void electroBall()
    {
        System.out.println("electroBall: I throw electroBall");
    }

    //getters en setter voor hp en attack
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Name: "+ getName()+"\t "+ "Type: "+ getType()+"\t "+ "health points: " + hp + "\t "+"attack: " + attack;
    }
}
