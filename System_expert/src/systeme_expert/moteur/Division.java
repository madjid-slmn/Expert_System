package systeme_expert.moteur;


/**
 * 
 * Classe representant une  expression arithmetique de type division  dans un fait entier
 */
public class Division extends ExpressionArithmetique{
    protected ExpressionArithmetique gauche;
    protected ExpressionArithmetique droite;


    /**
    * Constructeur du l'expression 
    * @param gauche  est le cote gauche de cet expression   .
    * @param droite   est le cote gauche de cet expression    .
    * 
    */

    public Division(ExpressionArithmetique gauche, ExpressionArithmetique droite) {
        this.gauche = gauche;
        this.droite = droite;
    }

    @Override
    public double evaluer() {
        return gauche.evaluer() / droite.evaluer();
    } 
    
    
    @Override
    public String toString(){
		return  this.gauche.evaluer() + " / " + this.droite.evaluer() ;
	}
    
    
    
    
    
}
