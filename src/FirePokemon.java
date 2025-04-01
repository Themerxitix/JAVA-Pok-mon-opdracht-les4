public class FirePokemon extends Pokemon
{
    private int hp;
    private String attack;

    //constructor, gedeeltelijk overgeerfd van Pokemon super class
    public FirePokemon(String name, String type, int hp, String attack)
    {
        super(name, type);
        this.hp = hp;
        this.attack = attack;
    }

    //methode die aansluit bij eigenschappen FirePokemon, dus de soort attack
    public void flameThrower()
    {
        System.out.println("flameThrowe: I throw flameThrowe");
    }

    //methode die aansluit bij eigenschappen FirePokemon, dus de soort attack
    public void fireLash()
    {
        System.out.println("fireLash: I throw fireLash");
    }

    //getters en setter
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

    //override toString

    @Override
    public String toString() {
        return "Name: "+ getName()+"\t "+ "Type: "+ getType()+"\t "+ "health points: " + hp + "\t "+"attack: " + attack;
    }
}
