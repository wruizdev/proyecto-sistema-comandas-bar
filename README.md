# proyecto-sistema-comandas-bar
Proyecto en Java que gestiona las comandas de cocina y barra de un bar primer

# Flujo del programa
1. El sistema permite registrar, camareros, comandas y platos (cada panel tiene su crud correspondiente).
2. Desde el panel de camareros se puede dar de alta en el sistema un camarero para que se le asigne la mesa que va a gestionar durante el servicio (es indispensable).
3. Desde el panel de comandas, el camarero selecciona la mesa y puede registrar el plato que elige el comensal previamente existente en el sistema.
4. Desde el panel de comandas, una vez se tienen las cantidades de los platos y bebidas se envía la comanda tanto a barra como cocina. El ticket sale en PDF.
5. Desde el panel de comandas, también se puede calcular el importe total de cada mesa y calcula de forma automática la vuelta.
6. Desde el panel de platos se pueden registrar nuevos productos propios de la carta, para que sean visibles al momento de registrar una comanda.
7. Cada panel cuenta con su CRUD para registar, eliminar, modificar y listar cada elemento del sistema.
8. Puedes ver el flujo del programa desde este vídeo: https://youtu.be/mEjzW5uUnpU?si=kv5TnrwY57eNgyww
   
# Instalación 
1. Descargar ZIP (Incluye proyecto MAVEN y Base de datos).
2. Tener instalado Java 17 o superior.
3. Tener instalado entorno para sql (PosgreSQL).

# Ejecución BBDD
1. Crear una base de datos de nombre bar_db2.
2. Importar script sql de nombre bar_db2_conInserciones.sql
3. Modificar archivo de conexión BBDD en el proyecto
-  El fichero se encuentra en src/main/sql/conexion.sql.java
-  Variables de conexión a ajustar en función de tu propio entorno. Url siempre será el mismo si creas la base de datos con el nombre que se indica. Usuario el que tú tengas y clave también como tú tengas configurado en tu entorno.

# Ejecución Programa
1. Sobre el directorio principal ejecutar el programa. Al ser MAVEN se ejecutara con todas las dependencias instaladas que figuran en el pom.xml.