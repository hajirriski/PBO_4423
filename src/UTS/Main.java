package UTS;

public class Main {
    public static void main(String[] args){
        StackKu stackKu = new StackKu();
        String inputan = stackKu.Input_Stack();

        String cek = stackKu.convStrToStack(inputan);
        if (cek != "x"){
            stackKu.cekInput(stackKu.stackAngka,inputan);
        }
    }
}
