# NotreApp
Ceci est NotreApp

IMPORTANT: 
Ne jamais pousser directement sur master s'il vous-plaît. 


IMPORTANT: 
Ne partager que le dossier app/src et  (il contient tous les fichiers java, ainsi que le manifest Android, ainsi que les ressources xml) et le fichier .gitignore.

Mais ne jamais pousser et partager entre nous quelque chose qui est à l'extérieur du dossier "app", 
en particulier: le dossier "idea". Si on partage le dossier "idea" on se partage des fichiers de 
configuration de l'éditeur AndroidStudio, et ça a mené à des conflits sur ma machine depuis que Nassym
et moi avons travaillé ça jeudi.


DONC QUAND VOUS FAITES UN PUSH VERS CE REPOSITORY SUR GITHUB, ASSUREZ-VOUS DE NE COCHER QUE CE QUI
EST DANS LE DOSSIER app/src



GOOGLE PLAY SERVICES :
le manifest est dans le partage, donc ça devrait aller
Mais le buiild_gradle, non!
Donc: 
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile 'com.android.support:appcompat-v7:21.0.3'
    compile 'com.google.android.gms:play-services:6.5.87'  //nouvelle regle pour googlePlay
}
dans le build.gradle
