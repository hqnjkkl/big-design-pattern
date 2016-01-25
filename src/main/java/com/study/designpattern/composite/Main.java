package com.study.designpattern.composite;

/**
 * @author huqiaonan
 * @date 2016年1月25日 上午9:52:08
 * 将对象组合成树形结构以表示‘部分-整体’的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 */
public class Main {

	public static void main(String[] args) {
		RootCompany root = new RootCompany("总公司");
		LeafCompany bigHRDepartment = new LeafCompany("总公司HR部门");
		root.add(bigHRDepartment);
		LeafCompany bigEconomicDepartment = new LeafCompany("总公司财务部门");
		root.add(bigEconomicDepartment);
		
		RootCompany root1 = new RootCompany("华东公司");
		LeafCompany eastHR = new LeafCompany("华东公司HR部门");
		root1.add(eastHR);
		LeafCompany eastEconomic = new LeafCompany("东公司财务部门");
		root1.add(eastEconomic);
		root.add(root1);
		
		RootCompany root2 = new RootCompany("华南公司");
		LeafCompany southHR = new LeafCompany("华南公司HR部门");
		root2.add(southHR);
		LeafCompany southEconomic = new LeafCompany("华南司财务部门");
		root2.add(southEconomic);
		root.add(root2);
		root.display(1);
	}

}
