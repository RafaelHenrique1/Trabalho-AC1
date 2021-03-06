
package ac1.pokemon;

public class Pokemon {
    //atributos encapsulados 
    private String  nome; 
    private String  tipo;
    private int    level;
    private int     vida;
    private int   ataque;
    private int   defesa;    
    
//CONSTRUTOR 

    public Pokemon(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;     
        calculaAtributos();    
        calculaBonus();
        imprimePokemon();
    }


//metodos
        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    
    public void imprimePokemon(){
        System.out.println("Nome:   " + nome +   " | " +
                           "Tipo:   " + tipo +   " | " +
                           "Level:  " + level +  " | " +
                           "Vida:   " + vida +   " | " +
                           "Ataque: " + ataque + " | " +
                           "Defesa: " + defesa + " | "
        );       
    
    }
    
    public void calculaAtributos(){
       switch(this.tipo){                         
           case "Fogo":
            this.vida = 50;
            this.ataque = 100; 
            this.defesa = 40;
           break;
           
           case "Agua":
            this.vida = 70;
            this.ataque = 60;
            this.defesa = 50;
           break;          
           
           case "Planta":
            this.vida = 100;
            this.ataque = 30;
            this.defesa = 60;
           break;
           
           case "Ar":
            this.vida = 90;
            this.ataque = 50;
            this.defesa = 20;
           break;
           
           case "Eletrico":
            this.vida = 50;
            this.ataque = 70;
            this.defesa = 65; 
           break;                            
       }                       
    }      
    public void calculaBonus(){
     vida = vida + (level / 2);
     ataque = ataque + (level / 3);
     defesa = defesa + (level / 4);        
    }   
}
