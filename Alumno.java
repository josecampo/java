import java.util.Arrays;

public class Alumno {
    public static String[] generosPosibles = {"hombre", "mujer","nobinario"};
    public String nombre;
    public String apellidos;
    private String fechaNac;
    private String dni;
    private String curso;
    private String codMatricula;
    private int[] nota = {};

    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public String getFechaNac(){
        return this.fechaNac;
    }
    public String getDNI(){
        return this.dni;
    }
    public String getCurso(){
        return this.curso;
    }
    public String getCodMatricula(){
        return this.codMatricula;
    }
    public float getNotaMedia(){

        int sumatorio = 0;

        for (int val: this.nota){

            sumatorio += val;
        }

        return (sumatorio / this.nota.length); 
    }

    public void setNombre(String giverName){
        this.nombre = giverName;
    }
        
    public void setApellidos(String giverSurname){
        this.apellidos = giverSurname;
    }

    public void setFechaNac(String day, String month, String year){
        this.fechaNac = day + "/" + month + "/" + year;
    }

    public void setDni(String givenDni){
        this.dni = givenDni;
    }

    public void setCurso(String givenCurso){
        this.curso = givenCurso;
    }

    public void setCodMatricula(String givenCode){
        this.codMatricula = givenCode;
    }

    public void addNota(int givenNota) {
        this.nota = Arrays.copyOf(this.nota, this.nota.length +1);
        this.nota[this.nota.length - 1] = givenNota;
    }
}
