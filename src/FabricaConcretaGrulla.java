
public class FabricaConcretaGrulla extends FabricaAbstractaOrigami{

    @Override
    FiguraOrigamiAbstracta fabricarFiguraOrigamiAbstracta(String color) {
        return new FiguraOrigamiGrulla(color);
    }
    
}
