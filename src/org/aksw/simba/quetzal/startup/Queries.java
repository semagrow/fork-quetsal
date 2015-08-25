package org.aksw.simba.quetzal.startup;

import java.util.ArrayList;
import java.util.List;

public class Queries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	}
/**
 * Get FedBench Queries
 * @return List of queries
 */
	public static List<String> getFedBenchQueries() {
		List<String> queries = new ArrayList<String> ();
		String CD1 = "SELECT ?predicate ?object  \n" //cd1 of fedbench
				+ "WHERE \n"
				+ " { \n" +    
				"     { \n"
				+ "     <http://dbpedia.org/resource/Barack_Obama> ?predicate ?object . \n"
				+ "     }\n" +
				" UNION \n " +
				" { \n"
				+ "   ?subject <http://www.w3.org/2002/07/owl#sameAs> <http://dbpedia.org/resource/Barack_Obama> .\n" +
				"   ?subject ?predicate ?object .\n"
				+ "  } \n " +
				"}";
		String CD2 = "SELECT ?party ?page  WHERE { \n" +   //cd2
				" <http://dbpedia.org/resource/Barack_Obama> <http://dbpedia.org/ontology/party> ?party .\n" +
				" ?x <http://data.nytimes.com/elements/topicPage> ?page .\n" +
				"?x <http://www.w3.org/2002/07/owl#sameAs> <http://dbpedia.org/resource/Barack_Obama> .\n"+
				"}";
		String CD3 = "SELECT ?president ?party ?page WHERE { \n" + //cd3
				"?president <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://dbpedia.org/ontology/President> .\n" +
				"?president <http://dbpedia.org/ontology/nationality> <http://dbpedia.org/resource/United_States> .\n" +
				"?president <http://dbpedia.org/ontology/party> ?party .\n" +
				"?x <http://data.nytimes.com/elements/topicPage> ?page .\n" +
				"?x <http://www.w3.org/2002/07/owl#sameAs> ?president .\n" +
				"}";

		String CD4 = "SELECT ?actor ?news WHERE {\n"+   //cd4
				"?film <http://purl.org/dc/terms/title> \"Tarzan\" .\n"+
				"?film <http://data.linkedmdb.org/resource/movie/actor> ?actor .\n"+
				"?actor <http://www.w3.org/2002/07/owl#sameAs> ?x .\n"+
				"?y <http://www.w3.org/2002/07/owl#sameAs> ?x .\n"+
				"?y <http://data.nytimes.com/elements/topicPage> ?news . \n"+
				"}";
		String CD5 = "SELECT ?film ?director ?genre WHERE {\n"+    //cd5 
				"?film <http://dbpedia.org/ontology/director> ?director .\n"+
				"?director <http://dbpedia.org/ontology/nationality> <http://dbpedia.org/resource/Italy> .\n"+
				"?x <http://www.w3.org/2002/07/owl#sameAs> ?film .\n"+
				"?x <http://data.linkedmdb.org/resource/movie/genre> ?genre .\n"+
				"}";
		String CD6 = "SELECT ?name ?location WHERE {\n"+ //cd 6
				"?artist <http://xmlns.com/foaf/0.1/name> ?name .\n"+
				"?artist <http://xmlns.com/foaf/0.1/based_near> ?location .\n"+
				"?location <http://www.geonames.org/ontology#parentFeature> ?germany . \n"+
				"?germany <http://www.geonames.org/ontology#name> \"Federal Republic of Germany\" . \n"+
				"}";
		String CD7= "SELECT ?location ?news WHERE {\n"+ //cd7
				"?location <http://www.geonames.org/ontology#parentFeature> ?parent .\n"+ 
				"?parent <http://www.geonames.org/ontology#name> \"California\" .\n"+
				"?y <http://www.w3.org/2002/07/owl#sameAs> ?location .\n"+
				"?y <http://data.nytimes.com/elements/topicPage> ?news . \n "+
				"}";
		//-----------------------------------------LS queries of FedBench-----------------------------------
		String LS1 = "SELECT ?drug ?melt WHERE {\n"+  //LS1
				"{ ?drug <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/meltingPoint> ?melt . }\n"+
				"    UNION"+
				"    { ?drug <http://dbpedia.org/ontology/Drug/meltingPoint> ?melt . \n}"+
				"}";
		String LS2 = "SELECT ?predicate ?object WHERE {\n"+ //LS2
				"{ <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugs/DB00201> ?predicate ?object . }\n"+
				"UNION    "+
				"{ <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugs/DB00201> <http://www.w3.org/2002/07/owl#sameAs> ?caff .\n"+
				"  ?caff ?predicate ?object . } \n"+
				"}";
		String LS3 = "SELECT ?Drug ?IntDrug ?IntEffect WHERE { \n"+ //LS3
				" ?Drug <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://dbpedia.org/ontology/Drug> .\n"+
				" ?y <http://www.w3.org/2002/07/owl#sameAs> ?Drug .\n"+
				" ?Int <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/interactionDrug1> ?y .\n"+
				" ?Int <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/interactionDrug2> ?IntDrug .\n"+
				" ?Int <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/text> ?IntEffect . \n"+
				"}";

		String LS4 = "SELECT ?drugDesc ?cpd ?equation WHERE {\n"+  //LS4
				"?drug <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/drugCategory> <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugcategory/cathartics> .\n"+
				"   ?drug <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/keggCompoundId> ?cpd .\n"+
				"  ?drug <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/description> ?drugDesc .\n"+
				" ?enzyme <http://bio2rdf.org/ns/kegg#xSubstrate> ?cpd .\n"+
				"?enzyme <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://bio2rdf.org/ns/kegg#Enzyme> .\n"+
				"?reaction <http://bio2rdf.org/ns/kegg#xEnzyme> ?enzyme .\n"+
				"?reaction <http://bio2rdf.org/ns/kegg#equation> ?equation . \n"+
				"}";
		String LS5 = "SELECT ?drug ?keggUrl ?chebiImage WHERE {\n"+ //LS5
				"?drug <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/drugs> .\n"+
				"  ?drug <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/keggCompoundId> ?keggDrug .\n"+
				"  ?keggDrug <http://bio2rdf.org/ns/bio2rdf#url> ?keggUrl .\n"+
				" ?drug <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/genericName> ?drugBankName .\n"+
				" ?chebiDrug <http://purl.org/dc/elements/1.1/title> ?drugBankName .\n"+
				" ?chebiDrug <http://bio2rdf.org/ns/bio2rdf#image> ?chebiImage .\n"+
				"}" ;
		String LS6 = "SELECT ?drug ?title WHERE {\n "+ //LS6
				"?drug <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/drugCategory> <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugcategory/micronutrient> .\n"+
				" ?drug <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/casRegistryNumber> ?id .\n"+
				" ?keggDrug <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://bio2rdf.org/ns/kegg#Drug> .\n"+
				" ?keggDrug <http://bio2rdf.org/ns/bio2rdf#xRef> ?id .\n"+
				" ?keggDrug <http://purl.org/dc/elements/1.1/title> ?title .\n"+
				"}";
		String LS7 = "SELECT ?drug ?transform ?mass WHERE { \n "+ //LS7
				"{ ?drug <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/affectedOrganism> \"Humans and other mammals\" .\n"+
				" 	  ?drug <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/casRegistryNumber> ?cas .\n"+
				"	  ?keggDrug <http://bio2rdf.org/ns/bio2rdf#xRef> ?cas .\n"+
				"	  ?keggDrug <http://bio2rdf.org/ns/bio2rdf#mass> ?mass . \n"+
				"	} "+
				"}";

		queries.add(CD1);
		queries.add(CD2);
		queries.add(CD3);
		queries.add(CD4);
		queries.add(CD5);
		queries.add(CD6);
		queries.add(CD7);
		queries.add(LS1);
		queries.add(LS2);
		queries.add(LS3);
		queries.add(LS4);
		queries.add(LS5);
		queries.add(LS6);
		queries.add(LS7);
		return queries;
	}


	public static List<String> getBigRDFBenchQueries() {
		List<String> queries = new ArrayList<String>();

		// Only C Queries
		String C1 = "PREFIX drugbank: <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/> \n" +
				"PREFIX drugtype: <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugtype/>\n" +
				"PREFIX kegg: <http://bio2rdf.org/ns/kegg#>\n" +
				"PREFIX chebi: <http://bio2rdf.org/ns/bio2rdf#>\n" +
				"PREFIX purl: <http://purl.org/dc/elements/1.1/>\n" +
				"SELECT distinct ?drug\t?drugDesc ?molecularWeightAverage \t?compound   ?ReactionTitle    ?ChemicalEquation \n" +
				"WHERE\n" +
				"{\n" +
				"?drug \t\t\tdrugbank:description \t ?drugDesc .\n" +
				"?drug \t\t\tdrugbank:drugType \t drugtype:smallMolecule .\n" +
				"?drug \t     drugbank:keggCompoundId ?compound. \n" +
				"?enzyme \t\tkegg:xSubstrate \t?compound .\n" +
				"?Chemicalreaction \tkegg:xEnzyme \t\t?enzyme .\n" +
				"?Chemicalreaction\tkegg:equation \t\t?ChemicalEquation .\n" +
				"?Chemicalreaction \tpurl:title \t\t?ReactionTitle\n" +
				"OPTIONAL \n" +
				"{ \n" +
				"?drug drugbank:molecularWeightAverage ?molecularWeightAverage.\n" +
				"FILTER (?molecularWeightAverage > 114) \n" +
				"}\n" +
				"}\n" +
				"Limit 1000";
		String C2 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
				"PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
				"PREFIX drugbank: <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/>\n" +
				"PREFIX kegg: <http://bio2rdf.org/ns/kegg#>\n" +
				"PREFIX chebi: <http://bio2rdf.org/ns/chebi#>\n" +
				"PREFIX purl: <http://purl.org/dc/elements/1.1/>\n" +
				"PREFIX bio2RDF: <http://bio2rdf.org/ns/bio2rdf#>\n" +
				"SELECT ?drug ?keggmass ?chebiIupacName \n" +
				"WHERE \n" +
				"{\n" +
				"?drug rdf:type drugbank:drugs .\n" +
				"?drug drugbank:keggCompoundId ?keggDrug .\n" +
				"?keggDrug bio2RDF:mass ?keggmass .\n" +
				"?drug drugbank:genericName ?drugBankName .\n" +
				"?chebiDrug purl:title ?drugBankName .\n" +
				"?chebiDrug chebi:iupacName ?chebiIupacName .\n" +
				"OPTIONAL { \n" +
				"            ?drug drugbank:inchiIdentifier ?drugbankInchi .\n" +
				"\t\t\t?chebiDrug bio2RDF:inchi ?chebiInchi .\n" +
				"\t\t\tFILTER (?drugbankInchi = ?chebiInchi) \n" +
				"\t\t}\n" +
				"}";
		String C3 = "PREFIX foaf: \t\t<http://xmlns.com/foaf/0.1/>\n" +
				"PREFIX geonames: \t<http://www.geonames.org/ontology#>\n" +
				"PREFIX mo:   \t\t<http://purl.org/ontology/mo/>\n" +
				"PREFIX nytimes:         <http://data.nytimes.com/elements/>\n" +
				"PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
				"SELECT DISTINCT ?artist ?name ?location ?anylocation\n" +
				"WHERE {\n" +
				"\t     ?artist a mo:MusicArtist ;\n" +
				"         foaf:name ?name ;\n" +
				"\t\t foaf:based_near ?location .\n" +
				"         ?location geonames:parentFeature ?locationName .\n" +
				"         ?locationName geonames:name ?anylocation .\n" +
				"         ?nytLocation owl:sameAs ?location.\n" +
				"         ?nytLocation nytimes:topicPage ?news \n" +
				"OPTIONAL \n" +
				"{\n" +
				"         ?locationName geonames:name 'Islamic Republic of Afghanistan' .\n" +
				"}\n" +
				"}";
		String C4 = "prefix geo: <http://www.w3.org/2003/01/geo/wgs84_pos#>\n" +
				"prefix geonames: <http://www.geonames.org/ontology#>\n" +
				"prefix owl: <http://www.w3.org/2002/07/owl#>\n" +
				"Prefix dbpedia: <http://dbpedia.org/ontology/>\n" +
				"SELECT DISTINCT ?countryName ?countryCode ?locationMap ?population ?longitude ?latitude ?nationalAnthem ?foundingDate ?largestCity ?ethnicGroup ?motto\n" +
				"{\n" +
				"?NYTplace geonames:name ?countryName;\n" +
				"geonames:countryCode ?countryCode;\n" +
				"geonames:population  ?population;\n" +
				"geo:long   ?longitude;\n" +
				"geo:lat     ?latitude;\n" +
				"owl:sameAs   ?geonameplace.\n" +
				"OPTIONAL\n" +
				"{\n" +
				"?geonameplace dbpedia:capital ?capital;\n" +
				"dbpedia:anthem ?nationalAnthem;\n" +
				"dbpedia:foundingDate ?foundingDate;\n" +
				"dbpedia:largestCity ?largestCity;\n" +
				"dbpedia:ethnicGroup ?ethnicGroup;\n" +
				"dbpedia:motto ?motto.\n" +
				"}\n" +
				"}\n" +
				"LIMIT 50";
		String C5 = "PREFIX linkedmdb: <http://data.linkedmdb.org/resource/movie/>\n" +
				"PREFIX dcterms: <http://purl.org/dc/terms/>\n" +
				"PREFIX dbpedia: <http://dbpedia.org/ontology/>\n" +
				"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
				"SELECT ?actor ?movie ?movieTitle ?movieDate ?birthDate ?spouseName\n" +
				"{\n" +
				"        ?actor rdfs:label ?actor_name_en;\n" +
				"               dbpedia:birthDate ?birthDate ;\n" +
				"               dbpedia:spouse ?spouseURI .\n" +
				"        ?spouseURI rdfs:label ?spouseName .\n" +
				"\n" +
				" \t?imdbactor linkedmdb:actor_name ?actor_name.\n" +
				"      ?movie linkedmdb:actor ?imdbactor ;\n" +
				"             dcterms:title ?movieTitle ;\n" +
				"             dcterms:date ?movieDate\n" +
				"      FILTER(STR(?actor_name_en )= STR(?actor_name))\n" +
				"\n" +
				"} LIMIT 500";
		String C6 = "PREFIX linkedmdb: <http://data.linkedmdb.org/resource/movie/>\n" +
				"prefix owl: <http://www.w3.org/2002/07/owl#>\n" +
				"PREFIX dcterms: <http://purl.org/dc/terms/>\n" +
				"PREFIX purl: <http://purl.org/dc/terms/>\n" +
				"PREFIX nytimes: <http://data.nytimes.com/elements/>\n" +
				"SELECT ?actor ?filmTitle ?news ?variants ?articleCount ?first_use ?latest_use\n" +
				"WHERE \n" +
				"{\n" +
				"?film purl:title \t\t\t?filmTitle .\n" +
				"?film linkedmdb:actor \t\t\t?actor .\n" +
				"?actor owl:sameAs \t\t\t?dbpediaURI.\n" +
				"?nytURI owl:sameAs \t\t\t?dbpediaURI .\n" +
				"?nytURI nytimes:topicPage \t\t?news ;\n" +
				"\tnytimes:number_of_variants \t?variants;\n" +
				"\tnytimes:associated_article_count ?articleCount;\n" +
				"\tnytimes:first_use \t\t?first_use;\n" +
				"\tnytimes:latest_use \t\t?latest_use\n" +
				"}\n" +
				"ORDER BY (?actor)";
		String C7 = "prefix swc: <http://data.semanticweb.org/ns/swc/ontology#>\n" +
				"prefix swrc: <http://swrc.ontoware.org/ontology#>\n" +
				"prefix eswc: <http://data.semanticweb.org/conference/eswc/>\n" +
				"prefix foaf: <http://xmlns.com/foaf/0.1/>\n" +
				"prefix dbpedia: <http://dbpedia.org/ontology/>\n" +
				"prefix geo: <http://www.w3.org/2003/01/geo/wgs84_pos#>\n" +
				"SELECT DISTINCT ?author ?role ?paper ?place ?capital ?latitude ?longitude  ?proceedings WHERE \n" +
				"{\n" +
				"?role swc:isRoleAt  eswc:2010.\n" +
				"?role swc:heldBy ?author .\n" +
				"?proceedings swc:relatedToEvent eswc:2010.\n" +
				"?paper swrc:author ?author .\n" +
				"?author foaf:based_near ?place.\n" +
				"?paper swc:isPartOf ?proceedings . \n" +
				"OPTIONAL\n" +
				"{\n" +
				"?place dbpedia:capital ?capital;\n" +
				"\tgeo:lat ?latitude;\t\n" +
				"\tgeo:long ?longitude.\n" +
				"}\n" +
				"}";
		String C8 = "prefix swc: <http://data.semanticweb.org/ns/swc/ontology#>\n" +
				"prefix swrc: <http://swrc.ontoware.org/ontology#>\n" +
				"prefix eswc: <http://data.semanticweb.org/conference/eswc/>\n" +
				"prefix iswc:  <http://data.semanticweb.org/conference/iswc/2009/>\n" +
				"prefix foaf: <http://xmlns.com/foaf/0.1/>\n" +
				"prefix purl: <http://purl.org/ontology/bibo/>\n" +
				"PREFIX dbpedia: <http://dbpedia.org/ontology/>\n" +
				"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
				"SELECT DISTINCT * WHERE \n" +
				"{\n" +
				"?paper swc:isPartOf iswc:proceedings .\n" +
				"iswc:proceedings swrc:address ?proceedingAddress.\n" +
				"?paper swrc:author ?author .\n" +
				"?author swrc:affiliation ?affiliation ;\n" +
				" rdfs:label ?fullnames ;\n" +
				" foaf:based_near ?place.\n" +
				"OPTIONAL\n" +
				"{\n" +
				"?place dbpedia:capital ?capital;\n" +
				"       dbpedia:populationDensity  ?populationDensity;\n" +
				"       dbpedia:governmentType   ?governmentType;\n" +
				"       dbpedia:language  ?language ;\n" +
				"       dbpedia:leaderTitle ?leaderTitle.\n" +
				"}\n" +
				"}";
		String C9 = "Prefix dbpedia: <http://dbpedia.org/ontology/>\n" +
				"Prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
				"Prefix owl: <http://www.w3.org/2002/07/owl#>\n" +
				"Prefix drugbank: <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/>\n" +
				"SELECT * WHERE \n" +
				"{\n" +
				"?Drug rdf:type dbpedia:Drug .\n" +
				"?drugbankDrug owl:sameAs ?Drug .\n" +
				"?InteractionName drugbank:interactionDrug1 ?drugbankDrug .\n" +
				"?InteractionName drugbank:interactionDrug2 ?drugbankDrug2 .\n" +
				"?InteractionName drugbank:text ?IntEffect \n" +
				"OPTIONAL\n" +
				"{\n" +
				"?drugbankDrug  drugbank:affectedOrganism 'Humans and other mammals';\n" +
				"drugbank:description ?description ;\n" +
				"drugbank:structure ?structure ;\n" +
				"drugbank:casRegistryNumber ?casRegistryNumber\n" +
				"}\n" +
				"}\n" +
				"ORDER BY (?drugbankDrug)\n" +
				"LIMIT 100";
		String C10 = "PREFIX tcga: <http://tcga.deri.ie/schema/>\n" +
				"PREFIX kegg: <http://bio2rdf.org/ns/kegg#>\n" +
				"PREFIX dbpedia: <http://dbpedia.org/ontology/>\n" +
				"PREFIX drugbank: <http://www4.wiwiss.fu-berlin.de/drugbank/resource/drugbank/>\n" +
				"PREFIX purl: <http://purl.org/dc/terms/>\n" +
				"SELECT  DISTINCT ?patient  ?gender ?country ?popDensity ?drugName ?indication ?formula ?compound \n" +
				"WHERE\n" +
				"{\n" +
				"?uri tcga:bcr_patient_barcode \t\t\t?patient .\n" +
				"?patient tcga:gender \t\t\t\t\t?gender.\n" +
				"?patient dbpedia:country \t\t\t\t?country.\n" +
				"?country dbpedia:populationDensity \t\t?popDensity.\n" +
				"?patient tcga:bcr_drug_barcode \t\t\t?drugbcr.\n" +
				"?drugbcr tcga:drug_name \t\t\t\t?drugName. \n" +
				"?drgBnkDrg  drugbank:genericName \t\t?drugName.\n" +
				"?drgBnkDrg  drugbank:indication \t\t?indication.\n" +
				"?drgBnkDrg  drugbank:chemicalFormula \t?formula.\n" +
				"?drgBnkDrg \tdrugbank:keggCompoundId \t?compound .\n" +
				"}";
		queries.add(C1);
		queries.add(C2);
		queries.add(C3);
		queries.add(C4);
		queries.add(C5);
		queries.add(C6);
		queries.add(C7);
		queries.add(C8);
		queries.add(C9);
		queries.add(C10);
		return queries;
	}
}
