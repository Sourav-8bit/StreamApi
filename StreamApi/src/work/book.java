package work;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class book 
{
public static void main(String args[])
	{

	List<Integer> list1=List.of(2,4,50,53,76);

List<Integer> list2=new ArrayList<>();
list2.add(12);
list2.add(34);
list2.add(76);
list2.add(56);


List<Integer> list3=Arrays.asList(2,4,8,90,45,23);



List<Integer> listEven=new ArrayList<>();

for(Integer i:list1)
{
	if(i%2==0)
	{
		listEven.add(i);
		}
	}
System.out.println(list1);
System.out.println(listEven);

//using Stream

Stream<Integer> stream=list1.stream();
List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
System.out.println(newList);


List<Integer> newList1=list1.stream().filter(i-> i%2==0).collect(Collectors.toList());
System.out.println(newList1);



List<Integer> newList3=list1.stream().filter(i->i>10).collect(Collectors.toList());
System.out.println(newList1);

Stream<Object> emptyStream=Stream.empty();
emptyStream.forEach(e-> {
	System.out.println(e);
});
	
	Stream<Object> emptyStream1=Stream.empty();
	String name[]= {"sourav","nama","ishika","bakliwal"};
	Stream<String> stream1=Stream.of(name);
	stream1.forEach(f -> {
		System.out.println(f);
	});

	
	//Stream<Object> streamBuilder=streambuilder().build();
	
	
	
	
	IntStream stream5=Arrays.stream( new int []  {10,23});
	stream5.forEach(j-> 
	{
		System.out.println(j);
	});
	
	
	@SuppressWarnings("unused")
	List<Integer> list9=List.of(2,4,50,53,76);

	List<Integer> list5=new ArrayList<>();
	list5.add(12);
	list5.add(34);
	list5.add(76);
	list5.add(56);
Stream<Integer> stream11=list5.stream();
stream11.forEach(k-> {
	System.out.println(k);
});
	
	List<String> name1=List.of("sourav","smiskha","surabhi","kook");
    List<String>  newNames=name1.stream().filter(q->q.startsWith("k")).collect(Collectors.toList());
System.out.println(newNames);



List<Integer> numbers1=List.of(24,12,56,334,234,2,1,4,0,34,21,111);
List<Integer> numbers2=numbers1.stream().map(i->i*i).collect(Collectors.toList());
System.out.println(numbers2);

name1.stream().forEach(q->
{
	System.out.println(q);
});

newNames.stream().forEach(System.out::println);


numbers1.stream().sorted().forEach(System.out::println);

Integer integer=numbers1.stream().min((x,y) -> x.compareTo(y)).get();
System.out.println(integer);


Integer integer2=numbers1.stream().max((x,y) ->x.compareTo(y)).get();
System.out.println(integer2);


}
}