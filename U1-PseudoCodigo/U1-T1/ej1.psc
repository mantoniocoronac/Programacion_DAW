Algoritmo ej1
	
	Definir horas como Entero;
	Escribir "Introduzca el numero de horas trabajadas durante la semana:"
	Leer horas
	
	Si horas<41 Entonces
		horas<-horas*10
		Escribir "El sueldo semanal que le corresponde es de ", horas
	SiNo
		horas<-horas*15-200
		Escribir "El sueldo semanal que le corresponde es de ", horas
	Fin Si
	
FinAlgoritmo
