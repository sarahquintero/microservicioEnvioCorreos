package co.edu.unicauca.infoii.correo.DTOs;

public class CancionAlmacenarDTOInput {
    private String titulo;
    private String artista;
    private String genero;

    public CancionAlmacenarDTOInput() {}

    public CancionAlmacenarDTOInput(String titulo, String artista, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
