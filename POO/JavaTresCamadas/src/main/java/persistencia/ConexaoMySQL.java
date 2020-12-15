package persistencia;

public class ConexaoMySQL {

    private Connection connect;
    private String erro =

    “”;

public static ConexaoMySQL getConexao() throws Exception {
        ConexaoMySQL c = new ConexaoMySQL();
        Connection connect = null;
        try {
            Class.forName(“com.mysql.jdbc.Driver
            ”);
String url = “jdbc:
            mysql://localhost/agenda”;
            connect = DriverManager.getConnection(url, “root
            ”, “123”);
c.setConnection(connect);
        } catch (ClassNotFoundException cnfex) {
            throw new Exception(
            “Falha ao ler o driver JDBC
            ” + cnfex.toString()
         );
} catch (SQLException sqlex) {
            throw new Exception(
            “Impossível conectar com a base de dados
            ” + sqlex.toString()
         );
} catch (Exception ex) {
            throw new Exception(
            “Outro erro
            ” + ex.toString()
        
        );
}
return c;
    }

    public void close() {
        try {
            this.connect.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    private void setErro(String erro) {
        this.erro = erro;
    }

    private void setConnection(Connection connection) {
        this.connect = connection;
    }

    public Connection getConnection() {
        return this.connect;
    }

    public String getMensagemErro() {
        return erro;
    }

    public boolean getEstadoConexao() {
        if (connect == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean manipular(String sql) // inserir, alterar,excluir
    {
        try {
            Statement statement = connect.createStatement();
            int result = statement.executeUpdate(sql);
            statement.close();
            if (result >= 1) {
                return true;
            }
        } catch (SQLException sqlex) {
            erro = “Erro: ” + sqlex.toString();
            return false;
        }
        return false;
    }

    public int getMaxPK(String tabela, String chave) {
        String sql = “select max(” + chave + “) as max from ” + tabela;
        int max = 0;
        ResultSet rs = null;
        try {
            Statement statement = connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            System.out.println(sql);
            rs = statement.executeQuery(sql);

            if (rs.next()) {
                max = rs.getInt(“max
            
            ”);
}
statement.close();
        } catch (SQLException sqlex) {
            erro = “Erro: ” + sqlex.toString();
            return -1;
        }

        return max;
    }

//aqui que a mágica da reflexão acontece
    public void Insere(String tabela, Object objeto) throws Exception {
        SimpleDateFormat sd = new SimpleDateFormat(“yyyy - MM - dd
        ”);
String sql = “INSERT INTO ” + tabela.toUpperCase() + “(“;

//percorre os atributos vendo o nome dos campos
Class<?> classe = objeto.getClass();
        for (Field f : classe.getDeclaredFields()) {
            f.setAccessible(true);
            sql += f.getName() + 
        “,”;
}

sql = sql.substring(0, sql.length() – 1); //retira a ultima virgula..
sql += “) VALUES(
        “;

//percorre os atributos vendo o valor dos campos
for (Field f : classe.getDeclaredFields()) {
            f.setAccessible(true);
            if (f.getType().getSimpleName().equals(“String
            
                ”)) {
sql += “‘” + f.get(objeto) + “‘,”;
} else {
                        sql += f.get(objeto) + “,”;
}
        }

        sql = sql.substring(0, sql.length() – 1); //retira a ultima virgula..
sql += “)”;

//executa a query
System.out.println(sql);
        if (!manipular(sql)) {
            throw new Exception(getMensagemErro());
        }
    }
}
