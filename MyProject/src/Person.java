public class Person {
    private String fname;
    private String lname;
    private String[] conNumber;
    private String email;
    private int headC;
    public Person(String fname,String lname){
        this.fname=fname;
        this.lname=lname;
        email=null;
        conNumber= new String[10];
        headC=0;
    }
    public void setConNumber(String i){
        this.conNumber[headC]=i;
        headC++;
    }
}
