
public class PruebaMetodoFabrica {

    
    public static void main(String[] args) {
        Impresora objImpresora=new Impresora();
        
        FabricaAbstractaOrigami objOrigamiGrulla=new FabricaConcretaGrulla();
        FabricaAbstractaOrigami objOrigamiRana=new FabricaConcretaRana();
        
        FiguraOrigamiAbstracta ranaOrigami;
        FiguraOrigamiAbstracta grullaOrigami;
        
        ranaOrigami=objOrigamiRana.fabricarFiguraOrigamiAbstracta("verde");
        grullaOrigami=objOrigamiGrulla.fabricarFiguraOrigamiAbstracta("blanco");
        
        objImpresora.imprimirTexto(ranaOrigami.activarFigura());
        objImpresora.imprimirTexto(grullaOrigami.activarFigura());
        
    }
    
}
