package observerPattern;

public interface Subject
{
	public void subscribeObserver(Observer observer);
	public void unSubscribeObserver(Observer observer);
	public void notifyObservers(String line);
	public String subjectDetails();
	
}
