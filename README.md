# Lab5

## Parte 1 

1. Realice una cinexión sincrona TCP/IP a través de Telnet al siguiente servidor
    ![TCP/IP](./Image/Telnet1.png)

2. Petición GET a telnet www.escuelaing.edu.co 80
    ![escuela](./Image/Telnet.png)  

    301 Moved Permanently: Indica que el host ha sido capaz de comunicarse con el servidor pero el recurso que solicitamos fue movido permanentemente   

    ¿Qué otros código de error existen?, ¿En qué caso se manejarán?

    ![Codigos De Error](./Image/CodigosDeError.png)    
3. Realice una nueva conexión con telnet, esta vez a
    ![httpbin](./Image/httpbin.png)

    Se obtiene un archivo html con texto 

4. Contar numero de letras del resultado

    ![WC primera parte](./Image/wcparte1.png)  
    ![WV segunda parte](./Image/wcparte2.png)

    ¿Cual es la diferencia entre el verbo GET y POST?

    ![Get vs Post](./Image/GetvsPost.png)

    ¿Que tipo de peticiones existen?

    ![Peticiones](./Image/TiposDePeticiones.png)
5. Curl 
    * Curl sin parametros

        ![curl](./Image/curl1.png)
    * Curl con parametro -v 
        ![curl -v](./Image/curl2.png)
    * Curl con parametros -i 
        ![curl -i](./Image/curl3.png)

    * ¿Cual es la diferencia entre los parametros?
        1. Parametro i: Incluye el protocolo responsable en el output 
        2. Parametro v: Retorna el output con mas información 

## Parte 2 

1. Puerto TCP/IP de Tomcat 

    ![package](./Image/Puerto.png)

    1. mvn package

        ![tomcat](./Image/mvnpackage.png)
    
    2. mvn tomcat7:run

        ![tomcat](./Image/Tomcat.png)

2. Abra un navegador y ponga la dirección con la cual se le enviarán las peticiones al SampleServer

    ![hello!](./Image/ServletHello.png)

3. Utilice el metodo GET para ingresar el valor del parametro name

    ![parametro](./Image/HelloParametro.png)

4. revise la direccion https://jsonplaceholder.typicode.com/todos/1. Intente cambiando diferentes números al final del path

    * Numero 1
        ![json1](./Image/json1.png)
    * Numero 30 
        ![json30](./Image/json30.png)
    * Numero 55
        ![json55](./Image/json55.png)
5. Implementación de la nueva clase CustomServlet.java
    * id 1
        ![test1](./Image/test1Custom.png)
    * id 26
        ![test2](./Image/test2Custom.png)
    * NumberFormatException 
        ![test3](./Image/test3Custom.png)
    * FileNotFoundException
        ![test4](./Image/test4Custom.png)
    
## Parte 3
1. Index.html
    ![html](./Image/index.png)
2. Post
    ![post](./Image/examPost.png)
3. Get
    ![get](./Image/examGet.png)

La diferencia es que si utilizamos el metodo get lo que hace es poner ?id=2
es decir, como enviarle el parametro id
