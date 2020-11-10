#-*- coding: utf-8-*-
respuesta="si"
while respuesta!="no":
   print (''' 
CALCULADORA BASICA ----->  //imprimimos el menu
1) SUMAR
2) RESTAR
3) MULTIPLICAR
4) PORCENTAJE
5) DIVIDIR
6) SALIR''')
   opcion=int(input("Ingrese el numero de su opcion: ")) #nos aseguramos que el numero sea entero  int
   while (opcion >0 and opcion 6): #seleccionamos la opcion de la operacion
      primer_numero=int(input("Ingrese un Numero: ")) #tomamos el primer numero
      segundo_numero=int(input("Ingrese otro Numero: "))  #tomamos el segundo numero
      if opcion == 1:
         suma=primer_numero + segundo_numero  #se suma el primer y segundo numero
         print ("SUMA: ", suma) #se imprime el resultado
      elif opcion == 2:
         resta=primer_numero-segundo_numero
         print ("RESTA: ", resta)
      elif opcion == 3:
         multiplicacion=primer_numero*segundo_numero
         print ("MULTIPLICACIÓN: ", multiplicacion)
      elif opcion == 4:
         porcentaje=segundo_numero*(primer_numero/100) # ingresamos el 1 numero y sacamos su %
         print ("PORCENTAJE: ", porcentaje,"%") 
      elif opcion == 5:
         if segundo_numero==0:
            print ("ERROR")
         else:
            division = primer_numero/segundo_numero
            print ("DIVISIÓN", division)     
      elif opcion == 6:
         print ("HASTA LUEGO!")
         sys.exit()
   respuesta=raw_input("Desea hacer otra operacion? [Si/No]: ")
 

