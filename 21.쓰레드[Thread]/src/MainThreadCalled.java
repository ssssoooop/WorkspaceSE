
public class MainThreadCalled {

	public static void main_thread_called_method() {
		System.out.println("\tA."+Thread.currentThread().getName());
		System.out.println("\tB"+Thread.currentThread().getPriority());
		return;
	}

}
