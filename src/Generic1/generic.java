package Generic1;

public class generic <T> {

    private T data;

    public generic(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public static void main(String[] args) {
        generic <String>task = new generic<>("Java");
        generic<Integer>task1 =new generic<>(12);
        System.out.println(task.getData());
        System.out.println(task1.getData());
    }
}
