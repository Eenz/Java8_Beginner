package by.blinov.chapter_4.examples.finalize_1;

public class Manager {
    private int id;

    public Manager(int value) {
        id = value;
    }

    protected void finalize() throws Throwable {
        try {
            System.out.println("объект будет удален, id=" + id);
        } finally {
            super.finalize();
        }
    }
}
