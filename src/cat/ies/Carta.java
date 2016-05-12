/**
 * Abstracció maxima d'una baralla
 * Cada carta esta formada por un numero i un pal.
 * Aquesta combinació es unica a la baralla, no hi ha dues cartes
 * iguals.
 * 
 * @author Juan Carlos Gálvez
 *
 */
public class Carta {
	/** Numero que te la carta */
	private int numero;
	/** Pal al que pertany la carta*/
	private String pal;
	
	/**
	 * Per instanciar una carta hem de passar el pal i el numero que tindra.
	 * 
	 * @param numero Numero de l'1 al 12.
	 * @param pal Ors,bastos,espases,copes.
	 */
	public Carta(int numero, String pal){
		this.numero=numero;
		this.pal=pal;
	}	
	
	/**
	 * 
	 * Sobreescrivim el metode toString per tal que retorni el numero i el pal en un mateix string.
	 * 
	 */
	@Override
	public String toString (){
		return numero+" "+pal+" ";
	}
	
}
