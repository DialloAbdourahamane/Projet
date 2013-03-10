<h1>Modalités organisationnelles</h1>
  <ul>
        <li>Gestionnaire de versions : Git</li>
        <li>Forge: GitHub</li>
        <li>Nom du projet sur GitHub : Projet<li>
        <li>Repository sur GitHub : <a href="https://github.com/marianendiaye/Projet.git">aller sur repository du projet</a></li>
        <li>Licence : BSD</li>
  </ul>

<h1>Logiciel de développement</h1>
          Eclipse STS 3.1.0

<h1>Configuration des outils</h1>
  <ol> <li>Configuration Git</li>
      <li>  
            Le nouveau développeur doit disposer d'un compte GitHub ou en créer
            un (sur https://github.com et suivre les instructions sur la page https:/
            /help.github.com/articles/generating-ssh-keys#platform-linux
            mettre à jour vos clés SSH sur votre environnement de développement
          et sur votre compte Github) et le communiquer au groupe</li>
      <li>Le nouveau développeur sera ajouté comme contributeur sur le projet</li>
      <li>Installer GitBash pour Windows (http://git-scm.com/ )</li>
      <li>Créer un dossier Projet, ouvrir GitBash et se placer sur le dossier Projet
        et cloner le projet depuis GitHub à l'aide de GitBash :
        git clone https://github.com/marianendiaye/Projet.git</li>
  </ol>
<h1>Configuration Eclipse STS</h1>

  <ol>
        <li>Télécharger Eclipse STS suite basé sur Eclipse 3.8.1 JUNO pour
            Windows et choisir le fichier .zip (http://www.springsource.org/
            downloads/sts-ggts ), si ce n'est pas déjà fait et suivre les instructions
            d’installation</li>
        <li>Rendez-vous sur Eclipse STS se placer dans la vue « package explorer »
            et faire un import du projet en tant que projet Maven</li>
        <li>Dans la vue « package explorer », faire un clique droit sur le projet
            cliquez sur « Team > Share Project ». Choisir le type de repository «Git ».
            Suivre les instructions d'Eclipse STS pour créer un nouveau repository Git associé à votre projet.</li>
    </ol>

<h1>Déroulement du développement</h1>

    <ul>
          <li>Avant de démarrer votre développement, il faudra créer une branche sur laquelle seront faites les modifications.</li>
          <li>Par la suite une fois que les modifications seront entérinées, il faudra :
              <ul>
                    <li>envoyer la branche sur le repository distant (pour conserver une trace de la création de la branche)
                    </li>
                    <li>fusionner cette branche avec la branche master local
                    </li>
                    <li>Faire un git pull pour récupérer les mises à jour du projet sur le répertoire distant et effectuer 
                      la fusion de la branche master distanteavec la branche master locale
                    </li>
                    <li>Envoyer les modifications sur le repository distant à l’aide de git push.
                    </li>
              </ul></li>
          <li>Pour créer une branche il existe deux moyens :
              <ul>
                    <li>A l'aide de GitBash : se placer dans le répertoire contenant le projet
                        qui a été cloné, et exécuter la commande : git branch -b « nom de la branche »
                    </li>
                    <li>A l'aide de Eclipse STS : dans la vue « package explorer », cliquez droit
                        sur le projet, cliquez sur « Team > Switch To > new branch » et suivre
                        les instructions à fin de créer la nouvelle branche.
                    </li>
              </ul>
            <li>Afin de fusionner la branche créée dans la branche master local
                
                <ul>
                      <li>A l'aide de GitBash : se placer dans le dossier Projet, puis se placer sur
                          la branche master (exécuter la commande : git checkout master ), puis
                          fusionner avec la branche (exécuter la commande : git merge « nom de la branche »
                      </li>
                      <li>A l'aide de Eclipse STS : se placer sur la branche master, dans la
                          vue « package explorer », faire clic droit sur le projet, cliquez sur 
                          «Team > Switch To > master », ensuite toujours sur la vue « package explorer », 
                          cliquez droit sur le projet cliquez sur « Team > Merge> puis selectionner la branche à fusionner
                      </li>
                </ul>
            <li>Pour envoyer les modifications de la branche master sur le repository distant :
                <ul>
                    <li>La première fois vous devez crée un remote qui sera un alias sur le
                        repository distant, afin de faciliter l'interaction avec ce dernier.
                        Pour créer un remote :</li>
                    <li>A l'aide de GitBash : se placer dans le dossier Projet, puis exécuter la commande :
                        git remote add origin https://github.com/marianendiaye/Projet.git , puis
                        vérifier que le fetch et le push de origin référence bien le remote déclaré
                        précédemment (exécuter la commande : git remote -v).</li>
                    <li>A l'aide de Eclipse STS : pas besoin de créer un remote, juste vérifier
                        que le push et le fetch référencient bien le repository distant. Pour
                        cela, il faut se placer dans la vue « package explorer », clic droit sur
                        le projet cliquez sur « Team > remote > Fetch From ». Même chose
                        pour le pull, clic droit sur le projet cliquez sur « Team > remote >Pull »
                       </li>
              </ul>
        </ul>
<h1>Contraintes du développement: </h1>
    <ul>
        <li>Tout code ajouté devra être commenté</li>
        <li>Écrire les classes de test correspondantes à chaque classe créee</li>
        <li>Les classes seront ajoutées au package src/main/java</li>
        <li>Les classes correspondantes aux tests seront ajoutés au package src/test/java</li>
    </ul>
