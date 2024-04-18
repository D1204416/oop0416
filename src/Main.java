public class Main {
    public static void main(String[] args) {

       //第一個物件
       IcCard card1 = new IcCard(); //新增一個物件它是IcCard類別
       System.out.println(card1.id+";"+ card1.money);
       card1.id = 12345;
       card1.money = 300; //給予成員變數 值
       System.out.println(card1.id+";"+ card1.money); //取值

       //第二個物件
       IcCard card2 = new IcCard();
       System.out.println(card2.id+";"+ card2.money);
       card2.id = 11111;
       card2.money = 100; //給予成員變數 值
       System.out.println(card2.id+";"+ card2.money); //取值


        // String(類別)函式的使用範例
        //String greeting = "Hello FCU";
        //String lowercase = greeting.toLowerCase();
        //System.out.println(lowercase);

        card1.showMoney();

        int balance = card1.addMoney(100);
        System.out.println(balance);

        card1.showMoney();

        card1.showInfo();

    }
}