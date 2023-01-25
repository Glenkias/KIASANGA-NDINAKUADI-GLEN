package TPLabo;

import java.util.Hashtable;
import java.util.Map;
public class Article {

	public static void main(String[] args) {
	Hashtable	<Long,String>tabArticle = new Hashtable<Long,String>();
	tabArticle.put(01L,"HP PROBOOK");
	tabArticle.put(02L,"HP IMPRIMANTE");
	tabArticle.put(03L,"SOURIS");
	tabArticle.put(04L,"SAC DE FARINE");
	tabArticle.put(05L,"FROMMAGE");
	tabArticle.put(06L,"CLAVIER");
	tabArticle.put(07L,"TECNO SPARK7");
	tabArticle.put(8L,"TECNO SPARK 8");
	tabArticle.put(9L,"TECNO SPARK 8C");
	tabArticle.put(10L,"TECNO SPARK 9");
	tabArticle.put(11L,"TECNO SPARK 9 PRO" );
	tabArticle.put(12L,"IPHONE X");
	tabArticle.put(13L,"IPHONE X S");
	tabArticle.put(14L,"CHARGEUR PC");
	tabArticle.put(15L,"ROUTEUR");
	tabArticle.put(16L,"DISK DUR");
	tabArticle.put(17L,"CASQUE ");
	tabArticle.put(18L,"MONTRE");
	tabArticle.put(19L,"POSTE TELEVISEUR");
	tabArticle.put(20L,"PLAYSTATION 5");
	
	for (Map.Entry mapentry : tabArticle.entrySet()) {
		if(mapentry.getValue().equals("MONTRE"))
		System.out.println("cle"+ " "+mapentry.getKey()
		+ " | valeur " +mapentry.getValue());
	}	
	}
}