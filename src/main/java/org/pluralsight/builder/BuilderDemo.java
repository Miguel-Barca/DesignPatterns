package org.pluralsight.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        LunchOrder lunchOrder = new LunchOrder();

		lunchOrder.setBread("Wheat");
		lunchOrder.setCondiments("Lettuce");
		lunchOrder.setDressing("Mustard");
		lunchOrder.setMeat("Ham");

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

        LunchOrderTelescopic lunchOrderTelescopic = new LunchOrderTelescopic("WheatTele", "LettuceTele", "MustardTele", "HamTele");
        System.out.println(lunchOrderTelescopic.getBread());
        System.out.println(lunchOrderTelescopic.getCondiments());
        System.out.println(lunchOrderTelescopic.getDressing());
        System.out.println(lunchOrderTelescopic.getMeat());

        /// ---- Builder ---- ///
        LunchOrderWithABuilderInside.Builder builder = new LunchOrderWithABuilderInside.Builder();

        builder.bread("Wheat").dressing("Mayo").meat("Turkey").condiments("testingOut");

        LunchOrderWithABuilderInside lunchOrder1 = builder.build();

        System.out.println(lunchOrder1.getBread());
        System.out.println(lunchOrder1.getCondiments());
        System.out.println(lunchOrder1.getDressing());
        System.out.println(lunchOrder1.getMeat());
    }
}
