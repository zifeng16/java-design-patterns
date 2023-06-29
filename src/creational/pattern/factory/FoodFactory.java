package creational.pattern.factory;

public class FoodFactory {
    public Shape getFood(String type) {
        if (type == null) {
            return null;
        }

        switch (type) {
            case "Round":
                return new Pizza();
            case  "Cylinder":
                return new Burrito();
            default:
                throw new IllegalArgumentException("Unknown shape");
        }
    }
}

// 使用反射创建对象
// 加一个static变为静态工程
//public static Coffee create(Class<? extends Coffee> clazz) throws Exception {
//    if (clazz != null) {
//        return clazz.newInstance();
//    }
//    return null;
//}
