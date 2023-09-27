package Class25;

import java.util.ArrayList;
import java.util.List;

public class E2ArrayList {
    public static void main(String[] args) {
        List<HeadSet>headsets=new ArrayList<>();
        HeadSet headset1=new HeadSet("Razer Nari Ultimate",79.99,4620);
        HeadSet headset2=new HeadSet("NEW SteelSeries Arctis",52.64,4868);
        HeadSet headset3=new HeadSet("HyperX Cloud II",0,32116);
        headsets.add(headset1);
        headsets.add(headset2);
        headsets.add(headset3);
        //printList(headsets);
        System.out.println(headsets);
    }
    public static void printList(List<HeadSet>headsets){
        for(HeadSet h:headsets){
            h.printInfo();
        }
    }
}
class HeadSet{
    String title;
    double price;
    int noOfReviews;
    HeadSet(String title,double price,int noOfReviews){
        this.title=title;
        this.price=price;
        this.noOfReviews=noOfReviews;
    }
    void printInfo(){
        System.out.println(title+" "+price+" "+noOfReviews);
    }
}
