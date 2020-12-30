package observerPattern;
import java.util.List;
public class CommentaryObject implements Subject,Commentary,Commercial
{
	private final List<Observer>observers;
	private String desc;
	private String title;
	private final String subjectDetails;
	
	public CommentaryObject(List<Observer>observers,String subjectDetails){
		this.observers = observers;
		this.subjectDetails = subjectDetails;
	}
	public CommentaryObject(List<Observer>observers,String subjectDetails,String title){
		this(observers,subjectDetails);
		this.title = title;
	}
	@Override
	public void subscribeObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unSubscribeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
		
	}

	@Override
	public void notifyObservers(String line) {
		System.out.println();
		for(Observer observer : observers){
			observer.update(line);
		}
		
	}
	
	@Override
	public void setDesc(String desc) {
		this.desc = desc;
		notifyObservers(this.desc);
	}
	@Override
	public String subjectDetails() {
		return subjectDetails;
	}
	
	@Override
	public void setCommercial(String title)
	{
		this.title = title;
		notifyObservers(this.title);
	}
	

}

