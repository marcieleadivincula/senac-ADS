package prManutencao.ServicoBanco;

import prManutencao.Classes.Equipamento;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class servicoBancoEquipamento {

    private final Conexao conexao = new Conexao();

    public void insert(Equipamento equipamento) throws SQLException {
        try (PreparedStatement pst = conexao.getConexao().prepareStatement("insert into equipamento (codigo, descricao, observacao) values (0, ? , ?)")) {
            pst.setString(1, equipamento.getDescricao());
            pst.setString(2, equipamento.getObservacao());
            pst.executeUpdate();
        }
        conexao.close();

        //verificar qual foi o código inserido
        //deverá ser criado um método que logo após criar o código inserir no objeto equipamento
    }

    public void update(Equipamento equipamento) throws SQLException {
        try (PreparedStatement pst = conexao.getConexao().prepareStatement("update equipamento set descricao = ?, observacao = ? where (codigo = ?)")) {
            pst.setString(1, equipamento.getDescricao());
            pst.setString(2, equipamento.getObservacao());
            pst.setInt(3, equipamento.getCodigo());
            pst.executeUpdate();
        }
        conexao.close();
    }

    public void delete(Equipamento equipamento) throws SQLException {
        try (PreparedStatement pst = conexao.getConexao().prepareStatement("delete from equipamento where (codigo = ?)")) {
            pst.setInt(1, equipamento.getCodigo());
            pst.executeUpdate();
        }
        conexao.close();
    }

    //Este é apenas uma ideia para um select simples na tabela
    public Equipamento select(int codigo) throws SQLException {
        Equipamento equipamentoRet = null;
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery("select * from equipamento where(codigo = " + codigo + ")")) {
            rs.first();

            equipamentoRet = new Equipamento(rs.getInt("codigo"), rs.getString("descricao"), rs.getString("observacao"));
        }
        conexao.close();
        return equipamentoRet;
    }
}
