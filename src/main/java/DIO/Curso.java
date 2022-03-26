package DIO;

public class Curso extends Conteudo {
    private String titulo;
    private String descrição;


    public double calcularXp() {
        return xpPadrão * cargaHoraria;
    }

    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescrição() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    private int cargaHoraria;

    public Curso() {
    }

}
