
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

    public void SetCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setPeriferico(Periferico periferico){
        this.listaPeriferico.add(periferico);
    }

    public int GetCodigo() {
        return this.codigo;
    }

    public void SetDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String GetDescricao() {
        return this.descricao;
    }

    public void SetObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String GetObservacao() {
        return this.observacao;
    }

    public void SetListaPeriferico(ArrayList listaPeriferico) {
        this.listaPeriferico = listaPeriferico;
    }

    public ArrayList GetListaPeriferico() {
        return this.listaPeriferico;
    }
}
