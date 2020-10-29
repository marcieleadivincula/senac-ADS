
package prManutencao.Classes;

import java.util.ArrayList;

public class Equipamento {
    private int codigo;
    private String descricao;
    private String observacao;
    private ArrayList<Periferico> listaPeriferico = new ArrayList<Periferico>();

    @Override
    public String toString(){
        return "Equipamento {" + "código=" + codigo + ", descrição=" + descricao + ", observação=" + observacao;
    }
    
    public Equipamento(int codigo, String descricao, String observacao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.observacao = observacao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setPeriferico(Periferico periferico){
        this.listaPeriferico.add(periferico);
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getObservacao() {
        return this.observacao;
    }

    public void setListaPeriferico(ArrayList listaPeriferico) {
        this.listaPeriferico = listaPeriferico;
    }

    public ArrayList getListaPeriferico() {
        return this.listaPeriferico;
    }
}
