package DIO;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    public Mentoria() {
    }
    private LocalDate data;

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo()+ '\'' +
                "descrição='" + getDescrição() + '\'' +
                "data=" + data +
                '}';
    }

    public double calcularXp() {
        return xpPadrão + 20d;}

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }





}
