////////////////////////// CONSIGNA ////////////////////////////////////////////////////
/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
*
* */

package exercise_01;

public class Exercise_01 {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();

        perro1.setNombre("Firulais");
        perro1.setRaza("Caniche");
        perro1.setEdad(2);
        perro1.setTamaño(0.50);
        perro1.setPersona(persona1);

        perro2.setNombre("Piter");
        perro2.setRaza("Dalmata");
        perro2.setEdad(3);
        perro2.setTamaño(1.50);
        perro2.setPersona(persona2);

        persona1.setNombre("Marta");
        persona1.setApellido("López");
        persona1.setEdad(25);
        persona1.setDocumento(39704701);
        persona1.setPerro(perro1);

        persona2.setNombre("José");
        persona2.setApellido("Rivas");
        persona2.setEdad(23);
        persona2.setDocumento(39562314);
        persona2.setPerro(perro2);

        persona1.visualizarPersona(persona1);
        persona2.visualizarPersona(persona2);



    }


}
