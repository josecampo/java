import java.util.ArrayList;

public class MyApp {
    public static void main(String[] args){
        
        System.out.println("Iniciando...");
        
        Alumno alumno = new Alumno();
        alumno.setNombre("Jose");
        alumno.setApellidos("Campo González");
        alumno.setCurso("Full Stack Developer");
        alumno.addNota(8);
        alumno.addNota(9);
        alumno.addNota(7);
        alumno.setCodMatricula("COD_00010");
        
        System.out.println(alumno.getNombre() + alumno.getApellidos());
        System.out.println("con código de matrícula: " + alumno.getCodMatricula() + " inscrito en el curso de " + alumno.getCurso()+ " tiene una media de " + alumno.getNotaMedia());

        System.out.println("Programa concluido.");

    }
}