public class IcCard {
    long id;
    int money;

    //方法1，看餘額(無回傳值)
    void showMoney(){

        System.out.println(money);
    }

    //方法2，做儲值動作(有回傳值)
    int addMoney(int newMoney){
        money = money + newMoney;
        return money;
    }

    //方法3，顯示卡片詳細資料
    void showInfo(){
        System.out.println("卡號："+id);
        System.out.println("餘額："+money);
    }


}
