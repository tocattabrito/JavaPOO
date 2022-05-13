public class App {
    public static void main(String[] args) throws Exception {
        
        Personagem heroi = new Personagem();
        heroi.nome = "Hercules";
        heroi.nivel = 2;
        heroi.forca = 16;

        // // "Personagem: <nome> (lvl <nivel>) com <forca> de força."

        // System.out.format("Personagem: %s (lvl %d) com %d de força.", heroi.nome, heroi.nivel, heroi.forca);

        heroi.mostarStatus();

        // Foi chamado o método atacar e passado como argumento uma String "Hydra"
        heroi.atacar("Hydra", "Golpe Duplo");
    }
}
