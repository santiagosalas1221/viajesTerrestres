# CHALLENGE - RESOLVIENDO PROBLEMA DE VIAJES TERRESTRES 
## Summary
Se tiene un problema en los dias del COVID-19, se requiere movilizar a diferentes ciudades del municipio de Antioquia, pero existe restricciones por la eventualidad de contraer el virus del COVID-19. El presidente declaro que es viable ahora poder movilizarse bajo ciertos controles de seguridad:
- No se permite compartir la silla del pasajero.
- Se debe tener el cubre bocas en todo el viaje
- El conductor no puede cambiar de rutas
- Se puede hacer escalas si es necesario pero el conductor no puede cambiar a otro vehículo.

### Lo que se espera:
Tener una funcionalidad en cualquier lenguaje de programación (Java, PHP, C#, NodeJS) que permita seleccionar un bus del listado y una serie de pasajeros permitidos para realizar el viaje a un destino particular, sin violar las restricciones del presidente y permitiendo que todos los pasajeros puedan hacer su viaje.

## Caso de Uso:
Como pasajero deseo hacer un viaje hacia **Santa Rosa de Osos**, que queda cerca de San José de la Montaña, solo hay 4 buses que pasa en esa ruta y dos de ellos hacen trasbordo en San José de la Montaña, los 4 buses tiene una capacidad de sillas de 40 pero existen 80 personas que desean viajar a Santa Rosa de Osos y 30 personas a San José de la Montaña. Yo soy el número de la lista 28 del listado de pasajeros y deseo hacer el viaje a **Santa Rosa de Osos**.
Por orden de llegada se debe definir el cupo de los pasajeros. 

- ¿Podré hacer el viaje?
- ¿En qué bus me tocaría irme?
- ¿Con cuantas personas me acuerdo voy?

Son preguntas que se debe cuestionar para implementar el caso de uso.

## Criterios 

||Criterio|Porcentaje|
|--|--|--|
|1|Se tiene una clase que liste todos los buses, municipios y pasajeros	|15 %|
|2|	Agregar un nuevo pasajero a un bus dentro de un destino dado, validando cupo del bus	|10 %|
|3|	Se aplicar un diseño de software en el cual que tenga divisadas las capas en base de datos y controlador	|20 %|
|4|	Implementa un sistema de persistencia de datos como MySQL	|10 %|
|5|	Se tiene una clase para asociar los pasajero a los buses, y esta clase valida las asociaciones	|20 %|
|6|	Se tiene una funcionalidad para crear pasajeros, buses y municipios	|15 %|
|7|	Consulta que busque un pasajero en todos los buses y que muestre el origen y destino de ese pasajero.	|10 %|