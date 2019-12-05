import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnosApp {
    public static void main(String[] args) {
        
        System.out.println(" ");
        System.out.println("Iniciando...");
        System.out.println(" ");

        ArrayList<Alumno> list = new ArrayList<Alumno>();

        try {
            File fileObject = new File("alumnos.txt");
            Scanner fileScanner = new Scanner(fileObject);

            while (fileScanner.hasNextLine()) {

                String fileLine = fileScanner.nextLine();
                String[] fields = fileLine.split(",");

                Alumno alumno = new Alumno();
                alumno.setNombre(fields[0]);
                alumno.setApellidos(fields[1]);
                alumno.setCurso(fields[2]);
                
                String[] notas = fields[3].split(" ");
                
                for (String nota: notas) {
                    if (!nota.isEmpty()){
                        alumno.addNota(Integer.parseInt(nota));
                    }
                }
                list.add(alumno);
                //System.out.println(fileLine);

            }

        } catch (FileNotFoundException ex) {
            System.out.println("No se ha podido leer el fichero");
        }

        for (int i = 0; i < list.size(); i++){
            
            Alumno thisAlumno = list.get(i);
            System.out.println("Nombre: " + thisAlumno.getNombre() + " Nota media: " + thisAlumno.getNotaMedia());
        }

        System.out.println(" ");
        System.out.println("Programa concluido.");
        System.out.println(" ");
    }
}