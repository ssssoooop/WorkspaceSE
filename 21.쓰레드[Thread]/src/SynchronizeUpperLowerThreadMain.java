import java.util.ArrayList;

public class SynchronizeUpperLowerThreadMain {

	public static void main(String[] args) {
		SynchronizeUpperLowerPrintSharedObject sharedObject1=
				new SynchronizeUpperLowerPrintSharedObject();
		SynchronizeUpperLowerPrintSharedObject sharedObject2=
				new SynchronizeUpperLowerPrintSharedObject();
		SynchronizeUpperThread upperThread=
				new SynchronizeUpperThread(sharedObject1);
		SynchronizeLowerThread lowerThread=
				new SynchronizeLowerThread(sharedObject2);
		upperThread.start();
		lowerThread.start();
	}
}