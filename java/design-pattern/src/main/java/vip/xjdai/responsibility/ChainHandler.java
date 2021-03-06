package vip.xjdai.responsibility;

public abstract class ChainHandler {

    public void execute(Chain chain) {
        this.handlerProcess();
        chain.execute();
    }

    protected abstract void handlerProcess();


}
