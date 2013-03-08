package dcll.nndi.projet;
import static org.junit.Assert.*;
import java.io.File;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**test de la classe JONtoXML
 * @author Grim amel & Diallo Abdourahamane
 */

public class JSONtoXMLTest {
	private JsonToXML testfichier=null;
	@Before
	public void setUp() throws Exception {
		testfichier=new JsonToXML();
	}

	@After
	public void tearDown() throws Exception {
		testfichier=null;
	}

	@Test
    /**
     * test de la methode permettant de parser le fichier au format xml
     * on fait appel à la methode convertJsonToXml puis on verifie que le 
     * fichier contenant le resultat a bien été crée
     * @throws XMLStreamException
     * @throws IOException
     */
	public void testconvertJsonToXml() throws Exception {

		testfichier.convertJsonToXml("fichier.json","sortie.xml");
		 File dir = new File("sortie.xml");
		 assertNotNull(dir.isFile());
	}

}