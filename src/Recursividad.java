public class Recursividad {
public int factorial (int n){
System.out.println("Calculando el factorial de "+n);
//caso base: n sea 0! y 1! son iguales a 1
if (n==0||n==1) {
System.out.println("Caso base alcansado el factorial de "+n+"es 1");    
    return 1;
}

int Resultado = n*factorial(n-1);
System.out.println("Resultado parcial para "+n+" * factorial("+(n-1)+")="+Resultado);
return Resultado;
//return n *factorial(n-1);
}
//calcular la suma de los numeros consecutivos
//n=5 resultado 5+4+3+2+1=15
public int sumaConsecutivos(int n){
//caso base
if (n==1) {
    return 1; 
}
return n + sumaConsecutivos(n-1);
}
//calcula la potencia de numero
public int potencia(int base, int exponente){
if (exponente == 0) {
    return 1;
}else{
    return base * potencia(base, exponente -1);
}
}
//crear un metodo que sume los diguitos de un numero
//si mando 456 sea igual a 15 
//4+5+6=15

}