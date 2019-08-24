package com.zhunongyun.toalibaba.designpatterns.adapter.poweradapter;

public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    /**
     * 输出5V电压
     *
     * @return
     */
    @Override
    public int outputDC5() {
        int adapterInput = ac220.outputAC220();

        int adapterOutput = adapterInput / 44;

        System.out.println("使用PowerAdapter将输入AC: " + adapterInput + "V, 输出DC: " + adapterOutput + "V");
        return adapterOutput;
    }
}