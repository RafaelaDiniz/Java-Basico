

public class ControleFluxo {

     public static void main(String[] args) {
       
        ifFlecha();
      //  ifSemFlecha();
         ifFerias(null, null, null);
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();
    }
   
  

    public static void ifFlecha()  {
    
       
       // Scanner scanner = new Scanner(String mês);
            int mes = 9;

                    if ( mes == 1 ) {System.out.println ("Janeiro");}
                    else 
                       if ( mes == 2) {System.out.println("Fevereiro");
                    }
                    else 
                        if ( mes == 3) {System.out.println("Março");
                    }
                    else 
                        if ( mes == 4) {System.out.println("Abril");
                    }
                    else 
                        if ( mes == 5) {System.out.println("Maio");
                    }
                    else 
                        if ( mes == 6) {System.out.println("Junho");
                    }
                    else 
                        if ( mes == 7) {System.out.println("Julho");
                    }
                    else 
                        if ( mes == 8) {System.out.println("Agosto");
                    }
                    else 
                        if ( mes == 9) {System.out.println("Setembro");
                    }
                    else 
                        if ( mes == 10) {System.out.println("Outubro");
                    }
                    else 
                        if ( mes == 11) {System.out.println("Novembro");
                    }
                    else 
                        if ( mes == 12) {System.out.println("Dezembro");
                    }
                    else {System.out.println("mês indefinido");}
        }
        public static void ifFerias(String julho, String dezembro, String janeiro) {
        
  
    String mes = julho;
 if (mes == julho || mes == dezembro || mes == janeiro) 
 {System.out.println("Férias");}}

 public static void ifMenor () {

    double salarioMensal = 11893.58d;
    double mediaSalario = 10500d;

    int quantidadeDependentes = 4;
    int mediaDependentes = 2;

    if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes))
    {System.out.println("funcionario deve receber auxilio");}

    boolean salarioBaixo = salarioMensal < mediaSalario;
    boolean muitosdependentes = quantidadeDependentes >= mediaDependentes;
    if ((salarioBaixo) && (muitosdependentes))
    {System.out.println("funcionario deve receber auxilio");}

    boolean recebeAuxilio = (salarioBaixo)&&(muitosdependentes);
    if (recebeAuxilio) {System.out.println("funcionario deve receber auxilio");}
    else {System.out.println("funcionario não deve receber auxilio");}
 

 }
private static void switchSemana () {

    String dia = "terça";
    switch (dia) {
    case "segunda":
    System.out.println(2);
    break;
    case "terça":
    System.out.println(3);
    break;  
    case "quarta":
    System.out.println(4);
    break; 
     case "quinta":
    System.out.println(5);
    break; 
     case "sexta":
    System.out.println(6);
    break;  
    case "sábado":
    System.out.println(7);
    break;
    case "domingo":
    System.out.println(1);
    break;
    default:
    System.out.println(1);
    System.out.println("dia invalido");
    break;
    }
}
private static void switchNumero (){

    int numero = 4;
    switch(numero){
case 1:
case 2:
case 3: 
System.out.println("certo");
break;
case 4:
System.out.println("errado");
break;
case 5:
System.out.println("talvez");
break;
case 6:
System.out.println("valor indefinido");
break;

}}
private static void switchFerias (){

    String mes = "dezembro";
    switch(mes){

            case"dezembro":
            case "julho":
            case "janeiro":
            System.out.println("ferias");
            break;
            default: 
            System.out.println("mes indefinido");
            break;
    }
}
}
        
