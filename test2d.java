public class test2d {
    

        public static void main(String[] args) {
           ProjectMMK sheet= new ProjectMMK(4,4);
           sheet.insert("moath", 0, 3);
           sheet.insert("khalid", 3,2);
           sheet.insert("mohamed", 2, 0);
           sheet.insert("ahmed", 1, 2);
           
           sheet.delete(1, 2);
           sheet.printItems();
        }  
      
         
}
