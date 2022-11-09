# Introduccion a la programacion

## Tipos de datos complejos

### Caracter

```
caracter = 'a';
```

### String (Texto)

```
//es una secuencia de caracteres
texto = "hola";
```

### Numerico

```
numeros = 321;
```

### Float

```
numeroFloat = 321.123
```

## Arrays

#### Hay diferentes tipos de Arrays :

- Array de caracter

```
 arrayChar = ['a','b','c','d'];
```

- Array de string

```
 arrayString = ['Hola','chau'];
```

- Array de numeros

```
 arrayChar = [0, 1, 2, 3];
```

- Array de numero float

```
 arrayChar = ['1.1','2.3','3.32','4.23'];
```

#### Los Array tienen que tener el `mismo tipo de dato` en la misma.

```
  arraysInvalido = ['a',"texto",10,3.5]
```

#### Los tipos compuestos a su vez pueden ser `doblemente compuestos`, es decir, que puedo tener un `Array` dentro de otro `Array`.

```
arrayArray = [
    [1, 2, 3],
    [4, 5, 6]
]

//A estos tipos de Array se los
conoce como bidimensional
porque tiene dos dimensiones.
```

## Tupla

#### Una Tupla suele ser similar a un Array pero con una diferencia, es decir, que los elementos de un `Array son variables o mutables` y las de una `Tupla son invariable o inmutable`.

```
tupla = (a, b, c) 0 (a => 1, b => 2, c => 3 )
```

#### Mapa asociativo o array asociativo son compuestos.

```
arrayAsociatiivo = ["clave" => valor]
```

#### Ejemplo:

```
arrayCapitalesPais =[
    "San Juan" => "San Juan",
    "Cordoba" => "Cordoba"
    ]
```

# Objetos o Cajas

#### Un objeto es algo que en la logica de nuestro programa intenta representar el mundo real.

#### Pseudocodigo:

```
Objeto:
    Propiedades:
        - Color: blanco
        - Forma: rectangular
    Metododos:
        - Pueden hacer algo
```

#### Ejemplo:

```
Jueguete:
    Propiedades:
        - Color: marron
        - Forma: patata
    Metododos:
        - Poner Sombrero
        - Quitar brazo
```

- `Java`

```
class Juguete {
    String Color ="blanco";
    String Forma = "patata";

    ponerSombrero(){}
    quitarBrazo(){}
}
```

# Consejos y curiosidades sobre tipos de datos

#### Cuando creamos una cadena de texto siempre termina con el caracter `NULL` que es un `0` que significa `fin de cadena de texto`.

```
nombre = "Victor" + 0
```

#### Las cadenas de texto son un `Array` de caracteres

```
arrayCaracteres = ['V', 'i', 'c', 't', 'o', 'r']
```
