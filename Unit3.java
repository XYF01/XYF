package hellojava;

public class Unit3 {

	public static void main(String[] args) {
		System.out.println("\n");//Java��Ifʹ��
		int math=88;  
		if(math>90)
		{System.out.println("�ɼ�����");}
		else if(math>75)
		{System.out.println("�ɼ�����");}
		else if(math>60)
		{System.out.println("�ɼ�����");}

		System.out.println("\n");//Java��switchʹ��
		int choose=2;  
		switch(choose){
		case 1:
			System.out.println("��ѡ����1");
			break;
		case 2:
			System.out.println("��ѡ����2");
			break;
		case 3:
			System.out.println("��ѡ����3");
			break;
		}
		
		System.out.println("\n");//Java��whileʹ��
		int a=1,b=0;
		while(a<=10) {
			b=b+a;
			a++;
		}
		System.out.println("1��10���ۼ�Ϊ��"+b);
		
		System.out.println("\n");//Java��do whileʹ��
		int x=100,y=0;
		do {
			y=y+x;
			x--;
		}while(x>=80);
		System.out.println("80�ӵ�100��ֵΪ��"+y);
		
		System.out.println("\n");//Java��forʹ��
		int c,d=0;
		for(c=0;d<=100;d++)
		{
			c=c+d;
		}
		System.out.println("1�ӵ�100��ֵΪ��"+c);
		
		System.out.println("\n");//Java��foreach��ʹ��
		int arr[]= {5,75,8};
		System.out.println("�����е�ֵΪ��");
		for(int q:arr) {
			System.out.println(q);
		}
		
		System.out.println("\n");//Java���������ѭ����ʹ��
		Loop:for(int n=0;n<3;n++) {
			for(int m=0;m<100;m++)
			{
				if(m==3)
				{
					break Loop;
				}
				System.out.println("n="+n+",m="+m);
			}
		}
		
		System.out.println("\n");//Javaѭ����continue��ʹ��
		System.out.println("С��15��ż��Ϊ:");
		for(int i=1;i<15;i++)
		{
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("\n");//��forѭ�����ο�����
		for(int e=1;e<=5;e++)//�����ϲ�����
		{
			for(int r=1;r<=5-e;r++)
			{System.out.print(" ");}//�ϲ��ո���
			for(int t=1;t<=2*e-1;t++)
			{
				if(t==1||t==2*e-1)
				{System.out.print("*");}//�ϲ�ÿ�е�һ�������һ�����*
				else 
				{System.out.print(" ");}//�ϲ����ಿ������ո�
			}
			System.out.print("\n");//ÿ���һ�оͻ�һ��
		}
		for(int e=1;e<=4;e++)//�����²������������м䲿���Ѿ����ϲ�������ˣ����Ա��ϲ���һ��
		{
			for(int r=5;r>5-e;r--)
			{System.out.print(" ");}//�²��ո���
			for(int t=1;t<=(5-e)*2-1;t++)
			{
				if(t==1||t==(5-e)*2-1)
			    {System.out.print("*");}//�²�ÿ�е�һ�������һ�����*
				else
				{System.out.print(" ");}}//�²����ಿ������ո�
			    System.out.print("\n");//�²�����
		    }
			
	}

}
