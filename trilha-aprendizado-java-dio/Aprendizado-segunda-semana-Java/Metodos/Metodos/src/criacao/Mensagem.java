package criacao;
import java.time.LocalTime;

//LocalTime horaAgora = LocalTime.format("HH:mm");
    //System.out.println("HH:mm-> "+horaAgora.format(LocalTime.now());


public class Mensagem {
public static void obterMensagem(int hora) {
 

    switch (hora)    {
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:

    mensagemBomDia();
    break;
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    mensagemBoaTarde();
    break;
    
    case 19:
    case 20:
    case 21:
    case 22:
    case 23:
    case 00:
    case 01:
    case 02:
    case 03:
    case 04:
    mensagemBoaNoite();
    break;
    default:
    System.out.println("hora inválida");
    break;  
}   
}

private static void mensagemBoaNoite() {
    System.out.println("Boa Noite");
}

private static void mensagemBoaTarde() {
    System.out.println("Boa tarde");
}

private static void mensagemBomDia() {
    System.out.println("Bom dia");
}

/**
 * @param now
 */
public static void obterMensagem(LocalTime now) {
  // TODO document why this method is empty
}
}