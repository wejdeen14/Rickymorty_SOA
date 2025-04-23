
# 🛸 Rick & Morty – Architecture Orientée Services (SOA)

**Projet universitaire** développé dans le cadre d’un apprentissage des **architectures orientées services (SOA)**, utilisant l’API publique de Rick and Morty pour afficher, rechercher et gérer des personnages issus de l’univers.

---

## 📌 Description

Cette application web consomme l’API publique de **Rick and Morty** afin de :

- 📋 Afficher une **liste de personnages**
- 🔎 Permettre la **recherche par nom**
- 👁️ Afficher les **détails de chaque personnage**

> Le projet simule une **architecture en microservices**, à des fins pédagogiques.

---

## 🧰 Technologies utilisées

- Java / Spring Boot
- REST API
- JSON
- Maven
- Postman (pour les tests)
- API externe : [rickandmortyapi.com](https://rickandmortyapi.com/)

---

## 📦 Fonctionnalités principales

| Fonctionnalité              | Description                                                       |
|----------------------------|-------------------------------------------------------------------|
| 🔍 Liste des personnages   | Récupération dynamique depuis l’API                               |
| 🔎 Recherche par nom       | Filtrage interactif via champs de recherche                       |
| 👤 Détails du personnage   | Affichage complet (image, statut, espèce, localisation, etc.)     |
| 🧱 Architecture SOA        | Architecture simulée en microservices                             |
| 🧪 Tests via Postman       | Tests API pour valider les endpoints REST                         |

---
## 📸 Aperçu
![Aperçu Rick et Morty](ricky.PNG)


> ## 🙋‍♀️ Développeuse

**Wejden Ben Yaagoub**  
📍 Développeuse Full Stack  
🔗 [LinkedIn](https://www.linkedin.com/in/wejdenbenyaagoub/)  
📫 [benyaagoubwejden@gmail.com](mailto:benyaagoubwejden@gmail.com)


## 🚀 Installation

```bash
git clone https://github.com/wejdeen14/Rickymorty_SOA.git
cd Rickymorty_SOA
mvn spring-boot:run
