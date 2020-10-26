package cpm.sparta.g2;


public class Operation {

    protected int result;

    public void printResult(){
        System.out.println("Result = "+getPrettyPrint(result));
    }

    private String getPrettyPrint(int str){
        return "**** "+str+" *****";
    }


    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }


}
