import java.util.Scanner;
/**
 * Clase Cuestionario
 * @autor Joe Diaz
 * @version 1.0 (09/11/2017)
 */
public class Cuestionario
{
    /**
     * Metodo para aplicar preguntas
     */
    public void aplicarPregunta(Pregunta q)
    {
        q.Imprimete();
        System.out.print("Respuesta: ");
        Scanner entrada = new Scanner(System.in);
        String respuesta = entrada.nextLine();
        /*if(q.checarRespuesta(respuesta)){
            System.out.println("Respuesta correcta");
        }else{
            System.out.println("Respuesta incorrecta");
        }*/
    }
}