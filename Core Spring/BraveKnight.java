class Quest{
	public void embark(){
		System.out.println("embark");
	}	
}
interface Knight{
}

public class BraveKnight implements Knight {
	private Quest quest;
	public BraveKnight(Quest quest) { //Quest is injected
		this.quest = quest;
	}
	public void embarkOnQuest() {
		quest.embark();
	}
}