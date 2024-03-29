package JavaTheory.Sliit.DesignPattern.observer;

public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void setStatus(String status);
    public String getStatus();
}
