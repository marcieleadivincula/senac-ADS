
public class Carro {
	private int ano;
    private String modelo;
    private double preco;

    public Carro(int ano, String modelo, double preco){
        if(ano >= 1891){
            this.ano = ano;
        }else{
            System.out.println("O ano informado est� inv�lido. Por isso usaremos 2017!");
            this.ano = 2017;
        }

        if( modelo != null){
            this.modelo = modelo;
        }else{
            System.out.println("O modelo n�o foi informado. Por isso usaremos Gol!");
            this.modelo = "Gol";
        }

        if(preco > 0){
            this.preco = preco;
        }else{
            System.out.println("O pre�o n�o � v�lido. Por isso usaremos 40000.0!");
            this.preco = 40000.0;
        }        
    }

    //Novo construtor AQUI!
    public Carro(String modelo, double preco){
    	//No Java podemos chamar a implementa��o de um construtor atrav�s de outro usando simplesmente this( ) com os par�metros exigidos pelo construtor.
    	//chamando o construtor que recebe int, String e double. Nosso primeiro!    
        this(2017, modelo, preco);
    }

    //getters e setters omitidos    
}
