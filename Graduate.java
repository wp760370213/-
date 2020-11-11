


public class Graduate implements StudentInterface,TeacherInterface{
	// 成员变量
		String name;
		String sex;
		int age;
		double fee;
		double pay;
		
		// 实现接口中的抽象方法
		@Override
		public void setPay(double pay) {
			this.pay = pay * 12;
			System.out.println("你的年收入为：" + this.pay);
		}
		
		// 实现接口中的抽象方法
		@Override
		public void getPay(double pay) {
			this.pay = pay * 12;
			System.out.println("你的年收入为：" + this.pay);
		}
		
		// 实现接口中的抽象方法
		@Override
		public void setFee(double fee) {
			this.fee = fee;
			System.out.println("你一年的学费为：" + this.fee);
		}
		
		// 实现接口中的抽象方法
		@Override
		public void getFee(double fee) {
			this.fee = fee;
			System.out.println("你一年的学费为：" + this.fee);
		}
		

		public boolean Loan(){
			if ((this.pay - this.fee) < 3000) {
				System.out.println("你的年收入" + this.pay + "  减去学费" + this.fee + " 等于" + (this.pay - this.fee));
				return true;
			}
			System.out.println("你的年收入" + this.pay + "   除去纳税"+this.pay*0.03+"  减去学费" + this.fee + " 等于" + (this.pay - this.fee));
			return false;
		}
		
		public static void main(String[] args) {
			// 创建一个研究生对象
			Graduate graduate1 = new Graduate();
			Graduate graduate2 = new Graduate();
			// 研究生对象的初始化
			graduate1.name = "张三";
			graduate1.age = 18;
			graduate1.sex = "男";
			
			graduate2.name = "李四";
			graduate2.age = 19;
			graduate2.sex = "女";
			
			System.out.println("你好:" + graduate1.name+"   年龄："+graduate1.age+"岁"+"    性别："+graduate1.sex);
			
			// 设置月工资
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入你的月工资：");
			
			double pay = scanner.nextDouble();
			graduate1.setPay(pay);
			
			// 设置学费
			try {
				System.out.println("请输入你的学费：");
				double fee = scanner.nextDouble();
				graduate1.setFee(fee);
				if(fee==0) {
					System.out.println("学费不能为0");
				}
			}catch(Exception e) {
				
			}
			
			
			
			
			System.out.println();
			//第二个博士生
			System.out.println("你好:" + graduate2.name+"   年龄："+graduate2.age+"岁"+"    性别："+graduate2.sex);
			
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("请输入你的月工资：");
			
			double pay1 = scanner1.nextDouble();
			graduate1.setPay(pay1);
			
			// 设置学费
			try {
				System.out.println("请输入你的学费：");
				double fee = scanner.nextDouble();
				graduate1.setFee(fee);
				if(fee==0) {
					System.out.println("错误");
				}
			}catch(Exception e) {
				
			}
			
			
			
		}
	 

}
