__Description des applications__

__*DemoJPAHibernate*__ est une application qui permet de comprendre les points suivants:
  1. Les étapes de création d'un projet JPA	
  2. Comment rendre une classe java persistante par JPA
  3. Comprendre les classes et interfaces EntityManagerFactory, EntityManager, EntityTransaction
  4. Comprendre le fichier de configuration de JPA: persistence.xml
  
 __*DemoAssociationManyToOne*__ est une application qui permet de comprendre la mis en oeuvre
d'un mapping 'plusieurs à un'.

__*DemoMappingCollectionsJPA*__ est une application qui permet de comprendre la mis en oeuvre
d'un mapping 'un à plusieurs'.

__*DemoMappingHeritageJPA*__ est une application qui permet de comprendre la mis en oeuvre
d'une relation d'héritage JPA.

__*DemoJPAHibernateMaven*__ est une application qui permet de comprendre la mis en oeuvre
d'une relation d'héritage JPA avec maven.

__Pré-requis avant execution__	

*Installer un jdk ou au moins un jre sur son ordinateur.*  

Pour l'installation merci de suivre les étapes suivantes:
  * Rendez-vous sur la partie Java du site d’Oracle : http://www.oracle.com/technetwork/java
  * Dans la zone de droite ’software downloads’, cliquez sur le lien ’Java SE’ (pour Java Standard Edition)
  * Cliquez sur l’icône ’Java’ pour télécharger le JDK
  * Accepter la licence
  * De préférence choisir la version la plus récente (dernière sur la liste)
	* Si votre machine est une 64 bit, choisir le jdk dont le nom a 'windows-X64' avant le '.exe'
	* Si votre machine est une 32 bit, choisir le jdk dont le nom a 'windows-i586' avant le '.exe' la version 32 bit fonctionne sur un Système Windows 32 bit ou 64 bit.
  * Cliquez sur le bouton ’Enregistrer le fichier’. Le téléchargement commence	 
  * Double cliquez sur le fichier téléchargé. L’assistant d’installation du JDK se lance
  * Cliquez sur le bouton ’Next’ des fenêtre qui vont s'afficher
  * Au moment d’installer un environnement d’exécution indépendant du JDK, l’assistant vous consulte. Acceptez les options par défaut et cliquez sur Next
  * Ainsi même si vous supprimez par la suite le répertoire d’installation du JDK (qui contient aussi une JRE), vous pourrez tout de même exécuter des programmes Java sur votre ordinateur
  * Vous arrivez à l’écran de fin d’installation, qui vous précise que l’installation s’est bien déroulée 
  * Cliquez sur Close: L’installation du JDK est terminée. 

__Installer un IDE sur son ordinateur__ 

*Dans notre cas nous allons installer Eclipse.*

Pour l'installation merci de suivre les étapes suivantes:
  * Rendez-vous à l'adresse https://www.eclipse.org/downloads/
  * Cliquez sur le bouton Télécharger 64 bits
  * Cliquez ensuite sur Télécharger
  * Démarrez l'exécutable du programme d'installation
  * Sélectionnez le package à installer
  * Sélectionnez votre dossier d'installation
  * Lancez Eclipse 

__Version du jdk__

java version "1.8.0_73"  
Java(TM) SE Runtime Environment (build 1.8.0_73-b02)  
Java HotSpot(TM) 64-Bit Server VM (build 25.73-b02, mixed mode)

__Execution de l'application__ 

*Veuillez suivre les indications suivantes:*
1. Téléchargez le fichier compressé Nom_projet.zip
2. Décompressez le dans votre workspace C:\Users\nom_utilisateur\eclipse-workspace	
3. Dans Eclipse cliquez sur file > Open Projects from File System...	
4. Sélectionnez le projet Nom_projet	
5. Cliquez sur finish
6. Clic droit sur le dossier Nom_projet > Run As > Java Application
