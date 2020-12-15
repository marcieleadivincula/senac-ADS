
package apresentacao;

public class Main {
    //BANCO
//    CREATE TABLE `contatos` (;
//
//`con_id` INT NOT NULL ,
//`con_nome` VARCHAR( 60 ) NOT NULL ,
//`con_endereco` VARCHAR( 100 ) NOT NULL ,
//`con_email` VARCHAR( 50 ) NOT NULL ,
//`con_telefone` VARCHAR( 20 ) NOT NULL ,
//PRIMARY KEY ( `con_id` )
//) ENGINE = INNODB CHARACTER SET utf8 COLLATE utf8_unicode_ci;

    // O código do botão Inserir segue abaixo:
    public void Inserir() {
        try {
            Contatos c = new Contatos(jTF_Nome.getText(), jTF_Endereco.getText(), jTF_Telefone.getText(), jTF_Email.getText());
            c.Insere();
            JOptionPane.showMessageDialog(this, “Contato adicionado com sucesso
         ”);
} catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}
    
}
