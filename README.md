# Diccionario_oscar

Mi repositorio: https://github.com/OscarLGP30/Diccionario_oscar.git



crear_tabla(tamaño). Crea y devuelve una tabla hash vacía con la cantidad de elementos, deter- minado por el tamaño ingresado

agregar(tabla, dato). Agrega el elemento a la tabla en la posición determinada por la función hash, si se produce una colisión se deberá reubicar el elemento con una función de sondeo y si es una tabla encadenada deberá utilizar una función extra para insertarla en la estructura auxiliar

quitar(tabla, dato). Elimina y devuelve el elemento de la tabla en la posición indicada por la función hash, puede requerir además aplicar la función utilizada en la inserción para resolver colisiones para encontrar dicho elemento o una función extra si es una tabla encadenada. Si devuelve None significa que no se encontró el dato en la tabla –y por ende no se elimina nin- gún elemento–

buscar(tabla, dato). Devuelve la posición de la tabla en la que se encuentra el elemento busca- do, puede requerir utilizar la función utilizada en la inserción para resolver las colisiones –si es una tabla hash cerrada– o una función extra si es una tabla hash encadenada. Si devuelve None significa que no se encontró la clave en la lista

funcion_hash(dato, tamaño_tabla). Devuelve la posición que le corresponde al dato en el vec- tor. Es probable que se disponga de más de una función hash dado que no se utilizará siempre la misma y dependerá del dominio de los datos.



sondeo(posicion, tamaño_tabla). Devuelve la nueva posición que le corresponde al dato en la tabla, para poder resolver las colisiones, o estructura auxiliar que permita resolver las colisio- nes que ocurran.

 cantidad_elementos(tabla). Devuelve la cantidad de elementos en la tabla, puede requerir uti- lizar alguna función extra si es una tabla encadenada para contar los elementos de la estruc- tura auxiliar.
