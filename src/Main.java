public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welkom, in Pokemon wereld!");
        System.out.println();

        //Maak eerst een FirePokemon aan
        Pokemon pokemon = new Pokemon("Pokemon", "Pokemon");
        //pokemon wordt uitgeprint m.b.c tostring methode @override
        System.out.println(pokemon);
        //methode eat wordt aangeroepen
        pokemon.eats();
        System.out.println();

        //maak een type FirePokemon
        FirePokemon firePokemon = new FirePokemon("firePokemon1", "FirePokemon", 200, "Fire");
        System.out.println(firePokemon);
        //methode wordt aangeroepen
        firePokemon.flameThrower();
        System.out.println();

        //maak een type WaterPokemon
        WaterPokemon waterPokemon = new WaterPokemon("waterPokemon1", "WaterPokemon", 200, "Water");
        System.out.println(waterPokemon);
        //methode wordt aangeroepen
        waterPokemon.hydroCannon();
        System.out.println();

        //maak een type GrassPokemon
        GrassPokemon grassPokemon = new GrassPokemon("grassPokemon1", "GrassPokemon", 200, "Grass");
        System.out.println(grassPokemon);
        //methode wordt aangeroepen
        grassPokemon.leafStorm();
        System.out.println();

        //maak een type ElectricPokemon
        ElectricPokemon electricPokemon = new ElectricPokemon("electricPokemon1", "ElectricPokemon", 200, "Electric");
        System.out.println(electricPokemon);
        //methode wordt aangeroepen
        electricPokemon.electroBall();
        System.out.println();




    }
}
