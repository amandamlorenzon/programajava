package AT1Q2;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList< CarbonFootprint > categorias = new ArrayList< CarbonFootprint >();
        categorias.add(new Bicicleta( 500.00 ));
		categorias.add(new Carro( 6000.00, 15.00 ));
        categorias.add(new Casa(500.00));
        categorias.add(new Escola(1500.00));
        System.out.println("Dados de cada categoria: ");

        for(CarbonFootprint currentCategoria : categorias){
            System.out.printf("\n%s: %s \n%s %s: %.2f\n",
                    "Informações sobre ", currentCategoria.getClass().getName(),
                    currentCategoria.toString(),
                    "\nCarbon footprint é ", currentCategoria.getCarbonFootprint());


        }
    }
}