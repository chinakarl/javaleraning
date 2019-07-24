package jdksoundcode.desigpattern.create.simplefactorypattern;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/16
 */
public class ClothingFactory {

    public static IClothing createClothing(Class c)
    {
        IClothing traffic = null;
        try {
            traffic = (IClothing)Class.forName(c.getName()).newInstance();
        }catch (InstantiationException e)
        {
            throw new RuntimeException("对象创建出错");
        }
        catch (IllegalAccessException e)
        {
            throw new RuntimeException("你调用错了吧");
        }
        catch (ClassNotFoundException e)
        {
            throw new RuntimeException("类都找不到你让我怎么搞");
        }
        return traffic;
    }
}
