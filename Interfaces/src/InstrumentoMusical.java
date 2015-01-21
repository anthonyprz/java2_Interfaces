/*
Una interface es una variante de una clase abstracta con la condición de que todos sus 
métodos deben ser asbtractos.

Si la interface va a tener atributos, éstos deben llevar las palabras reservadas static final
y con un valor inicial ya que funcionan como constantes por lo que, por convención, 
su nombre va en mayúsculas. 
*/
interface InstrumentoMusical {
	
	public static final String musico = "Anthony";
	void tocar();
	String tipoInstrumento();
}
