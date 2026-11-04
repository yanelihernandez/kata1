# Kata 1 · IntelliJ IDEA y flujo Git/GitHub

Proyecto Java realizado para **Ingeniería del Software 2** (Escuela de Ingeniería Informática, ULPGC). 

El objetivo es ganar soltura con el entorno de trabajo: crear, ejecutar, depurar y refactorizar en IntelliJ IDEA, familiarizarse con los shortcuts y refrescar un poco la gestión de proyectos con Github.

📹 **Vídeo explicativo:** [ ]

## Sobre el proyecto

El proyecto modela a una persona con la clase `Person`, que guarda su nombre y su fecha de nacimiento y calcula su **edad en años** a partir de la fecha actual. La clase `Main` solo crea una instancia y muestra el resultado por consola; toda la lógica vive en `Person`.

Decisiones de diseño:

- `Person` es un `record`: sus datos (`name`, `birthday`) son inmutables y no hay campos públicos modificables.
- El cálculo está separado en dos métodos con una responsabilidad clara: `getAge()` obtiene los días vividos y `toYears()` los convierte a años.
- El valor `365.25` (días medios por año, contando los bisiestos) es una constante con nombre, `DAYS_PER_YEAR`, y no un número suelto en el código.
- `Main` solo crea una Person y muestra su edad.
- Paquete base `software.ulpgc.kata1`.

## Primeros pasos

### Requisitos

- **JDK 27** 
- **Maven** 
- **IntelliJ IDEA**
- **Git**

No hay dependencias externas.

### Clonar y compilar

```bash
git clone https://github.com/yanelihernandez/kata1.git
cd kata1
mvn compile
```

### Ejecutar

**Desde IntelliJ IDEA:** abre la carpeta con `File > Open`, espera a que Maven importe el proyecto, comprueba el JDK en `File > Project Structure` y ejecuta `Main` con `Shift + F10`.

## Estructura

```
kata1/
├── src/main/java/software/ulpgc/kata1/
│   ├── Person.java
│   └── Main.java
├── pom.xml
├── .gitignore
```

| Clase | Responsabilidad |
|---|---|
| `Person` | Representa a una persona (`name`, `birthday`) y calcula su edad con `getAge()`. |
| `Main` | Punto de entrada: crea una `Person` e imprime su edad. |

## Ejemplo de uso

[ Imagen ]

## Flujo de trabajo con Git

El repositorio usa dos ramas principales:

- `master`: versión final.
- `develop`: rama donde he realizado el código por primera vez, antes de pasar los cambios a `master`.

```bash
git checkout master
git merge develop
git push origin master develop
```

Luego, para las repeticiones realizadas para el proyecto, se usan las ramas `repetition-n`.

## Verificación

Comprobaciones manuales realizadas:

[ ]

## Shortcuts de IntelliJ practicados

| Atajo | Uso |
|---|---|
| `Ctrl + K` | Abrir ventana de Git Commit |
| `Ctrl + Enter` | Realizar Commit |
| `Ctrl + Alt + C` | Extraer constante a partir de un valor seleccionado |
| `Alt + 1` | Cambiar al árbol del proyecto |
| `Alt + Insert` | Abre el menú **Generate** para crear código repetitivo automáticamente |
| `Alt + Enter` | Abre el menú **Show Context Actions** para solucionar errores y obtener sugerencias de optimización de código |
| `sout` | Genera System.out.println() |
