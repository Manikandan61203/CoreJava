import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class StreamToStudentsPerformance {
    public StreamToStudentsPerformance() {
        Scanner o=new Scanner(System.in);
        List<Student> l=new ArrayList<>();
        System.out.println("Enter No of Students :");
        int n=o.nextInt();
        for(int i=0;i<n;i++)
        {
            o.nextLine();
            System.out.println("Enter the Name :");
            String name=o.nextLine();
            System.out.println("Enter the Department :");
            String dept=o.nextLine();
            System.out.println("Enter five marks Seperated by Space :");
            String s[]=o.nextLine().split(" ");
            List<Integer> marks=Arrays.stream(s).map(Integer::parseInt).collect(toList());
            double sum=marks.stream().reduce(0,Integer::sum);
            Double avg=sum/5;
            l.add(new Student(name,dept,marks,avg));
        }

        List<Student> Top3 = (l.stream()
                .sorted((a,b)->b.Avg.compareTo(a.Avg) )
                .limit(3).collect(toList()));

        System.out.println("Top 3 Students and their Averages :");
        Top3.forEach(s-> System.out.println(s.Name+" : "+s.Avg));

        List<Student> Grade = (l.stream()
                .map(StreamToStudentsPerformance::apply)
                .collect(toList()));

        System.out.println("Students with their Grade :");
        Grade.forEach(s->{
            System.out.println(s.Name+" : "+s.Grade);
        });

        Map<String,Double> Avgmap=l.stream()
                .collect(Collectors.groupingBy(
                Student::getDept,
                        Collectors.averagingDouble(
                        Student::CalcAvg)));
        Map<String,Double> Avgmapsort= Avgmap.entrySet().stream()
                .sorted((s1,s2)->s2.getValue().compareTo(s1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

        System.out.println("Departments with their Average:");
        Avgmapsort.forEach((Department,Average)->{
            System.out.println(Department+" : "+Average);
        });

        Map<String,Optional<Student>> TopStdByDept=l.stream()
                .collect(Collectors.groupingBy(
                        Student::getDept,
                        Collectors.maxBy(Comparator.comparingDouble(Student::getAvg))));
        Map<String,Optional<Student>> TopStdByDeptrev=new TreeMap<>(Comparator.reverseOrder());
        TopStdByDeptrev.putAll(TopStdByDept);

        System.out.println("Top Students InEach Department :");
        System.out.println("Name | Department | Average");
        TopStdByDeptrev.forEach((dept,std)->
                System.out.println(std.get().Name+" : "+dept+" : "+std.get().Avg));

        Map<String,Long> CountFail=l.stream()
                .collect(Collectors.groupingBy(Student::getDept,
                        Collectors.filtering(Student::hasFailed,Collectors.counting())));

        System.out.println("Failed Student InEach Department :");
        CountFail.forEach((dept,count)-> System.out.println(dept+" : "+count));
    }

    private static Student apply(Student students) {
        if(students.Avg>=90&&students.Avg<=100){
            students.setGrade("A");
        } else if (students.Avg>=80&&students.Avg<90){
            students.setGrade("B");
        } else if(students.Avg>=70&&students.Avg<80) {
            students.setGrade("C");
        } else if(students.Avg>=60&&students.Avg<70){
            students.setGrade("D");
        }else if(students.Avg>=50&&students.Avg<60){
            students.setGrade("E");
        }else {
            students.setGrade("Fail");
        }
        return students;
    }

    public static void main(String[] args) {
        StreamToStudentsPerformance stsp=new StreamToStudentsPerformance();
    }
}
