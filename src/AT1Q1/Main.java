package AT1Q1;
import java.util.ArrayList;;

public class Main {
	public static void main(String[] args) {
		ArrayList< CarbonFootprint > categorias = new ArrayList< CarbonFootprint >();
		categorias.add(new Bicicleta(500.00));
		categorias.add(new Edificio(1000.00));
		categorias.add(new Carro(6000.00, 15.00));
		System.out.println("Dados de cada categoria: ");

		for(CarbonFootprint currentObject : categorias) {
			System.out.printf("\n%s: %s \n%s %s: %.2f\n",
					"Informações sobre ", currentObject.getClass().getName(),
					currentObject.toString(),
					"\nCarbon footprint é ", currentObject.getCarbonFootprint());
		}
	}
}
