public class OperadoresLogicos {
    public static void main(String[] args)  {
      
        
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        //b1 && b2; b1 && b3;
        //b2 || b3; b2 || b4;
        //b1 ^ b3; b4 ^ b1;
        //!b1;
        //!b2!;
        //(i1 > i2)<(f2 < f1);
        //((i1+i2)<(f2-f1)) && true;
        //boolean salarioBaixo = true;
        //boolean muitosDependente = true;
        //boolean salarioBase = false;
        //boolean poucosDependentes = false;
        //{System.out.println(" Recebe beneficio " + (salarioBaixo && muitosDependente));}
         //{System.out.println(" Não recebe beneficio" + (salarioBase && poucosDependentes));}
        
        
         {System.out.println("b1 && b2" + (b1 && b2));}
        {System.out.println("b1 && b3" + (b1 && b3));}
        {System.out.println("b2 || b3" + (b2 || b3));}
        {System.out.println("b2 || b4" + (b2 || b4));}
        {System.out.println("b1 ^ b3" + (b1 ^ b3));}
        {System.out.println("b4 ^ b1" + (b4 ^ b1));}
       {System.out.println("!b1" + (!b1));}
        {System.out.println("!b2" + (!b2));}

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        {System.out.println("eita" + ((i1 + i2)<(f2 - f1)&& true));}
        {System.out.println("eita2" + ((i1 > i2)||(f2 < f1)));}

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantDepend = 4;
        int mediaDepend = 2;

        {System.out.println((salarioMensal < mediaSalario) && (quantDepend >= mediaDepend));}

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependente = quantDepend >= mediaDepend;

        {System.out.println((salarioBaixo) && (muitosDependente));}

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependente);
        System.out.println("recebe auxilio" + recebeAuxilio);

    }
}
