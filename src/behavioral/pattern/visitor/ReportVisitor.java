package behavioral.pattern.visitor;

public interface ReportVisitor<R> {
    public R visit(FixedPriceContract fixedPriceContract);
    public R visit(TimeAndMaterialsContract timeAndMaterialsContract);
    public R visit(SupportContract supportContract);
}
