package OOPdmdev.OOPCLOUD;

public class Aspirant extends Student{
    public static final int MAX_STIP_ASPIRANTA = 2500;
    public static final int MIN_STIP_ASPIRANTA = 2000;

    private String work = "уВсехОдинаковая";

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Aspirant(String firstName, String lastName, String group, double mark) {
        super(firstName, lastName, group, mark);
    }

    @Override
    public void printStudent() {
        System.out.println(getFirstName() + " " + getLastName() + ", группа № " + getGroup() + ". Средняя оценика = " +
                getAverageMark() + ". Выплатить стипенидии - " + getScholarship() + ". " + work);

    }

    @Override
    public double getScholarship() {
        return getAverageMark() == 5 ? MAX_STIP_ASPIRANTA : MIN_STIP_ASPIRANTA;

    }
}
