
public class FabricaConcretaRana extends FabricaAbstractaOrigami{

    @Override
    FiguraOrigamiAbstracta fabricarFiguraOrigamiAbstracta(String color) {
        return new FiguraOrigamiRana(color);
    }

    
    
}
