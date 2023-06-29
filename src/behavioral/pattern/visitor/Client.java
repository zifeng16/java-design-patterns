package behavioral.pattern.visitor;

import java.util.Arrays;
import java.util.List;

/**
 *  在不改变数据结构的前提下定义作用于这些元素的新操作
 */
public class Client {
    public static void main(String[] args) {
        FixedPriceContract fixedPriceContract = new FixedPriceContract(10000);
        TimeAndMaterialsContract timeAndMaterialsContract = new TimeAndMaterialsContract(150, 10);
        SupportContract supportContract = new SupportContract(500);

        List<ReportElement> reportElementList = Arrays.asList(fixedPriceContract, timeAndMaterialsContract, supportContract);

        MonthlyCostReportVisitor monthlyCostReportVisitor = new MonthlyCostReportVisitor();
        YearlyCostReportVisitor yearlyCostReportVisitor = new YearlyCostReportVisitor();

        long monthlyCost = 0;
        long yearlyCost = 0;
        for (ReportElement reportElement : reportElementList) {
            monthlyCost += reportElement.accept(monthlyCostReportVisitor);
            yearlyCost += reportElement.accept(yearlyCostReportVisitor);
        }

        System.out.println("Montly Cost: " + monthlyCost);
        System.out.println("Yearly Cost: " + yearlyCost);
    }
}
