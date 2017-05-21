package excepciones;

public class PersonalNumberException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String comentario;

	public PersonalNumberException(String comentario){
		this.comentario=comentario;
	}
	
	@Override
	public String toString(){
		return comentario+super.toString();
	}
}
