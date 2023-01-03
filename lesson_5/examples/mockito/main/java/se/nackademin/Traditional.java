package se.nackademin;

public class Traditional {
    private int number;
    private Worker worker;

    Traditional(){
        number = 10;
    }

    public int getNumber() {
        return number;
    }

    public void setWorker(Worker worker){
        this.worker = worker;
    }

    public int doWork(){
        return this.worker.work() + number;
    }

}
