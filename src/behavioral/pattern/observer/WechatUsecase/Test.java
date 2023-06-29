package behavioral.pattern.observer.WechatUsecase;

public class Test {
    public static void main(String[] args) {
        WechatUser wechatUser1 = new WechatUser("user1");
        WechatUser wechatUser2 = new WechatUser("user2");
        WechatUser wechatUser3 = new WechatUser("user3");

        Observable publicAccount = new PublicAccount();
        publicAccount.add(wechatUser1);
        publicAccount.add(wechatUser2);
        publicAccount.add(wechatUser3);
        publicAccount.notify("A new article is released");

        System.out.println("");
        publicAccount.add(new WechatUser("user4"));
        publicAccount.add(new WechatUser("user100"));
        publicAccount.delete(wechatUser2);
        publicAccount.notify("Followers reached 100!");
    }
}
