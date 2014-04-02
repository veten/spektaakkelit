package domain;

import java.util.Map;
import java.util.Set;

public abstract class Viite {
    protected Map<Kentta, String> kentat;
    protected Set<Kentta> pakollisetKentat;
    protected Set<Kentta> sallitutKentat;
    protected String viiteavain;
    protected Syotetarkastaja tarkastaja;
    
    public void lisaaViiteavain(String viiteavain) {
        if(tarkastaja.tarkastaCitationKey(viiteavain)) {
            this.viiteavain = viiteavain;
        }
    }
    
    public void lisaaKentta(Kentta kentta, String syote) {
        if(sallitutKentat.contains(kentta)) {
            if(tarkastaja.tarkasta(kentta, syote)) {
                kentat.put(kentta, syote);
            }
        }
    }

    public Set<Kentta> getPakollisetKentat() {
        return pakollisetKentat;
    }

    public Set<Kentta> kaytossaOlevatKentat() {
        return kentat.keySet();
    }
    
    
    
    
}
