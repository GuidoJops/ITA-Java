package s3t1AbstractFactory;

public class FabricaProductor {
	public static FabricaAbstracta getFabrica(String tipoFabrica) {
		
		if(tipoFabrica.equalsIgnoreCase("Espaņa")) {
			return new FabricaEspaņa();
			
		}else if (tipoFabrica.equalsIgnoreCase("Argentina")) {
			return new FabricaArgentina();
			
		}
		return null;
	}

}
