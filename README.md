# Taller de Herencia en Java

Programa de consola en Java para practicar herencia y polimorfismo.

## Clases
- `Persona`: clase padre con nombre, edad y documento.
- `Estudiante`: hereda de `Persona` e incluye programa académico y promedio.
- `Profesor`: hereda de `Persona` e incluye área, salario base por hora y horas de cátedra.
- `Main`: menú para registrar estudiantes y profesores.

## Requisitos
JDK de Java instalado.

## Compilar y ejecutar
Desde esta carpeta, ejecuta:

```bash
javac Persona.java Estudiante.java Profesor.java Main.java
java Main
```

El salario total del profesor se calcula como salario base por hora multiplicado por horas de cátedra.

## Autor
Samuel
