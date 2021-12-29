package chapter1;

public class PracticalMarket {
    public static void main(String[] args) {
        //max
        String macBrand="MacBookAir";
        float macSize=13.3f;
        double macPrice=6988.88;
        String macConfig="i5处理器4GB内存128G固态硬盘";
        int macStock=5;

        //think
        String thinkBrand="ThinkPadT450";
        float thinkSize=14.0f;
        double thinkPrice=5999.99;
        String thinkConfig="i5处理器4GB内存500G固态硬盘";
        int thinkStock=10;

        //ASUS
        String asusBrand="ASUS-FL5800";
        float asusSize=15.6f;
        double asusPrice=4999.5;
        String asusConfig="i7处理器4GB内存128G固态硬盘";
        int asusStock=18;

        int totalStock=macStock+thinkStock+asusStock;
        double totalPrice=macStock*macPrice+thinkPrice*thinkStock+asusPrice*asusStock;

        System.out.println("------------------------------商城库存清单---------------------------------");
        System.out.println("品牌型号           尺寸         价格           配置                     库存数");
        System.out.println(macBrand+"       "+macSize+"     "+macPrice+"    "+macConfig+"      "+macStock+"  ");
        System.out.println(thinkBrand+"     "+thinkSize+"     "+thinkPrice+"    "+thinkConfig+"      "+thinkStock+"  ");
        System.out.println(asusBrand+"       "+asusSize+"     "+asusPrice+"    "+asusConfig+"      "+asusStock+"  ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("总库存数：" +totalStock);
        System.out.println("库存商品总金额： "+totalPrice);
    }
}
