package Estudantes;

public class Estudantes {
    //Variáveis de instâncias
    private String nome;
    private double media;

    //Construtor
    public Estudantes(String nome,double media){
        this.nome = nome;
        if (media >=0 && media <=10){
            this.media = media;
        }else {
            System.out.println("Resultado errado");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
