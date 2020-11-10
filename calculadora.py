continuar = True

while continuar:
    print("CALCULADORA BASICA ----->")
    print("1) SUMAR")
    print("2) RESTAR")
    print("3) MULTIPLICAR")
    print("4) DIVIDIR")
    print("5) SALIR")

    try:
        opcion = int(input("Ingrese una opción: "))

        if(0<opcion<6):
            if opcion == 5:
                print("Adiós")
                continuar = False
                continue
            
            try:
                primer_numero = int(input("Ingrese un Número: "))
                segundo_numero = int(input("Ingrese otro Número: "))

                if(primer_numero<0 or segundo_numero<0):
                    print("Debe ingresar sólo enteros positivos")
                    continue
            except ValueError:
                print("Debe ingresar sólo enteros positivos")
                continue

            if opcion == 1:
                suma = primer_numero + segundo_numero
                print("SUMA: " + str(suma))
            elif opcion == 2:
                resta = primer_numero - segundo_numero
                print("RESTA: " + str(resta))
            elif opcion == 3:
                multiplica = primer_numero * segundo_numero
                print("MULTIPLICACION: " + str(multiplica))
            elif opcion == 4:
                divide = primer_numero / segundo_numero
                print("DIVISION: " + str(divide))
            else:
                print("Opción no implementada")
        else:
            print("Opción no implementada")
    except ValueError:
        print("Opción no válida")