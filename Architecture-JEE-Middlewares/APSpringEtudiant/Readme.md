            **Activité Pratique Spring MVC, Spring Data JPA, Spring Security**
          
//
Lien Video:https://drive.google.com/file/d/1dVAOhSuVbWpBP6Rp5fUx7stgLccktWuO/view?usp=sharing

           ** Couche dao**

Entité Etudiant

![img.png](images/img.png)

Etudiant Repository

![img_3.png](images/img_3.png)

Fichier de configuration

![img_1.png](images/img_1.png)

Test et création de bd

![img_2.png](images/img_2.png)


        **Couche web**

EtudiantController

![img_4.png](images/img_4.png)

Création d'un template de base pour l'affichage

    Ici nous allons utiliser le moteur de template Thymleaf pour le rendu,après avoir ajouté les dependances dans pom.xml
    j'ajoute les namespace thymeleaf et thymeleaf/layout. j'intègre aussi bootstrap

![img_5.png](images/img_5.png)

Créeation d'un template

![img_6.png](images/img_6.png)
![img_7.png](images/img_7.png)

        **Fonctionnalités**
// 

    Affichage des etudiants

Controller :il retourne la vue "etudiants" 

![img_8.png](images/img_8.png)

Vue Etudiants avec Thymeleaf avec la pagination

![img_9.png](images/img_9.png)

Resultat:

![img_10.png](images/img_10.png)

    ** Formulaire de recherche**

![img_11.png](images/img_11.png)
![img_12.png](images/img_12.png)

        **supprimer**

Controller:
 ![img_3.png](images/img_3.png)

Template:
![img_6.png](images/img_6.png)

Test:
![img_4.png](images/img_4.png)

     la page 6 devient vide
![img_5.png](images/img_5.png)


        **ajouter**

Controller:

    la fonction qui ouvre le formulaire
![img_7.png](images/img_7.png)

    la fonction save
![img_8.png](images/img_8.png)

    formulaire 
![img.png](images/img.png)


Test:

     Avec des erreurs
![img_9.png](images/img_9.png)

     bien remplie
![img_11.png](images/img_11.png)
 
    resultat
![img_12.png](images/img_12.png)


             **Editer**

Controller:

    la fonction edit ouvre le formulaire de modification et la fonction save enregistre après les modificatiobs
![img_13.png](images/img_13.png)

Test:

![img_14.png](images/img_14.png)

![img_15.png](images/img_15.png)
![img_16.png](images/img_16.png)


                                         **Security**


//

                 ** Login**
Controller:
![img_3.png](img_3.png)

template
![img.png](img.png)

                 **logout**

![img_2.png](img_2.png)

          
             **registration**
Controller
![img_4.png](img_4.png)

template
![img_1.png](img_1.png)





