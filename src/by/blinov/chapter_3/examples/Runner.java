package by.blinov.chapter_3.examples;

import by.blinov.chapter_3.examples.Account;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Example # 8 #");
/* # 8 # использование логических блоков при объявлении класса # Department.java #
DemoLogic.java */
        Account from = new Account(78231864L, 258.5);
        Account to = new Account(58510009L, 12.1);
        TransferAction action = new TransferAction(52.0);
        boolean complete = action.transferIntoAccount(from, to);
        if (complete) {
            System.out.println("Сумма: " + action.getTransactionAmount() + " переведена успешно");
            System.out.print("На счету клиента ID=" + to.getId());
            System.out.println(" находится сумма: " + to.getAmount());
            System.out.printf("налог 2%%, к зачислению: %s%n", (action.getTransactionAmount()) * 0.98);
        } else {
            System.out.println("Транзакция не выполнена.");
            System.out.print("На счету клиента ID=" + from.getId());
            System.out.println(" недостаточно средств.");
        }
        System.out.println();
        System.out.println("Example # 11 # ");
        /* # 11 # создание и использование объектов параметризованного класса #
Message.java # Runner.java */

        Message<Integer> ob1 = new Message<Integer>();
        ob1.setValue(1);
        int v1 = ob1.getValue();
        System.out.println(v1);
        Message<String> ob2 = new Message<String>("Java");
        String v2 = ob2.getValue();
        System.out.println(v2);
        Message ob3 = new Message();
        ob3 = ob1;
        System.out.println(ob3.getValue());
        ob3.setValue(new Byte((byte) 1));
        ob3.setValue("Java SE 7");
        System.out.println(ob3);
        ob3.setValue(71);
        System.out.println(ob3);
        ob3.setValue(null);

        System.out.println();
        System.out.println("Example # 12 #");
/* # 12 # использование метасимвола в параметризованном классе # Exam.java #
Runner.java */
        Exam<Double> mb1 = new Exam<Double>(71.41D,"Progr");
        Exam<Double> mb2 = new Exam<Double>(71.45D,"Progr");
        System.out.println(mb1.equalsToMark(mb2));
        Exam<Integer> mi = new Exam<Integer>(71,"Progr");
        System.out.println(mb1.equalsToMark(mi));
    }
}
