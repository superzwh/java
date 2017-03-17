/*

public class Demo{
	public static void main(String[] args) {
		System.out.println(10);
	}
}



public class Demo{
	public static void main(String[] args){
		byte b = 100;
		System.out.println(b);
	}
}

public class Demo{
	public static void main(String[] args){
		String s = "java";
		System.out.println(s);
	}
}

public class Demo{
	public static void main(String[] args){
		double d = 3.14;
		int i = (int)d;
		System.out.println(i);
		
		byte b = (byte)200;
		System.out.println(b);
	}
}


public class Demo{
	public static void main(String[] args){
		//System.out.println("5+5="+5+5);
		
		int i = 5;
		int j = ++i ;
		System.out.println(i);
		System.out.println(j);
		
		int k = 6;
		int m = 4;
		//System.out.println(k%m);
		
		int a = 3;
		int b = 4;
		a--;
		//System.out.println(a);
		
		++b;
		//System.out.println(b);
	}
}


public class Demo{
	public static void main(String[] args){
		int i = 5;
		i+=6;
		System.out.println(i);
		
		byte b = 1;
		b = (byte)(b + 1);
		System.out.println(b);
	}
}


public class Demo{
	public static void main(String[] args){
		int i = 3;
		int j = 4;
		System.out.println(3<4 && ++j>2);
		System.out.println(i);
		System.out.println(j);
	}
}


public class Demo{
	public static void main(String[] args){
		int i = 17;
		if (i%2==0){
			System.out.println(i+"鏄伓鏁�");
		}else{
			System.out.println(i+"鏄鏁�");
		}		
	}
}


public class Demo{
	public static void main(String[] args){
		int grade = 75;
		if (grade>80){
			System.out.println(grade+"鎴愮哗鏄紭");
		}else if(grade>70) {
			System.out.println(grade+"鎴愮哗鏄壇");
		}else if(grade>60){
			System.out.println(grade+"鎴愮哗鏄腑");
		}else{
			System.out.println(grade+"鎴愮哗鏄樊");
		}
	}
}

public class Demo{
	public static void main(String[] args){
		int i = 5;
		int j = 6;
		if (i>j){
			System.out.println(i+"鏄渶澶у��");
		}else{
			System.out.println(j+"鏄渶澶у��");
		}
		int k = i>j ? i : j;
		System.out.println(k+"鏄渶澶у��");
	}
}


public class Demo{
	public static void main(String[] args){
		int i =1;
		while(i<1000){
			System.out.println(i);
            i++;			
		}
	}
}


public class Demo{
	public static void main(String[] args){
		for(int i=0;i<=10;i++){
			System.out.println(i);
		}
	}
}


public class Demo{
	public static void main(String[] args){
		int sum = 0;
		for (int i=1;i<=4;i++){
			sum =sum+i;
		}
		System.out.println(sum);
	}
}


public class Demo{
	public static void main(String[] args){
		int i = 0;
		do{
			System.out.println(i);
			
		}while(i<5);
	}
}


public class Demo{
	public static void main(String[] args){
		for(int i = 0;i < 2;i++){
			for(int j = 0;j <3;j++){
				System.out.print("*");
		    }
		    System.out.println();
	    }
    }
}


public class Demo{
	public static void main(String[] args){
		int i = 1;
		while(true){
			if(i == 3){
				break;
			}else{
				System.out.println(i);
			}
			i++;
		}
	}
}


public class Demo{
	public static void main(String[] args){
		int i = 2;
		switch(i){
			case 1:
				System.out.println("鏄熸湡涓�");
			break;
			
			case 2:
				System.out.println("鏄熸湡浜�");
			break;
			
			case 3:
				System.out.println("鏄熸湡涓�");
			break;
			
			case 4:
				System.out.println("鏄熸湡鍥�");
			break;
		
		    default:
				System.out.println("ok");
			break;
			
		}
	}
}


public class Demo{
	public static void main(String[] args){
		int[] arr =new int[]{1,2,5};
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr.length);
	}
}


public class Demo{
	public static void main(String[] args){
		int[] arr = {2,1,2,5,7,0,4};
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
	}
}


public class Demo{
	public static void main(String[] args){
		int[] arr = {2,3,4,5,6,4,7,9,5};
		int max = arr[0];
		for (int i = 1; i < arr.length; i++){
			if (max < arr [i]){
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}


public class Demo{
	public static void main(String[] args){
		int [][] arr = {{1,2,0},{2,3,4},{3,4,3,6}};
		for (int i = 0;i < arr.length; i++){
			for (int j = 0;j<arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
		}
		
		System.out.println(arr.length);
	}
}


import java.util.Scanner;
public class Demo{
	public static void main(String[] args){
		//printRect();
		//int number = getNumber();
		//System.out.println(number);
		//printRect2(5,9);
		int avg = getAvg(1,2,3);
		System.out.println(avg);
	}
	
	public static int getNumber(){
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		return number;
	}
	
	public static void printRect(){
		for (int i = 0;i < 3; i++){
			for(int j=0;j<3;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printRect2(int m, int n){
		for (int i = 0;i < m;i++){
			for (int j = 0;j < n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static int getAvg(int a, int b, int c){
		return (a+b+c)/3;
	}
}
*/


public class Demo{
	public static void main(String[] args) {
		System.out.println("好");
	}
}













