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

---

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

---

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

---

# Objetos o Cajas

#### Un objeto es algo que en la logica de nuestro programa intenta representar el mundo real.

#### `Pseudocódigo:`

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

# Consejos y curiosidades sobre tipos de datos

#### Cuando creamos una cadena de texto siempre termina con el caracter `NULL` que es un `0` que significa `fin de cadena de texto`.

```
nombre = "Victor" + 0
```

![Fin de cadena de texto](img/Diagrama%20sin%20t%C3%ADtulo.drawio.svg "explicacion")

#### Las cadenas de texto son un `Array` de caracteres

```
arrayCaracteres = ['V', 'i', 'c', 't', 'o', 'r', 0]
```

---

# Condicionales

## LOGICAS BOOLEANA

- "Y" `(&&)`
- "O" `(||)`

```
(40 MAYOR QUE 30) Y (30 MENOR QUE 50)
       SI         &&       SI
                  SI

(40 MAYOR QUE 30) O (30 MENOR QUE 50)
       SI         ||       SI
                  SI
```

### COMPARATIVAS

- "MAYOR QUE" `(>)`
- "MENOR QUE" `(<)`
- "MAYOR O IGUAL QUE" `(>=)`
- "MENOR O IGUAL QUE" `(<=)`
- "IGUAL A" `(==)`

#### Las condiciones tienen solamente dos resultados: `True` o `False`

### Ej:

```
40 > 30 => true
40 < 30 => false
```

---

## Condicional `SI` o `IF`

### `Pseudocodigo`

```
VAR ESTACION = "VERANO"

SI (ESTACION IGUAL A "VERANO") ENTONCES
    AQUI LAS ACCIONES A TOMAR
    BEBER_AGUA()
    TOMARSE_UN_MOGITO()
    IRSE_AL_BAR()
```

### Tiene que cumplirse la condicion para seguir la acciones a tomar.

```
VAR ESTACION = "INVIERNO"

SI (ESTACION IGUAL A "VERANO") ENTONCES
    AQUI LAS ACCIONES A TOMAR
    BEBER_AGUA()
    TOMARSE_UN_MOGITO()
    IRSE_AL_BAR()
EN CASO CONTRARIO SI (ESTACION IGUAL A "PRIMAVERA") ENTONCES
    SALIR_DE_PASEO()
EN CASO DE CONTRARIO ENTONCES
    VER_NETFLIX()
```

En este caso no se cumplio las dos primera entonces quedo con la ultima condicion. Esa forma de representarlo se lo llama `Pseudocódigo`.

_Ejemplo en [codigo](./ejercicio/app/src/condicional.java)_

---

# Bucles

Bucle es hacer algo un numero determinado de veces hasta que la condicion se cumpla.

---

- ## `While`

Solo se pasa a ejecutar su contenido si se comprueba la condición.

### `Pseudocodigo`

```
VAR CONTADOR = 10

MIENTRAS (CONTADOR MAYOR A CERO)
    RESTA UNO AL CONTADOR

    SIGO POR AQUI
```

_Ejemplo en [codigo](./ejercicio/app/src/countWhile.java)_

- ## `Do while`

Funciona de forma similar, solo que nos aseguramos de que el contenido sea ejecutado al menos una vez, es decir que aunque su condición no se cumpla, su contenido se ejecuta.

### `Pseudocodigo`

```
Haz
  RESTA UNO AL CONTADOR

MIENTRAS(CONTADOR SEA MAYOR QUE 10)
```

_Ejemplo en [codigo](./ejercicio/app/src/countDoWhile.java)_

- ## `For`

Es el bucle que mas vamos a usar en todos los programas.

El bucle repititivo tiene tres partes la de declaracion e inicializacion, comparacion y la de accion. En algunos lenguajes las tres obligatorias y en otras ninguna obligatoria.

### `Pseudocodigo`

```
"PARA"(INICIALIZACION;COMPARACION;ACCION)

"PARA"(CONTADOR MAYOR QUE 0; CONTADOR IGUAL A CONTADOR MENOS 1)
   IMPRIME EL VALOR DE LA VARIABLE CONTADOR
```

Otra explicacion:

```
VAR VALORES = |10|20|30|40|50|60|
                0  1  2  3  4  5

    PARA (POSICION_EN_ARRAT=0; POSICION_EN_ARRAY < LONGITUD_DEL_ARRAY; POSICION++)
        IMPRIME EL VALOR DE LA POSICIONA CTUAL EN EL ARRAY
```

_Ejemplo en [codigo](./ejercicio/app/src/countFor.java)_

## Cuando se ocupa un `For` o un `While`?

Los `For` se utilizan tipicamente cuando se quiere recorrer un Array o tipos de datos compuestos y un `While` para comparaciones de true o false.

- `For`

```
    int valores[] = new int[5];

    for (i = 0; i < valores.length; i++ ){
        System.out.println(valores[i]);
    }
```

- `While`

```
    var temperatura = 14;

    while (tempretatura != 15) {
        System.out.println(temperatura)
    }
```

---

- ## `Switch Case`
  Un interruptor es una forma de control.

### `Pseudocodigo`

```
VAR ESTACION = "VERANO"

DICIERNTE(ESTACION)
    CASO "VERANO"
        IMPRIMIR "ES VERANO"
    RUPTURA
    CASO "INVIERNO"
        IMPRIMIR "ES INVIERNO"
    RUPTURA
    DEFECTO
        imprime la estacion de la variable
    RUPTURA
```

_Ejemplo en [codigo](./ejercicio/app/src/switchCase.java)_
