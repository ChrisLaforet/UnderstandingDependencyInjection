public class ServiceA {
	public static String jobA() {
		return "jobA(" + ServiceB.jobB() + ")";
	}
}
