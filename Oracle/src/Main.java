import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        char[] values = {'(',')','('};
        validador(values);


    }
    public static void validador(char[] values){
        int parentesis =0;
        int llaves= 0;
        boolean validador= false;
        Stack<Character> pila = new Stack<Character>();

        for (int i = 0; i <values.length; i++) {
            if(values[i]== '(' || values[i] == '{'){
                pila.add(values[i]);
            }
            if(values[i]== '}' || values[i] == ')'){
                if(values[i] ==')' && !pila.isEmpty() && pila.pop()!= '('){
                    validador= false;
                    break;
                }

                if(values[i] ==')' && !pila.isEmpty() &&  pila.pop()== '('){
                    validador= true;
                }
                if(values[i] =='}'  && !pila.isEmpty() && pila.pop()!= '{'){
                    validador= false;
                    break;
                }
                if(values[i] =='}' && !pila.isEmpty() && pila.pop()!= '{'){
                    validador= true;

                }

            }
        }
        if(validador){
            System.out.println("valida");
        }else{
            System.out.println("Invalida");
        }



    }


}