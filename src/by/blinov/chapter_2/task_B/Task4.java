package by.blinov.chapter_2.task_B;

public class Task4 {
    boolean chek(int x) {
        if (x >= 1 && x <= 12) {
            return true;
        } else {
            System.out.println(" ERROR: incorrect 'K', entered from 1 to 12 ");
            return false;
        }
    }


    String outMonth(int x) {
        String month = "";

        if (chek(x)) {
            switch (x) {
                case 1:
                    month = "jan";
                    break;
                case 2:
                    month = "feb";
                    break;
                case 3:
                    month = "mar";
                    break;
                case 4:
                    month = "apr";
                    break;
                case 5:
                    month = "may";
                    break;
                case 6:
                    month = "jun";
                    break;
                case 7:
                    month = "jul";
                    break;
                case 8:
                    month = "aug";
                    break;
                case 9:
                    month = "sep";
                    break;
                case 10:
                    month = "okt";
                    break;
                case 11:
                    month = "now";
                    break;
                case 12:
                    month = "dec";
                    break;
                default:
                    System.out.println("Да ну нах, как ты так сделал??????" + x);
            }
        }
        return month;
    }
}
