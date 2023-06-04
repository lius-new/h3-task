package chapter12.task1;

public class Main {
    public static void main(String[] args) {

        AbstractUnit unit1, unit2, unit3, unit4, unit5;
        Company company1, company2, company3;

        // 初始化
        company1 = new Company("无敌大公司");
        company2 = new Company("高级大公司");
        company3 = new Company("小型大公司");

        // 1 公司有unit1部门
        unit1 = new RDDepartment();
        company1.add(unit1);
        company1.add(company2);

        // 2 公司有unit2,unit3部门
        unit2 = new FinanceDepartment();
        unit3 = new HRDepartment();
        company2.add(unit2);
        company2.add(unit3);
        company2.add(company3);

        // 3 公司有unit4,unit5部门
        unit4 = new RDDepartment();
        unit5 = new HRDepartment();
        company3.add(unit4);
        company3.add(unit5);

        company1.releaseMsg();
    }
}
