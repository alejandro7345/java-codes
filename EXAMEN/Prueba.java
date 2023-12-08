public class Prueba {
    
    public static void main(String[] args) {
        
        Motocicleta moto=new Motocicleta(2, " Yamaja", " 5700", "67354HGDJD", "MotoTurismo", "verde");
        Motocicleta moto1=new Motocicleta(0, null, null, null, null, null);
        Turismo auto=new Turismo(4," Honda", " civic", " 2H548DF98", "NEGRO");
        Turismo auto1=new Turismo(0, null, null, null, null);
        Turismo auto2=new Turismo(0, null, null, null, null);

        Motorista conductor=new Motorista("Alfonso Valladares", 0301);
        Motorista conductor1=new Motorista("Manuel Molina", 0302);
        Motorista conductor3=new Motorista("Armando Paredes", 0303);

        conductor.AsignarAuto(auto);
        conductor.imprimirMotorista();
        conductor1.AsignarAuto(moto);
        conductor1.imprimirMotorista();
        conductor3.AsignarAuto(null);
        conductor3.imprimirMotorista();

        
    }
}
