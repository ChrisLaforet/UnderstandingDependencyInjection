@Service
public class ServiceBImpl implements ServiceB {

	@Inject
	private ServiceA serviceA;

	@Override
	public ServiceA getServiceA() {
		return serviceA;
	}

	@Override
	public void setServiceA(final ServiceA serviceA) {
		this.serviceA = serviceA;
	}

	public String jobB() {
		return "jobB()";
	}
}
