package heranca;

public class Casa {
    public static void main(String[] args) {
        //Criando o objeto casa
        PlantaCasa casa = new PlantaCasa();

        //Inicializando os atributos (variáveis), características da casa
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";

        //Chamada da função metodo, da ordem
        casa.construir();
        casa.pintar("Vermelho");
        int resultado = casa.somarMetragem();
        System.out.println("A soma total da metragem da casa é: "+ resultado + "\n");

        casa.alterarCaracteristicas(100, 2, 2, "Madeira");
    }
}
