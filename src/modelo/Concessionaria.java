package modelo;

import java.util.HashSet;
import java.util.Set;

public class Concessionaria {

    private String nome;
    private Set<Praca> pracas;
    private Double totalRecebido;

    public Concessionaria(String nome) {
        this.nome = nome;
        this.totalRecebido = 0.0;
        this.pracas = new HashSet<>();
    }

    public Concessionaria() {
        this.totalRecebido = 0.0;
        this.pracas = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Praca> getPracas() {
        return pracas;
    }

    public void setPracas(Set<Praca> pracas) {
        this.pracas = pracas;
    }

    public Double getTotalRecebido() {
        return totalRecebido;
    }

    public void setTotalRecebido(Double totalRecebido) {
        this.totalRecebido = totalRecebido;
    }

    public void adicionarPraca(Praca praca) {
        this.pracas.add(praca);
        this.totalRecebido = 0.0;

        for (Praca p : this.pracas) {
            if (p.getTotalRecebido() != null) {
                this.totalRecebido = this.totalRecebido + p.getTotalRecebido();
            }
        }
    }
}