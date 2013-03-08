package dcll.nndi.projet;


/**.
 * App est la classe permettant de lancer la conversion d'un fichier au format
 * Moodle XML au format Json et inversement.
 * @author Ndèye Mariane NDIAYE & Mohamed Amine LOUHIDI & abddiallo amelGrim
 */
    public enum App {;
    /**.
     * 1.On cree une instance de la classe effectuant la conversion souhaitée
     * 2.On fait appel à la méthode permettant d'effectuer le parse en lui
     * donnant en paramètre le fichier à traiter 3.On exécute le code 4.On
     * raffraichit le projet 5.Le resultat de la conversion pourra être
     * consulté dans le fichier créé apres execution.
     * ConversionXMLToJSONjson pour une conversion de Moodle XML à Json
     * convertir un fichier json en xml a l'aide de la classe Json_To_Xml
     * on appelle la methode qui permet de faire la conversion
     * @param args
     *            tableau de paramètres par défaut de la méthode main
     * @throws Exception
     *             capture de l'exeption *
     */
    public static void main(final String[] args) throws Exception {
       
       
        XMLtoJSON testXml = new XMLtoJSON();
        testXml.convertXmlToJson("ExempleXml.xml");
        System.out.println("Conversion XML To JSON : "
        + "resultat disponible dans le fichier ConversionXMLToJSON.json");
        
        
        JsonToXML convjsonxml = new JsonToXML();
        convjsonxml.convertJsonToXml("fichier.json", "sortie.xml");
        System.out.println("Conversion JSON To XML  : "
                + "resultat disponible dans le fichier sortie.xml");
    }
    
}
