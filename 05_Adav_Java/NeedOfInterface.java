

interface Computer{
    void code();
}


class Laptop implements Computer{

    public void code() {
       System.out.println("code, compile, run");     
    }
    
}

class Desktop implements Computer{

    public void code()
	{
		System.out.println("code, compile, faster");
	}
}

class Devloper{
    public void devApp(Computer lap){
        lap.code();
    }
}


public class NeedOfInterface {
    public static void main(String[] args) {
        
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Devloper rakesh = new Devloper();
        rakesh.devApp(lap);

    }    
}
