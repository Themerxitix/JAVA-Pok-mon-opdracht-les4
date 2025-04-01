//super
public class Pokemon
{
    private String name;
    private String type;

    //constructior
    public Pokemon(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    //methodes een
    public void eats()
    {
        System.out.println("Pokemon is eating!");
    }
    //methodes twee
    public String speaks()
    {
        return "Methode2:  even niets";
    }

    //getters en setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "Naam: " + name + ", type: " + type ;
    }
}
