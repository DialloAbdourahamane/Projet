package dcll.nndi.projet;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * automatisation de toutes les classes de test 
 * @author Ndèye Mariane NDIAYE & Mohamed Amine LOUHIDI
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, XMLtoJSONTest.class, JSONtoXMLTest.class })
public class AllTests {

}
