package refactorin;

import java.util.ArrayList;

public class Client {
    private String nif;
    private String nom;
    private String telefon;
    private ArrayList<Lloguer> lloguers;

    public Client(String nif, String nom, String telefon) {
        this.nif = nif;
        this.nom = nom;
        this.telefon = telefon;
        this.lloguers = new ArrayList<Lloguer>();
    }

    public String getNif()     { return nif;     }
    public String getNom()     { return nom;     }
    public String getTelefon() { return telefon; }

    public void setNif(String nif) { this.nif = nif; }
    public void setNom(String nom) { this.nom = nom; }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void afegeix(Lloguer lloguer) {
        if (! lloguers.contains(lloguer) ) {
            lloguers.add(lloguer);
        }
    }
    public void elimina(Lloguer lloguer) {
        if (lloguers.contains(lloguer) ) {
            lloguers.remove(lloguer);
        }
    }
    public boolean conte(Lloguer lloguer) {
        return lloguers.contains(lloguer);
    }

 
    //_-------------------------
    /*
    public String informe() {
        String resultat = "Informe de lloguers del client " +
            getNom() +
            " (" + getNif() + ")\n";
        for (Lloguer lloguer: lloguers) {        
            resultat += "\t" +
                lloguer.getVehicle().getMarca() +
                " " +
                lloguer.getVehicle().getModel() + ": " +
                (lloguer.quantitat() * 30) + "€" + "\n";
        }

        // afegeix informació final
        resultat += "Import a pagar: " + importeTotal() + "€\n" +
            "Punts guanyats: " + bonificacionsTotals() + "\n";
        return resultat;
    }
    */
    //-------------clase 2
    public double importeTotal() {
    	double total = 0;
    	for (Lloguer lloguer: lloguers) {
    		total+= lloguer.quantitat()*30;
    	}
    	return total;
    }
    
    public int bonificacionsTotals() {
    	int bonificacions = 0;
    	for (Lloguer lloguer: lloguers) {
    		bonificacions += lloguer.bonificacions();
    	}
    	return bonificacions ;
    }
    
    public String informe() {
    	return composaCapsalera() +
    			composaDetall() + 
    			composaPeu();
    }
    public String informeHTML() {
    	return composaCapsalera() +
    			composaDetallHTML() + 
    			composaPeuHTML();
    }
    public String composaCapsaleraHTML() {
    	return "<p>Informe de lloguer del clients <em>" +
    				getNom() + "</em> ( <strong>" + getNif() + "\n";
    }
    //<p>Informe de lloguers del client <em>Ken Robinson </em> (<strong>43092837A</strong>)</p>
    
    
}