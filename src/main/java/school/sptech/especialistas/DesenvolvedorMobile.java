package school.sptech.especialistas;

import school.sptech.Desenvolvedor;

public class DesenvolvedorMobile extends Desenvolvedor {
    private String plataforma;
    private String linguagem;
    private Integer horasPrototipacao;

    public DesenvolvedorMobile() {

    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + (horasPrototipacao * 200);
    }

    @Override
    public boolean possuiTecnologia(String tecnologia) {
        tecnologia = tecnologia.toLowerCase();

        if(tecnologia.equals("plataforma") && plataforma != null) {
            return true;
        }

       return tecnologia.equals("linguagem" ) && linguagem != null;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public Integer getHorasPrototipacao() {
        return horasPrototipacao;
    }

    public void setHorasPrototipacao(Integer horasPrototipacao) {
        this.horasPrototipacao = horasPrototipacao;
    }
}