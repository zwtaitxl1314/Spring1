package aop.aspect;

public class Sun {

    private String name;

    public  void look(){
        System.out.println("看！大"+name+"！~~~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
