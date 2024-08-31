# Proyecto: Sistema de Gestión de Carga y Descarga en el Puerto de Rosario

El Puerto de Rosario nos ha solicitado el desarrollo de un programa para conocer información referida al operatorio de carga y descarga en los diferentes muelles en un periodo de tiempo. Para ello, se nos proporciona un archivo `barcos.csv` que contiene la información necesaria, la cual debemos importar en nuestro programa. A continuación, se detalla el conjunto de clases derivadas del análisis realizado.

## Clases

- **Puerto**: Contiene todos los barcos que necesitan ser procesados para generar la información del sistema solicitado.

- **Barco**: Representa una embarcación con la siguiente información:
  - **Matrícula**: Identificación del barco.
  - **Número de muelle**: Número del muelle de carga.
  - **Capacidad de carga**: Capacidad permitida en toneladas.
  - **Costo de alquiler**: Costo por hora de amarre.
  - **Capitán**: Persona a cargo de la nave.

- **Capitán**: Abstracción que representa a una persona a cargo de una embarcación, con los siguientes datos:
  - **Identificador**: ID del capitán.
  - **Nombre**: Nombre del capitán.
  - **Apellido**: Apellido del capitán.
  - **Antigüedad**: Años de experiencia en el cargo.

## Requisitos

1. **Modelo de Clases**: Generar el modelo de clases que soporte este dominio de problema, incluyendo la estructura básica de atributos y métodos.

2. **Carga de Embarcaciones**: Cargar las embarcaciones desde el archivo CSV en un array de objetos del tipo `Barco`.

3. **Cálculo de Recaudación**: Asumiendo que el tiempo promedio de carga de una embarcación es de 15 horas, calcular el total de carga que recaudará el puerto con todos los barcos amarrados (cargados en el array).

4. **Listado de Barcos**: Informar todos los barcos cuyo capitán tenga más de 18 años de experiencia en un listado.

5. **Carga Promedio**: Determinar la carga promedio en toneladas de todos los barcos ubicados en posiciones pares de amarre.
