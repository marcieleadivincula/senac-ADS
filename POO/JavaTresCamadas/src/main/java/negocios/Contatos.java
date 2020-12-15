package negocios;

public class Contatos {

    private int con_id;
    private String con_nome;
    private String con_endereco;
    private String con_telefone;
    private String con_email;

    public Contatos(String con_nome, String con_endereco, String con_telefone, String con_email) throws Exception {
        ConexaoMySQL c = ConexaoMySQL.getConexao();
        this.con_id = c.getMaxPK(“contatos”, “con_id
        ”) + 1;
c.close();
        this.con_nome = con_nome;
        this.con_endereco = con_endereco;
        this.con_telefone = con_telefone;
        this.con_email = con_email;
    }

    public void Insere() throws Exception {

        if (this.con_nome.equals(“”) || this.con_telefone.equals(
        
            “”)){
throw new Exception(
            “Preencha pelo menos o nome e o telefone
        
        .”);
}

ConexaoMySQL c = ConexaoMySQL.getConexao();
        c.Insere(“contatos”, this
        );
c.close();
    }

//getters e setters
}
