package jdksoundcode.desigpattern.create.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhaihx
 * @description:
 * @date:2019/7/17
 */
public abstract class CarModel {

    private List<String> sequence = new ArrayList<String>();

    /**
     * 启动
     */
    public abstract void start();

    /**
     * 停止
     */
    public abstract void stop();

    /**
     * 喇叭
     */
    public abstract void alarm();

    /**
     * 引擎
     */
    public abstract void engineBoom();

    final public void run() {
        for(int i=0;i<this.sequence.size();i++)
        {
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) { //如果是start关键字，
                this.start(); //开启汽车
            } else if (actionName.equalsIgnoreCase("stop")) { //如果是stop关键字
                this.stop(); //停止汽车
            } else if (actionName.equalsIgnoreCase("alarm")) { //如果是alarm关键字
                this.alarm(); //喇叭开始叫了
            } else if (actionName.equalsIgnoreCase("engineboom")) { //如果是engine
                this.engineBoom(); //引擎开始轰鸣
            }
        }
    }

    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
