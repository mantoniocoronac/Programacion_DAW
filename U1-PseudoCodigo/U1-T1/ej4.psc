Algoritmo ej4
	
	Definir nums,opciones como Entero;
	
	Dimension nums[20];
	
	Para i<-1 Hasta 20 Con Paso 1 Hacer
		numeroaleatorio<-Aleatorio(0,400);
		Escribir Sin Saltar numeroaleatorio " "
		nums[i]<-numeroaleatorio
	Fin Para
	Escribir " "
	Escribir "Que numeros quieres resaltar, 1=los multiplos de 5, 2=los multiplos de 7:";
	Leer opciones
	
	Para i<-1 Hasta 20 Con Paso 1 Hacer
		Si opciones=1 Entonces
			multiplo5<-nums[i]%5=0
			Si multiplo5=Verdadero Entonces
				Escribir "[",nums[i],"]"
			SiNo
				Escribir nums[i]
			Fin Si
		Fin Si
		Si opciones=2 Entonces
			multiplo7<-nums[i]%7=0
			Si multiplo7=Verdadero Entonces
				Escribir "[",nums[i],"]"
			SiNo
				Escribir nums[i]
			Fin Si
		Fin Si
	Fin Para
	
FinAlgoritmo
