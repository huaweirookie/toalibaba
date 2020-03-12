package com.zhunongyun.toalibaba.designpatterns.template.course;

public abstract class NetworkCourse {

    protected final void createCourse() {
        //1. 发布预习资料
        this.postPreResource();
        //2. 制作PPT课件
        this.createPPT();
        //3. 在线直播
        this.liceVideo();
        //4. 提交课件和课堂笔记
        this.postNote();
        //5. 提交源代码
        this.postSource();
        //6. 布置作业, 如果有作业需要检查作业, 没有作业就不需要检查
        if (this.needHomeWork()) {
            this.checkHomeWork();
        }
    }

    abstract void checkHomeWork();

    /**
     * 钩子方法
     * @return
     */
    protected boolean needHomeWork() {
        return false;
    }

    final void postPreResource(){
        System.out.println("发布预习资料");
    }

    final void createPPT(){
        System.out.println("制作PPT课件");
    }

    final void liceVideo(){
        System.out.println("在线直播");
    }

    final void postNote(){
        System.out.println("提交课件和课堂笔记");
    }

    final void postSource(){
        System.out.println("提交源代码");
    }
}