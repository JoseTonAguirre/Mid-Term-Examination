class ShowStudent
{
    public static void main (String args[])
    {
        Student s1 = new Student();

        s1.setHours(Integer.parseInt(args[0]));
        s1.setIDnumber();
        s1.setPoints(Integer.parseInt(args[1]));
        s1.showIDnumber();
        s1.showPoints();
        s1.showHours();
        System.out.println("The grade point average is "
                + s1.getGradePoint());
        System.out.println(" ");

        Student s2 = new Student();
        s2.setHours(Integer.parseInt(args[2]));
        s2.setIDnumber();
        s2.setPoints(Integer.parseInt(args[3]));
        s2.showIDnumber();
        s2.showPoints();
        s2.showHours();
        System.out.println("The grade point average is "
                + s2.getGradePoint());
        System.out.println(" ");

        Student s3 = new Student();
        s3.setHours(Integer.parseInt(args[4]));
        s3.setIDnumber();
        s3.setPoints(Integer.parseInt(args[5]));
        s3.showIDnumber();
        s3.showPoints();
        s3.showHours();
        System.out.println("The grade point average is "
                + s3.getGradePoint());
        System.out.println(" ");
    }
}