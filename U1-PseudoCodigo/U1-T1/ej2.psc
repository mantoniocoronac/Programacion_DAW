Algoritmo ej2
	
	//Escribe un programa que cambie un digito dentro de un numero 
	//dando la posicion y el valor nuevo. Las posiciones se cuentan de izquierda a derecha empezando por el 1.
	
	Definir digito,posicion,nuevo_digito Como Entero
	Escribir "Por favor, introduzca un numero entero positivo:";
	Leer digito;
	Escribir "Introduzca la posicion dentro del numero:";
	Leer posicion;
	Escribir "Introduzca el nuevo digito:";
	Leer nuevo_digito;
	
	digito_texto<- CONVERTIRATEXTO(digito);
	
	
	Para i<-1 Hasta longitud(digito_texto) Hacer
		Si i=posicion Entonces
			Escribir Sin Saltar nuevo_digito;
		SiNo
			Escribir SIN SALTAR subcadena(digito_texto, i, i);
		FinSi
	Fin Para
	
FinAlgoritmo
