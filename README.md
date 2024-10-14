# JPA-Hibernate


Ce projet est un système de gestion de stock, de projets, et de produits développé en Java. Il permet de gérer les projets, les tâches associées, ainsi que diverses opérations de manipulation de données. Le framework de persistance JPA Hibernate est utilisé pour simplifier les opérations CRUD. Le développement est principalement réalisé dans l'IDE NetBeans.


## Technologies Utilisées

- **Java** : Pour la logique de programmation et la gestion des opérations sur les données.
- **JDBC (Java Database Connectivity)** : Pour interagir avec la base de données MySQL.
- **MySQL** : Système de gestion de base de données utilisé pour stocker les informations sur les employés et les messages.
- **Hibernate** : Framework de persistance pour la gestion des entités Java en base de données.
- **NetBeans** : IDE recommandé pour le développement, le test et le déploiement de l'application.

## Prérequis

Avant de commencer, assurez-vous d'avoir les éléments suivants installés :

- **Java JDK 8+** : [Télécharger ici](https://www.oracle.com/java/technologies/javase-downloads.html).
- **MySQL** : [Télécharger ici](https://dev.mysql.com/downloads/installer/).
- **Pilote JDBC MySQL** : [Télécharger ici](https://dev.mysql.com/downloads/connector/j/).
- **Hibernate** : Les dépendances peuvent être ajoutées directement dans NetBeans.
- **NetBeans** ou un autre IDE Java : [Télécharger ici](https://netbeans.apache.org/download/index.html).

## Installation

### 1. Configuration de la Base de Données
- Installez MySQL et créez une base de données nommée `messagerie`.
- Créez les tables nécessaires pour gérer les employés et les messages. Le script SQL est fourni dans le fichier `setup.sql` du projet.

### 2. Configuration de Hibernate
- Dans le projet, créez un fichier de configuration `hibernate.cfg.xml` dans le package `ma.projet.config`. Ce fichier doit contenir les informations de connexion à la base de données MySQL, y compris l'URL, le nom d'utilisateur et le mot de passe.
- Exemple de fichier `hibernate.cfg.xml` :
  ```xml
  <!DOCTYPE hibernate-configuration PUBLIC "-//Hibernate/Hibernate Configuration DTD 3.0//EN" "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
  <hibernate-configuration>
    <session-factory>
      <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/(DBname)</property>
      <property name="hibernate.connection.username">votre_username</property>
      <property name="hibernate.connection.password">votre_password</property>
      <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
      <property name="hibernate.hbm2ddl.auto">update</property>
    </session-factory>
  </hibernate-configuration>

## Fonctionnalités Clés

- **Requêtes SQL :**  
  Permet d'exécuter des requêtes telles que :  
  - Identifier le développeur ayant produit le plus de scripts en une journée.
  - Classer les développeurs selon leur production hebdomadaire.
  - Calculer le total de scripts réalisés par un développeur spécifique.

### 1. Gestion de Projet
- **Création de projets** : Permet de créer de nouveaux projets avec des informations détaillées comme le nom, la date de début, et les membres impliqués.
- **Suivi des tâches** : Gère les tâches associées à chaque projet, en incluant les dates de début et de fin, ainsi que leur statut.
- **Affichage des projets** : Affiche la liste de tous les projets avec leurs détails, y compris les tâches assignées et leur progression.
- **Recherche et filtrage des projets** : Recherche des projets selon des critères spécifiques, comme les membres impliqués ou les dates de début et de fin.

### 2. Gestion de Stock
- **Ajout de nouveaux articles** : Permet d’ajouter de nouveaux articles au stock avec des informations détaillées comme la quantité, le prix, et la catégorie.
- **Mise à jour des niveaux de stock** : Suit les niveaux de stock et met à jour les quantités en fonction des entrées et sorties.
- **Affichage de l’état des stocks** : Fournit un aperçu complet des articles en stock, avec la possibilité de filtrer par catégorie ou par date.
- **Alertes de stock bas** : Génère des alertes pour les articles dont les niveaux de stock sont inférieurs à un seuil défini.

### 3. Gestion de Produit
- **Création de produits** : Crée de nouveaux produits avec des détails tels que la description, le prix, et la catégorie.
- **Modification des informations de produit** : Met à jour les informations sur les produits existants.
- **Suppression de produits** : Permet de supprimer des produits du système lorsque nécessaire.
- **Affichage et filtrage des produits** : Affiche la liste des produits avec des options de filtrage, par exemple par catégorie ou par fourchette de prix.

## Technologies Utilisées

- **Java :** Pour la logique de programmation et l'interaction avec la base de données.
- **JDBC (Java Database Connectivity) :** Pour l'accès et la manipulation des données MySQL.
- **MySQL :** Système de gestion de base de données utilisé pour stocker les informations des développeurs et leurs scripts.
- **Hibernate :** Framework de persistance pour simplifier les opérations CRUD sur la base de données.
- **NetBeans :** IDE recommandé pour le développement et les tests.

## Prérequis

Avant d'exécuter ce projet, il est nécessaire d'avoir :

- **Java JDK 8+ :** Pour l'exécution du code Java.
- **MySQL :** Pour le stockage des données des développeurs.
- **Pilote JDBC MySQL :** Pour établir la connexion entre Java et MySQL.
- **Hibernate :** Pour gérer la persistance des données entre les entités Java et la base de données.
- **NetBeans ou un autre IDE compatible avec Java.**

## Les démonstrations 

https://github.com/user-attachments/assets/825de0c0-ff1c-40ea-b9e7-68ccb8f0dac9


