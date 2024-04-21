import java.util.Scanner;
public class ProjectMMK {
String sheet[][];
public ProjectMMK(int rows, int columns){
    sheet=new String [rows][columns];
} 
//insertion method // insert: o(1)
boolean insert(String newitem,int x , int y){
    if(x<0 || x>=sheet.length || y<0 ||y >sheet[0].length ){
        System.out.println("invalid point (x,y)");
        return false;
    }
    sheet[x][y]=newitem;
    return true;
}
//Delete method // Delete o(1)
boolean delete(int x , int y){
    if(x<0 || x>=sheet.length || y<0 ||y >sheet[0].length ){
        System.out.println("invalid point (x,y)");
        return false;
    }
    sheet[x][y]=null;
    return true;
    
}
void printItems(){
    for (int i = 0; i < sheet.length; i++){
        for (int j = 0; j < sheet[i].length; j++){
            System.out.println(i+","+j+": "+sheet[i][j]);
            
        }
    }
}

    public static void main(String[] args) {
      
   
}
}
