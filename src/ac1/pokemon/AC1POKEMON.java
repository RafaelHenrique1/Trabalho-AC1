
package ac1.pokemon;
 
public class AC1POKEMON {
     public static void main(String[] args) {
      //instancia um objeto do tipo Pokemon
    
      Pokemon pokemon1 = new Pokemon("Charmander","Fogo",50);
      Pokemon pokemon2 = new Pokemon("Pikachu","Eletrico",50);
      Pokemon pokemon3 = new Pokemon("Bulbasaur","Planta",70);
      
      int vidaPokemon1 = pokemon1.getVida();
      int vidaPokemon2 = pokemon2.getVida();
  
      if(vidaPokemon1 > vidaPokemon2){
       System.out.println(pokemon1.getNome() + " venceu");      
      }else{
          System.out.println(pokemon2.getNome() + " venceu");
      }      
    }   
  
}