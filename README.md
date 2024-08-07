## Projet Démonstration : Spring Boot WebFlux et Kafka
#### Description
Ce projet de démonstration illustre l'intégration de Spring Boot avec WebFlux pour créer des applications réactives et l'utilisation de Kafka pour le traitement des messages en temps réel. L'objectif est de fournir un exemple pratique de la manière dont ces technologies peuvent être combinées pour créer des systèmes scalables et performants.
#### Fonctionnalités
- Spring Boot WebFlux : Implémentation de services réactifs utilisant le paradigme non-bloquant pour une meilleure scalabilité.
- Apache Kafka : Gestion de la communication asynchrone entre les différents composants de l'application via des topics Kafka.
- Exemples d'API : Points de terminaison pour illustrer l'envoi et la réception de messages via Kafka.
#### Prérequis
- Java 17 ou version ultérieure
- Apache Kafka (installé et en cours d'exécution)
- Maven (pour la gestion des dépendances)
#### Installation
- 1. Clonez le dépôt : https://github.com/abdoulkarim20/Spring-WebFlux-Apache-Kafka
- 2. Accédez au répertoire du projet : cd Spring-WebFlux-Apache-Kafka/productmanagement
- 3. Compilez et exécutez le projet
- 4. Assurez-vous que Kafka est en cours d'exécution : Vous pouvez télécharger et démarrer Kafka à partir de kafka.apache.org.
#### NB : Pour une meilleure demonstration :
Veuillez suivre les instructions de la documentation officielle pour installer Apache Kafka sur votre machine. Ce guide vous aidera à configurer Kafka et à démarrer un broker localement.
#### Configuration
- Renommez le fichier de configuration : Dans le répertoire src/main/resources, renommez le fichier exemple.properties en application.properties.
- Modifiez les paramètres selon vos besoins : Ouvrez application.properties et ajustez les configurations en fonction de votre environnement, notamment les paramètres de Kafka et d'autres propriétés spécifiques à votre application.
