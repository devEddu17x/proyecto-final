# Sistema de Gestión de Empleados

## Descripción

Este repositorio alberga una aplicación diseñada para realizar un seguimiento del desarrollo de los empleados dentro de una organización. La aplicación ofrece la capacidad de gestionar la información relacionada con los empleados, áreas y puestos definidos en la organización, así como las asignaciones realizadas a dichos empleados.

## Enunciado

Cuando un nuevo empleado es contratado en una organización, se le asigna un puesto y se le adscribe a un área específica de acuerdo con la plaza para la que se postuló. La finalidad de la aplicación es llevar un registro del progreso de los empleados durante su permanencia en la organización, proporcionando información actualizada sobre su estado en todo momento.

## Condiciones

1. **Estructura Organizacional:** La organización cuenta con una estructura organizacional definida en áreas tales como Gerencia, Administración, Finanzas, Contabilidad, Logística, Producción, Ventas, Compras, entre otras.
2. **Cargos en las Áreas:** Cada área tiene una serie de cargos como Director (Jefe), Adjunto, Auxiliar, Colaborador, con una cantidad específica de empleados asignados a cada uno.
3. **Asignaciones de Empleados:** Los empleados pueden ser asignados a varios puestos y áreas durante su permanencia en la organización, manteniendo un registro de las fechas de inicio y fin de cada asignación.
4. **Cambios de Puesto y Área:** Un empleado puede ser reasignado a un nuevo puesto dentro de la misma área o a una nueva área y puesto.
5. **Duración de Asignaciones:** El tiempo mínimo de una asignación es de 1 mes, aunque también existen asignaciones indefinidas.

## Clases

### 1. Empleado
- **Atributos:**
  - Código
  - DNI
  - Nombre
  - Apellidos
  - Profesión
  - Fecha de inicio en la organización

### 2. Área
- **Atributos:**
  - Código
  - Nombre
  - Número de empleados asignados a esa área

### 3. Puesto
- **Atributos:**
  - Código del puesto
  - Nombre
  - Código del área al que pertenece
  - Número máximo de empleados asignables en ese puesto

### 4. Asignación
- **Atributos:**
  - Fecha de asignación
  - Fecha de inicio y término de la asignación
  - Datos del empleado
  - Datos del área y puesto asignados

## Requerimientos

La aplicación desarrollada permite:

1. **Registro de Áreas y Puestos:** Registrar los datos de áreas y puestos.
2. **Registro de Empleados:** Registrar los datos de nuevos empleados.
3. **Asignación de Empleados:** Registrar la asignación de un empleado.
4. **Listar Datos de Empleado:** Mostrar los datos de un empleado dado su código, incluyendo los datos de los puestos y áreas asignados.
5. **Listar Datos de Área:** Mostrar los datos de un área dado su código, incluyendo los empleados asignados y el puesto que desempeñan.

Este proyecto se diseñó considerando las necesidades de seguimiento y gestión del personal dentro de la organización, cumpliendo con los requisitos mencionados.
