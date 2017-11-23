
public class SampleTelevision {

	public static void main(String[] args) {
		
		Television t=new Television(3,5,0,"on",1);
		
		//t.channel(0);
		//t.volume(0);
		t.toOperate(1);
		t.changeChannel(7);
		//t.increaseVolume(5);
		t.increaseVolume(0,"on");
		t.printStatus();
	}
	}
