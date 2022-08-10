# EventosBack

El proyecto fue diseñado en la tecnologia y herramientas BackEnd `Spring Boot` y `API Rest`, con el proposito de crear un servicio API Rest. Se seleccionaron estas herramientas por que simplican el desarrollo, lo que nos permite enfocarnos en la logica

## Descipción Logica

Al iniciar el proyecto este se comunica con la Base de Datos MySql alojada en un Servidor AWS, este servicio permite crear y consultar los eventos digitales expuesto en el servicio.

## Deployar servidor

Para inicar el proyecto debemos tener en cuenta en que sistema operativo esta alojado el proyecto, Si tipo Unix en la cmd escribe `mvnw spring-boot:run` pero si estas en windows en la cmd escribe `mvnw.cmd spring-boot:run` para iniciar el servidor de manera local. Ingrese a la url `http://localhost:8080/`.

## EndPoints

- `<eventos>` : http://localhost:8080/eventos/, al utilizar esta URL con una petición GET se exponen todos los eventos digitales
- `<eventos>` : http://localhost:8080/eventos/, al utilizar esta URL con una petición POST y body adecuado se puede realizar la creación o actulización de un registro de evento digital
- `<buscar>` : http://localhost:8080/eventos/buscar?origin={id} en esta URL se exponen solo los evento digitales que concuerdan con el id del origen. El parametro es de tipo numerico {id}
