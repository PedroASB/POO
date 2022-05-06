package Exercício2;

public class ExceptionNotConnected extends Exception {
    private String req;

    public ExceptionNotConnected(String req){
        this.req = req;
    }

    public String getRequest(){
        return req;
    }
}