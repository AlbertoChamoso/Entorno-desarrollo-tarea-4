
package alberto.deposito;

public class Main {
    
    public static void main (String []args){
        
        CCuenta cuenta1 ;
        double saldoActual;
        float cantidad = 0f;
        operativa_cuenta(cantidad);
    }

    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
        try{
            cuenta1.retirar(2300);
        }catch (Exception e){
            System.out.println("Fallo al retirar");
        }
        try{
            System.out.println("Ingreso cuenta");
            cuenta1.ingresar(695);
        }catch (Exception e){
            System.out.println("Fallo al ingresar");
        }
        try{
            System.out.println("Ingreso en cuenta ");
            cuenta1.ingresar(1000);
        }catch (Exception e){
            System.out.println("Fallo al ingresar");
        }
    }
    
}
