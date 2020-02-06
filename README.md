##** Choucair Testing 

Introducción 🚀
_Automatización de la página web choucairtesting.com

Descripción y contexto📝
Página Web, que permite .......

Pre-requisitos📋
-Java v1.8 update 151 o superior y JDK (variables de entorno configuradas) -Eclipse IDE o IntelliJ IDEA -Gradle v4.10.2 o superior (variables de entorno configuradas) Cucumber

Instalación🔧
Para clonar este repositorio localmente, se debe ejecutar el siguiente comando: git clone https://github.com/anamariajimenezacevedo/ChoucairTesting.git
Importar el proyecto desde Eclipse o IntelliJ IDE bajo la estructura de un proyecto Gradle existente
Configurar JRE System Library con JavaSE-1.8
Compilar El Proyecto y Generar Wrapper 🔨
Para compilar el proyecto se debe ejecutar el comando: gradle clean build -x test
Navegadores Web 🌐
La automatización actualmente se ejecuta en los siguientes navegadores

Google Chrome v79
Para Ejecutar Las Pruebas ⚙️
Para correr el proyecto se necesita Java JDK 1.8 y Gradle con la versión 5.6.1


▶️ Ejecutar el runner.
Pruebas End-To-End 🔛
Con esta automatización se realiza xxxxxxx, para después MMMMM ; Una vez MMMMMMM, acción. 

Detalles Generales De La Implementación 💻
Cada línea de los escenarios de pruebas creados en el feature bajo lenguaje Gherkin, se conectan con un método de las clases StepDefinitions con la ayuda de anotaciones @Given, @When y @Then, desde el StepDefinitions se conectan con las clases tipo Task donde se realizan las acciones de alto nivel  y desde las cuales se pueden invocar clases tipo Interactions en las cuales se realizan acciones de bajo nivel (p. ej. Scroll).

🚧 La estructura completa del proyecto es la siguiente:
src/test/java 
-co.com.choucair.testchoucair.runners: Runners para ejecutar la automatización con los escenarios indicados en el feature.
-co.com.choucair.testchoucair.stepdefinitions: Clases que son el punto de entrada del feature para traducir de lenguaje natural a lenguaje máquina y así permitir la ejecución de la automatización.
-co.com.choucair.testchoucair.steps:Clases que realizan las acciones de alto nivel.
-co.com.choucair.testchoucair.userinterface: Clases donde se mapean los elementos de la interfaz de usuario y a su vez para la interacción con cada uno de estos elementos.

src/test/resources
-drivers Se almacenan los drivers necesarios para que la automatización puede ejecutarse en los navegadores web.

-features Se encuentra los features del proyecto.

Construido Con 🛠️
La automatización fue desarrollada con:

BDD - Estrategia de desarrollo
POM - Patrón de diseño
Gradle - Gestor de dependencias
Selenium Web Driver - Herramienta para automatizar acciones en navegadores web
Cucumber - Herramienta para automatizar pruebas BDD
Serenity BDD - Biblioteca de código abierto para la generación de reportes
Gherkin - Lenguaje Business Readable DSL (Lenguaje especifico de dominio legible por el negocio)
Versionado 📌
Se uso GIT para el control de versiones, aplicando GitFlow 🔀

Autores ✒️
Ana María Jimenez Acevedo - ** - [anamariajimenezacevedo@gmail.com]
