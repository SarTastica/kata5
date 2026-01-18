Kata 5: Persistencia SQL
> **El reto:** *Manejar bases de datos de forma eficiente.*

Sustituimos los archivos de texto por una base de datos **SQLite**.
* **Optimización JDBC:** Uso de transacciones manuales (`AutoCommit=false`) y procesamiento por lotes (`Batch`) para insertar miles de registros en milisegundos.
* **Interfaces:** Desacoplamiento total de la tecnología de persistencia mediante `TitleReader` y `TitleWriter`.
