package interfaces;

public  class person implements Youtuber,Student {

	public static void main(String[] args) {
		    person obj = new person();
		    obj.study();
		    obj.makeVedio();

	}

	@Override
	public void study() {
		System.out.println("Person is studying");
		
	}

	@Override
	public void makeVedio() {
		System.out.println("Person is making Vedio");
		
	}

}
