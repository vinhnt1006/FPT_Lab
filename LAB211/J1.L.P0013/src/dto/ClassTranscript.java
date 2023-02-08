package dto;

public class ClassTranscript {
    public Student stu;
    public Subject sub;
    double labMark;
    double testMark;
    double finalMark;

    public ClassTranscript(Student stu, Subject sub, double labMark, double testMark, double finalMark) {
        this.stu = stu;
        this.sub = sub;
        this.labMark = labMark;
        this.testMark = testMark;
        this.finalMark = finalMark;
    }

    public double aveMark() {
        return (0.3 * labMark + 0.3 * testMark + 0.4 * finalMark);
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public Subject getSub() {
        return sub;
    }

    public void setSub(Subject sub) {
        this.sub = sub;
    }

    public double getLabMark() {
        return labMark;
    }

    public void setLabMark(double labMark) {
        this.labMark = labMark;
    }

    public double getTestMark() {
        return testMark;
    }

    public void setTestMark(double testMark) {
        this.testMark = testMark;
    }

    public double getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(double finalMark) {
        this.finalMark = finalMark;
    }
}
