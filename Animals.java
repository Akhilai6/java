class Animals{
    public void eat(){
        System.out.println("Animals can eat");
    }
    public void sound(){
        System.out.println("Animals make sounds");
    }
class Lion extends Animals{
    public void eat(){
        System.out.println("Lion eats deer");
    }
    public void sound(){
        System.out.println("Lion roar");
    }
}
class Tiger extends Animals{
    public void eat(){
        System.out.println("Tiger eats fox");
    }
    public void sound(){
        System.out.println("Tiger roar");
    }
}
class Panther extends Animals{
    public void eat(){
        System.out.println("Panther eats deer");
    }
    public void sound(){
        System.out.println("Panther roar");
    }
}
    public static void main(String[] args){
        Animals a1 = new Animals();
        Lion l1 = a1.new Lion();
        Tiger t1 = a1.new Tiger();
        Panther p1 = a1.new Panther();
        l1.eat();
        l1.sound();
        t1.eat();
        t1.sound();
        p1.eat();
        p1.sound();
       
    }

}