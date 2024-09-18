import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Atleta atleta = new Atleta(
            1,
            "Juan Pérez",
            Atleta.Genero.HOMBRE,
            "España",
            LocalDate.of(1990, 5, 15),
            1.23456f,
            80.0f
        );

       
        Medalla medalla = new Medalla(
            Medalla.Metal.ORO, 
            LocalDate.of(2024, 8, 10), 
            atleta, 
            "100 metros" 
        );
        
       
        System.out.println(medalla);
    }
}
