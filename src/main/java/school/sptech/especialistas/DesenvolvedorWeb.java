package school.sptech.especialistas;

import school.sptech.Desenvolvedor;

public class DesenvolvedorWeb extends Desenvolvedor {
    private String backend;
    private String frontend;
    private String sgbd;
    private Integer horasMentoria;

    public DesenvolvedorWeb() {

    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + (this.horasMentoria * 300);
    }

    public Boolean isFullstack() {
        if(backend != null && frontend != null && sgbd != null) {
            return true;
        }

        return false;
    }

    @Override
    public boolean possuiTecnologia(String tecnologia) {
        tecnologia = tecnologia.toLowerCase();

        if(tecnologia.equals("backend") && backend != null) {
            return true;
        }

        if(tecnologia.equals("frontend") && frontend != null) {
            return true;
        }

        return tecnologia.equals("sgbd" ) && sgbd != null;
    }

    public String getBackend() {
        return backend;
    }

    public void setBackend(String backend) {
        this.backend = backend;
    }

    public String getFrontend() {
        return frontend;
    }

    public void setFrontend(String frontend) {
        this.frontend = frontend;
    }

    public String getSgbd() {
        return sgbd;
    }

    public void setSgbd(String sgbd) {
        this.sgbd = sgbd;
    }

    public Integer getHorasMentoria() {
        return horasMentoria;
    }

    public void setHorasMentoria(Integer horasMentorias) {
        this.horasMentoria = horasMentorias;
    }
}


