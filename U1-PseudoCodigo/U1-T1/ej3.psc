Algoritmo ej3
	
	Definir tam como Entero;
	Escribir "Por favor, introduzca la altura del reloj de arena:";
	Leer tam
	
	Si tam%2!=0 y tam>=3 Entonces
		Para filas<-tam Hasta tam/2 Con Paso -1 Hacer
			Para colum<-1 Hasta filas Con Paso 1 Hacer
				Escribir Sin Saltar "*"
			Fin Para
			Escribir " "
		Fin Para
	SiNo
		Escribir "La altura no es valida"
	Fin Si

	
FinAlgoritmo
