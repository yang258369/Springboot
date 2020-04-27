package vip.xjdai.Decorates.extend.dynamic;

import vip.xjdai.Decorates.extend.Competitor;

public class CompetitorDecorator extends Competitor {

    private Competitor competitor;

    public static int  i = 0;

    public CompetitorDecorator(Competitor competitor) {
        this.competitor = competitor;
        i++;
        System.out.println(i);
    }

    public void sing() {
        competitor.sing();
    }
}