import java.util.Random;

public class Personagem {

  String nome;
  int nivel;
  int forca;

  // Metódo void não tem retorno.
  void mostarStatus() {
    
    System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);
  }

  // O método ira gerar números aleatorios atráves do objeto Random()
  int calcularDano () {
    Random gerador = new Random();
    // 1... 20
    // nextInt(): 0... 19
    // nextInt(): 0 = 20
    int dado20faces = 1 + gerador.nextInt(19);
    int dano = forca + dado20faces;
    return dano;
  }

  // Método que não retorna nada e recebe um parâmetro alvo que é do tipo String
  void atacar(String alvo, String habilidade) {
    int danoCausado = calcularDano();
    //  O tamanho da (.length) é igual a 0
    if (habilidade.length() == 0) {
      System.out.format("%s atacou %s e causou %d de dano.", nome, alvo,danoCausado);
    } else {
      System.out.format("%s usou '%s' contra %s e causou %d de dano.\n",
                        nome, habilidade,alvo,danoCausado);
    }
  }
}