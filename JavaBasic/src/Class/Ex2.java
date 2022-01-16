package Class;

class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price=price;
    }

    Product(){ }
}

class Tv extends Product{
    Tv(){ super(100);}

    public String toString() { return "Tv";};
}

class Computer extends Product{
    Computer(){ super(200);}

    public String toString() { return "computer";}
}

class Audio extends Product{
    Audio(){super(50);}

    public String toString(){return "Audio";}
}

class Buyer{
    int money=1000;
    int bonusPoint=0;
    Product cart [] = new Product[10];
    int i=0;

    void buy(Product p){
        if(money<p.price){
            System.out.println("잔액이 부족해 물건을 살 수 없습니다.");
            return;
        }

        money-=p.price;
        bonusPoint += p.bonusPoint;
        cart[i++]=p;
        System.out.println(p+"을/를 구입하셧습니다.");
    }

    void summary(){
        int sum=0;
        String itemList="";

        for(int i=0;i<cart.length;i++){
            if(cart[i]==null) break;
            sum += cart[i].price;
            itemList += cart[i]+", ";
        }
        System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
        System.out.println("구입하신 제품은 "+itemList+"입니다.");
    }
}
public class Ex2 {
    public static void main(String[] args){
        Buyer buyer = new Buyer();

        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.summary();
    }
}
