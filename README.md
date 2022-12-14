# Introduccion a la programacion

<br>

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

<br>

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

<br>

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

<br>

# Objetos o Cajas

#### Un objeto es algo que en la logica de nuestro programa intenta representar el mundo real.

### <strong>`Pseudocodigo`</strong>

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

<br>

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

<br>

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

<br>

## Condicional `SI` o `IF`

### <strong>`Pseudocodigo`</strong>

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

En este caso no se cumplio las dos primera entonces quedo con la ultima condicion. Esa forma de representarlo se lo llama `Pseudoc??digo`.

_Ejemplo en [codigo](./ejercicio/app/src/condicional.java)_

---

<br>

# Bucles

Bucle es hacer algo un numero determinado de veces hasta que la condicion se cumpla.

---

<br>

- ## `While`

Solo se pasa a ejecutar su contenido si se comprueba la condici??n.

### <strong>`Pseudocodigo`</strong>

```
VAR CONTADOR = 10

MIENTRAS (CONTADOR MAYOR A CERO)
    RESTA UNO AL CONTADOR

    SIGO POR AQUI
```

_Ejemplo en [codigo](./ejercicio/app/src/countWhile.java)_

<br>

- ## `Do while`

Funciona de forma similar, solo que nos aseguramos de que el contenido sea ejecutado al menos una vez, es decir que aunque su condici??n no se cumpla, su contenido se ejecuta.

### <strong>`Pseudocodigo`</strong>

```
Haz
  RESTA UNO AL CONTADOR

MIENTRAS(CONTADOR SEA MAYOR QUE 10)
```

_Ejemplo en [codigo](./ejercicio/app/src/countDoWhile.java)_

<br>

- ## `For`

Es el bucle que mas vamos a usar en todos los programas.

El bucle repititivo tiene tres partes la de declaracion e inicializacion, comparacion y la de accion. En algunos lenguajes las tres obligatorias y en otras ninguna obligatoria.

### <strong>`Pseudocodigo`</strong>

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

<br>

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

<br>

- ## `Switch Case`
  Un interruptor es una forma de control.

### <strong>`Pseudocodigo`</strong>

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

---

<br>

# Gestion de errores

Errores que se comente casi siempre como programador.

- `Primero:` Nombrar mal una `variable`.

  Imaginemos que tenemos que hacer un una variable que sea un `contador`.Como lo llamariamos?

  ```
  //BIEN
    var contador = 0;

  //MAL
    var foo = 0;
    var bar = 0;
    var foobar = 0;
  ```

  El codigo tiene que ser legible, por esto, la `variable` tiene que llevar el nombre de su funcion.

  Hay excepciones a esta regla utilizando bucle `for` esta permitido y no es una mala practica utilizar `variables` con nombre `"i"`, `"j"` o `"k"`

  ```
  int numero [] = {10, 20, 30, 50};

    // "i" viene de la palabra "index"

  for (int i = 0; i < numero.length; i++) {
        System.out.println(numero)
  }
  ```

  <br>

- `Segundo:` Hacer `comentarios` en el codigo donde se entiende.

  ```
  var temperatura = 15;
  // Compruebo que la temperatura sea 15
  if (temperatura == 15);
      //Ahora imprimimo su valor en pantalla
      System.out.println("es 15")
  ```

# Repercusi??n de los errores en programacion

- `Conversion de tipos:` El tema es que tenemos perdida de presicion cuando cambiamos un tipo de dato como por ejemplo de tipo float a uno tipo entero, donde el codigo compila pero tenes una perdida de presicion importate y que puede traer consecuencias mas adelante.

  - _Ejemplo en [codigo](./ejercicio/app/src/erroes_programacion/conver.java)_

- `Out of bounds (off-by-one):`Es cuando tenemos un `Array` que tiene 5 elementos y llamamos la ultima posicion `(array[5])` pero vamos a tener un error porque la posicion quinta es `4` por la forma que se cuenta los `Array` que la posicion `0` es `1`, `1` es `2`, `2` es `3` y asi sucesivamente.

  - _Ejemplo en [codigo](./ejercicio/app/src/erroes_programacion/offbyone.java)_

- `Overflow:`
  El tipo de dato `byte` es un entero de 8 bits complemento a dos. Su valor m??nimo es -128 y el m??ximo 127 (inclusive).
  - _Ejemplo en [codigo](./ejercicio/app/src/erroes_programacion/overflow.java)_

<br>

# Depuracion de codigo

Consiste buscar programas o anomalias durante la ejecucion de nuestra aplicacion creada.

## Breakpoint o Punto de interrucion

Las mayorias de los entornos de desarrollo trae depuracion de codigo y se lo marca en lado de la linea seleccionada.

![Fin de cadena de texto](img/brakpoint.png "explicacion")

## Watcher o Watchpoint

El consepto de `Watcher` es que solamente se dispara cuando cumple una condicion.

## Pila de llamadas

Nos tira en orden inversos por donde pasa nuestro aplicacion para saver donde esta el problema si no esta funcionando algo.

---

<br>

# Programacion Orientada a Objetos

La programaci??n orientada a objetos (Object Oriented Programming, OOP) es un modelo de programaci??n inform??tica que organiza el dise??o de software en torno a datos u objetos, en lugar de funciones y l??gica. Un objeto se puede definir como un campo de datos que tiene atributos y comportamiento ??nicos.

<br>

## Clases

Los objetos se declaran mediante `clases`.  
Las clases tiene propiedades que son `variables` o `constantes` y tambien tiene una serie de `funciones` para poder realizar algo.

<img src="./img/class.png" width="50%" height="50%">

## Constructor

Cuando yo no creo un `constructor` en `java` lo crea automaticamente, pero si lo creo no lo hace.
El `constructor` es donde inicializamos las `propiedades` de las `clases`

<img src="./img/constructor.png" width="50%" height="50%">

## Sobrecarga de contructores

Se lo llama asi cuando en una clase hay un contructor con `PARAMETRO` y otro sin nada.

<img src="./img/sobrecarga_constructor.png" width="50%" height="50%">

---

<br>

# Privacidad, abstraccion y encapsulacion

<br>

## **PRIVACIDAD**

## Propiedades privadas y publicas

### <strong>`Pseudocodigo`</strong>

<p>Cuando podes acceder desde fuera de una clases a su propiedades directamente, decimos que las <strong>propiedades</strong> son publicas</p>

```
  CLASE MICLASE
    PROPIEDAD1;
    PROPIEDAD2;

    FUNCION1();
    FUNCION2();

--- PROGRAMA PRINCIPAL ---

    LET unaclase INTACIA DE MICLASE
    unclase.PROPIEDAD1 = valor

```

### Cual es la diferencia entre `Publica` y `Privada`?

<p>Una <strong>propiedad privada</strong> solamente, unicamente y exclusivamente la podre utilizar dentro de la <strong>CLASE</strong></p>

### Como se la define `Publico`w y `Privado`?

<p>Dependiendo del lenguaje</p>

`java`

```
CLASE MICLASE
    public PROPIEDAD1; //Cuando es publico
    private PROPIEDAD2;//Cuando es privado
```

<br>

## **Encapsulacion**

<p>Consiste en jugar con los tipos publicos y privados, de forma, que desde la <strong>CLASE</strong>  lo manipules y que fuera de la <strong>CLASE</strong> lo puedas utilizar.</p>

```
  CLASE MICLASE
    PRIVADA PROPIEDAD1;
    PRIVADA PROPIEDAD2;
```

<p>Para encapsular tenemos que crear 2 funciones por cada una de las propiedades</p>

```
  CLASE MICLASE
    PRIVADA PROPIEDAD1;
    PRIVADA PROPIEDAD2;

    FUNCION SETTERPROPIEDAD1(TEXTO valor)
        ESTA_CLASE.PROPIEDAD1 = valor

    FUNCION GETTERPROPIEDAD1() TEXTO
        DEVUELVE EL VALOR DE ESTA_CLASE.PROPIEDAD1
```

<p>Se los van a llamar siempre <strong>SETTER</strong> y <strong>GETTER</strong> 
.</p>

- <strong>SETTER</strong> : `FIJAR` un valor
- <strong>GETTER</strong> : `OBTENER` un valor

<p>Estamos <strong>ENCAPSULANDO</strong> las propiedades para acceder a ella a travez de las funciones.</p>

## **Abstraccion**

<p>Las clases abstractas son iguales que las comencionales pero tienen que ser heredadas para poder funcionar.</p>

### <strong>`Pseudocodigo`</strong>

```
  CLASE ABSTRACTA VEHICULO
    PRIVADA TIPO;
    PRIVADA SONIDO;

    FUNCION SETTERTIPO(TEXTO valor)
        ESTA_CLASE.TIPO = valor

    FUNCION GETTERTIPO(TEXTO valor)
        DEVUELVE ESTA_CLASE.TIPO;

    FUNCION ABSTRACTA SETTERSONIDO(TEXTO sonido)
        ESTA_CLASE.SONIDO = sonido

    FUNCION ABSTRACTA GETTERSONIDO() TEXTO
        DEVUELVE ESTA_CLASE.sonido
```

<p>Las funciones abstractas son prototipos.</p>
<p>No tiene cuerpo de funcion y cuando lo herede, cada clase tiene que implementar esa funcion para su funcionalidad.</p>

- _Ejemplo en [codigo](./ejercicio/app/src/clases/abstracta.java)_

<br>

# Herencia, Polimorfismo e Interfaces

<br>

## **HERENCIA**

<p>Consiste en que una clase hereda metodos y propiedades de otro metodo de otra clase, a la clase que hereda se lo llamamos <strong>class HIJA</strong> y a la clase que sede sus funciones <strong>class PADRE</strong></p>

### <strong>`Pseudocodigo`</strong>

```
CLASE VEHICULO
    PRIVADA VELOCIDADMAXIMA;
    PRIVADA TIPOGASOLINA;

    FUNCTION diHola()
        IMPRIME "Hola"

CLASE COCHE HEREDA DE VEHICULO;
  (heredada) VELOCIDADMAXIMA
  (heredada) TIPOGASOLINA
  NUMERO_DE_PUERTAS;

  (heredada) FUNCION diHOLA()
  IMPRIME "Hola"

  FUNCTION SETTERNUMERODEPUERTAS(INTERGER puertas)
    ESTA_CLASE.NUMERO_DE_PUERTA = puertas

  FUNCTION GETTERNUMERODEPUERTAS() INTEGER
    DEVUELVE ESTA_CLASE.NUMERO_DE_PUERTAS


```

<p>Podemos crear otra clase como <strong>COUPE</strong> para que herede de la clase <strong>COCHE</strong> y asi sucesivamente. A esto se lo llama <strong>HERENCIA MULTIPLE</strong></p>

```
CLASE COUPE HEREDA DE COCHE;
  (heredada) VELOCIDADMAXIMA
  (heredada) TIPOGASOLINA
  NUMERO_DE_PUERTAS;

  (heredada) FUNCION diHOLA()
  IMPRIME "Hola"

  (heredada) FUNCTION SETTERNUMERODEPUERTAS(INTERGER puertas)
    ESTA_CLASE.NUMERO_DE_PUERTA = puertas

  (heredada) FUNCTION GETTERNUMERODEPUERTAS() INTEGER
    DEVUELVE ESTA_CLASE.NUMERO_DE_PUERTAS
```

<p>Cuando no queremos que se herede tenemos que agregar adelante de la class  <strong>"final"</strong></p>
<img src="./img/class_final.png" width="50%" height="50%">

<br>

### **Cunado utilizo una clase `PADRE` y una `HIJA`?**

<p>Utilizo una clase <strong>PADRE</strong> cuando tengo la certeza y absoluta seguridad que no voy a necesitar ningun metodo adicional que ya este en esta clase.
</p>

<br>

### **HERENCIA MULTIPLE**

<p>Conciste en que <strong>hereda</strong> de dos o mas <strong>CLASES PADRE</strong></p>

### <strong>`Pseudocodigo`</strong>

```
LASE VEHICULO
    PRIVADA VELOCIDADMAXIMA;
    PRIVADA TIPOGASOLINA;

    FUNCTION diHola()
        IMPRIME "Hola"

CLASE COCHE HEREDA DE VEHICULO Y DE MOTOR
  (heredada) VELOCIDADMAXIMA;
  (heredada) TIPOMOTOR;

```

<br>

### **HERENCIA JERARQUICA**

<p>Conciste en que de una clase base deriban otras clases y se produce una <strong>jerarquia</strong> y es parecido como un <strong>arbol familiar</strong>. </p>

### <strong>`Pseudocodigo`</strong>

```
CLASE A
  CLASE B HEREDA DE A
    CLASE UNO HEREDA DE B
    CLASE DOS HEREDA DE B

CLASE C
  CLASE C HEREDA DE A
    CLASE UNO HEREDA DE C
    CLASE DOS HEREDA DE C

CLASE D
  CLASE D HEREDA DE A
    CLASE UNO HEREDA DE D
    CLASE DOS HEREDA DE BD
```

<br>

### **HERENCIA HIBRIDA**

<p>Conciste en combinar modelos de herencias.</p>

### <strong>`Pseudocodigo`</strong>

```
CLASE A
  CLASE B HEREDA DE A
  CLASE C HEREDA DE A

  CLASE D HEREDA DE A Y HEREDA DE C
```

<p>Si lo imaginamos y lo dibujamos parece un rombo.</p>

<br>

## **POLIMORFISMO**

<p>Conciste en que las clases hijas implementan la misma funcion pero hacen distinta cosa.</p>

### <strong>`Pseudocodigo`</strong>

```
CLASE VEHICULO
    PRIVADA VELOCIDADMAXIMA;

 FUNCTION diHola()
        IMPRIME "Hola"

CLASE COCHE HEREDA DE VEHICULO
  (heredada) VELOCIDADMAXIMA;

  (heredada PERO LA SOBREESCRIBO) FUNCTION diHola()
        IMPRIME "Soy un robot y se contar del 1 al 10"
```

- _Ejemplo en [`codigo`](./ejercicio/app/src/polimorfismo/polimorfismo.java)_

  <br>

## **INTERFACES**

<p>Son parecidas a las clases abstracta pero a diferencias de ellas no implementan ninguna funcion,si no, que nos dice lo que nosotros tenemos que implementar. </p>

### <strong>`Pseudocodigo`</strong>

```
INTERFACE COCHE
  FUNCION ACELERAR(NUMERO CUANTAVELOCIDAD)
  FUNCION FRENAR(NUMERO CUANTAVELOCIDAD)
```

<p>Las <strong>INTERFACE</strong> las utilizamos cuando creamos clases y esas tiene ya funciones previamente definidas</p>

- _Ejemplo en [`codigo`](./ejercicio/app/src/_interface/interfaces.java)_

<br>

---

# Metodos de clase

<br>

<p>Un metodo de clase es, ni mas ni menos, que una <strong>FUNCION</strong>.</p>

<p>Segun el lenguaje tendra una asignatura, una firma o un prototipo.Esto seria que es la forma en la que la declaramos, si es <strong>PUBLICA</strong> o <strong>PRIVADA</strong>.</p>

<p>Publico puedo usarlo <strong>fuera de la clase</strong> y un Privado solamente puedo utilizarlo <strong>dentro de la clase.</strong></p>

### <strong>`Pseudocodigo`</strong>

```
CLASE A
  PROPIEDAD1
  PROPIEDAD2

  //Metodo
  [VISIBILIDAD][NOMBRE_METODO](PARAMETROS)[VALOR]
  PUBLICA leerLibros(TEXTO libro) TEXTO contenido
```

- _Ejemplo en [`codigo`](./ejercicio/app/src/_metodos/metodos.java)_

## **Parametros por valor o por referencia**

- Paso por valor: conciste en que cuando llamo una funcion, copio en memoria y se los doy.

  ### <strong>`Pseudocodigo`</strong>

```
FUNCION SUMA(INT A,INT B){
    DEVUELVE A + B;
}

VAR VALORA = 5;
VAR VALORB = 10;

SUMA(VALORA, VALORB);

```

- Paso por referencia: Es cuando un metodo recibe como parametro un objeto.

<br>

---

## **Recursividad**

<p>La <strong>Recursividad</strong> conciste en que un metodo se llama asi misma varias veces.</p>
<p>El problema de la <strong>recursividad</strong> es que tenemos que saber cuando detenerla porque en un momento puede llegar a  <strong>explotar el programa</strong> </p>

### <strong>`Pseudocodigo`</strong>

```
FUNCION SUMA(INT A, INT B){

    VAR TEMP = A + B;
    SUMA(A, TEMP)
}

```

<p>La forma de detener una recursividad es con un <strong>RETUNR</strong> </p>

- _Ejemplo en [`codigo`](./ejercicio/app/src/_metodos/recursividad.java)_

---

<br>

# **Lenguajes compilados e interpretados**

<br>

## **Compilador**

<p>Un compilador obtiene un secuencia de caracteres que forma un fichero de codigo y lo convierte en codigo maquina o otro lenguaje como un traducto de idiomas.</p>

## **Tipos de compiladores**

- Lenguaje Compilado
- Lenguaje Interpretado

```
CODIGO FUENTE ->[ACA TRANAJA EL COMPILADOR]-> CODIGO FINAL
```

<p>Un compilador tiene varias FASE que son:</p>

### **FASE: ANALIZADOR LEXICO**

<p>El anlizador lexico va leyendo cada unos de los caracteres y su funcion principal es obtener string de tokens</p>

```
VAR VARIABLE = 10;

~~~~~
V -> LETRA V
A -> LETRA A
R -> LETRA R
= -> SIMBOLO IGUAL
1 -> NUMERO
0 -> NUMERO
; -> PUNTO Y COMA
```

<p>Sigue analizando para saber si son palabras reservadas</p>

```
VAR -> "PALABRA RESERVADA"(COMO: IF, WHILE, DO, STATIC)
VARIABLE -> "IDENTIFICADOR"
= -> "SIMBOLO ASIGNACION"
10 -> "NUMERO ENTERO"
```

### **FASE: SINTACTICO**

<p>El analizador sintactico es el que nos avisa que estamos usando algo mal y nos tirar los famosos ERROR DE SINTAXIS</p>

```
IF (numero > 10){...}

~~~~
1.IF
2.ABRE PARENTESIS
3.CONDICION
4.CIERRA PARENTESIS
5.ABRE LLAVE
6.EXPRESIONES
7.CIERRA LLAVE
```

### **FASE: CODIGO INTERMEDIO**

<p>En esta FASE nos da un codigo que simplifica el lenguaje humano para poder representar en la estructura de datos y que lo puede manejar mejor el complilador.</p>
<p><strong>ABSTRACT SYNTAX TREE (ARBOL SINTACTICO ABSTRACTO)</strong> es llamado asi el codigo que nos da para el compilador</p>

### **FASE: OPTIMIZACION DEL CODIGO INTERMEDIO**

<p>Esta FASE pueden ser capaces de generar mas optimo del que nosotros escribimos o eliminar codigo redundante.</p>

```
VAR VARIABLE = 3;

IF (VARIABLE == 0){
  ACCION;
}
```

<p>Un ejemplo seria este en donde no funcionaria y algunos compiladores lo eliminan porque no andaria por la condicion.</p>

```
FOR (i=0; i <=4; i++){
    System.out.println("Valor actual:" + i);
}
```

<p>Otro ejemplo podria ser como este for donde el compilador entiende que esta interacci??n es mas costoso que quitar la interacci??n y dara como resultado <strong>Unroll loops</strong> que es una tecnica de optimizacion.</p>

```
    System.out.println("Valor actual: 0");
    System.out.println("Valor actual: 1");
    System.out.println("Valor actual: 2");
    System.out.println("Valor actual: 3");
    System.out.println("Valor actual: 4");
```

### **FASE: GENERACION DE CODIGO**

<p>En esta FASE vemos ya los resultados generados que puede ser:</p>

- CODIGO MAQUINA
- CODIGO PAR SER INTERPRETADO

<p>La diferencia entre los dos es que: un lenguaje  </p>
<p>Todos los compiladores funciona de la misma forma pero lo que varia es el resultado final.</p>

### <strong>`Pseudocodigo`</strong>

## **title**

<p>parrafo</p>
<br>
<strong></strong>

- _Ejemplo en [`codigo`](./ejercicio/app/src/_metodos/metodos.java)_
