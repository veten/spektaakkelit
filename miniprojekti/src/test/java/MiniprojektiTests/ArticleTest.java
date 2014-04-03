/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniprojektiTests;

import domain.Article;
import Syotetarkistus.Syotetarkastaja;
import domain.Kentta;
import java.util.EnumSet;
import junit.framework.TestCase;

/**
 *
 * @author tv
 */
public class ArticleTest extends TestCase {

    private Article artikkeli;

    public ArticleTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        artikkeli = new Article(new Syotetarkastaja());
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    // TODO add test methods here. The name must begin with 'test'. For example:
    
    public void testToString() {
        artikkeli.lisaaKentta(Kentta.title, "Viimeiset banjonsoittajat");
        artikkeli.lisaaKentta(Kentta.author, "Antti Akateeminen");
        artikkeli.lisaaKentta(Kentta.journal, "Advances in the theory of Banjos");
        artikkeli.lisaaKentta(Kentta.year, "2013");
        assertEquals(artikkeli.toString(), "Antti Akateeminen, Viimeiset banjonsoittajat,"
                + " Advances in the theory of Banjos, 2013");
    }
}
