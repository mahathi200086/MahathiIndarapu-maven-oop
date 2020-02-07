package mahathimaven2;
import java.util.ArrayList;
import java.util.*;
class Candies{
    int count(Integer n[],int ul,int ll){
    int count=0;
    for (int i=ul+1;i<ll-1;i++){
        if(n[i]==3){
            count=count+1;
        }
    }
    
    System.out.println("Candies in the given range:\t"+count);
    return count;
}
}
class Snickers{
    int count(Integer n[],int t){
    int count=0;
    for (int i=0;i<t;i++){
        if(n[i]==1){
            count=count+1;
        }
    }
    System.out.println("Snickers:  "+count);
    return count;
}
}
class Perk{
int count(Integer n[],int t){
    int count=0;
    for (int i=0;i<t;i++){
        if(n[i]==2){
            count++;
        }
    }
    System.out.println("Perk:  "+count);
    return count;
}
 
}  

class Luvit{
    int count(Integer n[],int t){
    int count=0;
    for (int i=0;i<t;i++){
        if(n[i]==4){
            count=count+1;
        }
    }
    System.out.println("Luvit:  "+count);
    return count;
}
}  

class Sweets{
    int count=0;
}

class Main1{
public static void main(String []args){
    Snickers sn=new Snickers();
    Perk p=new Perk();
    Luvit l=new Luvit();
    Candies c=new Candies();
    Sweets s=new Sweets();
    System.out.println("1.Snickers\n2.Perk\n3.Candy\n4.Luvit\n5.Barfi\n6.Exit(Gift selection is completed)\nEnter choice:");
    ArrayList<Integer> a =new ArrayList<>();
    
    for(int i=0;i<100;i++){
    	Scanner obj=new Scanner(System.in);
    	int num=obj.nextInt();
    	 a.add(num);
         if(num>6 || num<1)
         {
             System.out.println("wrong option\n");
             break;
         }
         if(num==6)
         {
        	 break;
         }
    }
    
    int size1=a.size();
    int size=size1-1;
    System.out.println("Total weight of gifts is:" +size);
    Integer[] arr=a.toArray(new Integer[a.size()]);
    
    int sn1=sn.count(arr,size);
    int p1=p.count(arr,size);
    int l1=l.count(arr,size);
    System.out.println("Sorting Chocolates in Ascending Order based on number of Chocolates of same type");
    
    
    if (sn1<=p1 && sn1<=l1)  {
        
        sn.count(arr,size);
        if(l1<=p1){
            l.count(arr,size);
            
            p.count(arr,size);
        }
        else if(p1<=l1){
            p.count(arr,size);
            
            l.count(arr,size);
        }
        
    }
        
    else if(p1<=sn1 && p1<=l1){
        p.count(arr,size);
        if(sn1<=l1)
        {
            sn.count(arr,size);
            
            l.count(arr,size);
        }
        else if(l1<=sn1)
        {
            l.count(arr,size);
            sn.count(arr,size);
        }
    }
    else{
        l.count(arr,size);
        if(sn1<=p1){
            sn.count(arr,size);
            p.count(arr,size);
        }
        else if(p1<=sn1){
            p.count(arr,size);
            sn.count(arr,size);
        }
        
        
    }
    System.out.println("Enter the lower limit of range:");
    Scanner obj1=new Scanner(System.in);
    int num1=obj1.nextInt();

    System.out.println("Enter the upper limit of range:");
    Scanner obj2=new Scanner(System.in);
    int num2=obj2.nextInt();
    
    int c1=c.count(arr,num1,num2);
    
}

}
