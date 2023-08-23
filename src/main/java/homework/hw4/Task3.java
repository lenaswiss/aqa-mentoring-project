package homework.hw4;

public class Task3 {
    /**
     * 3. Написать программу которая демонстрирует все возможные типы инициализации `final` и `static final`
     *  переменных
     */
    final int A = 1;
    final int B;{
        B = 2;
    }
    final int C;
    Task3(){
        C = 3;
    }

    public static void main(String[] args) {
        Task3 t = new Task3();
        System.out.println("A = " + t.A  + ", B = " + t.B + ", C = " + t.C);
    }
}

class FinalVariables {
    final static int FINAL_STATIC;
    final int FINAL_NOT_STATIC ;

    FinalVariables(int final_not_static, int final_static) {
        FINAL_NOT_STATIC = final_not_static;
    }

    static {
        FINAL_STATIC = 1;
//        FINAL_NOT_STATIC = 23; //в блоке статической инициализации
        final int FINAL_NOT_STATIC_BLOCK = 15 ;
    }

//    public void changeFinal(){
//        FINAL_NOT_STATIC = 4;
//    }
}
