/*
 * author shenlu
 * 
 */
package fourth;

import java.util.Scanner;

public class Graduate implements StudentInterface,TeacherInterface{
	// ��Ա����
		String name;
		String sex;
		int age;
		double fee;
		double pay;
		
		// ʵ�ֽӿ��еĳ��󷽷�
		@Override
		public void setPay(double pay) {
			this.pay = pay * 12;
			System.out.println("���������Ϊ��" + this.pay);
		}
		
		// ʵ�ֽӿ��еĳ��󷽷�
		@Override
		public void getPay(double pay) {
			this.pay = pay * 12;
			System.out.println("���������Ϊ��" + this.pay);
		}
		
		// ʵ�ֽӿ��еĳ��󷽷�
		@Override
		public void setFee(double fee) {
			this.fee = fee;
			System.out.println("��һ���ѧ��Ϊ��" + this.fee);
		}
		
		// ʵ�ֽӿ��еĳ��󷽷�
		@Override
		public void getFee(double fee) {
			this.fee = fee;
			System.out.println("��һ���ѧ��Ϊ��" + this.fee);
		}
		

		public boolean Loan(){
			if ((this.pay - this.fee) < 3000) {
				System.out.println("���������" + this.pay + "  ��ȥѧ��" + this.fee + " ����" + (this.pay - this.fee));
				return true;
			}
			System.out.println("���������" + this.pay + "   ��ȥ��˰"+this.pay*0.03+"  ��ȥѧ��" + this.fee + " ����" + (this.pay - this.fee));
			return false;
		}
		
		public static void main(String[] args) {
			// ����һ���о�������
			Graduate graduate1 = new Graduate();
			Graduate graduate2 = new Graduate();
			// �о�������ĳ�ʼ��
			graduate1.name = "С��ͬѧ";
			graduate1.age = 27;
			graduate1.sex = "��";
			
			graduate2.name = "С��ͬѧ";
			graduate2.age = 26;
			graduate2.sex = "Ů";
			
			System.out.println("���:" + graduate1.name+"   ���䣺"+graduate1.age+"��"+"    �Ա�"+graduate1.sex);
			
			// �����¹���
			Scanner scanner = new Scanner(System.in);
			System.out.println("����������¹��ʣ�");
			
			double pay = scanner.nextDouble();
			graduate1.setPay(pay);
			
			// ����ѧ��
			try {
				System.out.println("��������һ���ѧ�ѣ�");
				double fee = scanner.nextDouble();
				graduate1.setFee(fee);
				if(fee==0) {
					System.out.println("ѧ�Ѳ���Ϊ0Ŷ");
				}
			}catch(Exception e) {
				
			}
			
			
			
			
			System.out.println();
			//�ڶ�����ʿ��
			System.out.println("���:" + graduate2.name+"   ���䣺"+graduate2.age+"��"+"    �Ա�"+graduate2.sex);
			
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("����������¹��ʣ�");
			
			double pay1 = scanner1.nextDouble();
			graduate1.setPay(pay1);
			
			// ����ѧ��
			try {
				System.out.println("���������ѧ�ѣ�");
				double fee = scanner.nextDouble();
				graduate1.setFee(fee);
				if(fee==0) {
					System.out.println("����");
				}
			}catch(Exception e) {
				
			}
			
			
			
		}
	 

}
