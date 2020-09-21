/*
As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe 
contraram para desenvolver o programa que calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte 
critério, baseado no salário atual:
* salários até R$ 280,00 (incluindo) : aumento de 20%
* salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
* salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
* salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
* salário antes do reajuste;
* percentual de aumento aplicado;
* alor do aumento;
* novo salário, após o aumento.
 */
package aumentosalario;

import java.util.Scanner;

/**
 * @author Deyvid
 */
public class AumentoSalario {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print ("Digite o seu salario:" );
        double salario = teclado.nextDouble();
        
        int percetual = 0;
        if (salario <= 280){
            percetual = 20;
        }else if (salario >280 && salario <700){
            percetual = 15;
        }else if (salario >=700 && salario <1500){
            percetual = 10;
        }else if (salario >1500){
            percetual = 5;
        }
        double aumento = (salario / 100)*percetual;
        double salarioajustado = salario + aumento;
        
        System.out.println("Salario: " + salario);
        System.out.println("Percetual do aumento: " + percetual + "%");
        System.out.println("Aumento: " + aumento);
        System.out.println("Salario com aumento: " + salarioajustado);
    } 
    
}
