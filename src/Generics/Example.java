package Generics;
class Data{
    private Object obj;

    public Data(Object obj) {
        this.obj=obj;
    }

    public Object getObj() {
        return obj;
    }

    public String toString() {
        return "Data [Obj="+obj+"]";
    }
}
class GenericClass<T>{
    private T data;

    public GenericClass(T data) {
        this.data=data;
    }

    public T getData() {
        return data;
    }

    public String toString() {
        return "GenericClass [data="+data+"]";
    }
}

public class Example {

    public static void main(String[] args) {
        Data data=new Data("Some data");
        String element=(String)data.getObj();
        System.out.println(element);

        GenericClass<String> genericData = new GenericClass<String>("Some generic Data");
        String data1 = genericData.getData();
        System.out.println(data1);
    }

}




