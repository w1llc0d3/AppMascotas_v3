package willcode.com.appmascotas_v3.pojo;

public class Perfil {
    private int foto;
    private int meGusta;

    public Perfil(int foto, int meGusta){
        this.foto = foto;
        this.meGusta = meGusta;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }
}
