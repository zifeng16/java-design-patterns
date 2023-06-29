package behavioral.pattern.visitor;

public class MonthlyCostReportVisitor implements ReportVisitor<Long> {
    @Override
    public Long visit(FixedPriceContract fixedPriceContract) {
        return fixedPriceContract.costPerYear / 12;
    }

    @Override
    public Long visit(TimeAndMaterialsContract timeAndMaterialsContract) {
        return timeAndMaterialsContract.costPerHour * timeAndMaterialsContract.hours;
    }

    @Override
    public Long visit(SupportContract supportContract) {
        return supportContract.costPerMonth;
    }
}
