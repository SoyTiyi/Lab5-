# Lab5

## Parte 1 

1. Realice una cinexión sincrona TCP/IP a través de Telnet al siguiente servidor
    ![TCP/IP](./Image/Telnet1.png)

2. Petición GET a telnet www.escuelaing.edu.co 80
    ![TCP/IP](./Image/Telnet.png)  

    301 Moved Permanently: Indica que el host ha sido capaz de comunicarse con el servidor pero el recurso que solicitamos fue movido permanentemente   

    ¿Qué otros código de error existen?, ¿En qué caso se manejarán?

    ![TCP/IP](./Image/CodigosDeError.png)    
3. Realice una nueva conexión con telnet, esta vez a
    ![TCP/IP](./Image/httpbin.png)

    Se obtiene un archivo html con texto 

4. Contar numero de letras del resultado

    ![TCP/IP](./Image/wcparte1.png)  
    ![TCP/IP](./Image/wcparte2.png)

    ¿Cual es la diferencia entre el verbo GET y POST?

    ![TCP/IP](./Image/GetvsPost.png)

    ¿Que tipo de peticiones existen?

    ![TCP/IP](./Image/TiposDePeticiones.png)
5. Curl 
    * Curl sin parametros

        ![TCP/IP](./Image/curl1.png)
    * Curl con parametro -v 
        ![TCP/IP](./Image/curl2.png)
    * Curl con parametros -i 
        ![TCP/IP](./Image/curl3.png)

    * ¿Cual es la diferencia entre los parametros?
        1. Parametro i: Incluye el protocolo responsable en el output 
        2. Parametro v: Retorna el output con mas información 

## Parte 2 

1. Puerto TCP/IP de Tomcat 

    ![TCP/IP](./Image/Puerto.png)