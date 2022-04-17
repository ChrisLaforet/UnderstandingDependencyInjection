import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class UnderstandingDI {
	public static void main(String[] args) throws Exception {
		DIContext context = createContext();
		doBusinessLogic(context);
	}

	private static DIContext createContext() throws Exception {
		// snag the base package name from this main() class for scanning
		String rootPackageName = null;
		if (UnderstandingDI.class.getPackage() != null) {
			rootPackageName = UnderstandingDI.class.getPackage().getName();
		}
		return DIContext.createContextForPackage(rootPackageName);
	}

	private static void doBusinessLogic(DIContext context){
		ServiceA serviceA = context.getServiceInstance(ServiceA.class);
		ServiceB serviceB = context.getServiceInstance(ServiceB.class);
		System.out.println(serviceA.jobA());
		System.out.println(serviceB.jobB());
	}
}
