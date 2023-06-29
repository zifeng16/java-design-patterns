package behavioral.pattern.visitor;

public class YearlyCostReportVisitor implements ReportVisitor<Long> {
    @Override
    public Long visit(FixedPriceContract fixedPriceContract) {
        return fixedPriceContract.costPerYear;
    }

    @Override
    public Long visit(TimeAndMaterialsContract timeAndMaterialsContract) {
        return timeAndMaterialsContract.costPerHour * timeAndMaterialsContract.hours;
    }

    @Override
    public Long visit(SupportContract supportContract) {
        return supportContract.costPerMonth * 12;
    }
}
