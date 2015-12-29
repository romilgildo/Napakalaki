# Napakalaki

Consiste en un pequeño juego de cartas de mesa inspirado en el juego Munchkin. 

![Interfaz del Napakalaki](http://i628.photobucket.com/albums/uu6/romilgildo/napaka_zpsl9qg1v0b.png~original)

## Dinámica del juego

En el juego Napakalaki pueden participar de 3 a 4 jugadores, identificados por un nombre único y cuyo nivel inicial es 1. Gana el juego el jugador que llegue primero al nivel 10.

El juego contiene dos barajas de cartas: tesoros y monstruos. Los jugadores deben combatir con los monstruos y para ello pueden usar los tesoros, tal y como se describe a 
continuación.

### Tesoros

Los tesoros poseen un nombre, valen una cierta cantidad de piezas de oro, y suponen al jugador que los tiene poder enfrentarse a un monstruo con un cierto número de niveles 
adicionales a los que él tiene como jugador (lo que se denomina un bonus). Hay varios tipos de tesoros: de mano (una o dos manos), casco, calzado, armadura y collar. 

Puede haber tesoros sin bonus, cuya utilidad es simplemente la de su valor en piezas de oro. Los tesoros que tienen 2 bonus distintos, suman el valor más bajo si el jugador no 
dispone del tesoro “collar” y suman el nivel más alto si se dispone del tesoro “collar”.

A las cartas de tesoro que puede utilizar un jugador para combatir se les denomina cartas “equipadas” y se muestran a todos los jugadores. Cada jugador puede equiparse con un 
único tesoro de cada tipo (salvo los tesoros que sólo ocupan una mano, en cuyo caso puede tener dos). Así, cada jugador podría equiparse en el mejor de los casos con una 
armadura, un tesoro de dos manos, un casco, un calzado y un collar; o con una armadura, dos tesoros de una mano, un casco, un calzado y un collar.

Además de los tesoros equipados, cada jugador podrá tener además hasta cuatro tesoros “ocultos” en la mano que los demás jugadores no pueden ver. En el combate contra un 
monstruo, al nivel del jugador se sumará el bonus de todos sus tesoros equipados, no así el de sus tesoros ocultos. Al final de cada turno, el jugador podrá equiparse de nuevos 
tesoros (haciendo visible una o varias cartas que tenía ocultas en la mano), respetando las restricciones comentadas anteriormente.

Si un jugador tiene equipado el collar, el resto de tesoros actúan con el bonus más alto. Pero tras un combate contra un monstruo en el que ha intervenido el collar y el jugador ha 
ganado, éste debe descartarse obligatoriamente del collar. No lo puede volver a usar hasta que le vuelva a salir al robar un tesoro del mazo.

### Monstruos

Cada monstruo tiene un nombre que lo identifica y un cierto nivel de combate, además indica   cuántos   niveles   y/o   tesoros   gana   el   jugador   que   le   venza   (“buen   rollo”).   Sin 
embargo, también indica un “mal rollo”, que determina cuántos niveles y/o tesoros (ocultos y/o visibles y de qué tipo) pierde el jugador que sucumba. Si el mal rollo es “muerte”, el 
jugador pierde todos sus tesoros (visibles y ocultos) y vuelve a quedar con nivel 1.

Por defecto, al vencer a un monstruo se sube un nivel, a no ser que el monstruo indique explícitamente que se suben más.

### Juego

El jugador que comienza el juego se decide al azar, y después se sigue el orden de las agujas del reloj. En el primer turno que tiene cada jugador, lanza el dado para saber con 
cuantos tesoros comienza: si obtiene un 1 en el dado, comienza con 1 tesoro, si obtiene entre un 2 y un 5 en el dado, comienza con 2 tesoros, y si obtiene un 6, comienza con 3 
tesoros.

En su turno, el jugador debe sacar una carta del mazo de monstruos y combatir contra el monstruo que salga, pudiéndose dar uno de estos casos:
- Si el monstruo tiene un nivel inferior al nivel total del jugador (su nivel más el bonus de todos los tesoros que tenga equipados), gana el jugador y se aplica el “buen 
rollo” correspondiente (sube un nivel – o más si así lo indica el monstruo – y roba el número de tesoros que se indique). Si tiene equipado el collar, los tesoros han 
sumado al nivel del jugador el bonus más alto y debe descartarse del collar.
- Si el monstruo tiene un nivel mayor o igual al total del jugador, el jugador tiene la posibilidad de intentar huir tirando un dado. 
  - Si el resultado es 5 o 6, entonces el jugador logra huir y se queda tal y como estaba. 
  - En caso contrario, se aplica el “mal rollo” indicado por el monstruo: el jugador se descarta de los tesoros y pierde el número de niveles que se indique.

El nivel mínimo de un jugador es 1, es decir, que si un jugador tiene nivel 2 y sucumbe ante un monstruo cuyo mal rollo es bajar 3 niveles, se queda con nivel 1 (nunca se puede 
quedar en negativo o cero).

Un jugador puede quedarse en situación de muerte porque lo indique el mal rollo del monstruo con el que ha combatido. En ese caso, lanzará el dado para equiparse con 
algún tesoro antes del siguiente combate. Se equipará con 1, 2 ó 3 tesoros según lo que obtenga en el dado, aplicando la misma correspondencia que al principio de la partida.

Los tesoros recibidos por el jugador siempre pasarán a formar parte de su lista de tesoros ocultos. Después del combate, el jugador puede equiparse las cartas que considere 
oportuno. En caso de quedarse con más de 4 cartas ocultas, deberá descartar las que juzgue que le serán menos útiles hasta quedarse con un máximo de 4 cartas ocultas.

Las cartas visibles no pueden pasar nunca a ser ocultas. Por ejemplo, un jugador no puede cambiar un casco que se haya equipado por otro con un bonus mayor que tenga 
oculto. Sin embargo, sí podrán ser susceptibles de ser elegidas como descartes cuando el mal rollo del monstruo no indique explícitamente qué tipo de tesoros se pierden.

Finalmente, es posible comprar un nivel con 1.000 piezas de oro. La compra se realizará al principio del turno del jugador, antes de sacar el monstruo con el que debe combatir. 
Para ello, el jugador deberá descartarse de tantos tesoros como sea necesario para sumar dicha cantidad. Es posible comprar tantos niveles como se crea conveniente (1 
nivel – 1000 piezas de oro, 2 niveles – 2000 piezas de oro), y es posible usar tesoros tanto visibles como ocultos. El juego no devuelve el cambio, si un jugador emplea tesoros por valor de 1900 piezas de oro para comprar niveles, el sistema sólo le dará un nivel y perderá los tesoros empleados.

Tras el combate, el monstruo en juego se descarta y el jugador podrá equiparse algunos de sus tesoros ocultos tesoros, respetando las restricciones comentadas anteriormente
