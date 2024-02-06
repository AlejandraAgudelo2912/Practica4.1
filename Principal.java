import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal{
    public static Scanner teclado = new Scanner(System.in);

	public static void main (Strings[]arvs){

		System.out.println("Hola Mundo");
        MostrarFecha();
        System.out.print("Introduce una cantidad de alumnos: ");

        int cantidad = Integer.parseInt(teclado.nextLine().trim());
        
        Usuario[]usuarios = PedirUsuario(cantidad);
        
        for (int i =0; i<usuarios.length;i++) {
            System.out.println((i+1)+"º usuario");
            System.out.println("----------");
            System.out.println("Nombre: "+usuarios[i].getNombre());
            System.out.println("Apellidos: "+usuarios[i].getApellidos());
            System.out.println("Email: "+usuarios[i].getEmail());
    
        }
	
	}

    public static void MostrarFecha(){
        LocalDateTime hoy = LocalDateTime.now();  
	        
	    String fecha = hoy.getHour()+":"+hoy.getMinute()+":"+hoy.getSecond()+" "+hoy.getDayOfMonth()+"/"+hoy.getMonth()+"/"+hoy.getYear();
		System.out.println("Fecha y hora: "+ fecha);
    }

    public static Usuario[] PedirUsuario(int cantidad){

        Usuario[] usuarios= new Usuario [cantidad];
		
		for (int i =0; i<cantidad; i++) {
			
			Usuario actual = new Usuario();
			System.out.println((i+1)+"º Usuario");
			System.out.print("Nombre: ");
			actual.setNombre(teclado.nextLine());
			System.out.print("Apellidos: ");
			actual.setApellidos(teclado.nextLine());
			System.out.print("Email: ");
			actual.setEmail(teclado.nextLine());
			
			usuarios[i]= actual;

		}
		return usuarios;
    }
}

class Usuario {

	public String nombre ;
	public String apellidos ;
	public String email ;

    public String getNombre() {
		
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
		
	}
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}

	
	public String getEmail() {		
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	
	//constructor
	
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre, String apellidos, String nre, String email, String direccion){
		setNombre(nombre);
		setApellidos(apellidos);
		setNre(nre);
		setEmail(email);
		setDireccion(direccion);
	}

}

