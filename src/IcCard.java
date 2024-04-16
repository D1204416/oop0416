public class IcCard {
    long id;
    int money;

    //方法1，看餘額
    void showMoney(){
        System.out.println(money);
    }

    //方法2，做儲值動作
    int addMoney(int newMoney){
        money = money + newMoney;
        return money;
    }


}
