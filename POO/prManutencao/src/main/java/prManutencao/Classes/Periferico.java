
package prManutencao.Classes;

public class Periferico {
    private int codigo;
    private String descricao;
    private String observacao;

    @Override
    public String toString(){
        return "Periferico {" + "código=" + codigo + ", descrição=" + descricao + ", observação=" + observacao;
    }
    
    public Periferico(int codigo, String descricao, String observacao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.observacao = observacao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
}
