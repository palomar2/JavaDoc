/**
 * Una baralla es un conjunt de cartes
 * 
 * @author Juan Carlos Galvez
 *
 */
public class Baralla {
	/** Cada baralla esta formada per un vector de cartes*/
	private Carta [] baralla;
	
	/**
	 * Contructor: Crea una baralla de 48 cartes.
	 * No necesita arguments. El pal i el numero de les cartes 
	 * s'assigna automaticament al constructor.
	 * 
	 */
	public Baralla(){
		baralla = new Carta[48];
		for (int i=0;i<12;i++)
			baralla[i]= new Carta(i+1,"Ors");
		for (int i=12;i<24;i++)
			baralla[i]= new Carta(i+1-12,"Espases");
		for (int i=24;i<36;i++)
			baralla[i]= new Carta(i+1-24,"Copes");
		for (int i=36;i<48;i++)
			baralla[i]= new Carta(i+1-36,"Bastos");
	}
	/**
	 * Sobreescrivim el metode toString per tal de presentar la baralla
	 * de forma mes agradable.
	 */
	@Override
	public String toString (){
		String fullBaralla="";
		for (int i=0;i<baralla.length;i++){
			fullBaralla=fullBaralla+baralla[i].toString();
		}
		return fullBaralla;
	}
	
	
}
