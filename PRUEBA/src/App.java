
    import java.util.Scanner;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String NOMBREEMPLEADO,DOCUMENTOEMPLEADO,DIADESCANSO = "";
        double SALARIOBRUTO = 0;
        double SALARIONETO = 0;
        double DEDUCCIONPENSION = 0;
        double DEDUCCIONSALUD = 0;
        double HORASTRABAJADAS = 0;
        double VALORHORA = 0;
        double BONIFICACIONEMPLEADO = 0;
        double VALORSALARIOMINIMO = 1423500;
        double AUXILIODETRANSPORTE = 200000;
        double VALORHORAEXTRA = 0;
        double CANTIDADEHORASEXTRAS = 0;
        double TOTALVALORHORASEXTRAS = 0;

        System.out.println("Ingrese el nombre del empleado");
        NOMBREEMPLEADO = sc.nextLine();
        System.out.println("Ingrese el documento de empleado");
        DOCUMENTOEMPLEADO = sc.nextLine();;;
        System.out.println("Ingrese el dia de descamso: (Lunes a Viernes)");
        DIADESCANSO = sc.nextLine();
        System.out.println("Ingrese el valor de la hora");
        VALORHORA = sc.nextDouble();
        System.out.println("Ingresse la cantidad de horas trabajadas");
        HORASTRABAJADAS = sc.nextDouble();
        
        SALARIOBRUTO = HORASTRABAJADAS * VALORHORA;
        if ( SALARIOBRUTO <= VALORSALARIOMINIMO*2 ){
            AUXILIODETRANSPORTE = 200000;
            BONIFICACIONEMPLEADO = SALARIOBRUTO * 0.1;
        }else{
            AUXILIODETRANPORTE = 0;
            BONIFICACIONEMPLEADO = 0;
        }

        DEDUCCIONPENSION = SALARIOBRUTO * 0.04;
        DEDUCCIONSALUD = SALARIOBRUTO * 0.04;

        IF ( HORASTRABAJADAS <= 96 );{
            CANTIDADEHORASEXTRAS = HORASTRABAJADAS - 96;
            VALORHORAEXTRA = VALORHORA * 1.25 + VALORHORA;
            TOTALVALORHORASEXTRAS = CANTIDADEHORASEXTRAS * VALORHORAEXTRA;
        }else{
            CANTIDADEHORASEXTRAS = 0;
            VALORHORA = 0;
            TOTALVALORHORASEXTRAS = 0;

        IF( HORASTRABAJADAS< 24 );{
            System.out.println("Aun no le puedo pagar el salario, ya que no ha trabajado lo suficiente");
        }else{
            SALARIONETO = SALARIOBRUTO - DEDUCCIONPENSION - DEDUCCIONSALUD + AUXILIODETRANSPORTE + BONIFICACIONEMPLEADO + TOTALVALORHORASEXTRAS;
            System.out.println("El salario neto del empleado es:" + SALARIONETO + " El salario bruto es: " + SALARIOBRUTO + " El valor de la bonificacion es: " + BONIFICACIONEMPLEADO + " El valor de la deduccion de pension es: " + DEDUCCIONPENSION + " El valor de la deduccion de salud es: " + DEDUCCIONSALUD + " El valor del auxilio de transporte es: " + AUXILIODETRANSPORTE + " El valor de la bonificacion es: " + BONIFICACIONEMPLEADO + " El valor de las horas extras es: " + VALORHORAEXTRA + " El total de horas trabajadas es:" + HORASTRABAJADAS + " El total de horas extras es: " + CANTIDADEHORASEXTRAS + " El valor de la hora es: " + VALORHORA + " El dia de descanso es: " + DIADESCANSO + " El nombre del empleado es: " + NOMBREEMPLEADO );           }
        }
    }


