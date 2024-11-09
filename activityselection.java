import java.util.Scanner;
public class activityselection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , t;
        System.out.println("enter the number of activitites");
        n = sc.nextInt();
        System.out.println("enter the time you have");
        t = sc.nextInt();
        int[] activity = new int[n];
        int[] timetaken = new int[n];
        for(int i =0;i<n;i++){
            System.out.println("enter the activity id");
            activity[i]=sc.nextInt();
            System.out.println("enter the start time of activity");
            int start = sc.nextInt();
            System.out.println("enter the end of the activity");
            int end = sc.nextInt();
            timetaken[i]=end-start;
        }
        //sorting both the arrays;
        for(int i =0;i<n-1;i++){
            for(int j =i+1;j<n-i-1;j++){
                    if(timetaken[j]>timetaken[j+1]){
                        int temp = timetaken[j];
                        int temp2 = activity[j];
                        activity[j]=activity[j+1];
                        timetaken[j]=timetaken[j+1];
                        timetaken[j+1]=temp;
                        activity[j+1]=temp2;
                    }
            }

        }
        int count=0;
        System.out.println("the activities are :");
        for(int i = 0;i<n;i++){
            if(t-timetaken[i]<0){
                break;
            }
            System.out.println(activity[i]);
            t=t-timetaken[i];
            count++;
        }
        System.out.println("the total number of activitites we can do is  "+count);
        sc.close();
    }
}
