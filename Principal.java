import java.time.LocalDateTime;

public class Principal{
	public static void main (Strings[]arvs){

		
        MostrarFecha();
	}

    public static void MostrarFecha(){
        LocalDateTime hoy = LocalDateTime.now();  
	        
	    String fecha = hoy.getHour()+":"+hoy.getMinute()+":"+hoy.getSecond()+" "+hoy.getDayOfMonth()+"/"+hoy.getMonth()+"/"+hoy.getYear();
		System.out.println("Fecha y hora: "+ fecha);
    }
}
