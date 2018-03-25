/**
 * Collections
 */

 import java.util.*;


public class Collections {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        System.out.println(list.size());
        list.add("ABC");
        list.add("XYZ");
        list.add("DEF");
        list.add("XYZ");

        System.out.println(list.size());

        System.out.println(list.get(2));

        list.add(1,"JKL");
        list.set(3,"MNO");
        list.remove(0);

        
        for (String var : list) {
            
            System.out.print(var+" ");
        
        }
        


        ArrayList<Student> list2=new ArrayList<>();
        
        Student student=new Student();
        student.name="SHIVAM";
        student.roll="23456";
        student.isPassedOut=true;
        student.marks=75.3;
        

        Student student2=new Student();
        student2.name="SHUBHAM";
        student2.roll="121212121";
        student2.isPassedOut=false;
        student2.marks=60.34;

        list2.add(student);
        list2.add(student2);

        Student stu=list2.get(0);
        System.out.println(stu.name);


        HashMap<String,String> map=new HashMap<>();
        map.put("name","SHIVAM");
        map.put("roll","0987654");
        map.put("name","XYZ");

        System.out.println(map.toString());

        HashMap<String,Student> map2=new HashMap<>();
        map2.put("AIG",student);
        map2.put("DIGA",student2);

        
        System.out.println(map.get("name"));
 
        Set<String> set=map2.keySet();

        for (String key : set) {
        System.out.println(key+" "+map2.get(key).name);
            
        }

        
        
    }

    
}