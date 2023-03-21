package first_project;

public class $vj {
public static void main(String[] args) {
	int a[]= {1,2,3,4,1,3,5};
	int res[]= new int[a.length];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(a[i]==a[j]&&a[i]!=0)
				a[j]=0;
		}
		if(a[i]!=0)
			res[i]=a[i];
		System.out.print(a[i]);
	}
	for(int i=0;i<res.length;i++) {
		System.out.print(res[i]);
	}
}
}
