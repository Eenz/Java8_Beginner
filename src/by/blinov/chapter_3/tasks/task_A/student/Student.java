package by.blinov.chapter_3.tasks.task_A.student;

/*
здесь находятся данные о студентах:
id, фио, дата рождения, адрес, номер телефона, факультет, курс и группа;
а так же метода для получения и записи этих данных
 */
public class Student {
    private long[] id = {000_000, 000_001, 000_002, 000_003};
    private String[] surname = {"Титков", "Ололоева", "Ололоев", "Смешная"};
    private String[] name = {"Максим", "Лалка", "Лёня", "Алена"};
    private String[] patonymic = {"Александрович", "Бэкина", "Вэкин", "Гэкина"};
    private int[] birthdayDay = {15, 26, 11, 15};
    private String[] birthdayMonth = {"May", "Nov", "Dec", "Jan"};
    private long[] birthdayYear = {1995, 1997, 1995, 1997};
    private String[] adres = {"blalbalaba", "asdfghj", "asdfghj", "asdfghj"};
    private long[] phone = {375336219795l, 375333861336l, 315451241581l, 654545446541l};
    private String[] faculty = {"V", "B", "E", "B"};
    private int[] course = {1, 2, 3, 1};
    private int[] group = {1, 2, 2, 1};

    public void printDefineData(int i) {
        System.out.printf("ID:%06d %10s %10s %15s %5d %s %d     Adres:%20s    Phone:+%d F:%s   C:%d   G:%d%n", id[i], surname[i], name[i], patonymic[i], birthdayDay[i], birthdayMonth[i], birthdayYear[i], adres[i], phone[i], faculty[i], course[i], group[i]);
    }

    public void printAllData() {
        for (int i = 0; i < id.length; i++) {
            System.out.printf("ID:%06d %10s %10s %15s %5d %s %d     Adres:%20s    Phone:+%d F:%s   C:%d   G:%d%n", id[i], surname[i], name[i], patonymic[i], birthdayDay[i], birthdayMonth[i], birthdayYear[i], adres[i], phone[i], faculty[i], course[i], group[i]);
        }

    }

    public String[] getSurnameArr() {
        return surname;
    }

    public int getLenghtArray() {        // для получения длинны массивa
        return id.length;
    }

    public void setId(int i, long id) {
        this.id[i] = id;
    }

    public long getId(int i) {
        return id[i];
    }

    public void setSurname(int i, String surname) {
        this.surname[i] = surname;
    }

    public String getSurname(int i) {
        return surname[i];
    }

    public void setName(int i, String name) {
        this.name[i] = name;
    }

    public String getName(int i) {
        return name[i];
    }

    public void setPatonymic(int i, String patonymic) {
        this.patonymic[i] = patonymic;
    }

    public String getPatonymic(int i) {
        return patonymic[i];
    }

    public void setBirthdayDay(int i, int birthdayDay) {
        this.birthdayDay[i] = birthdayDay;
    }

    public int getBirthdayDay(int i) {
        return birthdayDay[i];
    }

    public void setBirthdayMonth(int i, String birthdayMonth) {
        this.birthdayMonth[i] = birthdayMonth;
    }

    public String getBirthdayMonth(int i) {
        return birthdayMonth[i];
    }

    public void setBirthdayYear(int i, long birthdayYear) {
        this.birthdayYear[i] = birthdayYear;
    }

    public long getBirthdayYear(int i) {
        return birthdayYear[i];
    }

    public void setAdres(int i, String adres) {
        this.adres[i] = adres;
    }

    public String getAdres(int i) {
        return adres[i];
    }

    public void setPhone(int i, long phone) {
        this.phone[i] = phone;
    }

    public long getPhone(int i) {
        return phone[i];
    }

    public void setFaculty(int i, String faculty) {
        this.faculty[i] = faculty;
    }

    public String getFaculty(int i) {
        return faculty[i];
    }

    public void setCourse(int i, int course) {
        this.course[i] = course;
    }

    public int getCourse(int i) {
        return course[i];
    }

    public void setGroup(int i, int group) {
        this.group[i] = group;
    }

    public int getGroup(int i) {
        return group[i];
    }

}
